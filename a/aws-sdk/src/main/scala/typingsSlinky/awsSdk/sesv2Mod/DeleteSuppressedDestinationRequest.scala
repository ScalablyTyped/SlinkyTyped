package typingsSlinky.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteSuppressedDestinationRequest extends StObject {
  
  /**
    * The suppressed email destination to remove from the account suppression list.
    */
  var EmailAddress: typingsSlinky.awsSdk.sesv2Mod.EmailAddress = js.native
}
object DeleteSuppressedDestinationRequest {
  
  @scala.inline
  def apply(EmailAddress: EmailAddress): DeleteSuppressedDestinationRequest = {
    val __obj = js.Dynamic.literal(EmailAddress = EmailAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSuppressedDestinationRequest]
  }
  
  @scala.inline
  implicit class DeleteSuppressedDestinationRequestMutableBuilder[Self <: DeleteSuppressedDestinationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmailAddress(value: EmailAddress): Self = StObject.set(x, "EmailAddress", value.asInstanceOf[js.Any])
  }
}

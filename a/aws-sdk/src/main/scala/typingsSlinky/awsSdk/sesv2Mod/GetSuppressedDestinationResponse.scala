package typingsSlinky.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSuppressedDestinationResponse extends StObject {
  
  /**
    * An object containing information about the suppressed email address.
    */
  var SuppressedDestination: typingsSlinky.awsSdk.sesv2Mod.SuppressedDestination = js.native
}
object GetSuppressedDestinationResponse {
  
  @scala.inline
  def apply(SuppressedDestination: SuppressedDestination): GetSuppressedDestinationResponse = {
    val __obj = js.Dynamic.literal(SuppressedDestination = SuppressedDestination.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSuppressedDestinationResponse]
  }
  
  @scala.inline
  implicit class GetSuppressedDestinationResponseMutableBuilder[Self <: GetSuppressedDestinationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuppressedDestination(value: SuppressedDestination): Self = StObject.set(x, "SuppressedDestination", value.asInstanceOf[js.Any])
  }
}

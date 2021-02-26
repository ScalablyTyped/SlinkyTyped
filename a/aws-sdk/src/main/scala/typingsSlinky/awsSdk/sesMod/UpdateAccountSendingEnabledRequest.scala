package typingsSlinky.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateAccountSendingEnabledRequest extends StObject {
  
  /**
    * Describes whether email sending is enabled or disabled for your Amazon SES account in the current AWS Region.
    */
  var Enabled: js.UndefOr[typingsSlinky.awsSdk.sesMod.Enabled] = js.native
}
object UpdateAccountSendingEnabledRequest {
  
  @scala.inline
  def apply(): UpdateAccountSendingEnabledRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAccountSendingEnabledRequest]
  }
  
  @scala.inline
  implicit class UpdateAccountSendingEnabledRequestMutableBuilder[Self <: UpdateAccountSendingEnabledRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Enabled): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
  }
}

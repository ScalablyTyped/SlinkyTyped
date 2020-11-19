package typingsSlinky.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateAccountSendingEnabledRequest extends js.Object {
  
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
  implicit class UpdateAccountSendingEnabledRequestOps[Self <: UpdateAccountSendingEnabledRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEnabled(value: Enabled): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("Enabled", js.undefined)
  }
}

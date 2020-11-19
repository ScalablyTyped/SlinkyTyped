package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAccountSettingsResponse extends js.Object {
  
  /**
    * The settings associated with the QuickSight subscription associated with this AWS account. This information includes the edition of Amazon QuickSight that you subscribed to (Standard or Enterprise) and the notification email for the QuickSight subscription. The QuickSight console, the QuickSight subscription is sometimes referred to as a QuickSight "account" even though it is technically not an account, but a subscription in your AWS account.
    */
  var AccountSettings: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.AccountSettings] = js.native
  
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
}
object DescribeAccountSettingsResponse {
  
  @scala.inline
  def apply(): DescribeAccountSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAccountSettingsResponse]
  }
  
  @scala.inline
  implicit class DescribeAccountSettingsResponseOps[Self <: DescribeAccountSettingsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccountSettings(value: AccountSettings): Self = this.set("AccountSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountSettings: Self = this.set("AccountSettings", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = this.set("RequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestId: Self = this.set("RequestId", js.undefined)
    
    @scala.inline
    def setStatus(value: StatusCode): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}

package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateAccountSettingsRequest extends js.Object {
  
  /**
    * The ID for the AWS account that contains the QuickSight settings that you want to list.
    */
  var AwsAccountId: typingsSlinky.awsSdk.quicksightMod.AwsAccountId = js.native
  
  /**
    * The default namespace for this AWS account. Currently, the default is default. AWS Identity and Access Management (IAM) users that register for the first time with QuickSight provide an email that becomes associated with the default namespace.
    */
  var DefaultNamespace: Namespace = js.native
  
  /**
    * The email address that you want QuickSight to send notifications to regarding your AWS account or QuickSight subscription.
    */
  var NotificationEmail: js.UndefOr[String] = js.native
}
object UpdateAccountSettingsRequest {
  
  @scala.inline
  def apply(AwsAccountId: AwsAccountId, DefaultNamespace: Namespace): UpdateAccountSettingsRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], DefaultNamespace = DefaultNamespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAccountSettingsRequest]
  }
  
  @scala.inline
  implicit class UpdateAccountSettingsRequestOps[Self <: UpdateAccountSettingsRequest] (val x: Self) extends AnyVal {
    
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
    def setAwsAccountId(value: AwsAccountId): Self = this.set("AwsAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultNamespace(value: Namespace): Self = this.set("DefaultNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationEmail(value: String): Self = this.set("NotificationEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationEmail: Self = this.set("NotificationEmail", js.undefined)
  }
}

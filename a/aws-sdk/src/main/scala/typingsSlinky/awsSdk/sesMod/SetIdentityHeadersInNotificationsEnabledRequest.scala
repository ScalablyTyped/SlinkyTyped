package typingsSlinky.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetIdentityHeadersInNotificationsEnabledRequest extends js.Object {
  /**
    * Sets whether Amazon SES includes the original email headers in Amazon SNS notifications of the specified notification type. A value of true specifies that Amazon SES will include headers in notifications, and a value of false specifies that Amazon SES will not include headers in notifications. This value can only be set when NotificationType is already set to use a particular Amazon SNS topic.
    */
  var Enabled: typingsSlinky.awsSdk.sesMod.Enabled = js.native
  /**
    * The identity for which to enable or disable headers in notifications. Examples: user@example.com, example.com.
    */
  var Identity: typingsSlinky.awsSdk.sesMod.Identity = js.native
  /**
    * The notification type for which to enable or disable headers in notifications. 
    */
  var NotificationType: typingsSlinky.awsSdk.sesMod.NotificationType = js.native
}

object SetIdentityHeadersInNotificationsEnabledRequest {
  @scala.inline
  def apply(Enabled: Enabled, Identity: Identity, NotificationType: NotificationType): SetIdentityHeadersInNotificationsEnabledRequest = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any], Identity = Identity.asInstanceOf[js.Any], NotificationType = NotificationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetIdentityHeadersInNotificationsEnabledRequest]
  }
  @scala.inline
  implicit class SetIdentityHeadersInNotificationsEnabledRequestOps[Self <: SetIdentityHeadersInNotificationsEnabledRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Enabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdentity(value: Identity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Identity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotificationType(value: NotificationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotificationType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetIdentityNotificationTopicRequest extends js.Object {
  /**
    * The identity (email address or domain) that you want to set the Amazon SNS topic for.  You can only specify a verified identity for this parameter.  You can specify an identity by using its name or by using its Amazon Resource Name (ARN). The following examples are all valid identities: sender@example.com, example.com, arn:aws:ses:us-east-1:123456789012:identity/example.com.
    */
  var Identity: typingsSlinky.awsSdk.sesMod.Identity = js.native
  /**
    * The type of notifications that will be published to the specified Amazon SNS topic.
    */
  var NotificationType: typingsSlinky.awsSdk.sesMod.NotificationType = js.native
  /**
    * The Amazon Resource Name (ARN) of the Amazon SNS topic. If the parameter is omitted from the request or a null value is passed, SnsTopic is cleared and publishing is disabled.
    */
  var SnsTopic: js.UndefOr[NotificationTopic] = js.native
}

object SetIdentityNotificationTopicRequest {
  @scala.inline
  def apply(Identity: Identity, NotificationType: NotificationType): SetIdentityNotificationTopicRequest = {
    val __obj = js.Dynamic.literal(Identity = Identity.asInstanceOf[js.Any], NotificationType = NotificationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetIdentityNotificationTopicRequest]
  }
  @scala.inline
  implicit class SetIdentityNotificationTopicRequestOps[Self <: SetIdentityNotificationTopicRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withSnsTopic(value: NotificationTopic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnsTopic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnsTopic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnsTopic")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.pulumiAws.identityNotificationTopicMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityNotificationTopicArgs extends js.Object {
  /**
    * The identity for which the Amazon SNS topic will be set. You can specify an identity by using its name or by using its Amazon Resource Name (ARN).
    */
  val identity: Input[String] = js.native
  /**
    * Whether SES should include original email headers in SNS notifications of this type. *false* by default.
    */
  val includeOriginalHeaders: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The type of notifications that will be published to the specified Amazon SNS topic. Valid Values: *Bounce*, *Complaint* or *Delivery*.
    */
  val notificationType: Input[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Amazon SNS topic. Can be set to "" (an empty string) to disable publishing.
    */
  val topicArn: js.UndefOr[Input[String]] = js.native
}

object IdentityNotificationTopicArgs {
  @scala.inline
  def apply(identity: Input[String], notificationType: Input[String]): IdentityNotificationTopicArgs = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], notificationType = notificationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityNotificationTopicArgs]
  }
  @scala.inline
  implicit class IdentityNotificationTopicArgsOps[Self <: IdentityNotificationTopicArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdentity(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotificationType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeOriginalHeaders(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeOriginalHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeOriginalHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeOriginalHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withTopicArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topicArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopicArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topicArn")(js.undefined)
        ret
    }
  }
  
}


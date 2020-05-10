package typingsSlinky.pulumiAws.emailChannelMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmailChannelArgs extends js.Object {
  /**
    * The application ID.
    */
  val applicationId: Input[String] = js.native
  /**
    * Whether the channel is enabled or disabled. Defaults to `true`.
    */
  val enabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The email address used to send emails from.
    */
  val fromAddress: Input[String] = js.native
  /**
    * The ARN of an identity verified with SES.
    */
  val identity: Input[String] = js.native
  /**
    * The ARN of an IAM Role used to submit events to Mobile Analytics' event ingestion service.
    */
  val roleArn: Input[String] = js.native
}

object EmailChannelArgs {
  @scala.inline
  def apply(
    applicationId: Input[String],
    fromAddress: Input[String],
    identity: Input[String],
    roleArn: Input[String]
  ): EmailChannelArgs = {
    val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any], fromAddress = fromAddress.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailChannelArgs]
  }
  @scala.inline
  implicit class EmailChannelArgsOps[Self <: EmailChannelArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFromAddress(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdentity(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoleArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnabled(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
  }
  
}


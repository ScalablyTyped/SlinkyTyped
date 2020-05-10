package typingsSlinky.pulumiAws.recorderMod

import typingsSlinky.pulumiAws.inputMod.cfg.RecorderRecordingGroup
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecorderState extends js.Object {
  /**
    * The name of the recorder. Defaults to `default`. Changing it recreates the resource.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Recording group - see below.
    */
  val recordingGroup: js.UndefOr[Input[RecorderRecordingGroup]] = js.native
  /**
    * Amazon Resource Name (ARN) of the IAM role.
    * used to make read or write requests to the delivery channel and to describe the AWS resources associated with the account.
    * See [AWS Docs](http://docs.aws.amazon.com/config/latest/developerguide/iamrole-permissions.html) for more details.
    */
  val roleArn: js.UndefOr[Input[String]] = js.native
}

object RecorderState {
  @scala.inline
  def apply(): RecorderState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecorderState]
  }
  @scala.inline
  implicit class RecorderStateOps[Self <: RecorderState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordingGroup(value: Input[RecorderRecordingGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordingGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordingGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordingGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(js.undefined)
        ret
    }
  }
  
}


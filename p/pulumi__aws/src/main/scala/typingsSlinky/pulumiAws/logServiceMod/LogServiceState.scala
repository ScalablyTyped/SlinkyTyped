package typingsSlinky.pulumiAws.logServiceMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogServiceState extends js.Object {
  /**
    * The id of directory.
    */
  val directoryId: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the cloudwatch log group to which the logs should be published. The log group should be already created and the directory service principal should be provided with required permission to create stream and publish logs. Changing this value would delete the current subscription and create a new one. A directory can only have one log subscription at a time.
    */
  val logGroupName: js.UndefOr[Input[String]] = js.native
}

object LogServiceState {
  @scala.inline
  def apply(): LogServiceState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogServiceState]
  }
  @scala.inline
  implicit class LogServiceStateOps[Self <: LogServiceState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectoryId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directoryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectoryId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directoryId")(js.undefined)
        ret
    }
    @scala.inline
    def withLogGroupName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logGroupName")(js.undefined)
        ret
    }
  }
  
}


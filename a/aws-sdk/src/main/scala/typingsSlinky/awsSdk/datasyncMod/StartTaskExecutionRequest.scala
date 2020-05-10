package typingsSlinky.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartTaskExecutionRequest extends js.Object {
  /**
    * A list of filter rules that determines which files to include when running a task. The pattern should contain a single filter string that consists of the patterns to include. The patterns are delimited by "|" (that is, a pipe). For example: "/folder1|/folder2"   
    */
  var Includes: js.UndefOr[FilterList] = js.native
  var OverrideOptions: js.UndefOr[Options] = js.native
  /**
    * The Amazon Resource Name (ARN) of the task to start.
    */
  var TaskArn: typingsSlinky.awsSdk.datasyncMod.TaskArn = js.native
}

object StartTaskExecutionRequest {
  @scala.inline
  def apply(TaskArn: TaskArn): StartTaskExecutionRequest = {
    val __obj = js.Dynamic.literal(TaskArn = TaskArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartTaskExecutionRequest]
  }
  @scala.inline
  implicit class StartTaskExecutionRequestOps[Self <: StartTaskExecutionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTaskArn(value: TaskArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaskArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludes(value: FilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Includes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Includes")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrideOptions(value: Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OverrideOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrideOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OverrideOptions")(js.undefined)
        ret
    }
  }
  
}


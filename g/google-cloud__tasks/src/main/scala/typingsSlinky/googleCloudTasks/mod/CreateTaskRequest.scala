package typingsSlinky.googleCloudTasks.mod

import typingsSlinky.googleCloudTasks.PartialTask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTaskRequest extends js.Object {
  var parent: String = js.native
  var responseView: js.UndefOr[View] = js.native
  var task: PartialTask = js.native
}

object CreateTaskRequest {
  @scala.inline
  def apply(parent: String, task: PartialTask): CreateTaskRequest = {
    val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTaskRequest]
  }
  @scala.inline
  implicit class CreateTaskRequestOps[Self <: CreateTaskRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTask(value: PartialTask): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("task")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponseView(value: View): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseView")(js.undefined)
        ret
    }
  }
  
}


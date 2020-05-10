package typingsSlinky.camundaExternalTaskClientJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HandlerArgs extends js.Object {
  var task: Task = js.native
  var taskService: TaskService = js.native
}

object HandlerArgs {
  @scala.inline
  def apply(task: Task, taskService: TaskService): HandlerArgs = {
    val __obj = js.Dynamic.literal(task = task.asInstanceOf[js.Any], taskService = taskService.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandlerArgs]
  }
  @scala.inline
  implicit class HandlerArgsOps[Self <: HandlerArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTask(value: Task): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("task")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaskService(value: TaskService): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskService")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


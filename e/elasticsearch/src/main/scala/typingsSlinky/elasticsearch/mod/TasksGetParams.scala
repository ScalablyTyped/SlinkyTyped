package typingsSlinky.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TasksGetParams extends GenericParams {
  var taskId: js.UndefOr[String] = js.native
  var waitForCompletion: js.UndefOr[Boolean] = js.native
}

object TasksGetParams {
  @scala.inline
  def apply(): TasksGetParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TasksGetParams]
  }
  @scala.inline
  implicit class TasksGetParamsOps[Self <: TasksGetParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTaskId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskId")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitForCompletion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForCompletion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitForCompletion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForCompletion")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TasksCancel extends Generic {
  var actions: js.UndefOr[String | js.Array[String]] = js.native
  var nodes: js.UndefOr[String | js.Array[String]] = js.native
  var parent_task_id: js.UndefOr[String] = js.native
  var task_id: js.UndefOr[String] = js.native
}

object TasksCancel {
  @scala.inline
  def apply(): TasksCancel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TasksCancel]
  }
  @scala.inline
  implicit class TasksCancelOps[Self <: TasksCancel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActions(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(js.undefined)
        ret
    }
    @scala.inline
    def withNodes(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodes")(js.undefined)
        ret
    }
    @scala.inline
    def withParent_task_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent_task_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent_task_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent_task_id")(js.undefined)
        ret
    }
    @scala.inline
    def withTask_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("task_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTask_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("task_id")(js.undefined)
        ret
    }
  }
  
}


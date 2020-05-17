package typingsSlinky.onfleetNodeOnfleet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tasks extends js.Object {
  var tasks: js.Array[String] = js.native
}

object Tasks {
  @scala.inline
  def apply(tasks: js.Array[String]): Tasks = {
    val __obj = js.Dynamic.literal(tasks = tasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tasks]
  }
  @scala.inline
  implicit class TasksOps[Self <: Tasks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTasks(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tasks")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


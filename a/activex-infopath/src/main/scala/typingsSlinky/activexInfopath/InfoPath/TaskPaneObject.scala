package typingsSlinky.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskPaneObject extends js.Object {
  @JSName("InfoPath.TaskPaneObject_typekey")
  var InfoPathDotTaskPaneObject_typekey: TaskPaneObject = js.native
  val Type: XdTaskPaneType = js.native
  var Visible: Boolean = js.native
}

object TaskPaneObject {
  @scala.inline
  def apply(InfoPathDotTaskPaneObject_typekey: TaskPaneObject, Type: XdTaskPaneType, Visible: Boolean): TaskPaneObject = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.TaskPaneObject_typekey")(InfoPathDotTaskPaneObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskPaneObject]
  }
  @scala.inline
  implicit class TaskPaneObjectOps[Self <: TaskPaneObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInfoPathDotTaskPaneObject_typekey(value: TaskPaneObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InfoPath.TaskPaneObject_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: XdTaskPaneType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Visible")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


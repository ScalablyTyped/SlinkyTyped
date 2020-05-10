package typingsSlinky.dhtmlxgantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GanttEnterprise extends js.Object {
  def getGanttInstance(): GanttStatic = js.native
}

object GanttEnterprise {
  @scala.inline
  def apply(getGanttInstance: () => GanttStatic): GanttEnterprise = {
    val __obj = js.Dynamic.literal(getGanttInstance = js.Any.fromFunction0(getGanttInstance))
    __obj.asInstanceOf[GanttEnterprise]
  }
  @scala.inline
  implicit class GanttEnterpriseOps[Self <: GanttEnterprise] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetGanttInstance(value: () => GanttStatic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGanttInstance")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}


package typingsSlinky.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiagramConnectionEditable extends js.Object {
  var tools: js.UndefOr[js.Array[DiagramConnectionEditableTool]] = js.native
}

object DiagramConnectionEditable {
  @scala.inline
  def apply(): DiagramConnectionEditable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramConnectionEditable]
  }
  @scala.inline
  implicit class DiagramConnectionEditableOps[Self <: DiagramConnectionEditable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTools(value: js.Array[DiagramConnectionEditableTool]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tools")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTools: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tools")(js.undefined)
        ret
    }
  }
  
}


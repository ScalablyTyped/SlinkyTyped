package typingsSlinky.activexOffice

import typingsSlinky.activexOffice.Office.CustomTaskPane
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCustomTaskPaneInst extends js.Object {
  val CustomTaskPaneInst: CustomTaskPane = js.native
}

object AnonCustomTaskPaneInst {
  @scala.inline
  def apply(CustomTaskPaneInst: CustomTaskPane): AnonCustomTaskPaneInst = {
    val __obj = js.Dynamic.literal(CustomTaskPaneInst = CustomTaskPaneInst.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCustomTaskPaneInst]
  }
  @scala.inline
  implicit class AnonCustomTaskPaneInstOps[Self <: AnonCustomTaskPaneInst] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomTaskPaneInst(value: CustomTaskPane): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomTaskPaneInst")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


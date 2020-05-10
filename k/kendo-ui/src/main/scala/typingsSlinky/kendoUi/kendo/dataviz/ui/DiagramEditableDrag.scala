package typingsSlinky.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiagramEditableDrag extends js.Object {
  var snap: js.UndefOr[Boolean | DiagramEditableDragSnap] = js.native
}

object DiagramEditableDrag {
  @scala.inline
  def apply(): DiagramEditableDrag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramEditableDrag]
  }
  @scala.inline
  implicit class DiagramEditableDragOps[Self <: DiagramEditableDrag] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSnap(value: Boolean | DiagramEditableDragSnap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snap")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Selectionobject extends js.Object {
  var qBackCount: Double = js.native
  var qForwardCount: Double = js.native
  var qSelections: js.Array[NxCurrentSelectionItem] = js.native
}

object Selectionobject {
  @scala.inline
  def apply(qBackCount: Double, qForwardCount: Double, qSelections: js.Array[NxCurrentSelectionItem]): Selectionobject = {
    val __obj = js.Dynamic.literal(qBackCount = qBackCount.asInstanceOf[js.Any], qForwardCount = qForwardCount.asInstanceOf[js.Any], qSelections = qSelections.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selectionobject]
  }
  @scala.inline
  implicit class SelectionobjectOps[Self <: Selectionobject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQBackCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qBackCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQForwardCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qForwardCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQSelections(value: js.Array[NxCurrentSelectionItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSelections")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


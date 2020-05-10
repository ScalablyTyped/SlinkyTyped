package typingsSlinky.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NxStackPage extends js.Object {
  var qArea: Rect = js.native
  var qData: js.Array[NxStackedPivotCell] = js.native
}

object NxStackPage {
  @scala.inline
  def apply(qArea: Rect, qData: js.Array[NxStackedPivotCell]): NxStackPage = {
    val __obj = js.Dynamic.literal(qArea = qArea.asInstanceOf[js.Any], qData = qData.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxStackPage]
  }
  @scala.inline
  implicit class NxStackPageOps[Self <: NxStackPage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQArea(value: Rect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQData(value: js.Array[NxStackedPivotCell]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qData")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


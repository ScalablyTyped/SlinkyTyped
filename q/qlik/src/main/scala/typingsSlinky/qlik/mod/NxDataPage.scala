package typingsSlinky.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NxDataPage extends js.Object {
  var qArea: Rect = js.native
  var qIsReduced: Boolean = js.native
  var qMatrix: js.Array[NxCellRows] = js.native
  var qTails: js.Array[NxGroupTail] = js.native
}

object NxDataPage {
  @scala.inline
  def apply(qArea: Rect, qIsReduced: Boolean, qMatrix: js.Array[NxCellRows], qTails: js.Array[NxGroupTail]): NxDataPage = {
    val __obj = js.Dynamic.literal(qArea = qArea.asInstanceOf[js.Any], qIsReduced = qIsReduced.asInstanceOf[js.Any], qMatrix = qMatrix.asInstanceOf[js.Any], qTails = qTails.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxDataPage]
  }
  @scala.inline
  implicit class NxDataPageOps[Self <: NxDataPage] (val x: Self) extends AnyVal {
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
    def withQIsReduced(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qIsReduced")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQMatrix(value: js.Array[NxCellRows]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qMatrix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQTails(value: js.Array[NxGroupTail]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qTails")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NxPivotPage extends js.Object {
  var qArea: Rect = js.native
  var qData: js.Array[NxPivotValuePoint] = js.native
  var qLeft: js.Array[NxPivotDimensioncell] = js.native
  var qTop: js.Array[NxPivotDimensioncell] = js.native
}

object NxPivotPage {
  @scala.inline
  def apply(
    qArea: Rect,
    qData: js.Array[NxPivotValuePoint],
    qLeft: js.Array[NxPivotDimensioncell],
    qTop: js.Array[NxPivotDimensioncell]
  ): NxPivotPage = {
    val __obj = js.Dynamic.literal(qArea = qArea.asInstanceOf[js.Any], qData = qData.asInstanceOf[js.Any], qLeft = qLeft.asInstanceOf[js.Any], qTop = qTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxPivotPage]
  }
  @scala.inline
  implicit class NxPivotPageOps[Self <: NxPivotPage] (val x: Self) extends AnyVal {
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
    def withQData(value: js.Array[NxPivotValuePoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQLeft(value: js.Array[NxPivotDimensioncell]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQTop(value: js.Array[NxPivotDimensioncell]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qTop")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxPivotPage...
  */
@js.native
trait INxPivotPage extends js.Object {
  /**
    * Size and offset of the data in the matrix.
    */
  var qArea: IRect = js.native
  /**
    * Array of data.
    */
  var qData: js.Array[INxPivotValuePoint] = js.native
  /**
    * Information about the left dimension values of a pivot table.
    */
  var qLeft: js.Array[INxPivotDimensionCell] = js.native
  /**
    * Information about the top dimension values of a pivot table.
    * If there is no top dimension in the pivot table, information about the measures are given.
    */
  var qTop: js.Array[INxPivotDimensionCell] = js.native
}

object INxPivotPage {
  @scala.inline
  def apply(
    qArea: IRect,
    qData: js.Array[INxPivotValuePoint],
    qLeft: js.Array[INxPivotDimensionCell],
    qTop: js.Array[INxPivotDimensionCell]
  ): INxPivotPage = {
    val __obj = js.Dynamic.literal(qArea = qArea.asInstanceOf[js.Any], qData = qData.asInstanceOf[js.Any], qLeft = qLeft.asInstanceOf[js.Any], qTop = qTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxPivotPage]
  }
  @scala.inline
  implicit class INxPivotPageOps[Self <: INxPivotPage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQArea(value: IRect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQData(value: js.Array[INxPivotValuePoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQLeft(value: js.Array[INxPivotDimensionCell]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQTop(value: js.Array[INxPivotDimensionCell]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qTop")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


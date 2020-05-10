package typingsSlinky.qlik.mod

import typingsSlinky.qlik.qlikStrings.K
import typingsSlinky.qlik.qlikStrings.P
import typingsSlinky.qlik.qlikStrings.S
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HyperCube extends js.Object {
  var qDataPages: js.Array[NxDataPage] = js.native
  var qDimensionInfo: js.Array[NxDimensionInfo] = js.native
  var qEffectiveInterColumnSortOrder: js.Array[Double] = js.native
  var qError: NxValidationError = js.native
  var qGrandTotalRow: js.Array[NxCell] = js.native
  var qHasOtherValues: Boolean = js.native
  var qIndentMode: Boolean = js.native
  var qLastExpandedPos: NxCellPosition = js.native
  var qMeasureInfo: js.Array[NxMeasureInfo] = js.native
  var qMode: S | P | K = js.native
  var qNoOfLeftDims: Double = js.native
  var qPivotDataPages: js.Array[NxPivotPage] = js.native
  var qSize: Size = js.native
  var qStackedDataPages: js.Array[NxStackPage] = js.native
  var qStateName: String = js.native
}

object HyperCube {
  @scala.inline
  def apply(
    qDataPages: js.Array[NxDataPage],
    qDimensionInfo: js.Array[NxDimensionInfo],
    qEffectiveInterColumnSortOrder: js.Array[Double],
    qError: NxValidationError,
    qGrandTotalRow: js.Array[NxCell],
    qHasOtherValues: Boolean,
    qIndentMode: Boolean,
    qLastExpandedPos: NxCellPosition,
    qMeasureInfo: js.Array[NxMeasureInfo],
    qMode: S | P | K,
    qNoOfLeftDims: Double,
    qPivotDataPages: js.Array[NxPivotPage],
    qSize: Size,
    qStackedDataPages: js.Array[NxStackPage],
    qStateName: String
  ): HyperCube = {
    val __obj = js.Dynamic.literal(qDataPages = qDataPages.asInstanceOf[js.Any], qDimensionInfo = qDimensionInfo.asInstanceOf[js.Any], qEffectiveInterColumnSortOrder = qEffectiveInterColumnSortOrder.asInstanceOf[js.Any], qError = qError.asInstanceOf[js.Any], qGrandTotalRow = qGrandTotalRow.asInstanceOf[js.Any], qHasOtherValues = qHasOtherValues.asInstanceOf[js.Any], qIndentMode = qIndentMode.asInstanceOf[js.Any], qLastExpandedPos = qLastExpandedPos.asInstanceOf[js.Any], qMeasureInfo = qMeasureInfo.asInstanceOf[js.Any], qMode = qMode.asInstanceOf[js.Any], qNoOfLeftDims = qNoOfLeftDims.asInstanceOf[js.Any], qPivotDataPages = qPivotDataPages.asInstanceOf[js.Any], qSize = qSize.asInstanceOf[js.Any], qStackedDataPages = qStackedDataPages.asInstanceOf[js.Any], qStateName = qStateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[HyperCube]
  }
  @scala.inline
  implicit class HyperCubeOps[Self <: HyperCube] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQDataPages(value: js.Array[NxDataPage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qDataPages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQDimensionInfo(value: js.Array[NxDimensionInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qDimensionInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQEffectiveInterColumnSortOrder(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qEffectiveInterColumnSortOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQError(value: NxValidationError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQGrandTotalRow(value: js.Array[NxCell]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qGrandTotalRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQHasOtherValues(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qHasOtherValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQIndentMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qIndentMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQLastExpandedPos(value: NxCellPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qLastExpandedPos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQMeasureInfo(value: js.Array[NxMeasureInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qMeasureInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQMode(value: S | P | K): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQNoOfLeftDims(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qNoOfLeftDims")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQPivotDataPages(value: js.Array[NxPivotPage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qPivotDataPages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQSize(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQStackedDataPages(value: js.Array[NxStackPage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qStackedDataPages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQStateName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qStateName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


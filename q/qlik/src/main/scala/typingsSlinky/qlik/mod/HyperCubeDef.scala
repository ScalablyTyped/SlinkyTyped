package typingsSlinky.qlik.mod

import typingsSlinky.qlik.qlikNumbers.`-1`
import typingsSlinky.qlik.qlikNumbers.`0`
import typingsSlinky.qlik.qlikNumbers.`1`
import typingsSlinky.qlik.qlikStrings.K
import typingsSlinky.qlik.qlikStrings.P
import typingsSlinky.qlik.qlikStrings.S
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HyperCubeDef extends js.Object {
  var qAlwaysFullyExpanded: js.UndefOr[Boolean] = js.native
  var qCalcCond: js.UndefOr[ValueExpr] = js.native
  var qDimensions: js.UndefOr[js.Array[NxDimension]] = js.native
  var qIndentMode: js.UndefOr[Boolean] = js.native
  var qInitialDataFetch: js.UndefOr[js.Array[NxPage]] = js.native
  var qInterColumnSortOrder: js.UndefOr[js.Array[Double]] = js.native
  var qMaxStackedCells: js.UndefOr[Double] = js.native
  var qMeasures: js.UndefOr[js.Array[NxMeasure]] = js.native
  var qMode: js.UndefOr[S | P | K] = js.native
  var qNoOfLeftDims: js.UndefOr[Double] = js.native
  var qPopulateMissing: js.UndefOr[Boolean] = js.native
  var qShowTotalsAbove: js.UndefOr[Boolean] = js.native
  var qSortByYValue: js.UndefOr[`-1` | `0` | `1`] = js.native
  var qStateName: js.UndefOr[String] = js.native
  var qSuppressZero: js.UndefOr[Boolean] = js.native
  var qSupressMissing: js.UndefOr[Boolean] = js.native
}

object HyperCubeDef {
  @scala.inline
  def apply(): HyperCubeDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HyperCubeDef]
  }
  @scala.inline
  implicit class HyperCubeDefOps[Self <: HyperCubeDef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQAlwaysFullyExpanded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qAlwaysFullyExpanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQAlwaysFullyExpanded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qAlwaysFullyExpanded")(js.undefined)
        ret
    }
    @scala.inline
    def withQCalcCond(value: ValueExpr): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qCalcCond")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQCalcCond: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qCalcCond")(js.undefined)
        ret
    }
    @scala.inline
    def withQDimensions(value: js.Array[NxDimension]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qDimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQDimensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qDimensions")(js.undefined)
        ret
    }
    @scala.inline
    def withQIndentMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qIndentMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQIndentMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qIndentMode")(js.undefined)
        ret
    }
    @scala.inline
    def withQInitialDataFetch(value: js.Array[NxPage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qInitialDataFetch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQInitialDataFetch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qInitialDataFetch")(js.undefined)
        ret
    }
    @scala.inline
    def withQInterColumnSortOrder(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qInterColumnSortOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQInterColumnSortOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qInterColumnSortOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withQMaxStackedCells(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qMaxStackedCells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQMaxStackedCells: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qMaxStackedCells")(js.undefined)
        ret
    }
    @scala.inline
    def withQMeasures(value: js.Array[NxMeasure]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qMeasures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQMeasures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qMeasures")(js.undefined)
        ret
    }
    @scala.inline
    def withQMode(value: S | P | K): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qMode")(js.undefined)
        ret
    }
    @scala.inline
    def withQNoOfLeftDims(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qNoOfLeftDims")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQNoOfLeftDims: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qNoOfLeftDims")(js.undefined)
        ret
    }
    @scala.inline
    def withQPopulateMissing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qPopulateMissing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQPopulateMissing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qPopulateMissing")(js.undefined)
        ret
    }
    @scala.inline
    def withQShowTotalsAbove(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qShowTotalsAbove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQShowTotalsAbove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qShowTotalsAbove")(js.undefined)
        ret
    }
    @scala.inline
    def withQSortByYValue(value: `-1` | `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSortByYValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQSortByYValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSortByYValue")(js.undefined)
        ret
    }
    @scala.inline
    def withQStateName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qStateName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQStateName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qStateName")(js.undefined)
        ret
    }
    @scala.inline
    def withQSuppressZero(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSuppressZero")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQSuppressZero: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSuppressZero")(js.undefined)
        ret
    }
    @scala.inline
    def withQSupressMissing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSupressMissing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQSupressMissing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSupressMissing")(js.undefined)
        ret
    }
  }
  
}


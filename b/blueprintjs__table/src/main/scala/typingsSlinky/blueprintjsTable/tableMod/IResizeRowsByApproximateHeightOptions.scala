package typingsSlinky.blueprintjsTable.tableMod

import typingsSlinky.blueprintjsTable.gridMod.ICellMapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IResizeRowsByApproximateHeightOptions extends js.Object {
  /**
    * Approximate width (in pixels) of an average character of text.
    */
  var getApproximateCharWidth: js.UndefOr[Double | ICellMapper[Double]] = js.native
  /**
    * Approximate height (in pixels) of an average line of text.
    */
  var getApproximateLineHeight: js.UndefOr[Double | ICellMapper[Double]] = js.native
  /**
    * Sum of horizontal paddings (in pixels) from the left __and__ right sides
    * of the cell.
    */
  var getCellHorizontalPadding: js.UndefOr[Double | ICellMapper[Double]] = js.native
  /**
    * Number of extra lines to add in case the calculation is imperfect.
    */
  var getNumBufferLines: js.UndefOr[Double | ICellMapper[Double]] = js.native
}

object IResizeRowsByApproximateHeightOptions {
  @scala.inline
  def apply(): IResizeRowsByApproximateHeightOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IResizeRowsByApproximateHeightOptions]
  }
  @scala.inline
  implicit class IResizeRowsByApproximateHeightOptionsOps[Self <: IResizeRowsByApproximateHeightOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetApproximateCharWidthFunction2(value: (/* rowIndex */ Double, /* columnIndex */ Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getApproximateCharWidth")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetApproximateCharWidth(value: Double | ICellMapper[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getApproximateCharWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetApproximateCharWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getApproximateCharWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withGetApproximateLineHeightFunction2(value: (/* rowIndex */ Double, /* columnIndex */ Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getApproximateLineHeight")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetApproximateLineHeight(value: Double | ICellMapper[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getApproximateLineHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetApproximateLineHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getApproximateLineHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withGetCellHorizontalPaddingFunction2(value: (/* rowIndex */ Double, /* columnIndex */ Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCellHorizontalPadding")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetCellHorizontalPadding(value: Double | ICellMapper[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCellHorizontalPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetCellHorizontalPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCellHorizontalPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withGetNumBufferLinesFunction2(value: (/* rowIndex */ Double, /* columnIndex */ Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNumBufferLines")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetNumBufferLines(value: Double | ICellMapper[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNumBufferLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetNumBufferLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNumBufferLines")(js.undefined)
        ret
    }
  }
  
}


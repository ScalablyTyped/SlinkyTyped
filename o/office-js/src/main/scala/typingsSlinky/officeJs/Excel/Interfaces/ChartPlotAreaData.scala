package typingsSlinky.officeJs.Excel.Interfaces

import typingsSlinky.officeJs.Excel.ChartPlotAreaPosition
import typingsSlinky.officeJs.officeJsStrings.Automatic
import typingsSlinky.officeJs.officeJsStrings.Custom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `chartPlotArea.toJSON()`. */
@js.native
trait ChartPlotAreaData extends js.Object {
  /**
    *
    * Represents the formatting of a chart plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var format: js.UndefOr[ChartPlotAreaFormatData] = js.native
  /**
    *
    * Represents the height value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var height: js.UndefOr[Double] = js.native
  /**
    *
    * Represents the insideHeight value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var insideHeight: js.UndefOr[Double] = js.native
  /**
    *
    * Represents the insideLeft value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var insideLeft: js.UndefOr[Double] = js.native
  /**
    *
    * Represents the insideTop value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var insideTop: js.UndefOr[Double] = js.native
  /**
    *
    * Represents the insideWidth value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var insideWidth: js.UndefOr[Double] = js.native
  /**
    *
    * Represents the left value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var left: js.UndefOr[Double] = js.native
  /**
    *
    * Represents the position of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var position: js.UndefOr[ChartPlotAreaPosition | Automatic | Custom] = js.native
  /**
    *
    * Represents the top value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var top: js.UndefOr[Double] = js.native
  /**
    *
    * Represents the width value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var width: js.UndefOr[Double] = js.native
}

object ChartPlotAreaData {
  @scala.inline
  def apply(): ChartPlotAreaData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartPlotAreaData]
  }
  @scala.inline
  implicit class ChartPlotAreaDataOps[Self <: ChartPlotAreaData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: ChartPlotAreaFormatData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withInsideHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insideHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsideHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insideHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withInsideLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insideLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsideLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insideLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withInsideTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insideTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsideTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insideTop")(js.undefined)
        ret
    }
    @scala.inline
    def withInsideWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insideWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsideWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insideWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: ChartPlotAreaPosition | Automatic | Custom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}


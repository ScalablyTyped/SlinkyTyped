package typingsSlinky.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * This object represents the attributes for a chart plotArea object.
  *
  * [Api set: ExcelApi 1.8]
  */
@js.native
trait ChartPlotAreaLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the formatting of a chart plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var format: js.UndefOr[ChartPlotAreaFormatLoadOptions] = js.native
  /**
    *
    * Represents the height value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var height: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the insideHeight value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var insideHeight: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the insideLeft value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var insideLeft: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the insideTop value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var insideTop: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the insideWidth value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var insideWidth: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the left value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var left: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the position of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var position: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the top value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var top: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the width value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var width: js.UndefOr[Boolean] = js.native
}

object ChartPlotAreaLoadOptions {
  @scala.inline
  def apply(): ChartPlotAreaLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartPlotAreaLoadOptions]
  }
  @scala.inline
  implicit class ChartPlotAreaLoadOptionsOps[Self <: ChartPlotAreaLoadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$all(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$all: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$all")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: ChartPlotAreaFormatLoadOptions): Self = {
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
    def withHeight(value: Boolean): Self = {
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
    def withInsideHeight(value: Boolean): Self = {
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
    def withInsideLeft(value: Boolean): Self = {
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
    def withInsideTop(value: Boolean): Self = {
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
    def withInsideWidth(value: Boolean): Self = {
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
    def withLeft(value: Boolean): Self = {
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
    def withPosition(value: Boolean): Self = {
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
    def withTop(value: Boolean): Self = {
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
    def withWidth(value: Boolean): Self = {
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


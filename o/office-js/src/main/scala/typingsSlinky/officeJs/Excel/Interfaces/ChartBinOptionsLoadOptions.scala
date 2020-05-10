package typingsSlinky.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Encapsulates the bin options for histogram charts and pareto charts.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait ChartBinOptionsLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies whether or not the bin overflow is enabled in a histogram chart or pareto chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var allowOverflow: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies whether or not the bin underflow is enabled in a histogram chart or pareto chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var allowUnderflow: js.UndefOr[Boolean] = js.native
  /**
    *
    * Returns or sets the bin count of a histogram chart or pareto chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var count: js.UndefOr[Boolean] = js.native
  /**
    *
    * Returns or sets the bin overflow value of a histogram chart or pareto chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var overflowValue: js.UndefOr[Boolean] = js.native
  /**
    *
    * Returns or sets the bin's type for a histogram chart or pareto chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var `type`: js.UndefOr[Boolean] = js.native
  /**
    *
    * Returns or sets the bin underflow value of a histogram chart or pareto chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var underflowValue: js.UndefOr[Boolean] = js.native
  /**
    *
    * Returns or sets the bin width value of a histogram chart or pareto chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var width: js.UndefOr[Boolean] = js.native
}

object ChartBinOptionsLoadOptions {
  @scala.inline
  def apply(): ChartBinOptionsLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartBinOptionsLoadOptions]
  }
  @scala.inline
  implicit class ChartBinOptionsLoadOptionsOps[Self <: ChartBinOptionsLoadOptions] (val x: Self) extends AnyVal {
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
    def withAllowOverflow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowOverflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowOverflow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowOverflow")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowUnderflow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUnderflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowUnderflow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUnderflow")(js.undefined)
        ret
    }
    @scala.inline
    def withCount(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.undefined)
        ret
    }
    @scala.inline
    def withOverflowValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverflowValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowValue")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUnderflowValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underflowValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnderflowValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underflowValue")(js.undefined)
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


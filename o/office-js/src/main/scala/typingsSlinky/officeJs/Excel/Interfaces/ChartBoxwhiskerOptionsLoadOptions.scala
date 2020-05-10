package typingsSlinky.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the properties of a box and whisker chart.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait ChartBoxwhiskerOptionsLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Returns or sets the quartile calculation type of a box and whisker chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var quartileCalculation: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies whether or not the inner points are shown in a box and whisker chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showInnerPoints: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies whether or not the mean line is shown in a box and whisker chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showMeanLine: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies whether or not the mean marker is shown in a box and whisker chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showMeanMarker: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies whether or not outlier points are shown in a box and whisker chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showOutlierPoints: js.UndefOr[Boolean] = js.native
}

object ChartBoxwhiskerOptionsLoadOptions {
  @scala.inline
  def apply(): ChartBoxwhiskerOptionsLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartBoxwhiskerOptionsLoadOptions]
  }
  @scala.inline
  implicit class ChartBoxwhiskerOptionsLoadOptionsOps[Self <: ChartBoxwhiskerOptionsLoadOptions] (val x: Self) extends AnyVal {
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
    def withQuartileCalculation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quartileCalculation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuartileCalculation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quartileCalculation")(js.undefined)
        ret
    }
    @scala.inline
    def withShowInnerPoints(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInnerPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowInnerPoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInnerPoints")(js.undefined)
        ret
    }
    @scala.inline
    def withShowMeanLine(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMeanLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowMeanLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMeanLine")(js.undefined)
        ret
    }
    @scala.inline
    def withShowMeanMarker(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMeanMarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowMeanMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMeanMarker")(js.undefined)
        ret
    }
    @scala.inline
    def withShowOutlierPoints(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOutlierPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowOutlierPoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOutlierPoints")(js.undefined)
        ret
    }
  }
  
}


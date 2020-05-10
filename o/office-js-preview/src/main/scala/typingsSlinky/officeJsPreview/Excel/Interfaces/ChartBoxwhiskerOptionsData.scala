package typingsSlinky.officeJsPreview.Excel.Interfaces

import typingsSlinky.officeJsPreview.Excel.ChartBoxQuartileCalculation
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Exclusive
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Inclusive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `chartBoxwhiskerOptions.toJSON()`. */
@js.native
trait ChartBoxwhiskerOptionsData extends js.Object {
  /**
    *
    * Returns or sets the quartile calculation type of a box and whisker chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var quartileCalculation: js.UndefOr[ChartBoxQuartileCalculation | Inclusive | Exclusive] = js.native
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

object ChartBoxwhiskerOptionsData {
  @scala.inline
  def apply(): ChartBoxwhiskerOptionsData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartBoxwhiskerOptionsData]
  }
  @scala.inline
  implicit class ChartBoxwhiskerOptionsDataOps[Self <: ChartBoxwhiskerOptionsData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQuartileCalculation(value: ChartBoxQuartileCalculation | Inclusive | Exclusive): Self = {
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


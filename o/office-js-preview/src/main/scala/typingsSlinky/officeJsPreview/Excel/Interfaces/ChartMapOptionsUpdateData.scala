package typingsSlinky.officeJsPreview.Excel.Interfaces

import typingsSlinky.officeJsPreview.Excel.ChartMapAreaLevel
import typingsSlinky.officeJsPreview.Excel.ChartMapLabelStrategy
import typingsSlinky.officeJsPreview.Excel.ChartMapProjectionType
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Albers
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Automatic
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.BestFit
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.City
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Continent
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Country
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.County
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.DataOnly
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Mercator
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Miller
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.None
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Robinson
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ShowAll
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.State
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.World
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartMapOptions object, for use in `chartMapOptions.set({ ... })`. */
@js.native
trait ChartMapOptionsUpdateData extends js.Object {
  /**
    *
    * Returns or sets the series map labels strategy of a region map chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var labelStrategy: js.UndefOr[ChartMapLabelStrategy | None | BestFit | ShowAll] = js.native
  /**
    *
    * Returns or sets the series mapping level of a region map chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var level: js.UndefOr[
    ChartMapAreaLevel | Automatic | DataOnly | City | County | State | Country | Continent | World
  ] = js.native
  /**
    *
    * Returns or sets the series projection type of a region map chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var projectionType: js.UndefOr[ChartMapProjectionType | Automatic | Mercator | Miller | Robinson | Albers] = js.native
}

object ChartMapOptionsUpdateData {
  @scala.inline
  def apply(): ChartMapOptionsUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartMapOptionsUpdateData]
  }
  @scala.inline
  implicit class ChartMapOptionsUpdateDataOps[Self <: ChartMapOptionsUpdateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabelStrategy(value: ChartMapLabelStrategy | None | BestFit | ShowAll): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelStrategy")(js.undefined)
        ret
    }
    @scala.inline
    def withLevel(
      value: ChartMapAreaLevel | Automatic | DataOnly | City | County | State | Country | Continent | World
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectionType(value: ChartMapProjectionType | Automatic | Mercator | Miller | Robinson | Albers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectionType")(js.undefined)
        ret
    }
  }
  
}


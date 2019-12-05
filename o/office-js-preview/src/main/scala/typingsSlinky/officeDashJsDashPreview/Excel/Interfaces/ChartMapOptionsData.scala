package typingsSlinky.officeDashJsDashPreview.Excel.Interfaces

import typingsSlinky.officeDashJsDashPreview.Excel.ChartMapAreaLevel
import typingsSlinky.officeDashJsDashPreview.Excel.ChartMapLabelStrategy
import typingsSlinky.officeDashJsDashPreview.Excel.ChartMapProjectionType
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Albers
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Automatic
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.BestFit
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.City
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Continent
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Country
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.County
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.DataOnly
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Mercator
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Miller
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.None
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Robinson
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ShowAll
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.State
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.World
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `chartMapOptions.toJSON()`. */
trait ChartMapOptionsData extends js.Object {
  /**
    *
    * Returns or sets the series map labels strategy of a region map chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var labelStrategy: js.UndefOr[ChartMapLabelStrategy | None | BestFit | ShowAll] = js.undefined
  /**
    *
    * Returns or sets the series mapping level of a region map chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var level: js.UndefOr[
    ChartMapAreaLevel | Automatic | DataOnly | City | County | State | Country | Continent | World
  ] = js.undefined
  /**
    *
    * Returns or sets the series projection type of a region map chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var projectionType: js.UndefOr[ChartMapProjectionType | Automatic | Mercator | Miller | Robinson | Albers] = js.undefined
}

object ChartMapOptionsData {
  @scala.inline
  def apply(
    labelStrategy: ChartMapLabelStrategy | None | BestFit | ShowAll = null,
    level: ChartMapAreaLevel | Automatic | DataOnly | City | County | State | Country | Continent | World = null,
    projectionType: ChartMapProjectionType | Automatic | Mercator | Miller | Robinson | Albers = null
  ): ChartMapOptionsData = {
    val __obj = js.Dynamic.literal()
    if (labelStrategy != null) __obj.updateDynamic("labelStrategy")(labelStrategy.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (projectionType != null) __obj.updateDynamic("projectionType")(projectionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartMapOptionsData]
  }
}


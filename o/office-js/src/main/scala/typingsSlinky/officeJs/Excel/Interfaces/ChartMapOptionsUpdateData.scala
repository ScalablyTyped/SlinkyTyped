package typingsSlinky.officeJs.Excel.Interfaces

import typingsSlinky.officeJs.Excel.ChartMapAreaLevel
import typingsSlinky.officeJs.Excel.ChartMapLabelStrategy
import typingsSlinky.officeJs.Excel.ChartMapProjectionType
import typingsSlinky.officeJs.officeJsStrings.Albers
import typingsSlinky.officeJs.officeJsStrings.Automatic
import typingsSlinky.officeJs.officeJsStrings.BestFit
import typingsSlinky.officeJs.officeJsStrings.City
import typingsSlinky.officeJs.officeJsStrings.Continent
import typingsSlinky.officeJs.officeJsStrings.Country
import typingsSlinky.officeJs.officeJsStrings.County
import typingsSlinky.officeJs.officeJsStrings.DataOnly
import typingsSlinky.officeJs.officeJsStrings.Mercator
import typingsSlinky.officeJs.officeJsStrings.Miller
import typingsSlinky.officeJs.officeJsStrings.None
import typingsSlinky.officeJs.officeJsStrings.Robinson
import typingsSlinky.officeJs.officeJsStrings.ShowAll
import typingsSlinky.officeJs.officeJsStrings.State
import typingsSlinky.officeJs.officeJsStrings.World
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartMapOptions object, for use in `chartMapOptions.set({ ... })`. */
trait ChartMapOptionsUpdateData extends js.Object {
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

object ChartMapOptionsUpdateData {
  @scala.inline
  def apply(
    labelStrategy: ChartMapLabelStrategy | None | BestFit | ShowAll = null,
    level: ChartMapAreaLevel | Automatic | DataOnly | City | County | State | Country | Continent | World = null,
    projectionType: ChartMapProjectionType | Automatic | Mercator | Miller | Robinson | Albers = null
  ): ChartMapOptionsUpdateData = {
    val __obj = js.Dynamic.literal()
    if (labelStrategy != null) __obj.updateDynamic("labelStrategy")(labelStrategy.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (projectionType != null) __obj.updateDynamic("projectionType")(projectionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartMapOptionsUpdateData]
  }
}


package typingsSlinky.officeDashJs.Excel.Interfaces

import typingsSlinky.officeDashJs.Excel.ChartMapAreaLevel
import typingsSlinky.officeDashJs.Excel.ChartMapLabelStrategy
import typingsSlinky.officeDashJs.Excel.ChartMapProjectionType
import typingsSlinky.officeDashJs.officeDashJsStrings.Albers
import typingsSlinky.officeDashJs.officeDashJsStrings.Automatic
import typingsSlinky.officeDashJs.officeDashJsStrings.BestFit
import typingsSlinky.officeDashJs.officeDashJsStrings.City
import typingsSlinky.officeDashJs.officeDashJsStrings.Continent
import typingsSlinky.officeDashJs.officeDashJsStrings.Country
import typingsSlinky.officeDashJs.officeDashJsStrings.County
import typingsSlinky.officeDashJs.officeDashJsStrings.DataOnly
import typingsSlinky.officeDashJs.officeDashJsStrings.Mercator
import typingsSlinky.officeDashJs.officeDashJsStrings.Miller
import typingsSlinky.officeDashJs.officeDashJsStrings.None
import typingsSlinky.officeDashJs.officeDashJsStrings.Robinson
import typingsSlinky.officeDashJs.officeDashJsStrings.ShowAll
import typingsSlinky.officeDashJs.officeDashJsStrings.State
import typingsSlinky.officeDashJs.officeDashJsStrings.World
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


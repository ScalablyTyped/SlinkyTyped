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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ChartMapOptions object, for use in `chartMapOptions.set({ ... })`. */
@js.native
trait ChartMapOptionsUpdateData extends StObject {
  
  /**
    *
    * Specifies the series map labels strategy of a region map chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var labelStrategy: js.UndefOr[ChartMapLabelStrategy | None | BestFit | ShowAll] = js.native
  
  /**
    *
    * Specifies the series mapping level of a region map chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var level: js.UndefOr[
    ChartMapAreaLevel | Automatic | DataOnly | City | County | State | Country | Continent | World
  ] = js.native
  
  /**
    *
    * Specifies the series projection type of a region map chart.
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
  implicit class ChartMapOptionsUpdateDataMutableBuilder[Self <: ChartMapOptionsUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabelStrategy(value: ChartMapLabelStrategy | None | BestFit | ShowAll): Self = StObject.set(x, "labelStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelStrategyUndefined: Self = StObject.set(x, "labelStrategy", js.undefined)
    
    @scala.inline
    def setLevel(
      value: ChartMapAreaLevel | Automatic | DataOnly | City | County | State | Country | Continent | World
    ): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    @scala.inline
    def setProjectionType(value: ChartMapProjectionType | Automatic | Mercator | Miller | Robinson | Albers): Self = StObject.set(x, "projectionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectionTypeUndefined: Self = StObject.set(x, "projectionType", js.undefined)
  }
}

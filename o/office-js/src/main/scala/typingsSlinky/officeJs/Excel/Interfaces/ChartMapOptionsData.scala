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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `chartMapOptions.toJSON()`. */
@js.native
trait ChartMapOptionsData extends js.Object {
  
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
object ChartMapOptionsData {
  
  @scala.inline
  def apply(): ChartMapOptionsData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartMapOptionsData]
  }
  
  @scala.inline
  implicit class ChartMapOptionsDataOps[Self <: ChartMapOptionsData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLabelStrategy(value: ChartMapLabelStrategy | None | BestFit | ShowAll): Self = this.set("labelStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelStrategy: Self = this.set("labelStrategy", js.undefined)
    
    @scala.inline
    def setLevel(
      value: ChartMapAreaLevel | Automatic | DataOnly | City | County | State | Country | Continent | World
    ): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setProjectionType(value: ChartMapProjectionType | Automatic | Mercator | Miller | Robinson | Albers): Self = this.set("projectionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectionType: Self = this.set("projectionType", js.undefined)
  }
}

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

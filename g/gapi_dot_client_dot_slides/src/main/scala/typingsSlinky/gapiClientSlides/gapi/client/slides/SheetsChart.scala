package typingsSlinky.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SheetsChart extends js.Object {
  
  /**
    * The ID of the specific chart in the Google Sheets spreadsheet that is
    * embedded.
    */
  var chartId: js.UndefOr[Double] = js.native
  
  /**
    * The URL of an image of the embedded chart, with a default lifetime of 30
    * minutes. This URL is tagged with the account of the requester. Anyone with
    * the URL effectively accesses the image as the original requester. Access to
    * the image may be lost if the presentation's sharing settings change.
    */
  var contentUrl: js.UndefOr[String] = js.native
  
  /** The properties of the Sheets chart. */
  var sheetsChartProperties: js.UndefOr[SheetsChartProperties] = js.native
  
  /** The ID of the Google Sheets spreadsheet that contains the source chart. */
  var spreadsheetId: js.UndefOr[String] = js.native
}
object SheetsChart {
  
  @scala.inline
  def apply(): SheetsChart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SheetsChart]
  }
  
  @scala.inline
  implicit class SheetsChartOps[Self <: SheetsChart] (val x: Self) extends AnyVal {
    
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
    def setChartId(value: Double): Self = this.set("chartId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChartId: Self = this.set("chartId", js.undefined)
    
    @scala.inline
    def setContentUrl(value: String): Self = this.set("contentUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentUrl: Self = this.set("contentUrl", js.undefined)
    
    @scala.inline
    def setSheetsChartProperties(value: SheetsChartProperties): Self = this.set("sheetsChartProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSheetsChartProperties: Self = this.set("sheetsChartProperties", js.undefined)
    
    @scala.inline
    def setSpreadsheetId(value: String): Self = this.set("spreadsheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpreadsheetId: Self = this.set("spreadsheetId", js.undefined)
  }
}

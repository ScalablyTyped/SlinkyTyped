package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddChartRequest extends js.Object {
  
  /**
    * The chart that should be added to the spreadsheet, including the position
    * where it should be placed. The chartId
    * field is optional; if one is not set, an id will be randomly generated. (It
    * is an error to specify the ID of an embedded object that already exists.)
    */
  var chart: js.UndefOr[EmbeddedChart] = js.native
}
object AddChartRequest {
  
  @scala.inline
  def apply(): AddChartRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddChartRequest]
  }
  
  @scala.inline
  implicit class AddChartRequestOps[Self <: AddChartRequest] (val x: Self) extends AnyVal {
    
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
    def setChart(value: EmbeddedChart): Self = this.set("chart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChart: Self = this.set("chart", js.undefined)
  }
}

package typingsSlinky.officeJsPreview.Excel

import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ChartDeleted
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Local
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Remote
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Provides information about the chart that raised the Deleted event.
  *
  * [Api set: ExcelApi 1.8]
  */
@js.native
trait ChartDeletedEventArgs extends StObject {
  
  /**
    *
    * Gets the id of the chart that is deleted from the worksheet.
    *
    * [Api set: ExcelApi 1.8]
    */
  var chartId: String = js.native
  
  /**
    *
    * Gets the source of the event. See Excel.EventSource for details.
    *
    * [Api set: ExcelApi 1.8]
    */
  var source: EventSource | Local | Remote = js.native
  
  /**
    *
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi 1.8]
    */
  var `type`: ChartDeleted = js.native
  
  /**
    *
    * Gets the id of the worksheet in which the chart is deleted.
    *
    * [Api set: ExcelApi 1.8]
    */
  var worksheetId: String = js.native
}
object ChartDeletedEventArgs {
  
  @scala.inline
  def apply(chartId: String, source: EventSource | Local | Remote, `type`: ChartDeleted, worksheetId: String): ChartDeletedEventArgs = {
    val __obj = js.Dynamic.literal(chartId = chartId.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartDeletedEventArgs]
  }
  
  @scala.inline
  implicit class ChartDeletedEventArgsMutableBuilder[Self <: ChartDeletedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChartId(value: String): Self = StObject.set(x, "chartId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: EventSource | Local | Remote): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ChartDeleted): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorksheetId(value: String): Self = StObject.set(x, "worksheetId", value.asInstanceOf[js.Any])
  }
}

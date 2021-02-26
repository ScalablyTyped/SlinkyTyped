package typingsSlinky.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportStatus extends StObject {
  
  /** If the report failed, this records the cause. */
  var failure: js.UndefOr[ReportFailure] = js.native
  
  /** The time when this report either completed successfully or failed. */
  var finishTimeMs: js.UndefOr[String] = js.native
  
  /** The file type of the report. */
  var format: js.UndefOr[String] = js.native
  
  /** The state of the report. */
  var state: js.UndefOr[String] = js.native
}
object ReportStatus {
  
  @scala.inline
  def apply(): ReportStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportStatus]
  }
  
  @scala.inline
  implicit class ReportStatusMutableBuilder[Self <: ReportStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailure(value: ReportFailure): Self = StObject.set(x, "failure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureUndefined: Self = StObject.set(x, "failure", js.undefined)
    
    @scala.inline
    def setFinishTimeMs(value: String): Self = StObject.set(x, "finishTimeMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinishTimeMsUndefined: Self = StObject.set(x, "finishTimeMs", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}

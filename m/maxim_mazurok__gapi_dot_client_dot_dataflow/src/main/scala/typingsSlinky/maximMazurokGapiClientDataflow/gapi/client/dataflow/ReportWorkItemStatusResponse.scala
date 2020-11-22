package typingsSlinky.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportWorkItemStatusResponse extends js.Object {
  
  /** Untranslated bag-of-bytes WorkProgressUpdateResponse for UnifiedWorker. */
  var unifiedWorkerResponse: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typingsSlinky.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.ReportWorkItemStatusResponse with TopLevel[js.Any]
  ] = js.native
  
  /**
    * A set of messages indicating the service-side state for each WorkItem whose status was reported, in the same order as the WorkItemStatus messages in the ReportWorkItemStatusRequest
    * which resulting in this response.
    */
  var workItemServiceStates: js.UndefOr[js.Array[WorkItemServiceState]] = js.native
}
object ReportWorkItemStatusResponse {
  
  @scala.inline
  def apply(): ReportWorkItemStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportWorkItemStatusResponse]
  }
  
  @scala.inline
  implicit class ReportWorkItemStatusResponseOps[Self <: ReportWorkItemStatusResponse] (val x: Self) extends AnyVal {
    
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
    def setUnifiedWorkerResponse(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typingsSlinky.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.ReportWorkItemStatusResponse with TopLevel[js.Any]
    ): Self = this.set("unifiedWorkerResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnifiedWorkerResponse: Self = this.set("unifiedWorkerResponse", js.undefined)
    
    @scala.inline
    def setWorkItemServiceStatesVarargs(value: WorkItemServiceState*): Self = this.set("workItemServiceStates", js.Array(value :_*))
    
    @scala.inline
    def setWorkItemServiceStates(value: js.Array[WorkItemServiceState]): Self = this.set("workItemServiceStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkItemServiceStates: Self = this.set("workItemServiceStates", js.undefined)
  }
}

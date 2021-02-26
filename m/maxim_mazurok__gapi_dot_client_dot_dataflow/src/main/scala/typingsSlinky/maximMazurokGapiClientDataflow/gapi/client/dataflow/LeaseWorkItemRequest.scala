package typingsSlinky.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LeaseWorkItemRequest extends StObject {
  
  /** The current timestamp at the worker. */
  var currentWorkerTime: js.UndefOr[String] = js.native
  
  /** The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that contains the WorkItem's job. */
  var location: js.UndefOr[String] = js.native
  
  /** The initial lease period. */
  var requestedLeaseDuration: js.UndefOr[String] = js.native
  
  /** Untranslated bag-of-bytes WorkRequest from UnifiedWorker. */
  var unifiedWorkerRequest: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typingsSlinky.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.LeaseWorkItemRequest with TopLevel[js.Any]
  ] = js.native
  
  /** Filter for WorkItem type. */
  var workItemTypes: js.UndefOr[js.Array[String]] = js.native
  
  /** Worker capabilities. WorkItems might be limited to workers with specific capabilities. */
  var workerCapabilities: js.UndefOr[js.Array[String]] = js.native
  
  /** Identifies the worker leasing work -- typically the ID of the virtual machine running the worker. */
  var workerId: js.UndefOr[String] = js.native
}
object LeaseWorkItemRequest {
  
  @scala.inline
  def apply(): LeaseWorkItemRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeaseWorkItemRequest]
  }
  
  @scala.inline
  implicit class LeaseWorkItemRequestMutableBuilder[Self <: LeaseWorkItemRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentWorkerTime(value: String): Self = StObject.set(x, "currentWorkerTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentWorkerTimeUndefined: Self = StObject.set(x, "currentWorkerTime", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setRequestedLeaseDuration(value: String): Self = StObject.set(x, "requestedLeaseDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedLeaseDurationUndefined: Self = StObject.set(x, "requestedLeaseDuration", js.undefined)
    
    @scala.inline
    def setUnifiedWorkerRequest(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typingsSlinky.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.LeaseWorkItemRequest with TopLevel[js.Any]
    ): Self = StObject.set(x, "unifiedWorkerRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnifiedWorkerRequestUndefined: Self = StObject.set(x, "unifiedWorkerRequest", js.undefined)
    
    @scala.inline
    def setWorkItemTypes(value: js.Array[String]): Self = StObject.set(x, "workItemTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkItemTypesUndefined: Self = StObject.set(x, "workItemTypes", js.undefined)
    
    @scala.inline
    def setWorkItemTypesVarargs(value: String*): Self = StObject.set(x, "workItemTypes", js.Array(value :_*))
    
    @scala.inline
    def setWorkerCapabilities(value: js.Array[String]): Self = StObject.set(x, "workerCapabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerCapabilitiesUndefined: Self = StObject.set(x, "workerCapabilities", js.undefined)
    
    @scala.inline
    def setWorkerCapabilitiesVarargs(value: String*): Self = StObject.set(x, "workerCapabilities", js.Array(value :_*))
    
    @scala.inline
    def setWorkerId(value: String): Self = StObject.set(x, "workerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerIdUndefined: Self = StObject.set(x, "workerId", js.undefined)
  }
}

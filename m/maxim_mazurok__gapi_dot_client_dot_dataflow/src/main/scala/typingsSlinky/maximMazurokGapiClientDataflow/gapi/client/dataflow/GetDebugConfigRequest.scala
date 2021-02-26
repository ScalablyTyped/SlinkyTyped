package typingsSlinky.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDebugConfigRequest extends StObject {
  
  /** The internal component id for which debug configuration is requested. */
  var componentId: js.UndefOr[String] = js.native
  
  /** The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that contains the job specified by job_id. */
  var location: js.UndefOr[String] = js.native
  
  /** The worker id, i.e., VM hostname. */
  var workerId: js.UndefOr[String] = js.native
}
object GetDebugConfigRequest {
  
  @scala.inline
  def apply(): GetDebugConfigRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDebugConfigRequest]
  }
  
  @scala.inline
  implicit class GetDebugConfigRequestMutableBuilder[Self <: GetDebugConfigRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponentId(value: String): Self = StObject.set(x, "componentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentIdUndefined: Self = StObject.set(x, "componentId", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setWorkerId(value: String): Self = StObject.set(x, "workerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerIdUndefined: Self = StObject.set(x, "workerId", js.undefined)
  }
}

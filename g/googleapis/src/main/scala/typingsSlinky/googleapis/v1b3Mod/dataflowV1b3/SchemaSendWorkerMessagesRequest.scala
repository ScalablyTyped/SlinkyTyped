package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A request for sending worker messages to the service.
  */
@js.native
trait SchemaSendWorkerMessagesRequest extends StObject {
  
  /**
    * The [regional endpoint]
    * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that
    * contains the job.
    */
  var location: js.UndefOr[String] = js.native
  
  /**
    * The WorkerMessages to send.
    */
  var workerMessages: js.UndefOr[js.Array[SchemaWorkerMessage]] = js.native
}
object SchemaSendWorkerMessagesRequest {
  
  @scala.inline
  def apply(): SchemaSendWorkerMessagesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSendWorkerMessagesRequest]
  }
  
  @scala.inline
  implicit class SchemaSendWorkerMessagesRequestMutableBuilder[Self <: SchemaSendWorkerMessagesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setWorkerMessages(value: js.Array[SchemaWorkerMessage]): Self = StObject.set(x, "workerMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerMessagesUndefined: Self = StObject.set(x, "workerMessages", js.undefined)
    
    @scala.inline
    def setWorkerMessagesVarargs(value: SchemaWorkerMessage*): Self = StObject.set(x, "workerMessages", js.Array(value :_*))
  }
}

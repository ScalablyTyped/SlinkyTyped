package typingsSlinky.maximMazurokGapiClientServicecontrol.gapi.client.servicecontrol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Api extends StObject {
  
  /**
    * The API operation name. For gRPC requests, it is the fully qualified API method name, such as "google.pubsub.v1.Publisher.Publish". For OpenAPI requests, it is the `operationId`,
    * such as "getPet".
    */
  var operation: js.UndefOr[String] = js.native
  
  /** The API protocol used for sending the request, such as "http", "https", "grpc", or "internal". */
  var protocol: js.UndefOr[String] = js.native
  
  /**
    * The API service name. It is a logical identifier for a networked API, such as "pubsub.googleapis.com". The naming syntax depends on the API management system being used for handling
    * the request.
    */
  var service: js.UndefOr[String] = js.native
  
  /** The API version associated with the API operation above, such as "v1" or "v1alpha1". */
  var version: js.UndefOr[String] = js.native
}
object Api {
  
  @scala.inline
  def apply(): Api = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Api]
  }
  
  @scala.inline
  implicit class ApiMutableBuilder[Self <: Api] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    @scala.inline
    def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    @scala.inline
    def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}

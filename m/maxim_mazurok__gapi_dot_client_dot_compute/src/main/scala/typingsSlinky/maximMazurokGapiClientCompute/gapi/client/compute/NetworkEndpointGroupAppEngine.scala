package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkEndpointGroupAppEngine extends StObject {
  
  /**
    * Optional serving service.
    *
    * The service name is case-sensitive and must be 1-63 characters long.
    *
    * Example value: "default", "my-service".
    */
  var service: js.UndefOr[String] = js.native
  
  /**
    * A template to parse service and version fields from a request URL. URL mask allows for routing to multiple App Engine services without having to create multiple Network Endpoint
    * Groups and backend services.
    *
    * For example, the request URLs "foo1-dot-appname.appspot.com/v1" and "foo1-dot-appname.appspot.com/v2" can be backed by the same Serverless NEG with URL mask
    * "-dot-appname.appspot.com/". The URL mask will parse them to { service = "foo1", version = "v1" } and { service = "foo1", version = "v2" } respectively.
    */
  var urlMask: js.UndefOr[String] = js.native
  
  /**
    * Optional serving version.
    *
    * The version name is case-sensitive and must be 1-100 characters long.
    *
    * Example value: "v1", "v2".
    */
  var version: js.UndefOr[String] = js.native
}
object NetworkEndpointGroupAppEngine {
  
  @scala.inline
  def apply(): NetworkEndpointGroupAppEngine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkEndpointGroupAppEngine]
  }
  
  @scala.inline
  implicit class NetworkEndpointGroupAppEngineMutableBuilder[Self <: NetworkEndpointGroupAppEngine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
    
    @scala.inline
    def setUrlMask(value: String): Self = StObject.set(x, "urlMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlMaskUndefined: Self = StObject.set(x, "urlMask", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}

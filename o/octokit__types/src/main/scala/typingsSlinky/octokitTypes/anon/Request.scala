package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.AppsUnsuspendInstallationEndpoint
import typingsSlinky.octokitTypes.endpointsMod.AppsUnsuspendInstallationRequestOptions
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Request extends StObject {
  
  var parameters: AppsUnsuspendInstallationEndpoint = js.native
  
  var request: AppsUnsuspendInstallationRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object Request {
  
  @scala.inline
  def apply(
    parameters: AppsUnsuspendInstallationEndpoint,
    request: AppsUnsuspendInstallationRequestOptions,
    response: OctokitResponse[_]
  ): Request = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
  
  @scala.inline
  implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: AppsUnsuspendInstallationEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: AppsUnsuspendInstallationRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}

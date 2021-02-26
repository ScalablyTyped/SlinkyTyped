package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.AppsCreateContentAttachmentEndpoint
import typingsSlinky.octokitTypes.endpointsMod.AppsCreateContentAttachmentRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.AppsCreateContentAttachmentResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersAppsCreateContentAttachmentEndpoint extends StObject {
  
  var parameters: AppsCreateContentAttachmentEndpoint = js.native
  
  var request: AppsCreateContentAttachmentRequestOptions = js.native
  
  var response: OctokitResponse[AppsCreateContentAttachmentResponseData] = js.native
}
object ParametersAppsCreateContentAttachmentEndpoint {
  
  @scala.inline
  def apply(
    parameters: AppsCreateContentAttachmentEndpoint,
    request: AppsCreateContentAttachmentRequestOptions,
    response: OctokitResponse[AppsCreateContentAttachmentResponseData]
  ): ParametersAppsCreateContentAttachmentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsCreateContentAttachmentEndpoint]
  }
  
  @scala.inline
  implicit class ParametersAppsCreateContentAttachmentEndpointMutableBuilder[Self <: ParametersAppsCreateContentAttachmentEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: AppsCreateContentAttachmentEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: AppsCreateContentAttachmentRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsCreateContentAttachmentResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}

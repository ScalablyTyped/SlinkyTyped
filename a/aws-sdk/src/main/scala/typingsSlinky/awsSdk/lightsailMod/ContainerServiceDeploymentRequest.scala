package typingsSlinky.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerServiceDeploymentRequest extends StObject {
  
  /**
    * An object that describes the configuration for the containers of the deployment.
    */
  var containers: js.UndefOr[ContainerMap] = js.native
  
  /**
    * An object that describes the endpoint of the deployment.
    */
  var publicEndpoint: js.UndefOr[EndpointRequest] = js.native
}
object ContainerServiceDeploymentRequest {
  
  @scala.inline
  def apply(): ContainerServiceDeploymentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerServiceDeploymentRequest]
  }
  
  @scala.inline
  implicit class ContainerServiceDeploymentRequestMutableBuilder[Self <: ContainerServiceDeploymentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainers(value: ContainerMap): Self = StObject.set(x, "containers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainersUndefined: Self = StObject.set(x, "containers", js.undefined)
    
    @scala.inline
    def setPublicEndpoint(value: EndpointRequest): Self = StObject.set(x, "publicEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicEndpointUndefined: Self = StObject.set(x, "publicEndpoint", js.undefined)
  }
}

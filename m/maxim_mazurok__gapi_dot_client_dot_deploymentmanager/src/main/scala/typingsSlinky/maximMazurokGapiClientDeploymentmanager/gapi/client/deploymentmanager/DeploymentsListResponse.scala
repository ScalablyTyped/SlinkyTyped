package typingsSlinky.maximMazurokGapiClientDeploymentmanager.gapi.client.deploymentmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeploymentsListResponse extends StObject {
  
  /** Output only. The deployments contained in this response. */
  var deployments: js.UndefOr[js.Array[Deployment]] = js.native
  
  /** Output only. A token used to continue a truncated list request. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object DeploymentsListResponse {
  
  @scala.inline
  def apply(): DeploymentsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentsListResponse]
  }
  
  @scala.inline
  implicit class DeploymentsListResponseMutableBuilder[Self <: DeploymentsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeployments(value: js.Array[Deployment]): Self = StObject.set(x, "deployments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentsUndefined: Self = StObject.set(x, "deployments", js.undefined)
    
    @scala.inline
    def setDeploymentsVarargs(value: Deployment*): Self = StObject.set(x, "deployments", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}

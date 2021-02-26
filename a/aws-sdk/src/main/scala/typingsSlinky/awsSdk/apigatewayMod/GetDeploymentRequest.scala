package typingsSlinky.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDeploymentRequest extends StObject {
  
  /**
    * [Required] The identifier of the Deployment resource to get information about.
    */
  var deploymentId: String = js.native
  
  /**
    * A query parameter to retrieve the specified embedded resources of the returned Deployment resource in the response. In a REST API call, this embed parameter value is a list of comma-separated strings, as in GET /restapis/{restapi_id}/deployments/{deployment_id}?embed=var1,var2. The SDK and other platform-dependent libraries might use a different format for the list. Currently, this request supports only retrieval of the embedded API summary this way. Hence, the parameter value must be a single-valued list containing only the "apisummary" string. For example, GET /restapis/{restapi_id}/deployments/{deployment_id}?embed=apisummary.
    */
  var embed: js.UndefOr[ListOfString] = js.native
  
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String = js.native
}
object GetDeploymentRequest {
  
  @scala.inline
  def apply(deploymentId: String, restApiId: String): GetDeploymentRequest = {
    val __obj = js.Dynamic.literal(deploymentId = deploymentId.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeploymentRequest]
  }
  
  @scala.inline
  implicit class GetDeploymentRequestMutableBuilder[Self <: GetDeploymentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeploymentId(value: String): Self = StObject.set(x, "deploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbed(value: ListOfString): Self = StObject.set(x, "embed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbedUndefined: Self = StObject.set(x, "embed", js.undefined)
    
    @scala.inline
    def setEmbedVarargs(value: String*): Self = StObject.set(x, "embed", js.Array(value :_*))
    
    @scala.inline
    def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
  }
}

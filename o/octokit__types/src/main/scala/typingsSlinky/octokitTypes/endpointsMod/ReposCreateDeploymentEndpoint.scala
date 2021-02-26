package typingsSlinky.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposCreateDeploymentEndpoint extends StObject {
  
  /**
    * Attempts to automatically merge the default branch into the requested ref, if it's behind the default branch.
    */
  var auto_merge: js.UndefOr[Boolean] = js.native
  
  /**
    * Short description of the deployment.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Name for the target deployment environment (e.g., `production`, `staging`, `qa`).
    */
  var environment: js.UndefOr[String] = js.native
  
  var owner: String = js.native
  
  /**
    * JSON payload with extra information about the deployment.
    */
  var payload: js.UndefOr[js.Any] = js.native
  
  /**
    * Specifies if the given environment is one that end-users directly interact with. Default: `true` when `environment` is `production` and `false` otherwise.
    * **Note:** This parameter requires you to use the [`application/vnd.github.ant-man-preview+json`](https://developer.github.com/v3/previews/#enhanced-deployments) custom media type.
    */
  var production_environment: js.UndefOr[Boolean] = js.native
  
  /**
    * The ref to deploy. This can be a branch, tag, or SHA.
    */
  var ref: String = js.native
  
  var repo: String = js.native
  
  /**
    * The [status](https://developer.github.com/v3/repos/statuses/) contexts to verify against commit status checks. If you omit this parameter, GitHub verifies all unique contexts before creating a deployment. To bypass checking entirely, pass an empty array. Defaults to all unique contexts.
    */
  var required_contexts: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Specifies a task to execute (e.g., `deploy` or `deploy:migrations`).
    */
  var task: js.UndefOr[String] = js.native
  
  /**
    * Specifies if the given environment is specific to the deployment and will no longer exist at some point in the future. Default: `false`
    * **Note:** This parameter requires you to use the [`application/vnd.github.ant-man-preview+json`](https://developer.github.com/v3/previews/#enhanced-deployments) custom media type. **Note:** This parameter requires you to use the [`application/vnd.github.ant-man-preview+json`](https://developer.github.com/v3/previews/#enhanced-deployments) custom media type.
    */
  var transient_environment: js.UndefOr[Boolean] = js.native
}
object ReposCreateDeploymentEndpoint {
  
  @scala.inline
  def apply(owner: String, ref: String, repo: String): ReposCreateDeploymentEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateDeploymentEndpoint]
  }
  
  @scala.inline
  implicit class ReposCreateDeploymentEndpointMutableBuilder[Self <: ReposCreateDeploymentEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuto_merge(value: Boolean): Self = StObject.set(x, "auto_merge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuto_mergeUndefined: Self = StObject.set(x, "auto_merge", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayload(value: js.Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    @scala.inline
    def setProduction_environment(value: Boolean): Self = StObject.set(x, "production_environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProduction_environmentUndefined: Self = StObject.set(x, "production_environment", js.undefined)
    
    @scala.inline
    def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequired_contexts(value: js.Array[String]): Self = StObject.set(x, "required_contexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequired_contextsUndefined: Self = StObject.set(x, "required_contexts", js.undefined)
    
    @scala.inline
    def setRequired_contextsVarargs(value: String*): Self = StObject.set(x, "required_contexts", js.Array(value :_*))
    
    @scala.inline
    def setTask(value: String): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskUndefined: Self = StObject.set(x, "task", js.undefined)
    
    @scala.inline
    def setTransient_environment(value: Boolean): Self = StObject.set(x, "transient_environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransient_environmentUndefined: Self = StObject.set(x, "transient_environment", js.undefined)
  }
}

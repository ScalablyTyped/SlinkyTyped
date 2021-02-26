package typingsSlinky.awsSdk.ecrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetRepositoryPolicyRequest extends StObject {
  
  /**
    * If the policy you are attempting to set on a repository policy would prevent you from setting another policy in the future, you must force the SetRepositoryPolicy operation. This is intended to prevent accidental repository lock outs.
    */
  var force: js.UndefOr[ForceFlag] = js.native
  
  /**
    * The JSON repository policy text to apply to the repository. For more information, see Amazon ECR Repository Policies in the Amazon Elastic Container Registry User Guide.
    */
  var policyText: RepositoryPolicyText = js.native
  
  /**
    * The AWS account ID associated with the registry that contains the repository. If you do not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.native
  
  /**
    * The name of the repository to receive the policy.
    */
  var repositoryName: RepositoryName = js.native
}
object SetRepositoryPolicyRequest {
  
  @scala.inline
  def apply(policyText: RepositoryPolicyText, repositoryName: RepositoryName): SetRepositoryPolicyRequest = {
    val __obj = js.Dynamic.literal(policyText = policyText.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetRepositoryPolicyRequest]
  }
  
  @scala.inline
  implicit class SetRepositoryPolicyRequestMutableBuilder[Self <: SetRepositoryPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForce(value: ForceFlag): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    @scala.inline
    def setPolicyText(value: RepositoryPolicyText): Self = StObject.set(x, "policyText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistryId(value: RegistryId): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
    
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
  }
}

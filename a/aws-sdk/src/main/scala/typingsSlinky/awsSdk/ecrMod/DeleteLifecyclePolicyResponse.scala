package typingsSlinky.awsSdk.ecrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteLifecyclePolicyResponse extends StObject {
  
  /**
    * The time stamp of the last time that the lifecycle policy was run.
    */
  var lastEvaluatedAt: js.UndefOr[js.Date] = js.native
  
  /**
    * The JSON lifecycle policy text.
    */
  var lifecyclePolicyText: js.UndefOr[LifecyclePolicyText] = js.native
  
  /**
    * The registry ID associated with the request.
    */
  var registryId: js.UndefOr[RegistryId] = js.native
  
  /**
    * The repository name associated with the request.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.native
}
object DeleteLifecyclePolicyResponse {
  
  @scala.inline
  def apply(): DeleteLifecyclePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteLifecyclePolicyResponse]
  }
  
  @scala.inline
  implicit class DeleteLifecyclePolicyResponseMutableBuilder[Self <: DeleteLifecyclePolicyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastEvaluatedAt(value: js.Date): Self = StObject.set(x, "lastEvaluatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastEvaluatedAtUndefined: Self = StObject.set(x, "lastEvaluatedAt", js.undefined)
    
    @scala.inline
    def setLifecyclePolicyText(value: LifecyclePolicyText): Self = StObject.set(x, "lifecyclePolicyText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifecyclePolicyTextUndefined: Self = StObject.set(x, "lifecyclePolicyText", js.undefined)
    
    @scala.inline
    def setRegistryId(value: RegistryId): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
    
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryNameUndefined: Self = StObject.set(x, "repositoryName", js.undefined)
  }
}

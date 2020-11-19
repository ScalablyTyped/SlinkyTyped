package typingsSlinky.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteLifecyclePolicyResponse extends js.Object {
  
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
  implicit class DeleteLifecyclePolicyResponseOps[Self <: DeleteLifecyclePolicyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLastEvaluatedAt(value: js.Date): Self = this.set("lastEvaluatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastEvaluatedAt: Self = this.set("lastEvaluatedAt", js.undefined)
    
    @scala.inline
    def setLifecyclePolicyText(value: LifecyclePolicyText): Self = this.set("lifecyclePolicyText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLifecyclePolicyText: Self = this.set("lifecyclePolicyText", js.undefined)
    
    @scala.inline
    def setRegistryId(value: RegistryId): Self = this.set("registryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegistryId: Self = this.set("registryId", js.undefined)
    
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepositoryName: Self = this.set("repositoryName", js.undefined)
  }
}

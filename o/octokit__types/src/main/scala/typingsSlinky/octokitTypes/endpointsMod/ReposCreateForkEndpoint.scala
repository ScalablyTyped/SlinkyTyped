package typingsSlinky.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposCreateForkEndpoint extends js.Object {
  
  /**
    * Optional parameter to specify the organization name if forking into an organization.
    */
  var organization: js.UndefOr[String] = js.native
  
  var owner: String = js.native
  
  var repo: String = js.native
}
object ReposCreateForkEndpoint {
  
  @scala.inline
  def apply(owner: String, repo: String): ReposCreateForkEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateForkEndpoint]
  }
  
  @scala.inline
  implicit class ReposCreateForkEndpointOps[Self <: ReposCreateForkEndpoint] (val x: Self) extends AnyVal {
    
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
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganization(value: String): Self = this.set("organization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrganization: Self = this.set("organization", js.undefined)
  }
}

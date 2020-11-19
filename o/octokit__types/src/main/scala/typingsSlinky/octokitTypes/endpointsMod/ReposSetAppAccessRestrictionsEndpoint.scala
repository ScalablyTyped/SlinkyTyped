package typingsSlinky.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposSetAppAccessRestrictionsEndpoint extends js.Object {
  
  /**
    * apps parameter
    */
  var apps: js.Array[String] = js.native
  
  var branch: String = js.native
  
  var owner: String = js.native
  
  var repo: String = js.native
}
object ReposSetAppAccessRestrictionsEndpoint {
  
  @scala.inline
  def apply(apps: js.Array[String], branch: String, owner: String, repo: String): ReposSetAppAccessRestrictionsEndpoint = {
    val __obj = js.Dynamic.literal(apps = apps.asInstanceOf[js.Any], branch = branch.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposSetAppAccessRestrictionsEndpoint]
  }
  
  @scala.inline
  implicit class ReposSetAppAccessRestrictionsEndpointOps[Self <: ReposSetAppAccessRestrictionsEndpoint] (val x: Self) extends AnyVal {
    
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
    def setAppsVarargs(value: String*): Self = this.set("apps", js.Array(value :_*))
    
    @scala.inline
    def setApps(value: js.Array[String]): Self = this.set("apps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranch(value: String): Self = this.set("branch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
  }
}

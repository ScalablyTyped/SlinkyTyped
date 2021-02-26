package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.octokitTypesStrings.admin
import typingsSlinky.octokitTypes.octokitTypesStrings.maintain
import typingsSlinky.octokitTypes.octokitTypesStrings.pull
import typingsSlinky.octokitTypes.octokitTypesStrings.push
import typingsSlinky.octokitTypes.octokitTypesStrings.triage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeamsAddOrUpdateRepoPermissionsInOrgEndpoint extends StObject {
  
  @JSName("org")
  var org_ : String = js.native
  
  var owner: String = js.native
  
  /**
    * The permission to grant the team on this repository. Can be one of:
    * \* `pull` - team members can pull, but not push to or administer this repository.
    * \* `push` - team members can pull and push, but not administer this repository.
    * \* `admin` - team members can pull, push and administer this repository.
    * \* `maintain` - team members can manage the repository without access to sensitive or destructive actions. Recommended for project managers. Only applies to repositories owned by organizations.
    * \* `triage` - team members can proactively manage issues and pull requests without write access. Recommended for contributors who triage a repository. Only applies to repositories owned by organizations.
    *
    * If no permission is specified, the team's `permission` attribute will be used to determine what permission to grant the team on this repository.
    */
  var permission: js.UndefOr[pull | push | admin | maintain | triage] = js.native
  
  var repo: String = js.native
  
  var team_slug: String = js.native
}
object TeamsAddOrUpdateRepoPermissionsInOrgEndpoint {
  
  @scala.inline
  def apply(org_ : String, owner: String, repo: String, team_slug: String): TeamsAddOrUpdateRepoPermissionsInOrgEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsAddOrUpdateRepoPermissionsInOrgEndpoint]
  }
  
  @scala.inline
  implicit class TeamsAddOrUpdateRepoPermissionsInOrgEndpointMutableBuilder[Self <: TeamsAddOrUpdateRepoPermissionsInOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermission(value: pull | push | admin | maintain | triage): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeam_slug(value: String): Self = StObject.set(x, "team_slug", value.asInstanceOf[js.Any])
  }
}

package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.octokitTypesStrings.admin
import typingsSlinky.octokitTypes.octokitTypesStrings.closed
import typingsSlinky.octokitTypes.octokitTypesStrings.pull
import typingsSlinky.octokitTypes.octokitTypesStrings.push
import typingsSlinky.octokitTypes.octokitTypesStrings.secret
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeamsCreateEndpoint extends js.Object {
  
  /**
    * The description of the team.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * List GitHub IDs for organization members who will become team maintainers.
    */
  var maintainers: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The name of the team.
    */
  var name: String = js.native
  
  @JSName("org")
  var org_ : String = js.native
  
  /**
    * The ID of a team to set as the parent team.
    */
  var parent_team_id: js.UndefOr[Double] = js.native
  
  /**
    * **Deprecated**. The permission that new repositories will be added to the team with when none is specified. Can be one of:
    * \* `pull` - team members can pull, but not push to or administer newly-added repositories.
    * \* `push` - team members can pull and push, but not administer newly-added repositories.
    * \* `admin` - team members can pull, push and administer newly-added repositories.
    */
  var permission: js.UndefOr[pull | push | admin] = js.native
  
  /**
    * The level of privacy this team should have. The options are:
    * **For a non-nested team:**
    * \* `secret` - only visible to organization owners and members of this team.
    * \* `closed` - visible to all members of this organization.
    * Default: `secret`
    * **For a parent or child team:**
    * \* `closed` - visible to all members of this organization.
    * Default for child team: `closed`
    */
  var privacy: js.UndefOr[secret | closed] = js.native
  
  /**
    * The full name (e.g., "organization-name/repository-name") of repositories to add the team to.
    */
  var repo_names: js.UndefOr[js.Array[String]] = js.native
}
object TeamsCreateEndpoint {
  
  @scala.inline
  def apply(name: String, org_ : String): TeamsCreateEndpoint = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsCreateEndpoint]
  }
  
  @scala.inline
  implicit class TeamsCreateEndpointOps[Self <: TeamsCreateEndpoint] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrg_(value: String): Self = this.set("org", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setMaintainersVarargs(value: String*): Self = this.set("maintainers", js.Array(value :_*))
    
    @scala.inline
    def setMaintainers(value: js.Array[String]): Self = this.set("maintainers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaintainers: Self = this.set("maintainers", js.undefined)
    
    @scala.inline
    def setParent_team_id(value: Double): Self = this.set("parent_team_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent_team_id: Self = this.set("parent_team_id", js.undefined)
    
    @scala.inline
    def setPermission(value: pull | push | admin): Self = this.set("permission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermission: Self = this.set("permission", js.undefined)
    
    @scala.inline
    def setPrivacy(value: secret | closed): Self = this.set("privacy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivacy: Self = this.set("privacy", js.undefined)
    
    @scala.inline
    def setRepo_namesVarargs(value: String*): Self = this.set("repo_names", js.Array(value :_*))
    
    @scala.inline
    def setRepo_names(value: js.Array[String]): Self = this.set("repo_names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepo_names: Self = this.set("repo_names", js.undefined)
  }
}

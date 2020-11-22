package typingsSlinky.contentfulManagement.teamSpaceMembershipMod

import typingsSlinky.contentfulManagement.commonTypesMod.MetaLinkProps
import typingsSlinky.contentfulManagement.commonTypesMod.MetaSysProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeamSpaceMembershipProps extends js.Object {
  
  /**
    * Is admin
    */
  var admin: Boolean = js.native
  
  /**
    * Roles
    */
  var roles: js.Array[MetaLinkProps] = js.native
  
  /**
    * System metadata
    */
  var sys: MetaSysProps = js.native
}
object TeamSpaceMembershipProps {
  
  @scala.inline
  def apply(admin: Boolean, roles: js.Array[MetaLinkProps], sys: MetaSysProps): TeamSpaceMembershipProps = {
    val __obj = js.Dynamic.literal(admin = admin.asInstanceOf[js.Any], roles = roles.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamSpaceMembershipProps]
  }
  
  @scala.inline
  implicit class TeamSpaceMembershipPropsOps[Self <: TeamSpaceMembershipProps] (val x: Self) extends AnyVal {
    
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
    def setAdmin(value: Boolean): Self = this.set("admin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRolesVarargs(value: MetaLinkProps*): Self = this.set("roles", js.Array(value :_*))
    
    @scala.inline
    def setRoles(value: js.Array[MetaLinkProps]): Self = this.set("roles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSys(value: MetaSysProps): Self = this.set("sys", value.asInstanceOf[js.Any])
  }
}

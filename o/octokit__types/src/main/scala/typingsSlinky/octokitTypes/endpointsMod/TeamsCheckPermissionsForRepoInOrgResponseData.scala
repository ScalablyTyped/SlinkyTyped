package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.anon.Allowmergecommit
import typingsSlinky.octokitTypes.anon.Avatarurl
import typingsSlinky.octokitTypes.anon.Maintain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeamsCheckPermissionsForRepoInOrgResponseData extends StObject {
  
  var organization: Avatarurl = js.native
  
  var parent: Allowmergecommit = js.native
  
  var permissions: Maintain = js.native
  
  var source: Allowmergecommit = js.native
}
object TeamsCheckPermissionsForRepoInOrgResponseData {
  
  @scala.inline
  def apply(organization: Avatarurl, parent: Allowmergecommit, permissions: Maintain, source: Allowmergecommit): TeamsCheckPermissionsForRepoInOrgResponseData = {
    val __obj = js.Dynamic.literal(organization = organization.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsCheckPermissionsForRepoInOrgResponseData]
  }
  
  @scala.inline
  implicit class TeamsCheckPermissionsForRepoInOrgResponseDataMutableBuilder[Self <: TeamsCheckPermissionsForRepoInOrgResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrganization(value: Avatarurl): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: Allowmergecommit): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissions(value: Maintain): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: Allowmergecommit): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}

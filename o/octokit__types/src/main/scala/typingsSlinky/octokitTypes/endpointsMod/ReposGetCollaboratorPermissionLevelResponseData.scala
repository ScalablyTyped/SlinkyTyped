package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.anon.Avatarurl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposGetCollaboratorPermissionLevelResponseData extends StObject {
  
  var permission: String = js.native
  
  var user: Avatarurl = js.native
}
object ReposGetCollaboratorPermissionLevelResponseData {
  
  @scala.inline
  def apply(permission: String, user: Avatarurl): ReposGetCollaboratorPermissionLevelResponseData = {
    val __obj = js.Dynamic.literal(permission = permission.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetCollaboratorPermissionLevelResponseData]
  }
  
  @scala.inline
  implicit class ReposGetCollaboratorPermissionLevelResponseDataMutableBuilder[Self <: ReposGetCollaboratorPermissionLevelResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPermission(value: String): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: Avatarurl): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}

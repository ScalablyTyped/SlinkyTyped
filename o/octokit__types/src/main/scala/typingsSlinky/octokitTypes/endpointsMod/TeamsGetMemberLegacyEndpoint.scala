package typingsSlinky.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeamsGetMemberLegacyEndpoint extends StObject {
  
  var team_id: Double = js.native
  
  var username: String = js.native
}
object TeamsGetMemberLegacyEndpoint {
  
  @scala.inline
  def apply(team_id: Double, username: String): TeamsGetMemberLegacyEndpoint = {
    val __obj = js.Dynamic.literal(team_id = team_id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsGetMemberLegacyEndpoint]
  }
  
  @scala.inline
  implicit class TeamsGetMemberLegacyEndpointMutableBuilder[Self <: TeamsGetMemberLegacyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTeam_id(value: Double): Self = StObject.set(x, "team_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}

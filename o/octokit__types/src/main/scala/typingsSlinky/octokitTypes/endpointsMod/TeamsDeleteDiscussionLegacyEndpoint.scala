package typingsSlinky.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeamsDeleteDiscussionLegacyEndpoint extends StObject {
  
  var discussion_number: Double = js.native
  
  var team_id: Double = js.native
}
object TeamsDeleteDiscussionLegacyEndpoint {
  
  @scala.inline
  def apply(discussion_number: Double, team_id: Double): TeamsDeleteDiscussionLegacyEndpoint = {
    val __obj = js.Dynamic.literal(discussion_number = discussion_number.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsDeleteDiscussionLegacyEndpoint]
  }
  
  @scala.inline
  implicit class TeamsDeleteDiscussionLegacyEndpointMutableBuilder[Self <: TeamsDeleteDiscussionLegacyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiscussion_number(value: Double): Self = StObject.set(x, "discussion_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeam_id(value: Double): Self = StObject.set(x, "team_id", value.asInstanceOf[js.Any])
  }
}

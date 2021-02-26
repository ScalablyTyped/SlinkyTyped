package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.anon.Avatarurl
import typingsSlinky.octokitTypes.anon.Membersurl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PullsListRequestedReviewersResponseData extends StObject {
  
  var teams: js.Array[Membersurl] = js.native
  
  var users: js.Array[Avatarurl] = js.native
}
object PullsListRequestedReviewersResponseData {
  
  @scala.inline
  def apply(teams: js.Array[Membersurl], users: js.Array[Avatarurl]): PullsListRequestedReviewersResponseData = {
    val __obj = js.Dynamic.literal(teams = teams.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsListRequestedReviewersResponseData]
  }
  
  @scala.inline
  implicit class PullsListRequestedReviewersResponseDataMutableBuilder[Self <: PullsListRequestedReviewersResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTeams(value: js.Array[Membersurl]): Self = StObject.set(x, "teams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamsVarargs(value: Membersurl*): Self = StObject.set(x, "teams", js.Array(value :_*))
    
    @scala.inline
    def setUsers(value: js.Array[Avatarurl]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsersVarargs(value: Avatarurl*): Self = StObject.set(x, "users", js.Array(value :_*))
  }
}

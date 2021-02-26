package typingsSlinky.maximMazurokGapiClientGamesmanagement.gapi.client.gamesmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScoresResetMultipleForAllRequest extends StObject {
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `gamesManagement#scoresResetMultipleForAllRequest`. */
  var kind: js.UndefOr[String] = js.native
  
  /** The IDs of leaderboards to reset. */
  var leaderboard_ids: js.UndefOr[js.Array[String]] = js.native
}
object ScoresResetMultipleForAllRequest {
  
  @scala.inline
  def apply(): ScoresResetMultipleForAllRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScoresResetMultipleForAllRequest]
  }
  
  @scala.inline
  implicit class ScoresResetMultipleForAllRequestMutableBuilder[Self <: ScoresResetMultipleForAllRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLeaderboard_ids(value: js.Array[String]): Self = StObject.set(x, "leaderboard_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeaderboard_idsUndefined: Self = StObject.set(x, "leaderboard_ids", js.undefined)
    
    @scala.inline
    def setLeaderboard_idsVarargs(value: String*): Self = StObject.set(x, "leaderboard_ids", js.Array(value :_*))
  }
}

package typingsSlinky.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlayerScoreResponse extends StObject {
  
  /** The time spans where the submitted score is better than the existing score for that time span. */
  var beatenScoreTimeSpans: js.UndefOr[js.Array[String]] = js.native
  
  /** The formatted value of the submitted score. */
  var formattedScore: js.UndefOr[String] = js.native
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#playerScoreResponse`. */
  var kind: js.UndefOr[String] = js.native
  
  /** The leaderboard ID that this score was submitted to. */
  var leaderboardId: js.UndefOr[String] = js.native
  
  /** Additional information about this score. Values will contain no more than 64 URI-safe characters as defined by section 2.3 of RFC 3986. */
  var scoreTag: js.UndefOr[String] = js.native
  
  /**
    * The scores in time spans that have not been beaten. As an example, the submitted score may be better than the player's `DAILY` score, but not better than the player's scores for the
    * `WEEKLY` or `ALL_TIME` time spans.
    */
  var unbeatenScores: js.UndefOr[js.Array[PlayerScore]] = js.native
}
object PlayerScoreResponse {
  
  @scala.inline
  def apply(): PlayerScoreResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlayerScoreResponse]
  }
  
  @scala.inline
  implicit class PlayerScoreResponseMutableBuilder[Self <: PlayerScoreResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeatenScoreTimeSpans(value: js.Array[String]): Self = StObject.set(x, "beatenScoreTimeSpans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeatenScoreTimeSpansUndefined: Self = StObject.set(x, "beatenScoreTimeSpans", js.undefined)
    
    @scala.inline
    def setBeatenScoreTimeSpansVarargs(value: String*): Self = StObject.set(x, "beatenScoreTimeSpans", js.Array(value :_*))
    
    @scala.inline
    def setFormattedScore(value: String): Self = StObject.set(x, "formattedScore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormattedScoreUndefined: Self = StObject.set(x, "formattedScore", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLeaderboardId(value: String): Self = StObject.set(x, "leaderboardId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeaderboardIdUndefined: Self = StObject.set(x, "leaderboardId", js.undefined)
    
    @scala.inline
    def setScoreTag(value: String): Self = StObject.set(x, "scoreTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreTagUndefined: Self = StObject.set(x, "scoreTag", js.undefined)
    
    @scala.inline
    def setUnbeatenScores(value: js.Array[PlayerScore]): Self = StObject.set(x, "unbeatenScores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnbeatenScoresUndefined: Self = StObject.set(x, "unbeatenScores", js.undefined)
    
    @scala.inline
    def setUnbeatenScoresVarargs(value: PlayerScore*): Self = StObject.set(x, "unbeatenScores", js.Array(value :_*))
  }
}

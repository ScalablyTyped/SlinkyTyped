package typingsSlinky.gapiClientGamesmanagement.gapi.client.gamesmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlayerScoreResetResponse extends js.Object {
  
  /** The ID of an leaderboard for which player state has been updated. */
  var definitionId: js.UndefOr[String] = js.native
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string gamesManagement#playerScoreResetResponse. */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The time spans of the updated score.
    * Possible values are:
    * - "ALL_TIME" - The score is an all-time score.
    * - "WEEKLY" - The score is a weekly score.
    * - "DAILY" - The score is a daily score.
    */
  var resetScoreTimeSpans: js.UndefOr[js.Array[String]] = js.native
}
object PlayerScoreResetResponse {
  
  @scala.inline
  def apply(): PlayerScoreResetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlayerScoreResetResponse]
  }
  
  @scala.inline
  implicit class PlayerScoreResetResponseOps[Self <: PlayerScoreResetResponse] (val x: Self) extends AnyVal {
    
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
    def setDefinitionId(value: String): Self = this.set("definitionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefinitionId: Self = this.set("definitionId", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setResetScoreTimeSpansVarargs(value: String*): Self = this.set("resetScoreTimeSpans", js.Array(value :_*))
    
    @scala.inline
    def setResetScoreTimeSpans(value: js.Array[String]): Self = this.set("resetScoreTimeSpans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResetScoreTimeSpans: Self = this.set("resetScoreTimeSpans", js.undefined)
  }
}

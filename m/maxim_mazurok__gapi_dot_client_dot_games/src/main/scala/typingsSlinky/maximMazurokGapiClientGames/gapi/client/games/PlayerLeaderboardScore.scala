package typingsSlinky.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlayerLeaderboardScore extends StObject {
  
  /** The rank of the score in the friends collection for this leaderboard. */
  var friendsRank: js.UndefOr[LeaderboardScoreRank] = js.native
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#playerLeaderboardScore`. */
  var kind: js.UndefOr[String] = js.native
  
  /** The ID of the leaderboard this score is in. */
  var leaderboard_id: js.UndefOr[String] = js.native
  
  /** The public rank of the score in this leaderboard. This object will not be present if the user is not sharing their scores publicly. */
  var publicRank: js.UndefOr[LeaderboardScoreRank] = js.native
  
  /** The formatted value of this score. */
  var scoreString: js.UndefOr[String] = js.native
  
  /** Additional information about the score. Values must contain no more than 64 URI-safe characters as defined by section 2.3 of RFC 3986. */
  var scoreTag: js.UndefOr[String] = js.native
  
  /** The numerical value of this score. */
  var scoreValue: js.UndefOr[String] = js.native
  
  /** The social rank of the score in this leaderboard. */
  var socialRank: js.UndefOr[LeaderboardScoreRank] = js.native
  
  /** The time span of this score. */
  var timeSpan: js.UndefOr[String] = js.native
  
  /** The timestamp at which this score was recorded, in milliseconds since the epoch in UTC. */
  var writeTimestamp: js.UndefOr[String] = js.native
}
object PlayerLeaderboardScore {
  
  @scala.inline
  def apply(): PlayerLeaderboardScore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlayerLeaderboardScore]
  }
  
  @scala.inline
  implicit class PlayerLeaderboardScoreMutableBuilder[Self <: PlayerLeaderboardScore] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFriendsRank(value: LeaderboardScoreRank): Self = StObject.set(x, "friendsRank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFriendsRankUndefined: Self = StObject.set(x, "friendsRank", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLeaderboard_id(value: String): Self = StObject.set(x, "leaderboard_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeaderboard_idUndefined: Self = StObject.set(x, "leaderboard_id", js.undefined)
    
    @scala.inline
    def setPublicRank(value: LeaderboardScoreRank): Self = StObject.set(x, "publicRank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicRankUndefined: Self = StObject.set(x, "publicRank", js.undefined)
    
    @scala.inline
    def setScoreString(value: String): Self = StObject.set(x, "scoreString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreStringUndefined: Self = StObject.set(x, "scoreString", js.undefined)
    
    @scala.inline
    def setScoreTag(value: String): Self = StObject.set(x, "scoreTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreTagUndefined: Self = StObject.set(x, "scoreTag", js.undefined)
    
    @scala.inline
    def setScoreValue(value: String): Self = StObject.set(x, "scoreValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreValueUndefined: Self = StObject.set(x, "scoreValue", js.undefined)
    
    @scala.inline
    def setSocialRank(value: LeaderboardScoreRank): Self = StObject.set(x, "socialRank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocialRankUndefined: Self = StObject.set(x, "socialRank", js.undefined)
    
    @scala.inline
    def setTimeSpan(value: String): Self = StObject.set(x, "timeSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeSpanUndefined: Self = StObject.set(x, "timeSpan", js.undefined)
    
    @scala.inline
    def setWriteTimestamp(value: String): Self = StObject.set(x, "writeTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteTimestampUndefined: Self = StObject.set(x, "writeTimestamp", js.undefined)
  }
}

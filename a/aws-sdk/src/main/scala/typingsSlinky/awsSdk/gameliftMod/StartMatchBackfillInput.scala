package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartMatchBackfillInput extends js.Object {
  /**
    * Name of the matchmaker to use for this request. You can use either the configuration name or ARN value. The ARN of the matchmaker that was used with the original game session is listed in the GameSession object, MatchmakerData property.
    */
  var ConfigurationName: MatchmakingConfigurationName = js.native
  /**
    * Amazon Resource Name (ARN) that is assigned to a game session and uniquely identifies it. This is the same as the game session ID.
    */
  var GameSessionArn: ArnStringModel = js.native
  /**
    * Match information on all players that are currently assigned to the game session. This information is used by the matchmaker to find new players and add them to the existing game.   PlayerID, PlayerAttributes, Team -\\- This information is maintained in the GameSession object, MatchmakerData property, for all players who are currently assigned to the game session. The matchmaker data is in JSON syntax, formatted as a string. For more details, see  Match Data.    LatencyInMs -\\- If the matchmaker uses player latency, include a latency value, in milliseconds, for the Region that the game session is currently in. Do not include latency values for any other Region.  
    */
  var Players: PlayerList = js.native
  /**
    * A unique identifier for a matchmaking ticket. If no ticket ID is specified here, Amazon GameLift will generate one in the form of a UUID. Use this identifier to track the match backfill ticket status and retrieve match results.
    */
  var TicketId: js.UndefOr[MatchmakingIdStringModel] = js.native
}

object StartMatchBackfillInput {
  @scala.inline
  def apply(
    ConfigurationName: MatchmakingConfigurationName,
    GameSessionArn: ArnStringModel,
    Players: PlayerList
  ): StartMatchBackfillInput = {
    val __obj = js.Dynamic.literal(ConfigurationName = ConfigurationName.asInstanceOf[js.Any], GameSessionArn = GameSessionArn.asInstanceOf[js.Any], Players = Players.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartMatchBackfillInput]
  }
  @scala.inline
  implicit class StartMatchBackfillInputOps[Self <: StartMatchBackfillInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigurationName(value: MatchmakingConfigurationName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGameSessionArn(value: ArnStringModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GameSessionArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlayers(value: PlayerList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Players")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTicketId(value: MatchmakingIdStringModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TicketId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTicketId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TicketId")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartMatchmakingInput extends js.Object {
  /**
    * Name of the matchmaking configuration to use for this request. Matchmaking configurations must exist in the same Region as this request. You can use either the configuration name or ARN value.
    */
  var ConfigurationName: MatchmakingConfigurationName = js.native
  /**
    * Information on each player to be matched. This information must include a player ID, and may contain player attributes and latency data to be used in the matchmaking process. After a successful match, Player objects contain the name of the team the player is assigned to.
    */
  var Players: PlayerList = js.native
  /**
    * A unique identifier for a matchmaking ticket. If no ticket ID is specified here, Amazon GameLift will generate one in the form of a UUID. Use this identifier to track the matchmaking ticket status and retrieve match results.
    */
  var TicketId: js.UndefOr[MatchmakingIdStringModel] = js.native
}

object StartMatchmakingInput {
  @scala.inline
  def apply(ConfigurationName: MatchmakingConfigurationName, Players: PlayerList): StartMatchmakingInput = {
    val __obj = js.Dynamic.literal(ConfigurationName = ConfigurationName.asInstanceOf[js.Any], Players = Players.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartMatchmakingInput]
  }
  @scala.inline
  implicit class StartMatchmakingInputOps[Self <: StartMatchmakingInput] (val x: Self) extends AnyVal {
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


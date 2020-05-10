package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatchmakingTicket extends js.Object {
  /**
    * The Amazon Resource Name (ARN) associated with the GameLift matchmaking configuration resource that is used with this ticket.
    */
  var ConfigurationArn: js.UndefOr[MatchmakingConfigurationArn] = js.native
  /**
    * Name of the MatchmakingConfiguration that is used with this ticket. Matchmaking configurations determine how players are grouped into a match and how a new game session is created for the match.
    */
  var ConfigurationName: js.UndefOr[MatchmakingIdStringModel] = js.native
  /**
    * Time stamp indicating when this matchmaking request stopped being processed due to success, failure, or cancellation. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var EndTime: js.UndefOr[js.Date] = js.native
  /**
    * Average amount of time (in seconds) that players are currently waiting for a match. If there is not enough recent data, this property may be empty.
    */
  var EstimatedWaitTime: js.UndefOr[WholeNumber] = js.native
  /**
    * Identifier and connection information of the game session created for the match. This information is added to the ticket only after the matchmaking request has been successfully completed.
    */
  var GameSessionConnectionInfo: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.GameSessionConnectionInfo] = js.native
  /**
    * A set of Player objects, each representing a player to find matches for. Players are identified by a unique player ID and may include latency data for use during matchmaking. If the ticket is in status COMPLETED, the Player objects include the team the players were assigned to in the resulting match.
    */
  var Players: js.UndefOr[PlayerList] = js.native
  /**
    * Time stamp indicating when this matchmaking request was received. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var StartTime: js.UndefOr[js.Date] = js.native
  /**
    * Current status of the matchmaking request.    QUEUED -- The matchmaking request has been received and is currently waiting to be processed.    SEARCHING -- The matchmaking request is currently being processed.     REQUIRES_ACCEPTANCE -- A match has been proposed and the players must accept the match (see AcceptMatch). This status is used only with requests that use a matchmaking configuration with a player acceptance requirement.    PLACING -- The FlexMatch engine has matched players and is in the process of placing a new game session for the match.    COMPLETED -- Players have been matched and a game session is ready to host the players. A ticket in this state contains the necessary connection information for players.    FAILED -- The matchmaking request was not completed.    CANCELLED -- The matchmaking request was canceled. This may be the result of a call to StopMatchmaking or a proposed match that one or more players failed to accept.    TIMED_OUT -- The matchmaking request was not successful within the duration specified in the matchmaking configuration.     Matchmaking requests that fail to successfully complete (statuses FAILED, CANCELLED, TIMED_OUT) can be resubmitted as new requests with new ticket IDs. 
    */
  var Status: js.UndefOr[MatchmakingConfigurationStatus] = js.native
  /**
    * Additional information about the current status.
    */
  var StatusMessage: js.UndefOr[StringModel] = js.native
  /**
    * Code to explain the current status. For example, a status reason may indicate when a ticket has returned to SEARCHING status after a proposed match fails to receive player acceptances.
    */
  var StatusReason: js.UndefOr[StringModel] = js.native
  /**
    * A unique identifier for a matchmaking ticket.
    */
  var TicketId: js.UndefOr[MatchmakingIdStringModel] = js.native
}

object MatchmakingTicket {
  @scala.inline
  def apply(): MatchmakingTicket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchmakingTicket]
  }
  @scala.inline
  implicit class MatchmakingTicketOps[Self <: MatchmakingTicket] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigurationArn(value: MatchmakingConfigurationArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationArn")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigurationName(value: MatchmakingIdStringModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationName")(js.undefined)
        ret
    }
    @scala.inline
    def withEndTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndTime")(js.undefined)
        ret
    }
    @scala.inline
    def withEstimatedWaitTime(value: WholeNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EstimatedWaitTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEstimatedWaitTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EstimatedWaitTime")(js.undefined)
        ret
    }
    @scala.inline
    def withGameSessionConnectionInfo(value: GameSessionConnectionInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GameSessionConnectionInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGameSessionConnectionInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GameSessionConnectionInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withPlayers(value: PlayerList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Players")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlayers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Players")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTime")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: MatchmakingConfigurationStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusMessage(value: StringModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusReason(value: StringModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusReason")(js.undefined)
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


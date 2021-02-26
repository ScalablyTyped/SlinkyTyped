package typingsSlinky.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MatchmakingTicket extends StObject {
  
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
  implicit class MatchmakingTicketMutableBuilder[Self <: MatchmakingTicket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationArn(value: MatchmakingConfigurationArn): Self = StObject.set(x, "ConfigurationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationArnUndefined: Self = StObject.set(x, "ConfigurationArn", js.undefined)
    
    @scala.inline
    def setConfigurationName(value: MatchmakingIdStringModel): Self = StObject.set(x, "ConfigurationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationNameUndefined: Self = StObject.set(x, "ConfigurationName", js.undefined)
    
    @scala.inline
    def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    @scala.inline
    def setEstimatedWaitTime(value: WholeNumber): Self = StObject.set(x, "EstimatedWaitTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedWaitTimeUndefined: Self = StObject.set(x, "EstimatedWaitTime", js.undefined)
    
    @scala.inline
    def setGameSessionConnectionInfo(value: GameSessionConnectionInfo): Self = StObject.set(x, "GameSessionConnectionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGameSessionConnectionInfoUndefined: Self = StObject.set(x, "GameSessionConnectionInfo", js.undefined)
    
    @scala.inline
    def setPlayers(value: PlayerList): Self = StObject.set(x, "Players", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayersUndefined: Self = StObject.set(x, "Players", js.undefined)
    
    @scala.inline
    def setPlayersVarargs(value: Player*): Self = StObject.set(x, "Players", js.Array(value :_*))
    
    @scala.inline
    def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    @scala.inline
    def setStatus(value: MatchmakingConfigurationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessage(value: StringModel): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    @scala.inline
    def setStatusReason(value: StringModel): Self = StObject.set(x, "StatusReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusReasonUndefined: Self = StObject.set(x, "StatusReason", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTicketId(value: MatchmakingIdStringModel): Self = StObject.set(x, "TicketId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicketIdUndefined: Self = StObject.set(x, "TicketId", js.undefined)
  }
}

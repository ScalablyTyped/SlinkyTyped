package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GameSessionPlacement extends js.Object {
  /**
    * DNS identifier assigned to the instance that is running the game session. Values have the following format:   TLS-enabled fleets: &lt;unique identifier&gt;.&lt;region identifier&gt;.amazongamelift.com.   Non-TLS-enabled fleets: ec2-&lt;unique identifier&gt;.compute.amazonaws.com. (See Amazon EC2 Instance IP Addressing.)   When connecting to a game session that is running on a TLS-enabled fleet, you must use the DNS name, not the IP address.
    */
  var DnsName: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.DnsName] = js.native
  /**
    * Time stamp indicating when this request was completed, canceled, or timed out.
    */
  var EndTime: js.UndefOr[js.Date] = js.native
  /**
    * Set of custom properties for a game session, formatted as key:value pairs. These properties are passed to a game server process in the GameSession object with a request to start a new game session (see Start a Game Session).
    */
  var GameProperties: js.UndefOr[GamePropertyList] = js.native
  /**
    * Identifier for the game session created by this placement request. This value is set once the new game session is placed (placement status is FULFILLED). This identifier is unique across all Regions. You can use this value as a GameSessionId value as needed.
    */
  var GameSessionArn: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * Set of custom game session properties, formatted as a single string value. This data is passed to a game server process in the GameSession object with a request to start a new game session (see Start a Game Session).
    */
  var GameSessionData: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.GameSessionData] = js.native
  /**
    * A unique identifier for the game session. This value is set once the new game session is placed (placement status is FULFILLED).
    */
  var GameSessionId: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * A descriptive label that is associated with a game session. Session names do not need to be unique.
    */
  var GameSessionName: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * A descriptive label that is associated with game session queue. Queue names must be unique within each Region.
    */
  var GameSessionQueueName: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.GameSessionQueueName] = js.native
  /**
    * Name of the Region where the game session created by this placement request is running. This value is set once the new game session is placed (placement status is FULFILLED).
    */
  var GameSessionRegion: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * IP address of the instance that is running the game session. When connecting to a Amazon GameLift game server, a client needs to reference an IP address (or DNS name) and port number. This value is set once the new game session is placed (placement status is FULFILLED). 
    */
  var IpAddress: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.IpAddress] = js.native
  /**
    * Information on the matchmaking process for this game. Data is in JSON syntax, formatted as a string. It identifies the matchmaking configuration used to create the match, and contains data on all players assigned to the match, including player attributes and team assignments. For more details on matchmaker data, see Match Data.
    */
  var MatchmakerData: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.MatchmakerData] = js.native
  /**
    * The maximum number of players that can be connected simultaneously to the game session.
    */
  var MaximumPlayerSessionCount: js.UndefOr[WholeNumber] = js.native
  /**
    * A collection of information on player sessions created in response to the game session placement request. These player sessions are created only once a new game session is successfully placed (placement status is FULFILLED). This information includes the player ID (as provided in the placement request) and the corresponding player session ID. Retrieve full player sessions by calling DescribePlayerSessions with the player session ID.
    */
  var PlacedPlayerSessions: js.UndefOr[PlacedPlayerSessionList] = js.native
  /**
    * A unique identifier for a game session placement.
    */
  var PlacementId: js.UndefOr[IdStringModel] = js.native
  /**
    * Set of values, expressed in milliseconds, indicating the amount of latency that a player experiences when connected to AWS Regions.
    */
  var PlayerLatencies: js.UndefOr[PlayerLatencyList] = js.native
  /**
    * Port number for the game session. To connect to a Amazon GameLift game server, an app needs both the IP address and port number. This value is set once the new game session is placed (placement status is FULFILLED).
    */
  var Port: js.UndefOr[PortNumber] = js.native
  /**
    * Time stamp indicating when this request was placed in the queue. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var StartTime: js.UndefOr[js.Date] = js.native
  /**
    * Current status of the game session placement request.    PENDING -- The placement request is currently in the queue waiting to be processed.    FULFILLED -- A new game session and player sessions (if requested) have been successfully created. Values for GameSessionArn and GameSessionRegion are available.     CANCELLED -- The placement request was canceled with a call to StopGameSessionPlacement.    TIMED_OUT -- A new game session was not successfully created before the time limit expired. You can resubmit the placement request as needed.    FAILED -- GameLift is not able to complete the process of placing the game session. Common reasons are the game session terminated before the placement process was completed, or an unexpected internal error.  
    */
  var Status: js.UndefOr[GameSessionPlacementState] = js.native
}

object GameSessionPlacement {
  @scala.inline
  def apply(): GameSessionPlacement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GameSessionPlacement]
  }
  @scala.inline
  implicit class GameSessionPlacementOps[Self <: GameSessionPlacement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDnsName(value: DnsName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DnsName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDnsName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DnsName")(js.undefined)
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
    def withGameProperties(value: GamePropertyList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GameProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGameProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GameProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withGameSessionArn(value: NonZeroAndMaxString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GameSessionArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGameSessionArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GameSessionArn")(js.undefined)
        ret
    }
    @scala.inline
    def withGameSessionData(value: GameSessionData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GameSessionData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGameSessionData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GameSessionData")(js.undefined)
        ret
    }
    @scala.inline
    def withGameSessionId(value: NonZeroAndMaxString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GameSessionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGameSessionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GameSessionId")(js.undefined)
        ret
    }
    @scala.inline
    def withGameSessionName(value: NonZeroAndMaxString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GameSessionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGameSessionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GameSessionName")(js.undefined)
        ret
    }
    @scala.inline
    def withGameSessionQueueName(value: GameSessionQueueName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GameSessionQueueName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGameSessionQueueName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GameSessionQueueName")(js.undefined)
        ret
    }
    @scala.inline
    def withGameSessionRegion(value: NonZeroAndMaxString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GameSessionRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGameSessionRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GameSessionRegion")(js.undefined)
        ret
    }
    @scala.inline
    def withIpAddress(value: IpAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchmakerData(value: MatchmakerData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MatchmakerData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchmakerData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MatchmakerData")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumPlayerSessionCount(value: WholeNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaximumPlayerSessionCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumPlayerSessionCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaximumPlayerSessionCount")(js.undefined)
        ret
    }
    @scala.inline
    def withPlacedPlayerSessions(value: PlacedPlayerSessionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlacedPlayerSessions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacedPlayerSessions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlacedPlayerSessions")(js.undefined)
        ret
    }
    @scala.inline
    def withPlacementId(value: IdStringModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlacementId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacementId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlacementId")(js.undefined)
        ret
    }
    @scala.inline
    def withPlayerLatencies(value: PlayerLatencyList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlayerLatencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlayerLatencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlayerLatencies")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: PortNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Port")(js.undefined)
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
    def withStatus(value: GameSessionPlacementState): Self = {
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
  }
  
}


package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GameSession extends js.Object {
  /**
    * Time stamp indicating when this data object was created. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  /**
    * A unique identifier for a player. This ID is used to enforce a resource protection policy (if one exists), that limits the number of game sessions a player can create.
    */
  var CreatorId: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * Number of players currently in the game session.
    */
  var CurrentPlayerSessionCount: js.UndefOr[WholeNumber] = js.native
  /**
    * DNS identifier assigned to the instance that is running the game session. Values have the following format:   TLS-enabled fleets: &lt;unique identifier&gt;.&lt;region identifier&gt;.amazongamelift.com.   Non-TLS-enabled fleets: ec2-&lt;unique identifier&gt;.compute.amazonaws.com. (See Amazon EC2 Instance IP Addressing.)   When connecting to a game session that is running on a TLS-enabled fleet, you must use the DNS name, not the IP address.
    */
  var DnsName: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.DnsName] = js.native
  /**
    *  The Amazon Resource Name (ARN) associated with the GameLift fleet that this game session is running on. 
    */
  var FleetArn: js.UndefOr[ArnStringModel] = js.native
  /**
    * A unique identifier for a fleet that the game session is running on.
    */
  var FleetId: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.FleetId] = js.native
  /**
    * Set of custom properties for a game session, formatted as key:value pairs. These properties are passed to a game server process in the GameSession object with a request to start a new game session (see Start a Game Session). You can search for active game sessions based on this custom data with SearchGameSessions.
    */
  var GameProperties: js.UndefOr[GamePropertyList] = js.native
  /**
    * Set of custom game session properties, formatted as a single string value. This data is passed to a game server process in the GameSession object with a request to start a new game session (see Start a Game Session).
    */
  var GameSessionData: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.GameSessionData] = js.native
  /**
    * A unique identifier for the game session. A game session ARN has the following format: arn:aws:gamelift:&lt;region&gt;::gamesession/&lt;fleet ID&gt;/&lt;custom ID string or idempotency token&gt;.
    */
  var GameSessionId: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * IP address of the instance that is running the game session. When connecting to a Amazon GameLift game server, a client needs to reference an IP address (or DNS name) and port number.
    */
  var IpAddress: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.IpAddress] = js.native
  /**
    * Information about the matchmaking process that was used to create the game session. It is in JSON syntax, formatted as a string. In addition the matchmaking configuration used, it contains data on all players assigned to the match, including player attributes and team assignments. For more details on matchmaker data, see Match Data. Matchmaker data is useful when requesting match backfills, and is updated whenever new players are added during a successful backfill (see StartMatchBackfill). 
    */
  var MatchmakerData: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.MatchmakerData] = js.native
  /**
    * The maximum number of players that can be connected simultaneously to the game session.
    */
  var MaximumPlayerSessionCount: js.UndefOr[WholeNumber] = js.native
  /**
    * A descriptive label that is associated with a game session. Session names do not need to be unique.
    */
  var Name: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * Indicates whether or not the game session is accepting new players.
    */
  var PlayerSessionCreationPolicy: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.PlayerSessionCreationPolicy] = js.native
  /**
    * Port number for the game session. To connect to a Amazon GameLift game server, an app needs both the IP address and port number.
    */
  var Port: js.UndefOr[PortNumber] = js.native
  /**
    * Current status of the game session. A game session must have an ACTIVE status to have player sessions.
    */
  var Status: js.UndefOr[GameSessionStatus] = js.native
  /**
    * Provides additional information about game session status. INTERRUPTED indicates that the game session was hosted on a spot instance that was reclaimed, causing the active game session to be terminated.
    */
  var StatusReason: js.UndefOr[GameSessionStatusReason] = js.native
  /**
    * Time stamp indicating when this data object was terminated. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var TerminationTime: js.UndefOr[js.Date] = js.native
}

object GameSession {
  @scala.inline
  def apply(): GameSession = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GameSession]
  }
  @scala.inline
  implicit class GameSessionOps[Self <: GameSession] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatorId(value: NonZeroAndMaxString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatorId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatorId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatorId")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentPlayerSessionCount(value: WholeNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentPlayerSessionCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentPlayerSessionCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentPlayerSessionCount")(js.undefined)
        ret
    }
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
    def withFleetArn(value: ArnStringModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FleetArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFleetArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FleetArn")(js.undefined)
        ret
    }
    @scala.inline
    def withFleetId(value: FleetId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FleetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFleetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FleetId")(js.undefined)
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
    def withName(value: NonZeroAndMaxString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withPlayerSessionCreationPolicy(value: PlayerSessionCreationPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlayerSessionCreationPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlayerSessionCreationPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlayerSessionCreationPolicy")(js.undefined)
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
    def withStatus(value: GameSessionStatus): Self = {
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
    def withStatusReason(value: GameSessionStatusReason): Self = {
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
    def withTerminationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TerminationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerminationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TerminationTime")(js.undefined)
        ret
    }
  }
  
}


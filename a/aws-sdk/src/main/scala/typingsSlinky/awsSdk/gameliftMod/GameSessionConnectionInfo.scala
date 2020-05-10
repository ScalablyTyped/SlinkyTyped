package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GameSessionConnectionInfo extends js.Object {
  /**
    * DNS identifier assigned to the instance that is running the game session. Values have the following format:   TLS-enabled fleets: &lt;unique identifier&gt;.&lt;region identifier&gt;.amazongamelift.com.   Non-TLS-enabled fleets: ec2-&lt;unique identifier&gt;.compute.amazonaws.com. (See Amazon EC2 Instance IP Addressing.)   When connecting to a game session that is running on a TLS-enabled fleet, you must use the DNS name, not the IP address.
    */
  var DnsName: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.DnsName] = js.native
  /**
    * Amazon Resource Name (ARN) that is assigned to a game session and uniquely identifies it.
    */
  var GameSessionArn: js.UndefOr[ArnStringModel] = js.native
  /**
    * IP address of the instance that is running the game session. When connecting to a Amazon GameLift game server, a client needs to reference an IP address (or DNS name) and port number.
    */
  var IpAddress: js.UndefOr[StringModel] = js.native
  /**
    * A collection of player session IDs, one for each player ID that was included in the original matchmaking request. 
    */
  var MatchedPlayerSessions: js.UndefOr[MatchedPlayerSessionList] = js.native
  /**
    * Port number for the game session. To connect to a Amazon GameLift game server, an app needs both the IP address and port number.
    */
  var Port: js.UndefOr[PositiveInteger] = js.native
}

object GameSessionConnectionInfo {
  @scala.inline
  def apply(): GameSessionConnectionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GameSessionConnectionInfo]
  }
  @scala.inline
  implicit class GameSessionConnectionInfoOps[Self <: GameSessionConnectionInfo] (val x: Self) extends AnyVal {
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
    def withGameSessionArn(value: ArnStringModel): Self = {
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
    def withIpAddress(value: StringModel): Self = {
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
    def withMatchedPlayerSessions(value: MatchedPlayerSessionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MatchedPlayerSessions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchedPlayerSessions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MatchedPlayerSessions")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: PositiveInteger): Self = {
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
  }
  
}


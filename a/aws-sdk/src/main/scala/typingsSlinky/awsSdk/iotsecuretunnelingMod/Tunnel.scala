package typingsSlinky.awsSdk.iotsecuretunnelingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tunnel extends js.Object {
  /**
    * The time when the tunnel was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.native
  /**
    * A description of the tunnel.
    */
  var description: js.UndefOr[Description] = js.native
  /**
    * The destination configuration that specifies the thing name of the destination device and a service name that the local proxy uses to connect to the destination application.
    */
  var destinationConfig: js.UndefOr[DestinationConfig] = js.native
  /**
    * The connection state of the destination application.
    */
  var destinationConnectionState: js.UndefOr[ConnectionState] = js.native
  /**
    * The last time the tunnel was updated.
    */
  var lastUpdatedAt: js.UndefOr[js.Date] = js.native
  /**
    * The connection state of the source application.
    */
  var sourceConnectionState: js.UndefOr[ConnectionState] = js.native
  /**
    * The status of a tunnel. Valid values are: Open and Closed.
    */
  var status: js.UndefOr[TunnelStatus] = js.native
  /**
    * A list of tag metadata associated with the secure tunnel.
    */
  var tags: js.UndefOr[TagList] = js.native
  /**
    * Timeout configuration for the tunnel.
    */
  var timeoutConfig: js.UndefOr[TimeoutConfig] = js.native
  /**
    * The Amazon Resource Name (ARN) of a tunnel. The tunnel ARN format is arn:aws:tunnel:&lt;region&gt;:&lt;account-id&gt;:tunnel/&lt;tunnel-id&gt; 
    */
  var tunnelArn: js.UndefOr[TunnelArn] = js.native
  /**
    * A unique alpha-numeric ID that identifies a tunnel.
    */
  var tunnelId: js.UndefOr[TunnelId] = js.native
}

object Tunnel {
  @scala.inline
  def apply(): Tunnel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tunnel]
  }
  @scala.inline
  implicit class TunnelOps[Self <: Tunnel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Description): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDestinationConfig(value: DestinationConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withDestinationConnectionState(value: ConnectionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationConnectionState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationConnectionState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationConnectionState")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceConnectionState(value: ConnectionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceConnectionState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceConnectionState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceConnectionState")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: TunnelStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeoutConfig(value: TimeoutConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeoutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withTunnelArn(value: TunnelArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tunnelArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTunnelArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tunnelArn")(js.undefined)
        ret
    }
    @scala.inline
    def withTunnelId(value: TunnelId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tunnelId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTunnelId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tunnelId")(js.undefined)
        ret
    }
  }
  
}


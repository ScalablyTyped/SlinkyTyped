package typingsSlinky.awsSdk.iotsecuretunnelingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenTunnelResponse extends js.Object {
  /**
    * The access token the destination local proxy uses to connect to AWS IoT Secure Tunneling.
    */
  var destinationAccessToken: js.UndefOr[ClientAccessToken] = js.native
  /**
    * The access token the source local proxy uses to connect to AWS IoT Secure Tunneling.
    */
  var sourceAccessToken: js.UndefOr[ClientAccessToken] = js.native
  /**
    * The Amazon Resource Name for the tunnel. The tunnel ARN format is arn:aws:tunnel:&lt;region&gt;:&lt;account-id&gt;:tunnel/&lt;tunnel-id&gt; 
    */
  var tunnelArn: js.UndefOr[TunnelArn] = js.native
  /**
    * A unique alpha-numeric tunnel ID.
    */
  var tunnelId: js.UndefOr[TunnelId] = js.native
}

object OpenTunnelResponse {
  @scala.inline
  def apply(): OpenTunnelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenTunnelResponse]
  }
  @scala.inline
  implicit class OpenTunnelResponseOps[Self <: OpenTunnelResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestinationAccessToken(value: ClientAccessToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationAccessToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationAccessToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationAccessToken")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceAccessToken(value: ClientAccessToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceAccessToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceAccessToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceAccessToken")(js.undefined)
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


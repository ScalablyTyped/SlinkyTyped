package typingsSlinky.awsSdk.iotsecuretunnelingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenTunnelRequest extends js.Object {
  /**
    * A short text description of the tunnel. 
    */
  var description: js.UndefOr[Description] = js.native
  /**
    * The destination configuration for the OpenTunnel request.
    */
  var destinationConfig: js.UndefOr[DestinationConfig] = js.native
  /**
    * A collection of tag metadata.
    */
  var tags: js.UndefOr[TagList] = js.native
  /**
    * Timeout configuration for a tunnel.
    */
  var timeoutConfig: js.UndefOr[TimeoutConfig] = js.native
}

object OpenTunnelRequest {
  @scala.inline
  def apply(): OpenTunnelRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenTunnelRequest]
  }
  @scala.inline
  implicit class OpenTunnelRequestOps[Self <: OpenTunnelRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}


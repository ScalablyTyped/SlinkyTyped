package typingsSlinky.awsSdk.kinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SingleMasterChannelEndpointConfiguration extends js.Object {
  /**
    * This property is used to determine the nature of communication over this SINGLE_MASTER signaling channel. If WSS is specified, this API returns a websocket endpoint. If HTTPS is specified, this API returns an HTTPS endpoint.
    */
  var Protocols: js.UndefOr[ListOfProtocols] = js.native
  /**
    * This property is used to determine messaging permissions in this SINGLE_MASTER signaling channel. If MASTER is specified, this API returns an endpoint that a client can use to receive offers from and send answers to any of the viewers on this signaling channel. If VIEWER is specified, this API returns an endpoint that a client can use only to send offers to another MASTER client on this signaling channel. 
    */
  var Role: js.UndefOr[ChannelRole] = js.native
}

object SingleMasterChannelEndpointConfiguration {
  @scala.inline
  def apply(): SingleMasterChannelEndpointConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SingleMasterChannelEndpointConfiguration]
  }
  @scala.inline
  implicit class SingleMasterChannelEndpointConfigurationOps[Self <: SingleMasterChannelEndpointConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProtocols(value: ListOfProtocols): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Protocols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Protocols")(js.undefined)
        ret
    }
    @scala.inline
    def withRole(value: ChannelRole): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Role")(js.undefined)
        ret
    }
  }
  
}


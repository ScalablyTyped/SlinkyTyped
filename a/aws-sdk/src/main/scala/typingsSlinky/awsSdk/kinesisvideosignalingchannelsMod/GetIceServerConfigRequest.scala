package typingsSlinky.awsSdk.kinesisvideosignalingchannelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetIceServerConfigRequest extends js.Object {
  /**
    * The ARN of the signaling channel to be used for the peer-to-peer connection between configured peers. 
    */
  var ChannelARN: ResourceARN = js.native
  /**
    * Unique identifier for the viewer. Must be unique within the signaling channel.
    */
  var ClientId: js.UndefOr[typingsSlinky.awsSdk.kinesisvideosignalingchannelsMod.ClientId] = js.native
  /**
    * Specifies the desired service. Currently, TURN is the only valid value.
    */
  var Service: js.UndefOr[typingsSlinky.awsSdk.kinesisvideosignalingchannelsMod.Service] = js.native
  /**
    * An optional user ID to be associated with the credentials.
    */
  var Username: js.UndefOr[typingsSlinky.awsSdk.kinesisvideosignalingchannelsMod.Username] = js.native
}

object GetIceServerConfigRequest {
  @scala.inline
  def apply(ChannelARN: ResourceARN): GetIceServerConfigRequest = {
    val __obj = js.Dynamic.literal(ChannelARN = ChannelARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIceServerConfigRequest]
  }
  @scala.inline
  implicit class GetIceServerConfigRequestOps[Self <: GetIceServerConfigRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannelARN(value: ResourceARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChannelARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientId(value: ClientId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientId")(js.undefined)
        ret
    }
    @scala.inline
    def withService(value: Service): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Service")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Service")(js.undefined)
        ret
    }
    @scala.inline
    def withUsername(value: Username): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Username")(js.undefined)
        ret
    }
  }
  
}


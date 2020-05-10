package typingsSlinky.awsSdk.kinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSignalingChannelEndpointInput extends js.Object {
  /**
    * The ARN of the signalling channel for which you want to get an endpoint.
    */
  var ChannelARN: ResourceARN = js.native
  /**
    * A structure containing the endpoint configuration for the SINGLE_MASTER channel type.
    */
  var SingleMasterChannelEndpointConfiguration: js.UndefOr[typingsSlinky.awsSdk.kinesisvideoMod.SingleMasterChannelEndpointConfiguration] = js.native
}

object GetSignalingChannelEndpointInput {
  @scala.inline
  def apply(ChannelARN: ResourceARN): GetSignalingChannelEndpointInput = {
    val __obj = js.Dynamic.literal(ChannelARN = ChannelARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSignalingChannelEndpointInput]
  }
  @scala.inline
  implicit class GetSignalingChannelEndpointInputOps[Self <: GetSignalingChannelEndpointInput] (val x: Self) extends AnyVal {
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
    def withSingleMasterChannelEndpointConfiguration(value: SingleMasterChannelEndpointConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SingleMasterChannelEndpointConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleMasterChannelEndpointConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SingleMasterChannelEndpointConfiguration")(js.undefined)
        ret
    }
  }
  
}


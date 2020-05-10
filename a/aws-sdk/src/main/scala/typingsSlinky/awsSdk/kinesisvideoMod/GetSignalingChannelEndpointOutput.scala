package typingsSlinky.awsSdk.kinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSignalingChannelEndpointOutput extends js.Object {
  /**
    * A list of endpoints for the specified signaling channel.
    */
  var ResourceEndpointList: js.UndefOr[typingsSlinky.awsSdk.kinesisvideoMod.ResourceEndpointList] = js.native
}

object GetSignalingChannelEndpointOutput {
  @scala.inline
  def apply(): GetSignalingChannelEndpointOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSignalingChannelEndpointOutput]
  }
  @scala.inline
  implicit class GetSignalingChannelEndpointOutputOps[Self <: GetSignalingChannelEndpointOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceEndpointList(value: ResourceEndpointList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceEndpointList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceEndpointList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceEndpointList")(js.undefined)
        ret
    }
  }
  
}


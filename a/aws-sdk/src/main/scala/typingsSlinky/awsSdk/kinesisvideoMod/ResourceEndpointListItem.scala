package typingsSlinky.awsSdk.kinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceEndpointListItem extends js.Object {
  /**
    * The protocol of the signaling channel returned by the GetSignalingChannelEndpoint API.
    */
  var Protocol: js.UndefOr[ChannelProtocol] = js.native
  /**
    * The endpoint of the signaling channel returned by the GetSignalingChannelEndpoint API.
    */
  var ResourceEndpoint: js.UndefOr[typingsSlinky.awsSdk.kinesisvideoMod.ResourceEndpoint] = js.native
}

object ResourceEndpointListItem {
  @scala.inline
  def apply(): ResourceEndpointListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceEndpointListItem]
  }
  @scala.inline
  implicit class ResourceEndpointListItemOps[Self <: ResourceEndpointListItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProtocol(value: ChannelProtocol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Protocol")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceEndpoint(value: ResourceEndpoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceEndpoint")(js.undefined)
        ret
    }
  }
  
}


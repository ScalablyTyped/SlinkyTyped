package typingsSlinky.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteLinkRequest extends js.Object {
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: String = js.native
  /**
    * The ID of the link.
    */
  var LinkId: String = js.native
}

object DeleteLinkRequest {
  @scala.inline
  def apply(GlobalNetworkId: String, LinkId: String): DeleteLinkRequest = {
    val __obj = js.Dynamic.literal(GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any], LinkId = LinkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLinkRequest]
  }
  @scala.inline
  implicit class DeleteLinkRequestOps[Self <: DeleteLinkRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGlobalNetworkId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalNetworkId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinkId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LinkId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


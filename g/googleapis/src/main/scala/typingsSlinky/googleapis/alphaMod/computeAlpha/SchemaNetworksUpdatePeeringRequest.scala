package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaNetworksUpdatePeeringRequest extends js.Object {
  var networkPeering: js.UndefOr[SchemaNetworkPeering] = js.native
}

object SchemaNetworksUpdatePeeringRequest {
  @scala.inline
  def apply(): SchemaNetworksUpdatePeeringRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworksUpdatePeeringRequest]
  }
  @scala.inline
  implicit class SchemaNetworksUpdatePeeringRequestOps[Self <: SchemaNetworksUpdatePeeringRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNetworkPeering(value: SchemaNetworkPeering): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkPeering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkPeering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkPeering")(js.undefined)
        ret
    }
  }
  
}


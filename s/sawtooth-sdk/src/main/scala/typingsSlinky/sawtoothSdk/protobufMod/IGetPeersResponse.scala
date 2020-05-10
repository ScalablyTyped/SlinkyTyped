package typingsSlinky.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGetPeersResponse extends js.Object {
  /** GetPeersResponse peerEndpoints */
  var peerEndpoints: js.UndefOr[js.Array[String] | Null] = js.native
}

object IGetPeersResponse {
  @scala.inline
  def apply(): IGetPeersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGetPeersResponse]
  }
  @scala.inline
  implicit class IGetPeersResponseOps[Self <: IGetPeersResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPeerEndpoints(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerEndpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeerEndpoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerEndpoints")(js.undefined)
        ret
    }
    @scala.inline
    def withPeerEndpointsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerEndpoints")(null)
        ret
    }
  }
  
}


package typingsSlinky.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPeerRegisterRequest extends js.Object {
  /** PeerRegisterRequest endpoint */
  var endpoint: js.UndefOr[String | Null] = js.native
  /** PeerRegisterRequest protocolVersion */
  var protocolVersion: js.UndefOr[Double | Null] = js.native
}

object IPeerRegisterRequest {
  @scala.inline
  def apply(): IPeerRegisterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPeerRegisterRequest]
  }
  @scala.inline
  implicit class IPeerRegisterRequestOps[Self <: IPeerRegisterRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpointNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(null)
        ret
    }
    @scala.inline
    def withProtocolVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocolVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocolVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocolVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocolVersionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocolVersion")(null)
        ret
    }
  }
  
}


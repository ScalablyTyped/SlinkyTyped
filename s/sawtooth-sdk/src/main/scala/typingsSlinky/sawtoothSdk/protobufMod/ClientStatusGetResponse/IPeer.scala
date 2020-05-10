package typingsSlinky.sawtoothSdk.protobufMod.ClientStatusGetResponse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a Peer. */
@js.native
trait IPeer extends js.Object {
  /** Peer endpoint */
  var endpoint: js.UndefOr[String | Null] = js.native
}

object IPeer {
  @scala.inline
  def apply(): IPeer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPeer]
  }
  @scala.inline
  implicit class IPeerOps[Self <: IPeer] (val x: Self) extends AnyVal {
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
  }
  
}


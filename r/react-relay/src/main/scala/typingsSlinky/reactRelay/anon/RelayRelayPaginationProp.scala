package typingsSlinky.reactRelay.anon

import typingsSlinky.reactRelay.mod.RelayPaginationProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelayRelayPaginationProp extends js.Object {
  var relay: RelayPaginationProp = js.native
}

object RelayRelayPaginationProp {
  @scala.inline
  def apply(relay: RelayPaginationProp): RelayRelayPaginationProp = {
    val __obj = js.Dynamic.literal(relay = relay.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelayRelayPaginationProp]
  }
  @scala.inline
  implicit class RelayRelayPaginationPropOps[Self <: RelayRelayPaginationProp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRelay(value: RelayPaginationProp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relay")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


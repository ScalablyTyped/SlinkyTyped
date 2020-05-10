package typingsSlinky.reactRelay

import typingsSlinky.reactRelay.mod.RelayPaginationProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRelayRelayPaginationProp extends js.Object {
  var relay: RelayPaginationProp = js.native
}

object AnonRelayRelayPaginationProp {
  @scala.inline
  def apply(relay: RelayPaginationProp): AnonRelayRelayPaginationProp = {
    val __obj = js.Dynamic.literal(relay = relay.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRelayRelayPaginationProp]
  }
  @scala.inline
  implicit class AnonRelayRelayPaginationPropOps[Self <: AnonRelayRelayPaginationProp] (val x: Self) extends AnyVal {
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


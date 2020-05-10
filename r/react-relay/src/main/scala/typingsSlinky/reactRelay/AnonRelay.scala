package typingsSlinky.reactRelay

import typingsSlinky.reactRelay.mod.RelayProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRelay extends js.Object {
  var relay: js.UndefOr[RelayProp] = js.native
}

object AnonRelay {
  @scala.inline
  def apply(): AnonRelay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonRelay]
  }
  @scala.inline
  implicit class AnonRelayOps[Self <: AnonRelay] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRelay(value: RelayProp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relay")(js.undefined)
        ret
    }
  }
  
}


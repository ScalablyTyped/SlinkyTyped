package typingsSlinky.jointjs.mod.dia.Cell

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisconnectableOptions extends Options {
  var disconnectLinks: js.UndefOr[Boolean] = js.native
}

object DisconnectableOptions {
  @scala.inline
  def apply(): DisconnectableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisconnectableOptions]
  }
  @scala.inline
  implicit class DisconnectableOptionsOps[Self <: DisconnectableOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisconnectLinks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disconnectLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisconnectLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disconnectLinks")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.jointjs.mod.dia.Graph

import typingsSlinky.jointjs.mod.dia.Cell.EmbeddableOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionOptions extends EmbeddableOptions {
  var inbound: js.UndefOr[Boolean] = js.native
  var outbound: js.UndefOr[Boolean] = js.native
}

object ConnectionOptions {
  @scala.inline
  def apply(): ConnectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionOptions]
  }
  @scala.inline
  implicit class ConnectionOptionsOps[Self <: ConnectionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInbound(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inbound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInbound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inbound")(js.undefined)
        ret
    }
    @scala.inline
    def withOutbound(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outbound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutbound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outbound")(js.undefined)
        ret
    }
  }
  
}


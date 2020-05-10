package typingsSlinky.leafletRoutingMachine.mod.Routing_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WaypointOptions extends js.Object {
  var allowUTurn: js.UndefOr[Boolean] = js.native
}

object WaypointOptions {
  @scala.inline
  def apply(): WaypointOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaypointOptions]
  }
  @scala.inline
  implicit class WaypointOptionsOps[Self <: WaypointOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowUTurn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUTurn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowUTurn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUTurn")(js.undefined)
        ret
    }
  }
  
}


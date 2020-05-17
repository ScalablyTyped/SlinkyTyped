package typingsSlinky.googleMapReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ne extends js.Object {
  @JSName("ne")
  var ne_FNe: typingsSlinky.googleMapReact.mod.Coords = js.native
  var sw: typingsSlinky.googleMapReact.mod.Coords = js.native
}

object Ne {
  @scala.inline
  def apply(ne: typingsSlinky.googleMapReact.mod.Coords, sw: typingsSlinky.googleMapReact.mod.Coords): Ne = {
    val __obj = js.Dynamic.literal(ne = ne.asInstanceOf[js.Any], sw = sw.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ne]
  }
  @scala.inline
  implicit class NeOps[Self <: Ne] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNe(value: typingsSlinky.googleMapReact.mod.Coords): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ne")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSw(value: typingsSlinky.googleMapReact.mod.Coords): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sw")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


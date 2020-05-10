package typingsSlinky.googleMapReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NESWBounds extends js.Object {
  @JSName("ne")
  var ne_FNESWBounds: Coords = js.native
  var nw: js.UndefOr[Coords] = js.native
  var se: js.UndefOr[Coords] = js.native
  var sw: Coords = js.native
}

object NESWBounds {
  @scala.inline
  def apply(ne: Coords, sw: Coords): NESWBounds = {
    val __obj = js.Dynamic.literal(ne = ne.asInstanceOf[js.Any], sw = sw.asInstanceOf[js.Any])
    __obj.asInstanceOf[NESWBounds]
  }
  @scala.inline
  implicit class NESWBoundsOps[Self <: NESWBounds] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNe(value: Coords): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ne")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSw(value: Coords): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNw(value: Coords): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nw")(js.undefined)
        ret
    }
    @scala.inline
    def withSe(value: Coords): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("se")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("se")(js.undefined)
        ret
    }
  }
  
}


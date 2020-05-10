package typingsSlinky.googleMapReact

import typingsSlinky.googleMapReact.mod.Coords
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNe extends js.Object {
  @JSName("ne")
  var ne_FAnonNe: Coords = js.native
  var sw: Coords = js.native
}

object AnonNe {
  @scala.inline
  def apply(ne: Coords, sw: Coords): AnonNe = {
    val __obj = js.Dynamic.literal(ne = ne.asInstanceOf[js.Any], sw = sw.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNe]
  }
  @scala.inline
  implicit class AnonNeOps[Self <: AnonNe] (val x: Self) extends AnyVal {
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
  }
  
}


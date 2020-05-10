package typingsSlinky.googleMapReact

import typingsSlinky.googleMapReact.mod.Coords
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNw extends js.Object {
  var nw: Coords = js.native
  var se: Coords = js.native
}

object AnonNw {
  @scala.inline
  def apply(nw: Coords, se: Coords): AnonNw = {
    val __obj = js.Dynamic.literal(nw = nw.asInstanceOf[js.Any], se = se.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNw]
  }
  @scala.inline
  implicit class AnonNwOps[Self <: AnonNw] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNw(value: Coords): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSe(value: Coords): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("se")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


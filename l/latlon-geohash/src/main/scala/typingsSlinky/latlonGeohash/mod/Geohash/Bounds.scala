package typingsSlinky.latlonGeohash.mod.Geohash

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bounds extends js.Object {
  @JSName("ne")
  var ne_FBounds: Point = js.native
  var sw: Point = js.native
}

object Bounds {
  @scala.inline
  def apply(ne: Point, sw: Point): Bounds = {
    val __obj = js.Dynamic.literal(ne = ne.asInstanceOf[js.Any], sw = sw.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bounds]
  }
  @scala.inline
  implicit class BoundsOps[Self <: Bounds] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNe(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ne")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSw(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sw")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


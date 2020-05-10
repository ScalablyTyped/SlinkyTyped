package typingsSlinky.ol.kmlMod

import typingsSlinky.ol.iconAnchorUnitsMod.IconAnchorUnits
import typingsSlinky.ol.iconOriginMod.IconOrigin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Vec2 extends js.Object {
  var origin: IconOrigin = js.native
  var x: Double = js.native
  var xunits: IconAnchorUnits = js.native
  var y: Double = js.native
  var yunits: IconAnchorUnits = js.native
}

object Vec2 {
  @scala.inline
  def apply(origin: IconOrigin, x: Double, xunits: IconAnchorUnits, y: Double, yunits: IconAnchorUnits): Vec2 = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xunits = xunits.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yunits = yunits.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vec2]
  }
  @scala.inline
  implicit class Vec2Ops[Self <: Vec2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrigin(value: IconOrigin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXunits(value: IconAnchorUnits): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xunits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYunits(value: IconAnchorUnits): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yunits")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


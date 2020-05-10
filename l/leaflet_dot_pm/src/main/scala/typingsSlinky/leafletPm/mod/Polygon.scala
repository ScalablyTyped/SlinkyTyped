package typingsSlinky.leafletPm.mod

import typingsSlinky.leafletPm.mod.PM.Edit.Line
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Polygon extends js.Object {
  var pm: Line = js.native
}

object Polygon {
  @scala.inline
  def apply(pm: Line): Polygon = {
    val __obj = js.Dynamic.literal(pm = pm.asInstanceOf[js.Any])
    __obj.asInstanceOf[Polygon]
  }
  @scala.inline
  implicit class PolygonOps[Self <: Polygon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPm(value: Line): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pm")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


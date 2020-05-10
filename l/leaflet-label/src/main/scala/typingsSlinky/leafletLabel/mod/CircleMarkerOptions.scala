package typingsSlinky.leafletLabel.mod

import typingsSlinky.leaflet.mod.Point_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CircleMarkerOptions extends js.Object {
  var labelAnchor: js.UndefOr[Point_] = js.native
}

object CircleMarkerOptions {
  @scala.inline
  def apply(): CircleMarkerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CircleMarkerOptions]
  }
  @scala.inline
  implicit class CircleMarkerOptionsOps[Self <: CircleMarkerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabelAnchor(value: Point_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelAnchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelAnchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelAnchor")(js.undefined)
        ret
    }
  }
  
}


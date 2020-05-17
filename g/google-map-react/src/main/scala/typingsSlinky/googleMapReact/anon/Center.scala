package typingsSlinky.googleMapReact.anon

import typingsSlinky.googleMapReact.mod.Bounds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Center extends js.Object {
  var center: Lat = js.native
  var newBounds: Bounds = js.native
  var zoom: Double = js.native
}

object Center {
  @scala.inline
  def apply(center: Lat, newBounds: Bounds, zoom: Double): Center = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], newBounds = newBounds.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Center]
  }
  @scala.inline
  implicit class CenterOps[Self <: Center] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCenter(value: Lat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewBounds(value: Bounds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newBounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


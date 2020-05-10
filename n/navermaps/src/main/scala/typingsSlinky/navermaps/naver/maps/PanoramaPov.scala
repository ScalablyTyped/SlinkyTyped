package typingsSlinky.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PanoramaPov extends js.Object {
  var fov: Double = js.native
  var pan: Double = js.native
  var tilt: Double = js.native
}

object PanoramaPov {
  @scala.inline
  def apply(fov: Double, pan: Double, tilt: Double): PanoramaPov = {
    val __obj = js.Dynamic.literal(fov = fov.asInstanceOf[js.Any], pan = pan.asInstanceOf[js.Any], tilt = tilt.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanoramaPov]
  }
  @scala.inline
  implicit class PanoramaPovOps[Self <: PanoramaPov] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFov(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fov")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPan(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTilt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tilt")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


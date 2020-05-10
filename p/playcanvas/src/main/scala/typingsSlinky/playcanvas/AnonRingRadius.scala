package typingsSlinky.playcanvas

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRingRadius extends js.Object {
  var ringRadius: js.UndefOr[Double] = js.native
  var segments: js.UndefOr[Double] = js.native
  var sides: js.UndefOr[Double] = js.native
  var tubeRadius: js.UndefOr[Double] = js.native
}

object AnonRingRadius {
  @scala.inline
  def apply(): AnonRingRadius = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonRingRadius]
  }
  @scala.inline
  implicit class AnonRingRadiusOps[Self <: AnonRingRadius] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRingRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ringRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRingRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ringRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withSegments(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segments")(js.undefined)
        ret
    }
    @scala.inline
    def withSides(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sides")(js.undefined)
        ret
    }
    @scala.inline
    def withTubeRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tubeRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTubeRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tubeRadius")(js.undefined)
        ret
    }
  }
  
}


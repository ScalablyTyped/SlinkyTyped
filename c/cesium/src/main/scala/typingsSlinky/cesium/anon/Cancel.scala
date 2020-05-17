package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.Camera.FlightCancelledCallback
import typingsSlinky.cesium.mod.Camera.FlightCompleteCallback
import typingsSlinky.cesium.mod.Cartesian3
import typingsSlinky.cesium.mod.EasingFunction
import typingsSlinky.cesium.mod.Matrix4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cancel extends js.Object {
  var cancel: js.UndefOr[FlightCancelledCallback] = js.native
  var complete: js.UndefOr[FlightCompleteCallback] = js.native
  var convert: js.UndefOr[Boolean] = js.native
  var destination: Cartesian3 | typingsSlinky.cesium.mod.Rectangle = js.native
  var duration: js.UndefOr[Double] = js.native
  var easingFunction: js.UndefOr[EasingFunction] = js.native
  var endTransform: js.UndefOr[Matrix4] = js.native
  var flyOverLongitude: js.UndefOr[Double] = js.native
  var flyOverLongitudeWeight: js.UndefOr[Double] = js.native
  var maximumHeight: js.UndefOr[Double] = js.native
  var orientation: js.UndefOr[Direction | Heading] = js.native
  var pitchAdjustHeight: js.UndefOr[Double] = js.native
}

object Cancel {
  @scala.inline
  def apply(destination: Cartesian3 | typingsSlinky.cesium.mod.Rectangle): Cancel = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cancel]
  }
  @scala.inline
  implicit class CancelOps[Self <: Cancel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestination(value: Cartesian3 | typingsSlinky.cesium.mod.Rectangle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCancel(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.undefined)
        ret
    }
    @scala.inline
    def withComplete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.undefined)
        ret
    }
    @scala.inline
    def withConvert(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConvert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convert")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withEasingFunction(value: EasingFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easingFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEasingFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easingFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withEndTransform(value: Matrix4): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTransform")(js.undefined)
        ret
    }
    @scala.inline
    def withFlyOverLongitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flyOverLongitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlyOverLongitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flyOverLongitude")(js.undefined)
        ret
    }
    @scala.inline
    def withFlyOverLongitudeWeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flyOverLongitudeWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlyOverLongitudeWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flyOverLongitudeWeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: Direction | Heading): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
        ret
    }
    @scala.inline
    def withPitchAdjustHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pitchAdjustHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPitchAdjustHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pitchAdjustHeight")(js.undefined)
        ret
    }
  }
  
}


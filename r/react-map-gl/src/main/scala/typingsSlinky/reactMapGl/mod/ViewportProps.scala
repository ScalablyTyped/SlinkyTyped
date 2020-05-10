package typingsSlinky.reactMapGl.mod

import typingsSlinky.reactMapGl.reactMapGlStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewportProps extends js.Object {
  var altitude: Double = js.native
  var bearing: Double = js.native
  var height: Double = js.native
  var latitude: Double = js.native
  var longitude: Double = js.native
  var maxPitch: Double = js.native
  var maxZoom: Double = js.native
  var minPitch: Double = js.native
  var minZoom: Double = js.native
  var pitch: Double = js.native
  var transitionDuration: js.UndefOr[Double | auto] = js.native
  var transitionEasing: js.UndefOr[EasingFunction] = js.native
  var transitionInterpolator: js.UndefOr[TransitionInterpolator] = js.native
  var transitionInterruption: js.UndefOr[TRANSITION_EVENTS] = js.native
  var width: Double = js.native
  var zoom: Double = js.native
}

object ViewportProps {
  @scala.inline
  def apply(
    altitude: Double,
    bearing: Double,
    height: Double,
    latitude: Double,
    longitude: Double,
    maxPitch: Double,
    maxZoom: Double,
    minPitch: Double,
    minZoom: Double,
    pitch: Double,
    width: Double,
    zoom: Double
  ): ViewportProps = {
    val __obj = js.Dynamic.literal(altitude = altitude.asInstanceOf[js.Any], bearing = bearing.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], maxPitch = maxPitch.asInstanceOf[js.Any], maxZoom = maxZoom.asInstanceOf[js.Any], minPitch = minPitch.asInstanceOf[js.Any], minZoom = minZoom.asInstanceOf[js.Any], pitch = pitch.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewportProps]
  }
  @scala.inline
  implicit class ViewportPropsOps[Self <: ViewportProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAltitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBearing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bearing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxPitch(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPitch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinPitch(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minPitch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPitch(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pitch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransitionDuration(value: Double | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionEasing(value: /* t */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionEasing")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTransitionEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionEasing")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionInterpolator(value: TransitionInterpolator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionInterpolator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionInterpolator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionInterpolator")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionInterruption(value: TRANSITION_EVENTS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionInterruption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionInterruption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionInterruption")(js.undefined)
        ret
    }
  }
  
}


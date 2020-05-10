package typingsSlinky.reactMapGl.mod

import typingsSlinky.reactMapGl.reactMapGlStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-map-gl.react-map-gl.ViewportProps & react-map-gl.react-map-gl.InteractiveState> */
@js.native
trait MapStateProps extends js.Object {
  var altitude: js.UndefOr[Double] = js.native
  var bearing: js.UndefOr[Double] = js.native
  var height: js.UndefOr[Double] = js.native
  var latitude: js.UndefOr[Double] = js.native
  var longitude: js.UndefOr[Double] = js.native
  var maxPitch: js.UndefOr[Double] = js.native
  var maxZoom: js.UndefOr[Double] = js.native
  var minPitch: js.UndefOr[Double] = js.native
  var minZoom: js.UndefOr[Double] = js.native
  var pitch: js.UndefOr[Double] = js.native
  var startBearing: js.UndefOr[Double] = js.native
  var startPanLngLat: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var startPitch: js.UndefOr[Double] = js.native
  var startZoom: js.UndefOr[Double] = js.native
  var startZoomLngLat: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var transitionDuration: js.UndefOr[Double | auto] = js.native
  var transitionEasing: js.UndefOr[EasingFunction] = js.native
  var transitionInterpolator: js.UndefOr[TransitionInterpolator] = js.native
  var transitionInterruption: js.UndefOr[TRANSITION_EVENTS] = js.native
  var width: js.UndefOr[Double] = js.native
  var zoom: js.UndefOr[Double] = js.native
}

object MapStateProps {
  @scala.inline
  def apply(): MapStateProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapStateProps]
  }
  @scala.inline
  implicit class MapStatePropsOps[Self <: MapStateProps] (val x: Self) extends AnyVal {
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
    def withoutAltitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altitude")(js.undefined)
        ret
    }
    @scala.inline
    def withBearing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bearing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBearing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bearing")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withLatitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latitude")(js.undefined)
        ret
    }
    @scala.inline
    def withLongitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLongitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longitude")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxPitch(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPitch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxPitch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPitch")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withMinPitch(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minPitch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinPitch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minPitch")(js.undefined)
        ret
    }
    @scala.inline
    def withMinZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withPitch(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pitch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPitch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pitch")(js.undefined)
        ret
    }
    @scala.inline
    def withStartBearing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startBearing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartBearing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startBearing")(js.undefined)
        ret
    }
    @scala.inline
    def withStartPanLngLat(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPanLngLat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartPanLngLat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPanLngLat")(js.undefined)
        ret
    }
    @scala.inline
    def withStartPitch(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPitch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartPitch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPitch")(js.undefined)
        ret
    }
    @scala.inline
    def withStartZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withStartZoomLngLat(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startZoomLngLat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartZoomLngLat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startZoomLngLat")(js.undefined)
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
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(js.undefined)
        ret
    }
  }
  
}


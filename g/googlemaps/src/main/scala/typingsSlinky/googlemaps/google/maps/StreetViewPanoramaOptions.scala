package typingsSlinky.googlemaps.google.maps

import typingsSlinky.googlemaps.googlemapsStrings.html4
import typingsSlinky.googlemaps.googlemapsStrings.html5
import typingsSlinky.googlemaps.googlemapsStrings.webgl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreetViewPanoramaOptions extends js.Object {
  var addressControl: js.UndefOr[Boolean] = js.native
  var addressControlOptions: js.UndefOr[StreetViewAddressControlOptions] = js.native
  var clickToGo: js.UndefOr[Boolean] = js.native
  var disableDefaultUI: js.UndefOr[Boolean] = js.native
  var disableDoubleClickZoom: js.UndefOr[Boolean] = js.native
  var enableCloseButton: js.UndefOr[Boolean] = js.native
  var fullscreenControl: js.UndefOr[Boolean] = js.native
  var fullscreenControlOptions: js.UndefOr[FullscreenControlOptions] = js.native
  var imageDateControl: js.UndefOr[Boolean] = js.native
  var linksControl: js.UndefOr[Boolean] = js.native
  var mode: js.UndefOr[html4 | html5 | webgl] = js.native
  var motionTracking: js.UndefOr[Boolean] = js.native
  var motionTrackingControl: js.UndefOr[Boolean] = js.native
  var motionTrackingControlOptions: js.UndefOr[MotionTrackingControlOptions] = js.native
  var panControl: js.UndefOr[Boolean] = js.native
  var panControlOptions: js.UndefOr[PanControlOptions] = js.native
  var pano: js.UndefOr[String] = js.native
  var panoProvider: js.UndefOr[js.Function1[/* input */ String, StreetViewPanoramaData]] = js.native
  var position: js.UndefOr[LatLng | LatLngLiteral] = js.native
  var pov: js.UndefOr[StreetViewPov] = js.native
  var scrollwheel: js.UndefOr[Boolean] = js.native
  var visible: js.UndefOr[Boolean] = js.native
  var zoom: js.UndefOr[Double] = js.native
  var zoomControl: js.UndefOr[Boolean] = js.native
  var zoomControlOptions: js.UndefOr[ZoomControlOptions] = js.native
}

object StreetViewPanoramaOptions {
  @scala.inline
  def apply(): StreetViewPanoramaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreetViewPanoramaOptions]
  }
  @scala.inline
  implicit class StreetViewPanoramaOptionsOps[Self <: StreetViewPanoramaOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddressControl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddressControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressControl")(js.undefined)
        ret
    }
    @scala.inline
    def withAddressControlOptions(value: StreetViewAddressControlOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressControlOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddressControlOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressControlOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withClickToGo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickToGo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickToGo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickToGo")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableDefaultUI(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableDefaultUI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableDefaultUI: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableDefaultUI")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableDoubleClickZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableDoubleClickZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableDoubleClickZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableDoubleClickZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableCloseButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCloseButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableCloseButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCloseButton")(js.undefined)
        ret
    }
    @scala.inline
    def withFullscreenControl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreenControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullscreenControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreenControl")(js.undefined)
        ret
    }
    @scala.inline
    def withFullscreenControlOptions(value: FullscreenControlOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreenControlOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullscreenControlOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreenControlOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withImageDateControl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageDateControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageDateControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageDateControl")(js.undefined)
        ret
    }
    @scala.inline
    def withLinksControl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linksControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinksControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linksControl")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: html4 | html5 | webgl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withMotionTracking(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motionTracking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMotionTracking: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motionTracking")(js.undefined)
        ret
    }
    @scala.inline
    def withMotionTrackingControl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motionTrackingControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMotionTrackingControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motionTrackingControl")(js.undefined)
        ret
    }
    @scala.inline
    def withMotionTrackingControlOptions(value: MotionTrackingControlOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motionTrackingControlOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMotionTrackingControlOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motionTrackingControlOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withPanControl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panControl")(js.undefined)
        ret
    }
    @scala.inline
    def withPanControlOptions(value: PanControlOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panControlOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanControlOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panControlOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withPano(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pano")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPano: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pano")(js.undefined)
        ret
    }
    @scala.inline
    def withPanoProvider(value: /* input */ String => StreetViewPanoramaData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panoProvider")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPanoProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panoProvider")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: LatLng | LatLngLiteral): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withPov(value: StreetViewPov): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pov")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPov: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pov")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollwheel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollwheel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollwheel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollwheel")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
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
    @scala.inline
    def withZoomControl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomControl")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomControlOptions(value: ZoomControlOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomControlOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomControlOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomControlOptions")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.googleMapReact.mod

import typingsSlinky.googleMapReact.AnonPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapOptions extends js.Object {
  // Any options from https://developers.google.com/maps/documentation/javascript/reference/3/#MapOptions
  // excluding 'zoom' and 'center' which get set via props.
  var backgroundColor: js.UndefOr[String] = js.native
  var clickableIcons: js.UndefOr[Boolean] = js.native
  var controlSize: js.UndefOr[Double] = js.native
  var disableDefaultUI: js.UndefOr[Boolean] = js.native
  var disableDoubleClickZoom: js.UndefOr[Boolean] = js.native
  var draggable: js.UndefOr[Boolean] = js.native
  var draggableCursor: js.UndefOr[String] = js.native
  var draggingCursor: js.UndefOr[String] = js.native
  var fullscreenControl: js.UndefOr[Boolean] = js.native
  var fullscreenControlOptions: js.UndefOr[AnonPosition] = js.native
  var gestureHandling: js.UndefOr[String] = js.native
  var heading: js.UndefOr[Double] = js.native
  var keyboardShortcuts: js.UndefOr[Boolean] = js.native
  var mapTypeControl: js.UndefOr[Boolean] = js.native
  var mapTypeControlOptions: js.UndefOr[js.Any] = js.native
  var mapTypeId: js.UndefOr[String] = js.native
  var maxZoom: js.UndefOr[Double] = js.native
  var minZoom: js.UndefOr[Double] = js.native
  var minZoomOverride: js.UndefOr[Boolean] = js.native
  var noClear: js.UndefOr[Boolean] = js.native
  var options: js.UndefOr[js.Function1[/* maps */ Maps, Props]] = js.native
  var panControl: js.UndefOr[Boolean] = js.native
  var panControlOptions: js.UndefOr[AnonPosition] = js.native
  var rotateControl: js.UndefOr[Boolean] = js.native
  var rotateControlOptions: js.UndefOr[AnonPosition] = js.native
  var scaleControl: js.UndefOr[Boolean] = js.native
  var scaleControlOptions: js.UndefOr[js.Any] = js.native
  var scrollwheel: js.UndefOr[Boolean] = js.native
  var streetView: js.UndefOr[js.Any] = js.native
  var streetViewControl: js.UndefOr[Boolean] = js.native
  var streetViewControlOptions: js.UndefOr[AnonPosition] = js.native
  var styles: js.UndefOr[js.Array[MapTypeStyle]] = js.native
  var tilt: js.UndefOr[Double] = js.native
  var zoomControl: js.UndefOr[Boolean] = js.native
  var zoomControlOptions: js.UndefOr[AnonPosition] = js.native
}

object MapOptions {
  @scala.inline
  def apply(): MapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapOptions]
  }
  @scala.inline
  implicit class MapOptionsOps[Self <: MapOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withClickableIcons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickableIcons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickableIcons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickableIcons")(js.undefined)
        ret
    }
    @scala.inline
    def withControlSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControlSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlSize")(js.undefined)
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
    def withDraggable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(js.undefined)
        ret
    }
    @scala.inline
    def withDraggableCursor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggableCursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggableCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggableCursor")(js.undefined)
        ret
    }
    @scala.inline
    def withDraggingCursor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggingCursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggingCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggingCursor")(js.undefined)
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
    def withFullscreenControlOptions(value: AnonPosition): Self = {
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
    def withGestureHandling(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gestureHandling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGestureHandling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gestureHandling")(js.undefined)
        ret
    }
    @scala.inline
    def withHeading(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heading")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboardShortcuts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardShortcuts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboardShortcuts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardShortcuts")(js.undefined)
        ret
    }
    @scala.inline
    def withMapTypeControl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapTypeControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapTypeControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapTypeControl")(js.undefined)
        ret
    }
    @scala.inline
    def withMapTypeControlOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapTypeControlOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapTypeControlOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapTypeControlOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withMapTypeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapTypeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapTypeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapTypeId")(js.undefined)
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
    def withMinZoomOverride(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoomOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinZoomOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoomOverride")(js.undefined)
        ret
    }
    @scala.inline
    def withNoClear(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noClear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoClear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noClear")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: /* maps */ Maps => Props): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
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
    def withPanControlOptions(value: AnonPosition): Self = {
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
    def withRotateControl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotateControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateControl")(js.undefined)
        ret
    }
    @scala.inline
    def withRotateControlOptions(value: AnonPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateControlOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotateControlOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateControlOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleControl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleControl")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleControlOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleControlOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleControlOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleControlOptions")(js.undefined)
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
    def withStreetView(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streetView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreetView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streetView")(js.undefined)
        ret
    }
    @scala.inline
    def withStreetViewControl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streetViewControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreetViewControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streetViewControl")(js.undefined)
        ret
    }
    @scala.inline
    def withStreetViewControlOptions(value: AnonPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streetViewControlOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreetViewControlOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streetViewControlOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withStyles(value: js.Array[MapTypeStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
    @scala.inline
    def withTilt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tilt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTilt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tilt")(js.undefined)
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
    def withZoomControlOptions(value: AnonPosition): Self = {
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


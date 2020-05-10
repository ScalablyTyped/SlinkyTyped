package typingsSlinky.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapOptions extends js.Object {
  /**
    * Color used for the background of the Map div. This color will be visible
    * when tiles have not yet loaded as the user pans. This option can only be
    * set when the map is initialized.
    */
  var backgroundColor: js.UndefOr[String] = js.native
  /** The initial Map center. Required. */
  var center: js.UndefOr[LatLng | LatLngLiteral] = js.native
  /**
    * When false, map icons are not clickable. A map icon represents a point of
    * interest, also known as a POI. By default map icons are clickable.
    */
  var clickableIcons: js.UndefOr[Boolean] = js.native
  /**
    * Size in pixels of the controls appearing on the map. This value must be
    * supplied directly when creating the Map, updating this value later may
    * bring the controls into an undefined state. Only governs the controls
    * made by the Maps API itself. Does not scale developer created custom
    * controls.
    */
  var controlSize: js.UndefOr[Double] = js.native
  /** Enables/disables all default UI. May be overridden individually. */
  var disableDefaultUI: js.UndefOr[Boolean] = js.native
  /** Enables/disables zoom and center on double click. Enabled by default. */
  var disableDoubleClickZoom: js.UndefOr[Boolean] = js.native
  /**
    * If false, prevents the map from being dragged. Dragging is enabled by
    * default.
    */
  var draggable: js.UndefOr[Boolean] = js.native
  /**
    * The name or url of the cursor to display when mousing over a draggable
    * map. This property uses the css cursor attribute to change the icon. As
    * with the css property, you must specify at least one fallback cursor that
    * is not a URL. For example: draggableCursor:
    * 'url(http://www.example.com/icon.png), auto;'.
    */
  var draggableCursor: js.UndefOr[String] = js.native
  /**
    * The name or url of the cursor to display when the map is being dragged.
    * This property uses the css cursor attribute to change the icon. As with
    * the css property, you must specify at least one fallback cursor that is
    * not a URL. For example: draggingCursor:
    * 'url(http://www.example.com/icon.png), auto;'.
    */
  var draggingCursor: js.UndefOr[String] = js.native
  /** The enabled/disabled state of the Fullscreen control. */
  var fullscreenControl: js.UndefOr[Boolean] = js.native
  /** The display options for the Fullscreen control. */
  var fullscreenControlOptions: js.UndefOr[FullscreenControlOptions] = js.native
  /**
    * This setting controls how gestures on the map are handled.
    */
  var gestureHandling: js.UndefOr[GestureHandlingOptions] = js.native
  /**
    * The heading for aerial imagery in degrees measured clockwise from
    * cardinal direction North. Headings are snapped to the nearest available
    * angle for which imagery is available.
    */
  var heading: js.UndefOr[Double] = js.native
  /**
    * If false, prevents the map from being controlled by the keyboard.
    * Keyboard shortcuts are enabled by default.
    */
  var keyboardShortcuts: js.UndefOr[Boolean] = js.native
  /** The initial enabled/disabled state of the Map type control. */
  var mapTypeControl: js.UndefOr[Boolean] = js.native
  /** The initial display options for the Map type control. */
  var mapTypeControlOptions: js.UndefOr[MapTypeControlOptions] = js.native
  /** The initial Map mapTypeId. Defaults to ROADMAP. */
  var mapTypeId: js.UndefOr[MapTypeId | String] = js.native
  /**
    * The maximum zoom level which will be displayed on the map. If omitted, or
    * set to null, the maximum zoom from the current map type is used instead.
    * Valid values: Integers between zero, and up to the supported maximum zoom
    * level.
    */
  var maxZoom: js.UndefOr[Double] = js.native
  /**
    * The minimum zoom level which will be displayed on the map. If omitted, or
    * set to null, the minimum zoom from the current map type is used instead.
    * Valid values: Integers between zero, and up to the supported maximum zoom
    * level.
    */
  var minZoom: js.UndefOr[Double] = js.native
  /** If true, do not clear the contents of the Map div. */
  var noClear: js.UndefOr[Boolean] = js.native
  /**
    * The enabled/disabled state of the Pan control.
    * Note: The Pan control is not available in the new set of controls
    * introduced in v3.22 of the Google Maps JavaScript API. While using v3.22
    * and v3.23, you can choose to use the earlier set of controls rather than
    * the new controls, thus making the Pan control available as part of the
    * old control set. See {@link
    * https://developers.google.com/maps/articles/v322-controls-diff|What's New
    * in the v3.22 Map Controls}.
    */
  var panControl: js.UndefOr[Boolean] = js.native
  /**
    * The display options for the Pan control.
    * Note: The Pan control is not available in the new set of controls
    * introduced in v3.22 of the Google Maps JavaScript API. While using v3.22
    * and v3.23, you can choose to use the earlier set of controls rather than
    * the new controls, thus making the Pan control available as part of the
    * old control set. See {@link
    * https://developers.google.com/maps/articles/v322-controls-diff|What's New
    * in the v3.22 Map Controls}.
    */
  var panControlOptions: js.UndefOr[PanControlOptions] = js.native
  /**
    * Defines a boundary that restricts the area of the map accessible to users.
    * When set, a user can only pan and zoom while the camera view stays inside the
    * limits of the boundary.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#MapOptions.restriction Maps JavaScript API}
    */
  var restriction: js.UndefOr[MapRestriction] = js.native
  /** The enabled/disabled state of the Rotate control. */
  var rotateControl: js.UndefOr[Boolean] = js.native
  /** The display options for the Rotate control. */
  var rotateControlOptions: js.UndefOr[RotateControlOptions] = js.native
  /** The initial enabled/disabled state of the Scale control. */
  var scaleControl: js.UndefOr[Boolean] = js.native
  /** The initial display options for the Scale control. */
  var scaleControlOptions: js.UndefOr[ScaleControlOptions] = js.native
  /**
    * If false, disables scrollwheel zooming on the map. The scrollwheel is
    * enabled by default.
    */
  var scrollwheel: js.UndefOr[Boolean] = js.native
  /**
    * A StreetViewPanorama to display when the Street View pegman is dropped on
    * the map. If no panorama is specified, a default StreetViewPanorama will
    * be displayed in the map's div when the pegman is dropped.
    */
  var streetView: js.UndefOr[StreetViewPanorama] = js.native
  /**
    * The initial enabled/disabled state of the Street View Pegman control.
    * This control is part of the default UI, and should be set to false when
    * displaying a map type on which the Street View road overlay should not
    * appear (e.g. a non-Earth map type).
    */
  var streetViewControl: js.UndefOr[Boolean] = js.native
  /** The initial display options for the Street View Pegman control. */
  var streetViewControlOptions: js.UndefOr[StreetViewControlOptions] = js.native
  /**
    * Styles to apply to each of the default map types. Note that for
    * satellite/hybrid and terrain modes, these styles will only apply to
    * labels and geometry.
    */
  var styles: js.UndefOr[js.Array[MapTypeStyle]] = js.native
  /**
    * Controls the automatic switching behavior for the angle of incidence of
    * the map. The only allowed values are 0 and 45. The value 0 causes the map
    * to always use a 0° overhead view regardless of the zoom level and
    * viewport. The value 45 causes the tilt angle to automatically switch to
    * 45 whenever 45° imagery is available for the current zoom level and
    * viewport, and switch back to 0 whenever 45° imagery is not available
    * (this is the default behavior). 45° imagery is only available for
    * satellite and hybrid map types, within some locations, and at some zoom
    * levels. Note: getTilt returns the current tilt angle, not the value
    * specified by this option. Because getTilt and this option refer to
    * different things, do not bind() the tilt property; doing so may yield
    * unpredictable effects.
    */
  var tilt: js.UndefOr[Double] = js.native
  /**
    * The initial Map zoom level. Required. Valid values: Integers between
    * zero, and up to the supported maximum zoom level.
    */
  var zoom: js.UndefOr[Double] = js.native
  /** The enabled/disabled state of the Zoom control. */
  var zoomControl: js.UndefOr[Boolean] = js.native
  /** The display options for the Zoom control. */
  var zoomControlOptions: js.UndefOr[ZoomControlOptions] = js.native
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
    def withCenter(value: LatLng | LatLngLiteral): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(js.undefined)
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
    def withGestureHandling(value: GestureHandlingOptions): Self = {
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
    def withMapTypeControlOptions(value: MapTypeControlOptions): Self = {
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
    def withMapTypeId(value: MapTypeId | String): Self = {
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
    def withRestriction(value: MapRestriction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restriction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestriction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restriction")(js.undefined)
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
    def withRotateControlOptions(value: RotateControlOptions): Self = {
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
    def withScaleControlOptions(value: ScaleControlOptions): Self = {
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
    def withStreetView(value: StreetViewPanorama): Self = {
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
    def withStreetViewControlOptions(value: StreetViewControlOptions): Self = {
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


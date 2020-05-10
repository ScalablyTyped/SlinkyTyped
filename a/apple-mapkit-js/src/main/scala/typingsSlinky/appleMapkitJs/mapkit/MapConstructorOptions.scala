package typingsSlinky.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object that contains options for initializing a map's features.
  */
@js.native
trait MapConstructorOptions extends js.Object {
  /**
    * A delegate method for modifying cluster annotations.
    */
  var annotationForCluster: js.UndefOr[js.Function1[/* annotation */ Annotation, Unit]] = js.native
  /**
    * An array of all the annotations on the map.
    */
  var annotations: js.UndefOr[js.Array[Annotation]] = js.native
  /**
    * The map coordinate at the center of the map view.
    */
  var center: js.UndefOr[Coordinate] = js.native
  /**
    * The map’s color scheme when displaying standard or muted standard map types.
    */
  var colorScheme: js.UndefOr[String] = js.native
  /**
    * A Boolean value that determines whether the user may rotate the map using
    * the compass control or a rotate gesture.
    */
  var isRotationEnabled: js.UndefOr[Boolean] = js.native
  /**
    * A Boolean value that determines whether the user may scroll the map with
    * a pointing device or gestures on a touchscreen.
    */
  var isScrollEnabled: js.UndefOr[Boolean] = js.native
  /**
    * A Boolean value that determines whether the user may zoom in and out on
    * the map using pinch gestures or the zoom control.
    */
  var isZoomEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The type of data displayed by the map view.
    */
  var mapType: js.UndefOr[String] = js.native
  /**
    * An array of all of the map's overlays.
    */
  var overlays: js.UndefOr[js.Array[Overlay]] = js.native
  /**
    * The map's inset margins.
    */
  var padding: js.UndefOr[Padding] = js.native
  /**
    * The area currently displayed by the map.
    */
  var region: js.UndefOr[CoordinateRegion] = js.native
  /**
    * The map's rotation, in degrees.
    */
  var rotation: js.UndefOr[Double] = js.native
  /**
    * The annotation on the map that is selected.
    */
  var selectedAnnotation: js.UndefOr[Annotation] = js.native
  /**
    * The overlay on the map that is selected.
    */
  var selectedOverlay: js.UndefOr[Overlay] = js.native
  /**
    * A feature visibility setting that determines when the compass is visible.
    */
  var showsCompass: js.UndefOr[String] = js.native
  /**
    * A Boolean value that determines whether to display a control that lets
    * users choose the map type.
    */
  var showsMapTypeControl: js.UndefOr[Boolean] = js.native
  /**
    * A Boolean value that determines whether the map displays points of interest.
    */
  var showsPointsOfInterest: js.UndefOr[Boolean] = js.native
  /**
    * A feature visibility setting that determines when the map's scale is
    * displayed.
    */
  var showsScale: js.UndefOr[String] = js.native
  /**
    * A Boolean value that determines whether to show the user's location on
    * the map.
    */
  var showsUserLocation: js.UndefOr[Boolean] = js.native
  /**
    * A Boolean value that determines whether the user location control is visible.
    */
  var showsUserLocationControl: js.UndefOr[Boolean] = js.native
  /**
    * A Boolean value that determines whether to display a control for zooming
    * in and zooming out on a map.
    */
  var showsZoomControl: js.UndefOr[Boolean] = js.native
  /**
    * The CSS color that is used to paint the user interface controls on the map.
    */
  var tintColor: js.UndefOr[String] = js.native
  /**
    * A Boolean value that determines whether to center the map on the user's
    * location.
    */
  var tracksUserLocation: js.UndefOr[Boolean] = js.native
  /**
    * The visible area of the map defined in map units.
    */
  var visibleMapRect: js.UndefOr[MapRect] = js.native
}

object MapConstructorOptions {
  @scala.inline
  def apply(): MapConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapConstructorOptions]
  }
  @scala.inline
  implicit class MapConstructorOptionsOps[Self <: MapConstructorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotationForCluster(value: /* annotation */ Annotation => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationForCluster")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAnnotationForCluster: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationForCluster")(js.undefined)
        ret
    }
    @scala.inline
    def withAnnotations(value: js.Array[Annotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotations")(js.undefined)
        ret
    }
    @scala.inline
    def withCenter(value: Coordinate): Self = {
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
    def withColorScheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorScheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorScheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorScheme")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRotationEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRotationEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsRotationEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRotationEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIsScrollEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isScrollEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsScrollEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isScrollEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIsZoomEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isZoomEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsZoomEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isZoomEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withMapType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapType")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlays(value: js.Array[Overlay]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlays")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: Padding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: CoordinateRegion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
        ret
    }
    @scala.inline
    def withRotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedAnnotation(value: Annotation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedAnnotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedOverlay(value: Overlay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedOverlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedOverlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedOverlay")(js.undefined)
        ret
    }
    @scala.inline
    def withShowsCompass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showsCompass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowsCompass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showsCompass")(js.undefined)
        ret
    }
    @scala.inline
    def withShowsMapTypeControl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showsMapTypeControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowsMapTypeControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showsMapTypeControl")(js.undefined)
        ret
    }
    @scala.inline
    def withShowsPointsOfInterest(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showsPointsOfInterest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowsPointsOfInterest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showsPointsOfInterest")(js.undefined)
        ret
    }
    @scala.inline
    def withShowsScale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showsScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowsScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showsScale")(js.undefined)
        ret
    }
    @scala.inline
    def withShowsUserLocation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showsUserLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowsUserLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showsUserLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withShowsUserLocationControl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showsUserLocationControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowsUserLocationControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showsUserLocationControl")(js.undefined)
        ret
    }
    @scala.inline
    def withShowsZoomControl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showsZoomControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowsZoomControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showsZoomControl")(js.undefined)
        ret
    }
    @scala.inline
    def withTintColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tintColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTintColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tintColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTracksUserLocation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracksUserLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTracksUserLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracksUserLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibleMapRect(value: MapRect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleMapRect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibleMapRect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleMapRect")(js.undefined)
        ret
    }
  }
  
}


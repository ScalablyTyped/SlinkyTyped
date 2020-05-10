package typingsSlinky.googlemaps.google.maps.drawing

import org.scalajs.dom.raw.Element
import typingsSlinky.googlemaps.google.maps.CircleOptions
import typingsSlinky.googlemaps.google.maps.Map
import typingsSlinky.googlemaps.google.maps.MarkerOptions
import typingsSlinky.googlemaps.google.maps.PolygonOptions
import typingsSlinky.googlemaps.google.maps.PolylineOptions
import typingsSlinky.googlemaps.google.maps.RectangleOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options for the drawing manager. */
@js.native
trait DrawingManagerOptions extends js.Object {
  /**
    * Options to apply to any new circles created with this DrawingManager.
    * The center and radius properties are ignored, and the map property of a
    * new circle is always set to the DrawingManager's map.
    */
  var circleOptions: js.UndefOr[CircleOptions] = js.native
  /**
    * The enabled/disabled state of the drawing control. Defaults to true.
    */
  var drawingControl: js.UndefOr[Boolean] = js.native
  /** The display options for the drawing control. */
  var drawingControlOptions: js.UndefOr[DrawingControlOptions] = js.native
  /**
    * The DrawingManager's drawing mode, which defines the type of overlay to
    * be added on the map. Accepted values are 'marker', 'polygon',
    * 'polyline', 'rectangle', 'circle', or null. A drawing mode of null
    * means that the user can interact with the map as normal, and clicks do
    * not draw anything.
    */
  var drawingMode: js.UndefOr[OverlayType | Null] = js.native
  /**
    * The Map to which the DrawingManager is attached, which is the Map on
    * which the overlays created will be placed.
    */
  var map: js.UndefOr[Map[Element]] = js.native
  /**
    * Options to apply to any new markers created with this DrawingManager.
    * The position property is ignored, and the map property of a new marker
    * is always set to the DrawingManager's map.
    */
  var markerOptions: js.UndefOr[MarkerOptions] = js.native
  /**
    * Options to apply to any new polygons created with this DrawingManager.
    * The paths property is ignored, and the map property of a new polygon is
    * always set to the DrawingManager's map.
    */
  var polygonOptions: js.UndefOr[PolygonOptions] = js.native
  /**
    * Options to apply to any new polylines created with this DrawingManager.
    * The path property is ignored, and the map property of a new polyline is
    * always set to the DrawingManager's map.
    */
  var polylineOptions: js.UndefOr[PolylineOptions] = js.native
  /**
    * Options to apply to any new rectangles created with this
    * DrawingManager. The bounds property is ignored, and the map property of
    * a new rectangle is always set to the DrawingManager's map.
    */
  var rectangleOptions: js.UndefOr[RectangleOptions] = js.native
}

object DrawingManagerOptions {
  @scala.inline
  def apply(): DrawingManagerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawingManagerOptions]
  }
  @scala.inline
  implicit class DrawingManagerOptionsOps[Self <: DrawingManagerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCircleOptions(value: CircleOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circleOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCircleOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circleOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawingControl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawingControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawingControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawingControl")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawingControlOptions(value: DrawingControlOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawingControlOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawingControlOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawingControlOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawingMode(value: OverlayType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawingMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawingMode")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawingModeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawingMode")(null)
        ret
    }
    @scala.inline
    def withMap(value: Map[Element]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerOptions(value: MarkerOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withPolygonOptions(value: PolygonOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygonOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolygonOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygonOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withPolylineOptions(value: PolylineOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polylineOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolylineOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polylineOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withRectangleOptions(value: RectangleOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rectangleOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRectangleOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rectangleOptions")(js.undefined)
        ret
    }
  }
  
}


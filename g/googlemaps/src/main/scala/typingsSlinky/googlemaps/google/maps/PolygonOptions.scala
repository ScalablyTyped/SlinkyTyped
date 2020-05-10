package typingsSlinky.googlemaps.google.maps

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolygonOptions extends js.Object {
  /**
    * Indicates whether this Polygon handles mouse events. Defaults to true.
    */
  var clickable: js.UndefOr[Boolean] = js.native
  /**
    * If set to true, the user can drag this shape over the map.
    * The geodesic property defines the mode of dragging. Defaults to false.
    */
  var draggable: js.UndefOr[Boolean] = js.native
  /**
    * If set to true, the user can edit this shape by dragging the control
    * points shown at the vertices and on each segment. Defaults to false.
    */
  var editable: js.UndefOr[Boolean] = js.native
  /**
    * The fill color. All CSS3 colors are supported except for extended named
    * colors.
    */
  var fillColor: js.UndefOr[String] = js.native
  /** The fill opacity between 0.0 and 1.0 */
  var fillOpacity: js.UndefOr[Double] = js.native
  /**
    * When true, edges of the polygon are interpreted as geodesic and will
    * follow the curvature of the Earth. When false, edges of the polygon are
    * rendered as straight lines in screen space. Note that the shape of a
    * geodesic polygon may appear to change when dragged, as the dimensions are
    * maintained relative to the surface of the earth. Defaults to false.
    */
  var geodesic: js.UndefOr[Boolean] = js.native
  /** Map on which to display Polygon. */
  var map: js.UndefOr[Map[Element]] = js.native
  /**
    * The ordered sequence of coordinates that designates a closed loop. Unlike
    * polylines, a polygon may consist of one or more paths. As a result, the
    * paths property may specify one or more arrays of LatLng coordinates.
    * Paths are closed automatically; do not repeat the first vertex of the
    * path as the last vertex. Simple polygons may be defined using a single
    * array of LatLngs. More complex polygons may specify an array of arrays.
    * Any simple arrays are converted into MVCArrays. Inserting or removing
    * LatLngs from the MVCArray will automatically update the polygon on the
    * map.
    */
  var paths: js.UndefOr[
    (MVCArray[LatLng | MVCArray[LatLng]]) | (js.Array[(js.Array[LatLng | LatLngLiteral]) | LatLng | LatLngLiteral])
  ] = js.native
  /**
    * The stroke color.
    * All CSS3 colors are supported except for extended named colors.
    */
  var strokeColor: js.UndefOr[String] = js.native
  /** The stroke opacity between 0.0 and 1.0 */
  var strokeOpacity: js.UndefOr[Double] = js.native
  /**
    * The stroke position. Defaults to CENTER.
    * This property is not supported on Internet Explorer 8 and earlier.
    */
  var strokePosition: js.UndefOr[StrokePosition] = js.native
  /** The stroke width in pixels. */
  var strokeWeight: js.UndefOr[Double] = js.native
  /** Whether this polygon is visible on the map. Defaults to true. */
  var visible: js.UndefOr[Boolean] = js.native
  /** The zIndex compared to other polys. */
  var zIndex: js.UndefOr[Double] = js.native
}

object PolygonOptions {
  @scala.inline
  def apply(): PolygonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolygonOptions]
  }
  @scala.inline
  implicit class PolygonOptionsOps[Self <: PolygonOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClickable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickable")(js.undefined)
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
    def withEditable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(js.undefined)
        ret
    }
    @scala.inline
    def withFillColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillColor")(js.undefined)
        ret
    }
    @scala.inline
    def withFillOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withGeodesic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geodesic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeodesic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geodesic")(js.undefined)
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
    def withPaths(
      value: (MVCArray[LatLng | MVCArray[LatLng]]) | (js.Array[(js.Array[LatLng | LatLngLiteral]) | LatLng | LatLngLiteral])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeColor")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokePosition(value: StrokePosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokePosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokePosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokePosition")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeWeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWeight")(js.undefined)
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
    def withZIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.leafletDraw.mod.Control

import typingsSlinky.leafletDraw.leafletDrawBooleans.`false`
import typingsSlinky.leafletDraw.mod.DrawOptions.CircleMarkerOptions
import typingsSlinky.leafletDraw.mod.DrawOptions.CircleOptions
import typingsSlinky.leafletDraw.mod.DrawOptions.MarkerOptions
import typingsSlinky.leafletDraw.mod.DrawOptions.PolygonOptions
import typingsSlinky.leafletDraw.mod.DrawOptions.PolylineOptions
import typingsSlinky.leafletDraw.mod.DrawOptions.RectangleOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawOptions extends js.Object {
  /**
    * Circle draw handler options. Set to false to disable handler.
    *
    * @default {}
    */
  var circle: js.UndefOr[CircleOptions | `false`] = js.undefined
  /**
    * Circle marker draw handler options. Set to false to disable handler.
    *
    * @default {}
    */
  var circlemarker: js.UndefOr[CircleMarkerOptions | `false`] = js.undefined
  /**
    * Marker draw handler options. Set to false to disable handler.
    *
    * @default {}
    */
  var marker: js.UndefOr[MarkerOptions | `false`] = js.undefined
  /**
    * Polygon draw handler options. Set to false to disable handler.
    *
    * @default {}
    */
  var polygon: js.UndefOr[PolygonOptions | `false`] = js.undefined
  /**
    * Polyline draw handler options. Set to false to disable handler.
    *
    * @default {}
    */
  var polyline: js.UndefOr[PolylineOptions | `false`] = js.undefined
  /**
    * Rectangle draw handler options. Set to false to disable handler.
    *
    * @default {}
    */
  var rectangle: js.UndefOr[RectangleOptions | `false`] = js.undefined
}

object DrawOptions {
  @scala.inline
  def apply(
    circle: CircleOptions | `false` = null,
    circlemarker: CircleMarkerOptions | `false` = null,
    marker: MarkerOptions | `false` = null,
    polygon: PolygonOptions | `false` = null,
    polyline: PolylineOptions | `false` = null,
    rectangle: RectangleOptions | `false` = null
  ): DrawOptions = {
    val __obj = js.Dynamic.literal()
    if (circle != null) __obj.updateDynamic("circle")(circle.asInstanceOf[js.Any])
    if (circlemarker != null) __obj.updateDynamic("circlemarker")(circlemarker.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (polygon != null) __obj.updateDynamic("polygon")(polygon.asInstanceOf[js.Any])
    if (polyline != null) __obj.updateDynamic("polyline")(polyline.asInstanceOf[js.Any])
    if (rectangle != null) __obj.updateDynamic("rectangle")(rectangle.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawOptions]
  }
}


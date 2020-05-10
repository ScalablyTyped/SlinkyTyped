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

@js.native
trait DrawOptions extends js.Object {
  /**
    * Circle draw handler options. Set to false to disable handler.
    *
    * @default {}
    */
  var circle: js.UndefOr[CircleOptions | `false`] = js.native
  /**
    * Circle marker draw handler options. Set to false to disable handler.
    *
    * @default {}
    */
  var circlemarker: js.UndefOr[CircleMarkerOptions | `false`] = js.native
  /**
    * Marker draw handler options. Set to false to disable handler.
    *
    * @default {}
    */
  var marker: js.UndefOr[MarkerOptions | `false`] = js.native
  /**
    * Polygon draw handler options. Set to false to disable handler.
    *
    * @default {}
    */
  var polygon: js.UndefOr[PolygonOptions | `false`] = js.native
  /**
    * Polyline draw handler options. Set to false to disable handler.
    *
    * @default {}
    */
  var polyline: js.UndefOr[PolylineOptions | `false`] = js.native
  /**
    * Rectangle draw handler options. Set to false to disable handler.
    *
    * @default {}
    */
  var rectangle: js.UndefOr[RectangleOptions | `false`] = js.native
}

object DrawOptions {
  @scala.inline
  def apply(): DrawOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawOptions]
  }
  @scala.inline
  implicit class DrawOptionsOps[Self <: DrawOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCircle(value: CircleOptions | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCircle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circle")(js.undefined)
        ret
    }
    @scala.inline
    def withCirclemarker(value: CircleMarkerOptions | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circlemarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCirclemarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circlemarker")(js.undefined)
        ret
    }
    @scala.inline
    def withMarker(value: MarkerOptions | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(js.undefined)
        ret
    }
    @scala.inline
    def withPolygon(value: PolygonOptions | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolygon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygon")(js.undefined)
        ret
    }
    @scala.inline
    def withPolyline(value: PolylineOptions | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polyline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolyline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polyline")(js.undefined)
        ret
    }
    @scala.inline
    def withRectangle(value: RectangleOptions | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rectangle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRectangle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rectangle")(js.undefined)
        ret
    }
  }
  
}


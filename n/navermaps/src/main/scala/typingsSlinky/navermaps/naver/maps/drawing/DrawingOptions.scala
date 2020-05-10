package typingsSlinky.navermaps.naver.maps.drawing

import typingsSlinky.navermaps.naver.maps.EllipseOptions
import typingsSlinky.navermaps.naver.maps.Map
import typingsSlinky.navermaps.naver.maps.MarkerOptions
import typingsSlinky.navermaps.naver.maps.PolygonOptions
import typingsSlinky.navermaps.naver.maps.PolylineOptions
import typingsSlinky.navermaps.naver.maps.RectangleOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawingOptions extends js.Object {
  var arrowlineOptions: js.UndefOr[PolylineOptions] = js.native
  var controlPointOptions: js.UndefOr[typingsSlinky.navermaps.naver.maps.drawing.controlPointOptions] = js.native
  var drawingControl: js.UndefOr[js.Array[DrawingMode]] = js.native
  var drawingControlOptions: js.UndefOr[typingsSlinky.navermaps.naver.maps.drawing.drawingControlOptions] = js.native
  var drawingMode: js.UndefOr[DrawingMode] = js.native
  var ellipseOptions: js.UndefOr[EllipseOptions] = js.native
  var map: js.UndefOr[Map] = js.native
  var markerOptions: js.UndefOr[MarkerOptions] = js.native
  var polygonOptions: js.UndefOr[PolygonOptions] = js.native
  var polylineOptions: js.UndefOr[PolylineOptions] = js.native
  var rectangleOptions: js.UndefOr[RectangleOptions] = js.native
}

object DrawingOptions {
  @scala.inline
  def apply(): DrawingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawingOptions]
  }
  @scala.inline
  implicit class DrawingOptionsOps[Self <: DrawingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrowlineOptions(value: PolylineOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowlineOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowlineOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowlineOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withControlPointOptions(value: controlPointOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlPointOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControlPointOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlPointOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawingControl(value: js.Array[DrawingMode]): Self = {
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
    def withDrawingControlOptions(value: drawingControlOptions): Self = {
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
    def withDrawingMode(value: DrawingMode): Self = {
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
    def withEllipseOptions(value: EllipseOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipseOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEllipseOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipseOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withMap(value: Map): Self = {
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


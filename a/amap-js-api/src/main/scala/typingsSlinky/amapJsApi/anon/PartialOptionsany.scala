package typingsSlinky.amapJsApi.anon

import typingsSlinky.amapJsApi.AMap.Bounds
import typingsSlinky.amapJsApi.AMap.LocationValue
import typingsSlinky.amapJsApi.AMap.Map
import typingsSlinky.amapJsApi.AMap.StrokeLineCap
import typingsSlinky.amapJsApi.AMap.StrokeLineJoin
import typingsSlinky.amapJsApi.AMap.StrokeStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<amap-js-api.AMap.Rectangle.Options<any>> */
@js.native
trait PartialOptionsany extends js.Object {
  var bounds: js.UndefOr[Bounds] = js.native
  var bubble: js.UndefOr[Boolean] = js.native
  var clickable: js.UndefOr[Boolean] = js.native
  var cursor: js.UndefOr[String] = js.native
  var draggable: js.UndefOr[Boolean] = js.native
  var extData: js.UndefOr[js.Any] = js.native
  var fillColor: js.UndefOr[String] = js.native
  var fillOpacity: js.UndefOr[Double] = js.native
  var lineCap: js.UndefOr[StrokeLineCap] = js.native
  var lineJoin: js.UndefOr[StrokeLineJoin] = js.native
  var map: js.UndefOr[Map] = js.native
  var path: js.UndefOr[js.Array[js.Array[LocationValue] | LocationValue]] = js.native
  var strokeColor: js.UndefOr[String] = js.native
  var strokeDasharray: js.UndefOr[js.Array[Double]] = js.native
  var strokeOpacity: js.UndefOr[Double] = js.native
  var strokeStyle: js.UndefOr[StrokeStyle] = js.native
  var strokeWeight: js.UndefOr[Double] = js.native
  var visible: js.UndefOr[Boolean] = js.native
  var zIndex: js.UndefOr[Double] = js.native
}

object PartialOptionsany {
  @scala.inline
  def apply(): PartialOptionsany = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptionsany]
  }
  @scala.inline
  implicit class PartialOptionsanyOps[Self <: PartialOptionsany] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBounds(value: Bounds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(js.undefined)
        ret
    }
    @scala.inline
    def withBubble(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubble")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBubble: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubble")(js.undefined)
        ret
    }
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
    def withCursor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(js.undefined)
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
    def withExtData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extData")(js.undefined)
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
    def withLineCap(value: StrokeLineCap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineCap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineCap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineCap")(js.undefined)
        ret
    }
    @scala.inline
    def withLineJoin(value: StrokeLineJoin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineJoin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineJoin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineJoin")(js.undefined)
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
    def withPath(value: js.Array[js.Array[LocationValue] | LocationValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
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
    def withStrokeDasharray(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeDasharray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeDasharray: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeDasharray")(js.undefined)
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
    def withStrokeStyle(value: StrokeStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeStyle")(js.undefined)
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


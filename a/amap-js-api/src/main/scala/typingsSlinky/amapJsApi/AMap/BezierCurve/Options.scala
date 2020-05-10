package typingsSlinky.amapJsApi.AMap.BezierCurve

import typingsSlinky.amapJsApi.AMap.LocationValue
import typingsSlinky.amapJsApi.AMap.Map
import typingsSlinky.amapJsApi.AMap.StrokeLineCap
import typingsSlinky.amapJsApi.AMap.StrokeLineJoin
import typingsSlinky.amapJsApi.AMap.StrokeStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined amap-js-api.AMap.Merge<amap-js-api.AMap.Polyline.Options<ExtraData>, {  path  :std.Array<std.Array<number | string | std.Array<string | number>>>,   tolerance ? :number,   interpolateNumLimit ? :[number]}> */
@js.native
trait Options[ExtraData] extends js.Object {
  /**
    * 描边的宽度
    */
  var borderWeight: js.UndefOr[Double] = js.native
  /**
    * 事件是否穿透到地图
    */
  var bubble: js.UndefOr[Boolean] = js.native
  /**
    * 是否支持点击
    */
  var clickable: js.UndefOr[Boolean] = js.native
  /**
    * 鼠标悬停时的鼠标样式
    */
  var cursor: js.UndefOr[String] = js.native
  /**
    * 方向箭头颜色
    */
  var dirColor: js.UndefOr[String] = js.native
  /**
    * 是否支持拖拽
    */
  var draggable: js.UndefOr[Boolean] = js.native
  /**
    * 自定义数据
    */
  var extData: js.UndefOr[ExtraData] = js.native
  /**
    * 是否绘制成大地线
    */
  var geodesic: js.UndefOr[Boolean] = js.native
  var interpolateNumLimit: js.UndefOr[js.Array[Double]] = js.native
  /**
    * 线条是否带描边
    */
  var isOutline: js.UndefOr[Boolean] = js.native
  /**
    * 折线两端线帽的绘制样式
    */
  var lineCap: js.UndefOr[StrokeLineCap] = js.native
  /**
    * 折线拐点的绘制样式
    */
  var lineJoin: js.UndefOr[StrokeLineJoin] = js.native
  /**
    * 所属地图
    */
  var map: js.UndefOr[Map] = js.native
  /**
    * 线条描边颜色
    */
  var outlineColor: js.UndefOr[String] = js.native
  // internal
  /**
    * 折线的节点数组
    */
  /**
    * 贝瑟尔曲线的路径
    */
  var path: js.UndefOr[
    js.Array[LocationValue] with (js.Array[js.Array[Double | String | (js.Array[String | Double])]])
  ] = js.native
  /**
    * 是否延路径显示方向箭头
    */
  var showDir: js.UndefOr[Boolean] = js.native
  /**
    * 描边线条颜色
    */
  var strokeColor: js.UndefOr[String] = js.native
  /**
    * 虚线间隔
    */
  var strokeDasharray: js.UndefOr[js.Array[Double]] = js.native
  /**
    * 描边线条透明度
    */
  var strokeOpacity: js.UndefOr[Double] = js.native
  /**
    * 描边样式
    */
  var strokeStyle: js.UndefOr[StrokeStyle] = js.native
  /**
    * 描边宽度
    */
  var strokeWeight: js.UndefOr[Double] = js.native
  // internal
  var tolerance: js.UndefOr[Double] = js.native
  /**
    * 是否可见
    */
  var visible: js.UndefOr[Boolean] = js.native
  /**
    * 覆盖物层级
    */
  var zIndex: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply[ExtraData](): Options[ExtraData] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[ExtraData]]
  }
  @scala.inline
  implicit class OptionsOps[Self[extradata] <: Options[extradata], ExtraData] (val x: Self[ExtraData]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ExtraData] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ExtraData]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ExtraData] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ExtraData] with Other]
    @scala.inline
    def withBorderWeight(value: Double): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderWeight: Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWeight")(js.undefined)
        ret
    }
    @scala.inline
    def withBubble(value: Boolean): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubble")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBubble: Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubble")(js.undefined)
        ret
    }
    @scala.inline
    def withClickable(value: Boolean): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickable: Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickable")(js.undefined)
        ret
    }
    @scala.inline
    def withCursor(value: String): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursor: Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(js.undefined)
        ret
    }
    @scala.inline
    def withDirColor(value: String): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirColor: Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirColor")(js.undefined)
        ret
    }
    @scala.inline
    def withDraggable(value: Boolean): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggable: Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(js.undefined)
        ret
    }
    @scala.inline
    def withExtData(value: ExtraData): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtData: Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extData")(js.undefined)
        ret
    }
    @scala.inline
    def withGeodesic(value: Boolean): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geodesic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeodesic: Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geodesic")(js.undefined)
        ret
    }
    @scala.inline
    def withInterpolateNumLimit(value: js.Array[Double]): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolateNumLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterpolateNumLimit: Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolateNumLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withIsOutline(value: Boolean): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOutline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsOutline: Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOutline")(js.undefined)
        ret
    }
    @scala.inline
    def withLineCap(value: StrokeLineCap): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineCap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineCap: Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineCap")(js.undefined)
        ret
    }
    @scala.inline
    def withLineJoin(value: StrokeLineJoin): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineJoin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineJoin: Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineJoin")(js.undefined)
        ret
    }
    @scala.inline
    def withMap(value: Map): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMap: Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.undefined)
        ret
    }
    @scala.inline
    def withOutlineColor(value: String): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutlineColor: Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlineColor")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(
      value: js.Array[LocationValue] with (js.Array[js.Array[Double | String | (js.Array[String | Double])]])
    ): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withShowDir(value: Boolean): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowDir: Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDir")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeColor(value: String): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeColor: Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeColor")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeDasharray(value: js.Array[Double]): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeDasharray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeDasharray: Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeDasharray")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeOpacity(value: Double): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeOpacity: Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeStyle(value: StrokeStyle): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeStyle: Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeWeight(value: Double): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeWeight: Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWeight")(js.undefined)
        ret
    }
    @scala.inline
    def withTolerance(value: Double): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tolerance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTolerance: Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tolerance")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
    @scala.inline
    def withZIndex(value: Double): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndex: Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(js.undefined)
        ret
    }
  }
  
}


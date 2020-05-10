package typingsSlinky.amapJsApi.AMap.ShapeOverlay

import typingsSlinky.amapJsApi.AMap.Map
import typingsSlinky.amapJsApi.AMap.StrokeStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOptionsResult[ExtraData] extends js.Object {
  /**
    * 事件是否穿透到地图
    */
  var bubble: Boolean = js.native
  /**
    * 是否支持点击
    */
  var clickable: Boolean = js.native
  /**
    * 自定义属性
    */
  var extData: ExtraData | js.Object = js.native
  /**
    * 所属地图
    */
  var map: Map = js.native
  /**
    * 线条颜色
    */
  var strokeColor: String = js.native
  /**
    * 虚线的分段
    */
  var strokeDasharray: js.Array[Double] = js.native
  /**
    * 线条透明度
    */
  var strokeOpacity: Double = js.native
  /**
    * 线条样式，虚线或者实线
    */
  var strokeStyle: StrokeStyle = js.native
  /**
    * 线条宽度
    */
  var strokeWeight: Double = js.native
  /**
    * 层级
    */
  var zIndex: Double = js.native
}

object GetOptionsResult {
  @scala.inline
  def apply[ExtraData](
    bubble: Boolean,
    clickable: Boolean,
    extData: ExtraData | js.Object,
    map: Map,
    strokeColor: String,
    strokeDasharray: js.Array[Double],
    strokeOpacity: Double,
    strokeStyle: StrokeStyle,
    strokeWeight: Double,
    zIndex: Double
  ): GetOptionsResult[ExtraData] = {
    val __obj = js.Dynamic.literal(bubble = bubble.asInstanceOf[js.Any], clickable = clickable.asInstanceOf[js.Any], extData = extData.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], strokeColor = strokeColor.asInstanceOf[js.Any], strokeDasharray = strokeDasharray.asInstanceOf[js.Any], strokeOpacity = strokeOpacity.asInstanceOf[js.Any], strokeStyle = strokeStyle.asInstanceOf[js.Any], strokeWeight = strokeWeight.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOptionsResult[ExtraData]]
  }
  @scala.inline
  implicit class GetOptionsResultOps[Self[extradata] <: GetOptionsResult[extradata], ExtraData] (val x: Self[ExtraData]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ExtraData] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ExtraData]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ExtraData] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ExtraData] with Other]
    @scala.inline
    def withBubble(value: Boolean): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubble")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClickable(value: Boolean): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtData(value: ExtraData | js.Object): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMap(value: Map): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrokeColor(value: String): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrokeDasharray(value: js.Array[Double]): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeDasharray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrokeOpacity(value: Double): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrokeStyle(value: StrokeStyle): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrokeWeight(value: Double): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZIndex(value: Double): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.amapJsApi.AMap.Polyline

import typingsSlinky.amapJsApi.AMap.LngLat
import typingsSlinky.amapJsApi.AMap.Map
import typingsSlinky.amapJsApi.AMap.StrokeLineCap
import typingsSlinky.amapJsApi.AMap.StrokeLineJoin
import typingsSlinky.amapJsApi.AMap.StrokeStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOptionsResult[ExtraData]
  extends typingsSlinky.amapJsApi.AMap.ShapeOverlay.GetOptionsResult[ExtraData] {
  /**
    * 描边的宽度
    */
  var borderWeight: Double = js.native
  /**
    * 方向箭头颜色
    */
  var dirColor: String = js.native
  /**
    * 方向箭头图片
    */
  var dirImg: String = js.native
  /**
    * 是否绘制成大地线
    */
  var geodesic: Boolean = js.native
  /**
    * 线条是否带描边
    */
  var isOutline: Boolean = js.native
  /**
    * 折线两端线帽的绘制样式
    */
  var lineCap: StrokeLineCap = js.native
  /**
    * 折线拐点的绘制样式
    */
  var lineJoin: StrokeLineJoin = js.native
  /**
    * 线条描边颜色
    */
  var outlineColor: String = js.native
  /**
    * 折线的节点数组
    */
  var path: js.Array[LngLat] = js.native
  /**
    * 是否延路径显示方向箭头
    */
  var showDir: Boolean = js.native
}

object GetOptionsResult {
  @scala.inline
  def apply[ExtraData](
    borderWeight: Double,
    bubble: Boolean,
    clickable: Boolean,
    dirColor: String,
    dirImg: String,
    extData: ExtraData | js.Object,
    geodesic: Boolean,
    isOutline: Boolean,
    lineCap: StrokeLineCap,
    lineJoin: StrokeLineJoin,
    map: Map,
    outlineColor: String,
    path: js.Array[LngLat],
    showDir: Boolean,
    strokeColor: String,
    strokeDasharray: js.Array[Double],
    strokeOpacity: Double,
    strokeStyle: StrokeStyle,
    strokeWeight: Double,
    zIndex: Double
  ): GetOptionsResult[ExtraData] = {
    val __obj = js.Dynamic.literal(borderWeight = borderWeight.asInstanceOf[js.Any], bubble = bubble.asInstanceOf[js.Any], clickable = clickable.asInstanceOf[js.Any], dirColor = dirColor.asInstanceOf[js.Any], dirImg = dirImg.asInstanceOf[js.Any], extData = extData.asInstanceOf[js.Any], geodesic = geodesic.asInstanceOf[js.Any], isOutline = isOutline.asInstanceOf[js.Any], lineCap = lineCap.asInstanceOf[js.Any], lineJoin = lineJoin.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], outlineColor = outlineColor.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], showDir = showDir.asInstanceOf[js.Any], strokeColor = strokeColor.asInstanceOf[js.Any], strokeDasharray = strokeDasharray.asInstanceOf[js.Any], strokeOpacity = strokeOpacity.asInstanceOf[js.Any], strokeStyle = strokeStyle.asInstanceOf[js.Any], strokeWeight = strokeWeight.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOptionsResult[ExtraData]]
  }
  @scala.inline
  implicit class GetOptionsResultOps[Self[extradata] <: GetOptionsResult[extradata], ExtraData] (val x: Self[ExtraData]) extends AnyVal {
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
    def withDirColor(value: String): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirImg(value: String): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirImg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGeodesic(value: Boolean): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geodesic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsOutline(value: Boolean): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOutline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineCap(value: StrokeLineCap): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineCap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineJoin(value: StrokeLineJoin): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineJoin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutlineColor(value: String): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: js.Array[LngLat]): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowDir(value: Boolean): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDir")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


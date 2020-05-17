package typingsSlinky.amapJsApi.AMap.Polygon

import typingsSlinky.amapJsApi.AMap.LocationValue
import typingsSlinky.amapJsApi.ReferOverlayOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options[ExtraData]
  extends typingsSlinky.amapJsApi.AMap.PathOverlay.Options[ExtraData]
     with ReferOverlayOptions[js.Any] {
  /**
    * 多边形填充颜色
    */
  var fillColor: js.UndefOr[String] = js.native
  /**
    * 边形填充透明度
    */
  var fillOpacity: js.UndefOr[Double] = js.native
  /**
    * 多边形轮廓线的节点坐标数组
    */
  var path: js.UndefOr[js.Array[js.Array[LocationValue] | LocationValue]] = js.native
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
    def withFillColor(value: String): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillColor: Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillColor")(js.undefined)
        ret
    }
    @scala.inline
    def withFillOpacity(value: Double): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillOpacity: Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: js.Array[js.Array[LocationValue] | LocationValue]): Self[ExtraData] = {
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
  }
  
}


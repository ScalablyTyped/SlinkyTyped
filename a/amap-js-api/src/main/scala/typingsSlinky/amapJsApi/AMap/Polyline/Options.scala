package typingsSlinky.amapJsApi.AMap.Polyline

import typingsSlinky.amapJsApi.AMap.LocationValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options[ExtraData]
  extends typingsSlinky.amapJsApi.AMap.PathOverlay.Options[ExtraData] {
  /**
    * 描边的宽度
    */
  var borderWeight: js.UndefOr[Double] = js.native
  /**
    * 方向箭头颜色
    */
  var dirColor: js.UndefOr[String] = js.native
  /**
    * 是否绘制成大地线
    */
  var geodesic: js.UndefOr[Boolean] = js.native
  /**
    * 线条是否带描边
    */
  var isOutline: js.UndefOr[Boolean] = js.native
  /**
    * 线条描边颜色
    */
  var outlineColor: js.UndefOr[String] = js.native
  // internal
  /**
    * 折线的节点数组
    */
  var path: js.UndefOr[js.Array[LocationValue]] = js.native
  /**
    * 是否延路径显示方向箭头
    */
  var showDir: js.UndefOr[Boolean] = js.native
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
    def withPath(value: js.Array[LocationValue]): Self[ExtraData] = {
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
  }
  
}


package typingsSlinky.amapJsApiToolBar.AMap.ToolBar

import typingsSlinky.amapJsApi.AMap.Marker
import typingsSlinky.amapJsApi.AMap.Pixel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * 是否自动定位，即地图初始化加载完成后，是否自动定位的用户所在地，仅在支持HTML5的浏览器中有效
    */
  var autoPosition: js.UndefOr[Boolean] = js.native
  /**
    * 方向键盘是否可见
    */
  var direction: js.UndefOr[Boolean] = js.native
  /**
    * 是否使用精简模式
    */
  var liteStyle: js.UndefOr[Boolean] = js.native
  /**
    * 是否显示定位按钮
    */
  var locate: js.UndefOr[Boolean] = js.native
  /**
    * 自定义定位图标，值为Marker对象
    */
  var locationMarker: js.UndefOr[Marker[_]] = js.native
  /**
    * 定位失败后，是否开启IP定位
    */
  var noIpLocate: js.UndefOr[Boolean] = js.native
  /**
    * 相对于地图容器左上角的偏移量
    */
  var offset: js.UndefOr[Pixel] = js.native
  /**
    * 控件停靠位置
    * LT:左上角;
    * RT:右上角;
    * LB:左下角;
    * RB:右下角;
    */
  var position: js.UndefOr[Position] = js.native
  /**
    * 标尺键盘是否可见
    */
  var ruler: js.UndefOr[Boolean] = js.native
  // internal
  var timeout: js.UndefOr[Double] = js.native
  /**
    * 是否使用高德定位sdk用来辅助优化定位效果
    */
  var useNative: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoPosition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withLiteStyle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liteStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLiteStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liteStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withLocate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locate")(js.undefined)
        ret
    }
    @scala.inline
    def withLocationMarker(value: Marker[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationMarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocationMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationMarker")(js.undefined)
        ret
    }
    @scala.inline
    def withNoIpLocate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noIpLocate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoIpLocate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noIpLocate")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: Pixel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: Position): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withRuler(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruler")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withUseNative(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseNative: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNative")(js.undefined)
        ret
    }
  }
  
}


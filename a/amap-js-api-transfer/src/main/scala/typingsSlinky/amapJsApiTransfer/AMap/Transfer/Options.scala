package typingsSlinky.amapJsApiTransfer.AMap.Transfer

import typingsSlinky.amapJsApi.AMap.Map
import typingsSlinky.amapJsApiTransfer.AMap.TransferPolicy
import typingsSlinky.amapJsApiTransfer.amapJsApiTransferStrings.all
import typingsSlinky.amapJsApiTransfer.amapJsApiTransferStrings.base
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * 用于控制在路径规划结束后，是否自动调整地图视野使绘制的路线处于视口的可见范围
    */
  var autoFitView: js.UndefOr[Boolean] = js.native
  /**
    * 公交换乘的城市，支持城市名称、城市区号、电话区号，此项为必填
    */
  var city: String = js.native
  /**
    * 终点城市，跨城公交路径规划时为必填参数
    */
  var cityd: js.UndefOr[String] = js.native
  /**
    * 返回结果控制, 默认值: base
    * base:返回基本信息
    * all:返回全部信息
    */
  var extensions: js.UndefOr[all | base] = js.native
  /**
    * 设置是否隐藏路径规划的起始点图标
    */
  var hideMarkers: js.UndefOr[Boolean] = js.native
  /**
    * 使用map属性时，绘制的规划线路是否显示描边。默认为true
    */
  var isOutline: js.UndefOr[Boolean] = js.native
  /**
    * AMap.Map对象, 展现结果的地图实例
    */
  var map: js.UndefOr[Map] = js.native
  /**
    * 是否计算夜班车，默认为不计算
    */
  var nightflag: js.UndefOr[Boolean] = js.native
  /**
    * 使用map属性时，绘制的规划线路的描边颜色。默认为'white'
    */
  var outlineColor: js.UndefOr[String] = js.native
  /**
    * 结果列表的HTML容器id或容器元素
    */
  var panel: js.UndefOr[String] = js.native
  /**
    * 公交换乘策略
    */
  var policy: js.UndefOr[TransferPolicy] = js.native
  // internal
  var showDir: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(city: String): Options = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("city")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoFitView(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFitView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoFitView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFitView")(js.undefined)
        ret
    }
    @scala.inline
    def withCityd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cityd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCityd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cityd")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensions(value: all | base): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(js.undefined)
        ret
    }
    @scala.inline
    def withHideMarkers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideMarkers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideMarkers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideMarkers")(js.undefined)
        ret
    }
    @scala.inline
    def withIsOutline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOutline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsOutline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOutline")(js.undefined)
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
    def withNightflag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nightflag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNightflag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nightflag")(js.undefined)
        ret
    }
    @scala.inline
    def withOutlineColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutlineColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlineColor")(js.undefined)
        ret
    }
    @scala.inline
    def withPanel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panel")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicy(value: TransferPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(js.undefined)
        ret
    }
    @scala.inline
    def withShowDir(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDir")(js.undefined)
        ret
    }
  }
  
}


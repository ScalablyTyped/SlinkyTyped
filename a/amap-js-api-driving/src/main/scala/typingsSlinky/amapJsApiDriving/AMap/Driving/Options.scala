package typingsSlinky.amapJsApiDriving.AMap.Driving

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.amapJsApi.AMap.Map
import typingsSlinky.amapJsApiDriving.AMap.DrivingPolicy
import typingsSlinky.amapJsApiDriving.amapJsApiDrivingStrings.all
import typingsSlinky.amapJsApiDriving.amapJsApiDrivingStrings.base
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * 于控制在路径规划结束后，是否自动调整地图视野使绘制的路线处于视口的可见范围
    */
  var autoFitView: js.UndefOr[Boolean] = js.native
  /**
    * 返回信息种类
    * 默认值：base，返回基本地址信息
    * 当取值为：all，返回DriveStep基本信息+DriveStep详细信息
    */
  var extensions: js.UndefOr[base | all] = js.native
  /**
    * 默认为0，表示可以使用轮渡，为1的时候表示不可以使用轮渡
    */
  var ferry: js.UndefOr[Boolean] = js.native
  /**
    * 设置隐藏路径规划的起始点图标
    */
  var hideMarkers: js.UndefOr[Boolean] = js.native
  /**
    * 使用map属性时，绘制的规划线路是否显示描边。缺省为true
    */
  var isOutline: js.UndefOr[Boolean] = js.native
  /**
    * AMap.Map对象
    * 展现结果的地图实例。当指定此参数后，搜索结果的标注、线路等均会自动添加到此地图上。
    */
  var map: js.UndefOr[Map] = js.native
  /**
    * 除省份之外车牌的字母和数字，用于判断限行相关，与province属性组合使用。
    */
  var number: js.UndefOr[String] = js.native
  /**
    * 使用map属性时，绘制的规划线路的描边颜色。缺省为'white'
    */
  var outlineColor: js.UndefOr[String] = js.native
  /**
    * 结果列表的HTML容器id或容器元素，提供此参数后，结果列表将在此容器中进行展示。
    */
  var panel: js.UndefOr[String | HTMLElement] = js.native
  /**
    * 驾车路线规划策略
    */
  var policy: js.UndefOr[DrivingPolicy] = js.native
  /**
    * 车牌省份的汉字缩写，用于判断是否限行，与number属性组合使用。
    */
  var province: js.UndefOr[String] = js.native
  // internal
  var showDir: js.UndefOr[Boolean] = js.native
  /**
    * 设置是否显示实时路况信息，默认设置为true。
    * 显示绿色代表畅通，黄色代表轻微拥堵，红色代表比较拥堵，灰色表示无路况信息。
    */
  var showTraffic: js.UndefOr[Boolean] = js.native
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
    def withExtensions(value: base | all): Self = {
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
    def withFerry(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ferry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFerry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ferry")(js.undefined)
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
    def withNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(js.undefined)
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
    def withPanelHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPanel(value: String | HTMLElement): Self = {
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
    def withPolicy(value: DrivingPolicy): Self = {
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
    def withProvince(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("province")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvince: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("province")(js.undefined)
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
    @scala.inline
    def withShowTraffic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTraffic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTraffic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTraffic")(js.undefined)
        ret
    }
  }
  
}


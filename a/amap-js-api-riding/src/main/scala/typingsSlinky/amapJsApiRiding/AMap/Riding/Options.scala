package typingsSlinky.amapJsApiRiding.AMap.Riding

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.amapJsApi.AMap.Map
import typingsSlinky.amapJsApiRiding.AMap.RidingPolicy
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
    * 设置隐藏路径规划的起始点图标，设置为true：隐藏图标；设置false：显示图标 默认值为：false
    */
  var hideMarkers: js.UndefOr[Boolean] = js.native
  /**
    * 使用map属性时，绘制的规划线路是否显示描边，默认为true
    */
  var isOutline: js.UndefOr[Boolean] = js.native
  /**
    * AMap.Map对象, 展现结果的地图实例。
    * 当指定此参数后，搜索结果的标注、线路等均会自动添加到此地图上
    */
  var map: js.UndefOr[Map] = js.native
  /**
    * 使用map属性时，绘制的规划线路是否显示描边，默认为"white"
    */
  var outlineColor: js.UndefOr[String] = js.native
  /**
    * 结果列表的HTML容器id或容器元素，提供此参数后，结果列表将在此容器中进行展示
    */
  var panel: js.UndefOr[String | HTMLElement] = js.native
  /**
    * 骑行路线规划策略
    */
  var policy: js.UndefOr[RidingPolicy] = js.native
  // internal
  var showDir: js.UndefOr[Boolean] = js.native
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
    def withPolicy(value: RidingPolicy): Self = {
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


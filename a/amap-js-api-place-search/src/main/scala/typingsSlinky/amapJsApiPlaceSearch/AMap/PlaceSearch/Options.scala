package typingsSlinky.amapJsApiPlaceSearch.AMap.PlaceSearch

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.amapJsApi.AMap.Lang
import typingsSlinky.amapJsApi.AMap.Map
import typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.all
import typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.base
import typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.default
import typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.newpc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * 是否自动调整地图视野使绘制的Marker点都处于视口的可见范围
    */
  var autoFitView: js.UndefOr[Boolean] = js.native
  /**
    * 是否按照层级展示子POI数据
    * children=1，展示子节点POI数据，children=0，不展示子节点数据
    */
  var children: js.UndefOr[Double] = js.native
  /**
    * 兴趣点城市
    */
  var city: js.UndefOr[String] = js.native
  /**
    * 是否强制限制在设置的城市内搜索
    */
  var citylimit: js.UndefOr[Boolean] = js.native
  /**
    * 是否返回详细信息
    * base返回基本地址信息；all返回基本+详细信息
    */
  var extensions: js.UndefOr[base | all] = js.native
  /**
    * 检索语言类型
    */
  var lang: js.UndefOr[Lang] = js.native
  /**
    * Map对象
    */
  var map: js.UndefOr[Map] = js.native
  /**
    * 页码
    */
  var pageIndex: js.UndefOr[Double] = js.native
  /**
    * 单页显示结果条数
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * 结果列表的HTML容器id或容器元素
    */
  var panel: js.UndefOr[String | HTMLElement] = js.native
  var rankBy: js.UndefOr[String] = js.native
  // internal
  var renderEngine: js.UndefOr[String] = js.native
  /**
    * 绘制的UI风格
    */
  var renderStyle: js.UndefOr[newpc | default] = js.native
  /**
    * 是否在地图上显示周边搜索的圆或者范围搜索的多边形
    */
  var showCover: js.UndefOr[Boolean] = js.native
  /**
    * 兴趣点类别，多个类别用“|”分割
    */
  var `type`: js.UndefOr[String] = js.native
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
    def withChildren(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withCity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("city")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("city")(js.undefined)
        ret
    }
    @scala.inline
    def withCitylimit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("citylimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCitylimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("citylimit")(js.undefined)
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
    def withLang(value: Lang): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLang: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(js.undefined)
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
    def withPageIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(js.undefined)
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
    def withRankBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rankBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRankBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rankBy")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderEngine(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderEngine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderEngine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderEngine")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderStyle(value: newpc | default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCover")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}


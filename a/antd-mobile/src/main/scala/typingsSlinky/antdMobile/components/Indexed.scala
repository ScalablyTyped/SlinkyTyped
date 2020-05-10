package typingsSlinky.antdMobile.components

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antdMobile.AnonLabel
import typingsSlinky.antdMobile.indexedMod.MIndexedListProps
import typingsSlinky.antdMobile.indexedMod.default
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Indexed {
  @JSImport("antd-mobile/lib/list-view/Indexed", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def contentContainerStyle(value: CSSProperties): this.type = set("contentContainerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def delayActivityIndicatorReactElement(value: ReactElement): this.type = set("delayActivityIndicator", value.asInstanceOf[js.Any])
    @scala.inline
    def delayActivityIndicator(value: TagMod[Any]): this.type = set("delayActivityIndicator", value.asInstanceOf[js.Any])
    @scala.inline
    def delayTime(value: Double): this.type = set("delayTime", value.asInstanceOf[js.Any])
    @scala.inline
    def horizontal(value: Boolean): this.type = set("horizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def initialListSize(value: Double): this.type = set("initialListSize", value.asInstanceOf[js.Any])
    @scala.inline
    def listPrefixCls(value: String): this.type = set("listPrefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def listViewPrefixCls(value: String): this.type = set("listViewPrefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def onContentSizeChange(value: (/* w */ Double, /* h */ Double) => Unit): this.type = set("onContentSizeChange", js.Any.fromFunction2(value))
    @scala.inline
    def onEndReached(value: /* e */ js.UndefOr[js.Any] => Unit): this.type = set("onEndReached", js.Any.fromFunction1(value))
    @scala.inline
    def onEndReachedThreshold(value: Double): this.type = set("onEndReachedThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def onLayout(value: /* event */ js.Any => Unit): this.type = set("onLayout", js.Any.fromFunction1(value))
    @scala.inline
    def onQuickSearch(value: (/* sectionID */ js.Any, /* topId */ js.UndefOr[js.Any]) => Unit): this.type = set("onQuickSearch", js.Any.fromFunction2(value))
    @scala.inline
    def onScroll(value: /* e */ js.UndefOr[js.Any] => Unit): this.type = set("onScroll", js.Any.fromFunction1(value))
    @scala.inline
    def pageSize(value: Double): this.type = set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def pullToRefreshReactElement(value: ReactElement): this.type = set("pullToRefresh", value.asInstanceOf[js.Any])
    @scala.inline
    def pullToRefresh(value: TagMod[Any]): this.type = set("pullToRefresh", value.asInstanceOf[js.Any])
    @scala.inline
    def quickSearchBarStyle(value: CSSProperties): this.type = set("quickSearchBarStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def quickSearchBarTop(value: AnonLabel): this.type = set("quickSearchBarTop", value.asInstanceOf[js.Any])
    @scala.inline
    def renderBodyComponent(value: () => ReactElement): this.type = set("renderBodyComponent", js.Any.fromFunction0(value))
    @scala.inline
    def renderFooter(value: () => ReactElement): this.type = set("renderFooter", js.Any.fromFunction0(value))
    @scala.inline
    def renderHeader(value: () => ReactElement): this.type = set("renderHeader", js.Any.fromFunction0(value))
    @scala.inline
    def renderScrollComponent(value: /* p */ js.Any => ReactElement): this.type = set("renderScrollComponent", js.Any.fromFunction1(value))
    @scala.inline
    def renderSectionBodyWrapper(value: () => ReactElement): this.type = set("renderSectionBodyWrapper", js.Any.fromFunction0(value))
    @scala.inline
    def renderSectionHeader(value: (/* sectionData */ js.Any, /* sectionId */ String | Double) => ReactElement): this.type = set("renderSectionHeader", js.Any.fromFunction2(value))
    @scala.inline
    def renderSectionWrapper(value: () => ReactElement): this.type = set("renderSectionWrapper", js.Any.fromFunction0(value))
    @scala.inline
    def renderSeparator(
      value: (/* sectionID */ String | Double, /* rowID */ String | Double, /* adjacentRowHighlighted */ js.UndefOr[Boolean]) => ReactElement
    ): this.type = set("renderSeparator", js.Any.fromFunction3(value))
    @scala.inline
    def scrollEventThrottle(value: Double): this.type = set("scrollEventThrottle", value.asInstanceOf[js.Any])
    @scala.inline
    def scrollRenderAheadDistance(value: Double): this.type = set("scrollRenderAheadDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def sectionBodyClassName(value: String): this.type = set("sectionBodyClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def useBodyScroll(value: Boolean): this.type = set("useBodyScroll", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MIndexedListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    dataSource: js.Any,
    renderRow: (js.Any, Double | String, Double | String, js.UndefOr[Boolean]) => ReactElement
  ): Builder = {
    val __props = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any], renderRow = js.Any.fromFunction4(renderRow))
    new Builder(js.Array(this.component, __props.asInstanceOf[MIndexedListProps]))
  }
}


package typingsSlinky.antdDashMobile.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.antdDashMobile.Anon_Label
import typingsSlinky.antdDashMobile.libListDashViewIndexedMod.MIndexedListProps
import typingsSlinky.antdDashMobile.libListDashViewIndexedMod.default
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Indexed
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("antd-mobile/lib/list-view/Indexed", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, onScroll */
  def apply(
    dataSource: js.Any,
    renderRow: (js.Any, Double | String, Double | String, js.UndefOr[Boolean]) => ReactElement,
    contentContainerStyle: CSSProperties = null,
    delayActivityIndicator: TagMod[Any] = null,
    delayTime: Int | Double = null,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    initialListSize: Int | Double = null,
    listPrefixCls: String = null,
    listViewPrefixCls: String = null,
    onContentSizeChange: (/* w */ Double, /* h */ Double) => Unit = null,
    onEndReached: /* e */ js.UndefOr[js.Any] => Unit = null,
    onEndReachedThreshold: Int | Double = null,
    onLayout: /* event */ js.Any => Unit = null,
    onQuickSearch: (/* sectionID */ js.Any, /* topId */ js.UndefOr[js.Any]) => Unit = null,
    pageSize: Int | Double = null,
    prefixCls: String = null,
    pullToRefresh: TagMod[Any] = null,
    quickSearchBarStyle: CSSProperties = null,
    quickSearchBarTop: Anon_Label = null,
    renderBodyComponent: () => ReactElement = null,
    renderFooter: () => ReactElement = null,
    renderHeader: () => ReactElement = null,
    renderScrollComponent: /* p */ js.Any => ReactElement = null,
    renderSectionBodyWrapper: () => ReactElement = null,
    renderSectionHeader: (/* sectionData */ js.Any, /* sectionId */ String | Double) => ReactElement = null,
    renderSectionWrapper: () => ReactElement = null,
    renderSeparator: (/* sectionID */ String | Double, /* rowID */ String | Double, /* adjacentRowHighlighted */ js.UndefOr[Boolean]) => ReactElement = null,
    scrollEventThrottle: Int | Double = null,
    scrollRenderAheadDistance: Int | Double = null,
    sectionBodyClassName: String = null,
    style: CSSProperties = null,
    useBodyScroll: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any], renderRow = js.Any.fromFunction4(renderRow))
    if (contentContainerStyle != null) __obj.updateDynamic("contentContainerStyle")(contentContainerStyle.asInstanceOf[js.Any])
    if (delayActivityIndicator != null) __obj.updateDynamic("delayActivityIndicator")(delayActivityIndicator.asInstanceOf[js.Any])
    if (delayTime != null) __obj.updateDynamic("delayTime")(delayTime.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (initialListSize != null) __obj.updateDynamic("initialListSize")(initialListSize.asInstanceOf[js.Any])
    if (listPrefixCls != null) __obj.updateDynamic("listPrefixCls")(listPrefixCls.asInstanceOf[js.Any])
    if (listViewPrefixCls != null) __obj.updateDynamic("listViewPrefixCls")(listViewPrefixCls.asInstanceOf[js.Any])
    if (onContentSizeChange != null) __obj.updateDynamic("onContentSizeChange")(js.Any.fromFunction2(onContentSizeChange))
    if (onEndReached != null) __obj.updateDynamic("onEndReached")(js.Any.fromFunction1(onEndReached))
    if (onEndReachedThreshold != null) __obj.updateDynamic("onEndReachedThreshold")(onEndReachedThreshold.asInstanceOf[js.Any])
    if (onLayout != null) __obj.updateDynamic("onLayout")(js.Any.fromFunction1(onLayout))
    if (onQuickSearch != null) __obj.updateDynamic("onQuickSearch")(js.Any.fromFunction2(onQuickSearch))
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (pullToRefresh != null) __obj.updateDynamic("pullToRefresh")(pullToRefresh.asInstanceOf[js.Any])
    if (quickSearchBarStyle != null) __obj.updateDynamic("quickSearchBarStyle")(quickSearchBarStyle.asInstanceOf[js.Any])
    if (quickSearchBarTop != null) __obj.updateDynamic("quickSearchBarTop")(quickSearchBarTop.asInstanceOf[js.Any])
    if (renderBodyComponent != null) __obj.updateDynamic("renderBodyComponent")(js.Any.fromFunction0(renderBodyComponent))
    if (renderFooter != null) __obj.updateDynamic("renderFooter")(js.Any.fromFunction0(renderFooter))
    if (renderHeader != null) __obj.updateDynamic("renderHeader")(js.Any.fromFunction0(renderHeader))
    if (renderScrollComponent != null) __obj.updateDynamic("renderScrollComponent")(js.Any.fromFunction1(renderScrollComponent))
    if (renderSectionBodyWrapper != null) __obj.updateDynamic("renderSectionBodyWrapper")(js.Any.fromFunction0(renderSectionBodyWrapper))
    if (renderSectionHeader != null) __obj.updateDynamic("renderSectionHeader")(js.Any.fromFunction2(renderSectionHeader))
    if (renderSectionWrapper != null) __obj.updateDynamic("renderSectionWrapper")(js.Any.fromFunction0(renderSectionWrapper))
    if (renderSeparator != null) __obj.updateDynamic("renderSeparator")(js.Any.fromFunction3(renderSeparator))
    if (scrollEventThrottle != null) __obj.updateDynamic("scrollEventThrottle")(scrollEventThrottle.asInstanceOf[js.Any])
    if (scrollRenderAheadDistance != null) __obj.updateDynamic("scrollRenderAheadDistance")(scrollRenderAheadDistance.asInstanceOf[js.Any])
    if (sectionBodyClassName != null) __obj.updateDynamic("sectionBodyClassName")(sectionBodyClassName.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(useBodyScroll)) __obj.updateDynamic("useBodyScroll")(useBodyScroll.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = MIndexedListProps
}


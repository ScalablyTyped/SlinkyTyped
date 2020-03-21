package typingsSlinky.rmcTabs.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.rmcTabs.modelsMod.Models.TabData
import typingsSlinky.rmcTabs.propsTypeMod.TabBarPropsType
import typingsSlinky.rmcTabs.rmcTabsBooleans.`false`
import typingsSlinky.rmcTabs.rmcTabsStrings.bottom
import typingsSlinky.rmcTabs.rmcTabsStrings.horizontal
import typingsSlinky.rmcTabs.rmcTabsStrings.left
import typingsSlinky.rmcTabs.rmcTabsStrings.right
import typingsSlinky.rmcTabs.rmcTabsStrings.top
import typingsSlinky.rmcTabs.rmcTabsStrings.vertical
import typingsSlinky.rmcTabs.tabsMod.PropsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tabs
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.rmcTabs.mod.Tabs] {
  @JSImport("rmc-tabs", "Tabs")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    tabs: js.Array[TabData],
    animated: js.UndefOr[Boolean] = js.undefined,
    destroyInactiveTab: js.UndefOr[Boolean] = js.undefined,
    distanceToChangeTab: Int | Double = null,
    initialPage: Double | String = null,
    noRenderContent: js.UndefOr[Boolean] = js.undefined,
    onChange: (/* tab */ TabData, /* index */ Double) => Unit = null,
    onTabClick: (/* tab */ TabData, /* index */ Double) => Unit = null,
    page: Double | String = null,
    prefixCls: String = null,
    prerenderingSiblingsNumber: Int | Double = null,
    renderTabBar: (js.Function1[/* props */ TabBarPropsType, TagMod[Any]]) | `false` = null,
    swipeable: js.UndefOr[Boolean] = js.undefined,
    tabBarActiveTextColor: String = null,
    tabBarBackgroundColor: String = null,
    tabBarInactiveTextColor: String = null,
    tabBarPosition: top | bottom | left | right = null,
    tabBarTextStyle: CSSProperties | js.Any = null,
    tabBarUnderlineStyle: CSSProperties | js.Any = null,
    tabDirection: horizontal | vertical = null,
    useLeftInsteadTransform: js.UndefOr[Boolean] = js.undefined,
    useOnPan: js.UndefOr[Boolean] = js.undefined,
    usePaged: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.rmcTabs.mod.Tabs] = {
    val __obj = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any])
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyInactiveTab)) __obj.updateDynamic("destroyInactiveTab")(destroyInactiveTab.asInstanceOf[js.Any])
    if (distanceToChangeTab != null) __obj.updateDynamic("distanceToChangeTab")(distanceToChangeTab.asInstanceOf[js.Any])
    if (initialPage != null) __obj.updateDynamic("initialPage")(initialPage.asInstanceOf[js.Any])
    if (!js.isUndefined(noRenderContent)) __obj.updateDynamic("noRenderContent")(noRenderContent.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onTabClick != null) __obj.updateDynamic("onTabClick")(js.Any.fromFunction2(onTabClick))
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (prerenderingSiblingsNumber != null) __obj.updateDynamic("prerenderingSiblingsNumber")(prerenderingSiblingsNumber.asInstanceOf[js.Any])
    if (renderTabBar != null) __obj.updateDynamic("renderTabBar")(renderTabBar.asInstanceOf[js.Any])
    if (!js.isUndefined(swipeable)) __obj.updateDynamic("swipeable")(swipeable.asInstanceOf[js.Any])
    if (tabBarActiveTextColor != null) __obj.updateDynamic("tabBarActiveTextColor")(tabBarActiveTextColor.asInstanceOf[js.Any])
    if (tabBarBackgroundColor != null) __obj.updateDynamic("tabBarBackgroundColor")(tabBarBackgroundColor.asInstanceOf[js.Any])
    if (tabBarInactiveTextColor != null) __obj.updateDynamic("tabBarInactiveTextColor")(tabBarInactiveTextColor.asInstanceOf[js.Any])
    if (tabBarPosition != null) __obj.updateDynamic("tabBarPosition")(tabBarPosition.asInstanceOf[js.Any])
    if (tabBarTextStyle != null) __obj.updateDynamic("tabBarTextStyle")(tabBarTextStyle.asInstanceOf[js.Any])
    if (tabBarUnderlineStyle != null) __obj.updateDynamic("tabBarUnderlineStyle")(tabBarUnderlineStyle.asInstanceOf[js.Any])
    if (tabDirection != null) __obj.updateDynamic("tabDirection")(tabDirection.asInstanceOf[js.Any])
    if (!js.isUndefined(useLeftInsteadTransform)) __obj.updateDynamic("useLeftInsteadTransform")(useLeftInsteadTransform.asInstanceOf[js.Any])
    if (!js.isUndefined(useOnPan)) __obj.updateDynamic("useOnPan")(useOnPan.asInstanceOf[js.Any])
    if (!js.isUndefined(usePaged)) __obj.updateDynamic("usePaged")(usePaged.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PropsType
}


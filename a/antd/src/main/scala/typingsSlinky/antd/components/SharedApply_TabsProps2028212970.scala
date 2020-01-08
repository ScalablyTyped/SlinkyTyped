package typingsSlinky.antd.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.antd.Anon_InkBar
import typingsSlinky.antd.antdStrings.add
import typingsSlinky.antd.antdStrings.default
import typingsSlinky.antd.antdStrings.large
import typingsSlinky.antd.antdStrings.remove
import typingsSlinky.antd.antdStrings.small
import typingsSlinky.antd.libTabsMod.TabsPosition
import typingsSlinky.antd.libTabsMod.TabsProps
import typingsSlinky.antd.libTabsMod.TabsType
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_TabsProps2028212970[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  /* The following DOM/SVG props were specified: className, onChange */
  def apply(
    activeKey: String = null,
    animated: Boolean | Anon_InkBar = null,
    defaultActiveKey: String = null,
    destroyInactiveTabPane: js.UndefOr[Boolean] = js.undefined,
    hideAdd: js.UndefOr[Boolean] = js.undefined,
    onEdit: (/* targetKey */ String | SyntheticMouseEvent[HTMLElement], /* action */ add | remove) => Unit = null,
    onNextClick: SyntheticMouseEvent[HTMLElement] => Unit = null,
    onPrevClick: SyntheticMouseEvent[HTMLElement] => Unit = null,
    onTabClick: js.Function = null,
    prefixCls: String = null,
    renderTabBar: (/* props */ TabsProps, /* DefaultTabBar */ ReactComponentClass[_]) => ReactElement = null,
    size: large | default | small = null,
    style: CSSProperties = null,
    tabBarExtraContent: TagMod[Any] = null,
    tabBarGutter: Int | Double = null,
    tabBarStyle: CSSProperties = null,
    tabPosition: TabsPosition = null,
    `type`: TabsType = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal()
    if (activeKey != null) __obj.updateDynamic("activeKey")(activeKey.asInstanceOf[js.Any])
    if (animated != null) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (defaultActiveKey != null) __obj.updateDynamic("defaultActiveKey")(defaultActiveKey.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyInactiveTabPane)) __obj.updateDynamic("destroyInactiveTabPane")(destroyInactiveTabPane.asInstanceOf[js.Any])
    if (!js.isUndefined(hideAdd)) __obj.updateDynamic("hideAdd")(hideAdd.asInstanceOf[js.Any])
    if (onEdit != null) __obj.updateDynamic("onEdit")(js.Any.fromFunction2(onEdit))
    if (onNextClick != null) __obj.updateDynamic("onNextClick")(js.Any.fromFunction1(onNextClick))
    if (onPrevClick != null) __obj.updateDynamic("onPrevClick")(js.Any.fromFunction1(onPrevClick))
    if (onTabClick != null) __obj.updateDynamic("onTabClick")(onTabClick.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (renderTabBar != null) __obj.updateDynamic("renderTabBar")(js.Any.fromFunction2(renderTabBar))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabBarExtraContent != null) __obj.updateDynamic("tabBarExtraContent")(tabBarExtraContent.asInstanceOf[js.Any])
    if (tabBarGutter != null) __obj.updateDynamic("tabBarGutter")(tabBarGutter.asInstanceOf[js.Any])
    if (tabBarStyle != null) __obj.updateDynamic("tabBarStyle")(tabBarStyle.asInstanceOf[js.Any])
    if (tabPosition != null) __obj.updateDynamic("tabPosition")(tabPosition.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, ComponentRef] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, ComponentRef](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = TabsProps
}


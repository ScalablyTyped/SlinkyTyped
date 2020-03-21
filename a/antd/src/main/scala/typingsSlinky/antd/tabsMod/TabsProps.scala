package typingsSlinky.antd.tabsMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.AnonInkBar
import typingsSlinky.antd.antdStrings.add
import typingsSlinky.antd.antdStrings.large
import typingsSlinky.antd.antdStrings.remove
import typingsSlinky.antd.antdStrings.small
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsProps extends js.Object {
  var activeKey: js.UndefOr[String] = js.undefined
  var animated: js.UndefOr[Boolean | AnonInkBar] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var defaultActiveKey: js.UndefOr[String] = js.undefined
  var destroyInactiveTabPane: js.UndefOr[Boolean] = js.undefined
  var hideAdd: js.UndefOr[Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* activeKey */ String, Unit]] = js.undefined
  var onEdit: js.UndefOr[
    js.Function2[
      /* targetKey */ String | SyntheticMouseEvent[HTMLElement], 
      /* action */ add | remove, 
      Unit
    ]
  ] = js.undefined
  var onNextClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
  var onPrevClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
  var onTabClick: js.UndefOr[js.Function] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var renderTabBar: js.UndefOr[
    js.Function2[/* props */ TabsProps, /* DefaultTabBar */ ReactComponentClass[_], ReactElement]
  ] = js.undefined
  var size: js.UndefOr[large | typingsSlinky.antd.antdStrings.default | small] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var tabBarExtraContent: js.UndefOr[TagMod[Any] | Null] = js.undefined
  var tabBarGutter: js.UndefOr[Double] = js.undefined
  var tabBarStyle: js.UndefOr[CSSProperties] = js.undefined
  var tabPosition: js.UndefOr[TabsPosition] = js.undefined
  var `type`: js.UndefOr[TabsType] = js.undefined
}

object TabsProps {
  @scala.inline
  def apply(
    activeKey: String = null,
    animated: Boolean | AnonInkBar = null,
    className: String = null,
    defaultActiveKey: String = null,
    destroyInactiveTabPane: js.UndefOr[Boolean] = js.undefined,
    hideAdd: js.UndefOr[Boolean] = js.undefined,
    onChange: /* activeKey */ String => Unit = null,
    onEdit: (/* targetKey */ String | SyntheticMouseEvent[HTMLElement], /* action */ add | remove) => Unit = null,
    onNextClick: SyntheticMouseEvent[HTMLElement] => Unit = null,
    onPrevClick: SyntheticMouseEvent[HTMLElement] => Unit = null,
    onTabClick: js.Function = null,
    prefixCls: String = null,
    renderTabBar: (/* props */ TabsProps, /* DefaultTabBar */ ReactComponentClass[_]) => ReactElement = null,
    size: large | typingsSlinky.antd.antdStrings.default | small = null,
    style: CSSProperties = null,
    tabBarExtraContent: TagMod[Any] = null,
    tabBarGutter: Int | Double = null,
    tabBarStyle: CSSProperties = null,
    tabPosition: TabsPosition = null,
    `type`: TabsType = null
  ): TabsProps = {
    val __obj = js.Dynamic.literal()
    if (activeKey != null) __obj.updateDynamic("activeKey")(activeKey.asInstanceOf[js.Any])
    if (animated != null) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultActiveKey != null) __obj.updateDynamic("defaultActiveKey")(defaultActiveKey.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyInactiveTabPane)) __obj.updateDynamic("destroyInactiveTabPane")(destroyInactiveTabPane.asInstanceOf[js.Any])
    if (!js.isUndefined(hideAdd)) __obj.updateDynamic("hideAdd")(hideAdd.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
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
    __obj.asInstanceOf[TabsProps]
  }
}


package typingsSlinky.antd.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.anon.InkBar
import typingsSlinky.antd.antdStrings.add
import typingsSlinky.antd.antdStrings.default
import typingsSlinky.antd.antdStrings.large
import typingsSlinky.antd.antdStrings.remove
import typingsSlinky.antd.antdStrings.small
import typingsSlinky.antd.tabsMod.TabsPosition
import typingsSlinky.antd.tabsMod.TabsProps
import typingsSlinky.antd.tabsMod.TabsType
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@scala.inline
class SharedBuilder_TabsProps2061107023[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  @scala.inline
  def activeKey(value: String): this.type = set("activeKey", value.asInstanceOf[js.Any])
  @scala.inline
  def animated(value: Boolean | InkBar): this.type = set("animated", value.asInstanceOf[js.Any])
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  @scala.inline
  def defaultActiveKey(value: String): this.type = set("defaultActiveKey", value.asInstanceOf[js.Any])
  @scala.inline
  def destroyInactiveTabPane(value: Boolean): this.type = set("destroyInactiveTabPane", value.asInstanceOf[js.Any])
  @scala.inline
  def hideAdd(value: Boolean): this.type = set("hideAdd", value.asInstanceOf[js.Any])
  @scala.inline
  def keyboard(value: Boolean): this.type = set("keyboard", value.asInstanceOf[js.Any])
  @scala.inline
  def onChange(value: /* activeKey */ String => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
  @scala.inline
  def onEdit(
    value: (/* targetKey */ String | SyntheticMouseEvent[HTMLElement], /* action */ add | remove) => Unit
  ): this.type = set("onEdit", js.Any.fromFunction2(value))
  @scala.inline
  def onNextClick(value: SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onNextClick", js.Any.fromFunction1(value))
  @scala.inline
  def onPrevClick(value: SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onPrevClick", js.Any.fromFunction1(value))
  @scala.inline
  def onTabClick(value: js.Function): this.type = set("onTabClick", value.asInstanceOf[js.Any])
  @scala.inline
  def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  @scala.inline
  def renderTabBar(value: (/* props */ TabsProps, /* DefaultTabBar */ ReactComponentClass[_]) => ReactElement): this.type = set("renderTabBar", js.Any.fromFunction2(value))
  @scala.inline
  def size(value: large | default | small): this.type = set("size", value.asInstanceOf[js.Any])
  @scala.inline
  def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  @scala.inline
  def tabBarExtraContentReactElement(value: ReactElement): this.type = set("tabBarExtraContent", value.asInstanceOf[js.Any])
  @scala.inline
  def tabBarExtraContent(value: TagMod[Any]): this.type = set("tabBarExtraContent", value.asInstanceOf[js.Any])
  @scala.inline
  def tabBarExtraContentNull: this.type = set("tabBarExtraContent", null)
  @scala.inline
  def tabBarGutter(value: Double): this.type = set("tabBarGutter", value.asInstanceOf[js.Any])
  @scala.inline
  def tabBarStyle(value: CSSProperties): this.type = set("tabBarStyle", value.asInstanceOf[js.Any])
  @scala.inline
  def tabPosition(value: TabsPosition): this.type = set("tabPosition", value.asInstanceOf[js.Any])
  @scala.inline
  def `type`(value: TabsType): this.type = set("type", value.asInstanceOf[js.Any])
}


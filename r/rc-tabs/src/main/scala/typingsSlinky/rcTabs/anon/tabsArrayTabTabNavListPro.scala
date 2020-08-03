package typingsSlinky.rcTabs.anon

import org.scalajs.dom.raw.Element
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.rcTabs.interfaceMod.AnimatedConfig
import typingsSlinky.rcTabs.interfaceMod.EditableConfig
import typingsSlinky.rcTabs.interfaceMod.OnTabScroll
import typingsSlinky.rcTabs.interfaceMod.RenderTabBar
import typingsSlinky.rcTabs.interfaceMod.Tab
import typingsSlinky.rcTabs.interfaceMod.TabPosition
import typingsSlinky.rcTabs.interfaceMod.TabsLocale
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  tabs :std.Array<rc-tabs.rc-tabs/es/interface.Tab>} & rc-tabs.rc-tabs/es/TabNavList.TabNavListProps */
@js.native
trait tabsArrayTabTabNavListPro extends js.Object {
  var activeKey: String = js.native
  var animated: js.UndefOr[AnimatedConfig] = js.native
  var children: js.UndefOr[js.Function1[/* node */ ReactElement, ReactElement]] = js.native
  var className: js.UndefOr[String] = js.native
  var editable: js.UndefOr[EditableConfig] = js.native
  var extra: js.UndefOr[ReactElement] = js.native
  var id: String = js.native
  var locale: js.UndefOr[TabsLocale] = js.native
  var mobile: Boolean = js.native
  var moreIcon: js.UndefOr[ReactElement] = js.native
  var moreTransitionName: js.UndefOr[String] = js.native
  var onTabScroll: js.UndefOr[OnTabScroll] = js.native
  var panes: ReactElement = js.native
  var renderTabBar: js.UndefOr[RenderTabBar] = js.native
  var rtl: Boolean = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var tabBarGutter: js.UndefOr[Double] = js.native
  var tabPosition: TabPosition = js.native
  var tabs: js.Array[Tab] = js.native
  def onTabClick(activeKey: Key, e: SyntheticKeyboardEvent[Element]): Unit = js.native
  def onTabClick(activeKey: Key, e: SyntheticMouseEvent[Element]): Unit = js.native
}


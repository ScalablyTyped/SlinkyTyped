package typingsSlinky.rcTabs

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.rcTabs.interfaceMod.AnimatedConfig
import typingsSlinky.rcTabs.interfaceMod.EditableConfig
import typingsSlinky.rcTabs.interfaceMod.OnTabScroll
import typingsSlinky.rcTabs.interfaceMod.RenderTabBar
import typingsSlinky.rcTabs.interfaceMod.TabBarExtraContent
import typingsSlinky.rcTabs.interfaceMod.TabPosition
import typingsSlinky.rcTabs.interfaceMod.TabsLocale
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.Key
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-tabs/es/TabNavList", JSImport.Namespace)
@js.native
object tabNavListMod extends js.Object {
  
  val default: ForwardRefExoticComponent[TabNavListProps with RefAttributes[HTMLDivElement]] = js.native
  
  @js.native
  trait TabNavListProps extends js.Object {
    
    var activeKey: String = js.native
    
    var animated: js.UndefOr[AnimatedConfig] = js.native
    
    var children: js.UndefOr[js.Function1[/* node */ ReactElement, ReactElement]] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var editable: js.UndefOr[EditableConfig] = js.native
    
    var extra: js.UndefOr[TabBarExtraContent] = js.native
    
    var id: String = js.native
    
    var locale: js.UndefOr[TabsLocale] = js.native
    
    var mobile: Boolean = js.native
    
    var moreIcon: js.UndefOr[ReactElement] = js.native
    
    var moreTransitionName: js.UndefOr[String] = js.native
    
    def onTabClick(activeKey: Key, e: SyntheticKeyboardEvent[Element]): Unit = js.native
    def onTabClick(activeKey: Key, e: SyntheticMouseEvent[Element]): Unit = js.native
    
    var onTabScroll: js.UndefOr[OnTabScroll] = js.native
    
    var panes: ReactElement = js.native
    
    var renderTabBar: js.UndefOr[RenderTabBar] = js.native
    
    var rtl: Boolean = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var tabBarGutter: js.UndefOr[Double] = js.native
    
    var tabPosition: TabPosition = js.native
  }
}

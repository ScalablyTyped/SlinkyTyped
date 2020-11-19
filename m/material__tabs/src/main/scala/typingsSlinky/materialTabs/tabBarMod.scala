package typingsSlinky.materialTabs

import org.scalajs.dom.raw.Element
import typingsSlinky.materialBase.componentMod.default
import typingsSlinky.materialTabs.tabBarAdapterMod.MDCTabBarAdapter
import typingsSlinky.materialTabs.tabMod.MDCTab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/tabs/tab-bar", JSImport.Namespace)
@js.native
object tabBarMod extends js.Object {
  
  @js.native
  class MDCTabBar () extends default[MDCTabBarAdapter] {
    
    var activeTab: MDCTab = js.native
    
    var activeTabIndex: Double = js.native
    
    def initialize(): Unit = js.native
    def initialize(tabFactory: js.Function1[/* el */ Element, MDCTab]): Unit = js.native
    
    def layout(): Unit = js.native
    
    val tabs: js.Array[MDCTab] = js.native
  }
  /* static members */
  @js.native
  object MDCTabBar extends js.Object {
    
    def attachTo(root: Element): MDCTabBar = js.native
  }
  
  @js.native
  class MDCTabBarFoundation ()
    extends typingsSlinky.materialTabs.tabBarFoundationMod.default
  /* static members */
  @js.native
  object MDCTabBarFoundation extends js.Object {
    
    val cssClasses: typingsSlinky.materialTabs.tabBarConstantsMod.cssClasses = js.native
    
    val defaultAdapter: MDCTabBarAdapter = js.native
    
    val strings: typingsSlinky.materialTabs.tabBarConstantsMod.strings = js.native
  }
}

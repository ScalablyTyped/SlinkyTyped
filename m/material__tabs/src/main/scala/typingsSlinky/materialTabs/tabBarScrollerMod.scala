package typingsSlinky.materialTabs

import org.scalajs.dom.raw.Element
import typingsSlinky.materialBase.componentMod.default
import typingsSlinky.materialTabs.adapterMod.MDCTabBarScrollerAdapter
import typingsSlinky.materialTabs.tabBarMod.MDCTabBar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/tabs/tab-bar-scroller", JSImport.Namespace)
@js.native
object tabBarScrollerMod extends js.Object {
  
  @js.native
  class MDCTabBarScroller () extends default[MDCTabBarScrollerAdapter] {
    
    def initialize(): Unit = js.native
    def initialize(tabBarFactory: js.Function1[/* root */ Element, MDCTabBar]): Unit = js.native
    
    def layout(): Unit = js.native
    
    val tabBar: MDCTabBar = js.native
  }
  /* static members */
  @js.native
  object MDCTabBarScroller extends js.Object {
    
    def attachTo(root: Element): MDCTabBarScroller = js.native
  }
  
  @js.native
  class MDCTabBarScrollerFoundation ()
    extends typingsSlinky.materialTabs.foundationMod.default
  /* static members */
  @js.native
  object MDCTabBarScrollerFoundation extends js.Object {
    
    val cssClasses: typingsSlinky.materialTabs.constantsMod.cssClasses = js.native
    
    val defaultAdapter: MDCTabBarScrollerAdapter = js.native
    
    val strings: typingsSlinky.materialTabs.constantsMod.strings = js.native
  }
}

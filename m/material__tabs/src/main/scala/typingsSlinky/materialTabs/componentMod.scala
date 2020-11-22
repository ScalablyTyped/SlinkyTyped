package typingsSlinky.materialTabs

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.materialBase.componentMod.MDCComponent
import typingsSlinky.materialTabs.foundationMod.MDCTabBarScrollerFoundation
import typingsSlinky.materialTabs.tabBarComponentMod.MDCTabBar
import typingsSlinky.materialTabs.tabBarComponentMod.MDCTabBarFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/tabs/tab-bar-scroller/component", JSImport.Namespace)
@js.native
object componentMod extends js.Object {
  
  @js.native
  class MDCTabBarScroller () extends MDCComponent[MDCTabBarScrollerFoundation] {
    
    def initialize(): Unit = js.native
    def initialize(tabBarFactory: MDCTabBarFactory): Unit = js.native
    
    def layout(): Unit = js.native
    
    var root_ : HTMLElement = js.native
    
    val tabBar: MDCTabBar = js.native
  }
  /* static members */
  @js.native
  object MDCTabBarScroller extends js.Object {
    
    def attachTo(root: Element): MDCTabBarScroller = js.native
  }
}

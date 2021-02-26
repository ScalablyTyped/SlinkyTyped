package typingsSlinky.materialTabs

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.materialBase.componentMod.MDCComponent
import typingsSlinky.materialTabs.foundationMod.MDCTabBarScrollerFoundation
import typingsSlinky.materialTabs.tabBarComponentMod.MDCTabBar
import typingsSlinky.materialTabs.tabBarComponentMod.MDCTabBarFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("@material/tabs/tab-bar-scroller/component", "MDCTabBarScroller")
  @js.native
  class MDCTabBarScroller protected () extends MDCComponent[MDCTabBarScrollerFoundation] {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(root: Element, foundation: MDCTabBarScrollerFoundation, args: js.Any*) = this()
    
    def initialize(): Unit = js.native
    def initialize(tabBarFactory: MDCTabBarFactory): Unit = js.native
    
    def layout(): Unit = js.native
    
    var root_ : HTMLElement = js.native
    
    val tabBar: MDCTabBar = js.native
  }
  /* static members */
  object MDCTabBarScroller {
    
    @JSImport("@material/tabs/tab-bar-scroller/component", "MDCTabBarScroller.attachTo")
    @js.native
    def attachTo(root: Element): MDCTabBarScroller = js.native
  }
}

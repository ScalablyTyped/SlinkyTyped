package typingsSlinky.materialTabs

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.materialBase.componentMod.MDCComponent
import typingsSlinky.materialTabs.tabBarFoundationMod.MDCTabBarFoundation
import typingsSlinky.materialTabs.tabComponentMod.MDCTab
import typingsSlinky.materialTabs.tabComponentMod.MDCTabFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabBarComponentMod {
  
  @JSImport("@material/tabs/tab-bar/component", "MDCTabBar")
  @js.native
  class MDCTabBar protected () extends MDCComponent[MDCTabBarFoundation] {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(root: Element, foundation: MDCTabBarFoundation, args: js.Any*) = this()
    
    var activeTab: MDCTab = js.native
    
    var activeTabIndex: Double = js.native
    
    def initialize(): Unit = js.native
    def initialize(tabFactory: MDCTabFactory): Unit = js.native
    
    def layout(): Unit = js.native
    
    var root_ : HTMLElement = js.native
    
    val tabs: js.Array[MDCTab] = js.native
  }
  /* static members */
  object MDCTabBar {
    
    @JSImport("@material/tabs/tab-bar/component", "MDCTabBar.attachTo")
    @js.native
    def attachTo(root: Element): MDCTabBar = js.native
  }
  
  type MDCTabBarFactory = js.Function2[/* el */ Element, /* foundation */ js.UndefOr[MDCTabBarFoundation], MDCTabBar]
}

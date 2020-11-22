package typingsSlinky.materialTabs

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.materialBase.componentMod.MDCComponent
import typingsSlinky.materialTabs.tabBarFoundationMod.MDCTabBarFoundation
import typingsSlinky.materialTabs.tabComponentMod.MDCTab
import typingsSlinky.materialTabs.tabComponentMod.MDCTabFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/tabs/tab-bar/component", JSImport.Namespace)
@js.native
object tabBarComponentMod extends js.Object {
  
  @js.native
  class MDCTabBar () extends MDCComponent[MDCTabBarFoundation] {
    
    var activeTab: MDCTab = js.native
    
    var activeTabIndex: Double = js.native
    
    def initialize(): Unit = js.native
    def initialize(tabFactory: MDCTabFactory): Unit = js.native
    
    def layout(): Unit = js.native
    
    var root_ : HTMLElement = js.native
    
    val tabs: js.Array[MDCTab] = js.native
  }
  /* static members */
  @js.native
  object MDCTabBar extends js.Object {
    
    def attachTo(root: Element): MDCTabBar = js.native
  }
  
  type MDCTabBarFactory = js.Function2[/* el */ Element, /* foundation */ js.UndefOr[MDCTabBarFoundation], MDCTabBar]
}

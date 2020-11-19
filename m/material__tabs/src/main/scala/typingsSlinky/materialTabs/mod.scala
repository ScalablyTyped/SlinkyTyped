package typingsSlinky.materialTabs

import org.scalajs.dom.raw.Element
import typingsSlinky.materialTabs.adapterMod.MDCTabBarScrollerAdapter
import typingsSlinky.materialTabs.tabAdapterMod.MDCTabAdapter
import typingsSlinky.materialTabs.tabBarAdapterMod.MDCTabBarAdapter
import typingsSlinky.materialTabs.tabBarFoundationMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/tabs", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class MDCTab ()
    extends typingsSlinky.materialTabs.tabMod.MDCTab
  /* static members */
  @js.native
  object MDCTab extends js.Object {
    
    def attachTo(root: Element): typingsSlinky.materialTabs.tabMod.MDCTab = js.native
  }
  
  @js.native
  class MDCTabBar ()
    extends typingsSlinky.materialTabs.tabBarMod.MDCTabBar
  /* static members */
  @js.native
  object MDCTabBar extends js.Object {
    
    def attachTo(root: Element): typingsSlinky.materialTabs.tabBarMod.MDCTabBar = js.native
  }
  
  @js.native
  class MDCTabBarFoundation () extends default
  /* static members */
  @js.native
  object MDCTabBarFoundation extends js.Object {
    
    val cssClasses: typingsSlinky.materialTabs.tabBarConstantsMod.cssClasses = js.native
    
    val defaultAdapter: MDCTabBarAdapter = js.native
    
    val strings: typingsSlinky.materialTabs.tabBarConstantsMod.strings = js.native
  }
  
  @js.native
  class MDCTabBarScroller ()
    extends typingsSlinky.materialTabs.tabBarScrollerMod.MDCTabBarScroller
  /* static members */
  @js.native
  object MDCTabBarScroller extends js.Object {
    
    def attachTo(root: Element): typingsSlinky.materialTabs.tabBarScrollerMod.MDCTabBarScroller = js.native
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
  
  @js.native
  class MDCTabFoundation ()
    extends typingsSlinky.materialTabs.tabFoundationMod.default
  /* static members */
  @js.native
  object MDCTabFoundation extends js.Object {
    
    val cssClasses: typingsSlinky.materialTabs.tabConstantsMod.cssClasses = js.native
    
    val defaultAdapter: MDCTabAdapter = js.native
    
    val strings: typingsSlinky.materialTabs.tabConstantsMod.strings = js.native
  }
}

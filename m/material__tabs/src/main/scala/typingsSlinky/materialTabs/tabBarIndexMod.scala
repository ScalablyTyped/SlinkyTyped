package typingsSlinky.materialTabs

import org.scalajs.dom.raw.Element
import typingsSlinky.materialTabs.anon.CHANGEEVENT
import typingsSlinky.materialTabs.anon.PartialMDCTabBarAdapter
import typingsSlinky.materialTabs.anon.UPGRADED
import typingsSlinky.materialTabs.tabBarAdapterMod.MDCTabBarAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/tabs/tab-bar/index", JSImport.Namespace)
@js.native
object tabBarIndexMod extends js.Object {
  
  @js.native
  class MDCTabBar ()
    extends typingsSlinky.materialTabs.tabBarComponentMod.MDCTabBar
  /* static members */
  @js.native
  object MDCTabBar extends js.Object {
    
    def attachTo(root: Element): typingsSlinky.materialTabs.tabBarComponentMod.MDCTabBar = js.native
  }
  
  @js.native
  class MDCTabBarFoundation ()
    extends typingsSlinky.materialTabs.tabBarFoundationMod.MDCTabBarFoundation {
    def this(adapter: PartialMDCTabBarAdapter) = this()
  }
  /* static members */
  @js.native
  object MDCTabBarFoundation extends js.Object {
    
    val cssClasses: UPGRADED = js.native
    
    val defaultAdapter: MDCTabBarAdapter = js.native
    
    val strings: CHANGEEVENT = js.native
  }
  
  @js.native
  object tabBarCssClasses extends js.Object {
    
    var UPGRADED: String = js.native
  }
  
  @js.native
  object tabBarStrings extends js.Object {
    
    var CHANGE_EVENT: String = js.native
    
    var INDICATOR_SELECTOR: String = js.native
    
    var TAB_SELECTOR: String = js.native
  }
}

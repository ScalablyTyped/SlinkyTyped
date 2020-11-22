package typingsSlinky.materialTabs

import org.scalajs.dom.raw.Element
import typingsSlinky.materialTabs.adapterMod.MDCTabBarScrollerAdapter
import typingsSlinky.materialTabs.anon.FRAMESELECTOR
import typingsSlinky.materialTabs.anon.INDICATORBACK
import typingsSlinky.materialTabs.anon.PartialMDCTabBarScrollerA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/tabs/tab-bar-scroller/index", JSImport.Namespace)
@js.native
object indexMod extends js.Object {
  
  @js.native
  class MDCTabBarScroller ()
    extends typingsSlinky.materialTabs.componentMod.MDCTabBarScroller
  /* static members */
  @js.native
  object MDCTabBarScroller extends js.Object {
    
    def attachTo(root: Element): typingsSlinky.materialTabs.componentMod.MDCTabBarScroller = js.native
  }
  
  @js.native
  class MDCTabBarScrollerFoundation ()
    extends typingsSlinky.materialTabs.foundationMod.MDCTabBarScrollerFoundation {
    def this(adapter: PartialMDCTabBarScrollerA) = this()
  }
  /* static members */
  @js.native
  object MDCTabBarScrollerFoundation extends js.Object {
    
    val cssClasses: INDICATORBACK = js.native
    
    val defaultAdapter: MDCTabBarScrollerAdapter = js.native
    
    val strings: FRAMESELECTOR = js.native
  }
  
  @js.native
  object tabBarScrollerCssClasses extends js.Object {
    
    var INDICATOR_BACK: String = js.native
    
    var INDICATOR_ENABLED: String = js.native
    
    var INDICATOR_FORWARD: String = js.native
    
    var TAB: String = js.native
  }
  
  @js.native
  object tabBarScrollerStrings extends js.Object {
    
    var FRAME_SELECTOR: String = js.native
    
    var INDICATOR_BACK_SELECTOR: String = js.native
    
    var INDICATOR_FORWARD_SELECTOR: String = js.native
    
    var TABS_SELECTOR: String = js.native
    
    var TAB_SELECTOR: String = js.native
  }
}

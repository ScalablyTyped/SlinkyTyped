package typingsSlinky.materialTabs

import org.scalajs.dom.raw.Element
import typingsSlinky.materialTabs.adapterMod.MDCTabBarScrollerAdapter
import typingsSlinky.materialTabs.anon.FRAMESELECTOR
import typingsSlinky.materialTabs.anon.INDICATORBACK
import typingsSlinky.materialTabs.anon.PartialMDCTabBarScrollerA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexMod {
  
  @JSImport("@material/tabs/tab-bar-scroller/index", "MDCTabBarScroller")
  @js.native
  class MDCTabBarScroller protected ()
    extends typingsSlinky.materialTabs.componentMod.MDCTabBarScroller {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(
      root: Element,
      foundation: typingsSlinky.materialTabs.foundationMod.MDCTabBarScrollerFoundation,
      args: js.Any*
    ) = this()
  }
  /* static members */
  object MDCTabBarScroller {
    
    @JSImport("@material/tabs/tab-bar-scroller/index", "MDCTabBarScroller.attachTo")
    @js.native
    def attachTo(root: Element): typingsSlinky.materialTabs.componentMod.MDCTabBarScroller = js.native
  }
  
  @JSImport("@material/tabs/tab-bar-scroller/index", "MDCTabBarScrollerFoundation")
  @js.native
  class MDCTabBarScrollerFoundation ()
    extends typingsSlinky.materialTabs.foundationMod.MDCTabBarScrollerFoundation {
    def this(adapter: PartialMDCTabBarScrollerA) = this()
  }
  /* static members */
  object MDCTabBarScrollerFoundation {
    
    @JSImport("@material/tabs/tab-bar-scroller/index", "MDCTabBarScrollerFoundation.cssClasses")
    @js.native
    val cssClasses: INDICATORBACK = js.native
    
    @JSImport("@material/tabs/tab-bar-scroller/index", "MDCTabBarScrollerFoundation.defaultAdapter")
    @js.native
    val defaultAdapter: MDCTabBarScrollerAdapter = js.native
    
    @JSImport("@material/tabs/tab-bar-scroller/index", "MDCTabBarScrollerFoundation.strings")
    @js.native
    val strings: FRAMESELECTOR = js.native
  }
  
  object tabBarScrollerCssClasses {
    
    @JSImport("@material/tabs/tab-bar-scroller/index", "tabBarScrollerCssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/tabs/tab-bar-scroller/index", "tabBarScrollerCssClasses.INDICATOR_BACK")
    @js.native
    def INDICATOR_BACK: String = js.native
    @scala.inline
    def INDICATOR_BACK_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INDICATOR_BACK")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tabs/tab-bar-scroller/index", "tabBarScrollerCssClasses.INDICATOR_ENABLED")
    @js.native
    def INDICATOR_ENABLED: String = js.native
    @scala.inline
    def INDICATOR_ENABLED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INDICATOR_ENABLED")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tabs/tab-bar-scroller/index", "tabBarScrollerCssClasses.INDICATOR_FORWARD")
    @js.native
    def INDICATOR_FORWARD: String = js.native
    @scala.inline
    def INDICATOR_FORWARD_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INDICATOR_FORWARD")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tabs/tab-bar-scroller/index", "tabBarScrollerCssClasses.TAB")
    @js.native
    def TAB: String = js.native
    @scala.inline
    def TAB_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAB")(x.asInstanceOf[js.Any])
  }
  
  object tabBarScrollerStrings {
    
    @JSImport("@material/tabs/tab-bar-scroller/index", "tabBarScrollerStrings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/tabs/tab-bar-scroller/index", "tabBarScrollerStrings.FRAME_SELECTOR")
    @js.native
    def FRAME_SELECTOR: String = js.native
    @scala.inline
    def FRAME_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FRAME_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tabs/tab-bar-scroller/index", "tabBarScrollerStrings.INDICATOR_BACK_SELECTOR")
    @js.native
    def INDICATOR_BACK_SELECTOR: String = js.native
    @scala.inline
    def INDICATOR_BACK_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INDICATOR_BACK_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tabs/tab-bar-scroller/index", "tabBarScrollerStrings.INDICATOR_FORWARD_SELECTOR")
    @js.native
    def INDICATOR_FORWARD_SELECTOR: String = js.native
    @scala.inline
    def INDICATOR_FORWARD_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INDICATOR_FORWARD_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tabs/tab-bar-scroller/index", "tabBarScrollerStrings.TABS_SELECTOR")
    @js.native
    def TABS_SELECTOR: String = js.native
    @scala.inline
    def TABS_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TABS_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tabs/tab-bar-scroller/index", "tabBarScrollerStrings.TAB_SELECTOR")
    @js.native
    def TAB_SELECTOR: String = js.native
    @scala.inline
    def TAB_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAB_SELECTOR")(x.asInstanceOf[js.Any])
  }
}

package typingsSlinky.materialTabs

import org.scalajs.dom.raw.Element
import typingsSlinky.materialTabs.adapterMod.MDCTabBarScrollerAdapter
import typingsSlinky.materialTabs.anon.ACTIVE
import typingsSlinky.materialTabs.anon.CHANGEEVENT
import typingsSlinky.materialTabs.anon.FRAMESELECTOR
import typingsSlinky.materialTabs.anon.INDICATORBACK
import typingsSlinky.materialTabs.anon.PartialMDCTabAdapter
import typingsSlinky.materialTabs.anon.PartialMDCTabBarAdapter
import typingsSlinky.materialTabs.anon.PartialMDCTabBarScrollerA
import typingsSlinky.materialTabs.anon.SELECTEDEVENT
import typingsSlinky.materialTabs.anon.UPGRADED
import typingsSlinky.materialTabs.tabAdapterMod.MDCTabAdapter
import typingsSlinky.materialTabs.tabBarAdapterMod.MDCTabBarAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@material/tabs", "MDCTab")
  @js.native
  class MDCTab protected ()
    extends typingsSlinky.materialTabs.tabIndexMod.MDCTab {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(
      root: Element,
      foundation: typingsSlinky.materialTabs.tabFoundationMod.MDCTabFoundation,
      args: js.Any*
    ) = this()
  }
  /* static members */
  object MDCTab {
    
    @JSImport("@material/tabs", "MDCTab.attachTo")
    @js.native
    def attachTo(root: Element): typingsSlinky.materialTabs.tabComponentMod.MDCTab = js.native
  }
  
  @JSImport("@material/tabs", "MDCTabBar")
  @js.native
  class MDCTabBar protected ()
    extends typingsSlinky.materialTabs.tabBarIndexMod.MDCTabBar {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(
      root: Element,
      foundation: typingsSlinky.materialTabs.tabBarFoundationMod.MDCTabBarFoundation,
      args: js.Any*
    ) = this()
  }
  /* static members */
  object MDCTabBar {
    
    @JSImport("@material/tabs", "MDCTabBar.attachTo")
    @js.native
    def attachTo(root: Element): typingsSlinky.materialTabs.tabBarComponentMod.MDCTabBar = js.native
  }
  
  @JSImport("@material/tabs", "MDCTabBarFoundation")
  @js.native
  class MDCTabBarFoundation ()
    extends typingsSlinky.materialTabs.tabBarIndexMod.MDCTabBarFoundation {
    def this(adapter: PartialMDCTabBarAdapter) = this()
  }
  /* static members */
  object MDCTabBarFoundation {
    
    @JSImport("@material/tabs", "MDCTabBarFoundation.cssClasses")
    @js.native
    val cssClasses: UPGRADED = js.native
    
    @JSImport("@material/tabs", "MDCTabBarFoundation.defaultAdapter")
    @js.native
    val defaultAdapter: MDCTabBarAdapter = js.native
    
    @JSImport("@material/tabs", "MDCTabBarFoundation.strings")
    @js.native
    val strings: CHANGEEVENT = js.native
  }
  
  @JSImport("@material/tabs", "MDCTabBarScroller")
  @js.native
  class MDCTabBarScroller protected ()
    extends typingsSlinky.materialTabs.indexMod.MDCTabBarScroller {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(
      root: Element,
      foundation: typingsSlinky.materialTabs.foundationMod.MDCTabBarScrollerFoundation,
      args: js.Any*
    ) = this()
  }
  /* static members */
  object MDCTabBarScroller {
    
    @JSImport("@material/tabs", "MDCTabBarScroller.attachTo")
    @js.native
    def attachTo(root: Element): typingsSlinky.materialTabs.componentMod.MDCTabBarScroller = js.native
  }
  
  @JSImport("@material/tabs", "MDCTabBarScrollerFoundation")
  @js.native
  class MDCTabBarScrollerFoundation ()
    extends typingsSlinky.materialTabs.indexMod.MDCTabBarScrollerFoundation {
    def this(adapter: PartialMDCTabBarScrollerA) = this()
  }
  /* static members */
  object MDCTabBarScrollerFoundation {
    
    @JSImport("@material/tabs", "MDCTabBarScrollerFoundation.cssClasses")
    @js.native
    val cssClasses: INDICATORBACK = js.native
    
    @JSImport("@material/tabs", "MDCTabBarScrollerFoundation.defaultAdapter")
    @js.native
    val defaultAdapter: MDCTabBarScrollerAdapter = js.native
    
    @JSImport("@material/tabs", "MDCTabBarScrollerFoundation.strings")
    @js.native
    val strings: FRAMESELECTOR = js.native
  }
  
  @JSImport("@material/tabs", "MDCTabFoundation")
  @js.native
  class MDCTabFoundation ()
    extends typingsSlinky.materialTabs.tabIndexMod.MDCTabFoundation {
    def this(adapter: PartialMDCTabAdapter) = this()
  }
  /* static members */
  object MDCTabFoundation {
    
    @JSImport("@material/tabs", "MDCTabFoundation.cssClasses")
    @js.native
    val cssClasses: ACTIVE = js.native
    
    @JSImport("@material/tabs", "MDCTabFoundation.defaultAdapter")
    @js.native
    val defaultAdapter: MDCTabAdapter = js.native
    
    @JSImport("@material/tabs", "MDCTabFoundation.strings")
    @js.native
    val strings: SELECTEDEVENT = js.native
  }
  
  object tabBarCssClasses {
    
    @JSImport("@material/tabs", "tabBarCssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/tabs", "tabBarCssClasses.UPGRADED")
    @js.native
    def UPGRADED: String = js.native
    @scala.inline
    def UPGRADED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UPGRADED")(x.asInstanceOf[js.Any])
  }
  
  object tabBarScrollerCssClasses {
    
    @JSImport("@material/tabs", "tabBarScrollerCssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/tabs", "tabBarScrollerCssClasses.INDICATOR_BACK")
    @js.native
    def INDICATOR_BACK: String = js.native
    @scala.inline
    def INDICATOR_BACK_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INDICATOR_BACK")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tabs", "tabBarScrollerCssClasses.INDICATOR_ENABLED")
    @js.native
    def INDICATOR_ENABLED: String = js.native
    @scala.inline
    def INDICATOR_ENABLED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INDICATOR_ENABLED")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tabs", "tabBarScrollerCssClasses.INDICATOR_FORWARD")
    @js.native
    def INDICATOR_FORWARD: String = js.native
    @scala.inline
    def INDICATOR_FORWARD_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INDICATOR_FORWARD")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tabs", "tabBarScrollerCssClasses.TAB")
    @js.native
    def TAB: String = js.native
    @scala.inline
    def TAB_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAB")(x.asInstanceOf[js.Any])
  }
  
  object tabBarScrollerStrings {
    
    @JSImport("@material/tabs", "tabBarScrollerStrings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/tabs", "tabBarScrollerStrings.FRAME_SELECTOR")
    @js.native
    def FRAME_SELECTOR: String = js.native
    @scala.inline
    def FRAME_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FRAME_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tabs", "tabBarScrollerStrings.INDICATOR_BACK_SELECTOR")
    @js.native
    def INDICATOR_BACK_SELECTOR: String = js.native
    @scala.inline
    def INDICATOR_BACK_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INDICATOR_BACK_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tabs", "tabBarScrollerStrings.INDICATOR_FORWARD_SELECTOR")
    @js.native
    def INDICATOR_FORWARD_SELECTOR: String = js.native
    @scala.inline
    def INDICATOR_FORWARD_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INDICATOR_FORWARD_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tabs", "tabBarScrollerStrings.TABS_SELECTOR")
    @js.native
    def TABS_SELECTOR: String = js.native
    @scala.inline
    def TABS_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TABS_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tabs", "tabBarScrollerStrings.TAB_SELECTOR")
    @js.native
    def TAB_SELECTOR: String = js.native
    @scala.inline
    def TAB_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAB_SELECTOR")(x.asInstanceOf[js.Any])
  }
  
  object tabBarStrings {
    
    @JSImport("@material/tabs", "tabBarStrings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/tabs", "tabBarStrings.CHANGE_EVENT")
    @js.native
    def CHANGE_EVENT: String = js.native
    @scala.inline
    def CHANGE_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHANGE_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tabs", "tabBarStrings.INDICATOR_SELECTOR")
    @js.native
    def INDICATOR_SELECTOR: String = js.native
    @scala.inline
    def INDICATOR_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INDICATOR_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tabs", "tabBarStrings.TAB_SELECTOR")
    @js.native
    def TAB_SELECTOR: String = js.native
    @scala.inline
    def TAB_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAB_SELECTOR")(x.asInstanceOf[js.Any])
  }
  
  object tabCssClasses {
    
    @JSImport("@material/tabs", "tabCssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/tabs", "tabCssClasses.ACTIVE")
    @js.native
    def ACTIVE: String = js.native
    @scala.inline
    def ACTIVE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ACTIVE")(x.asInstanceOf[js.Any])
  }
  
  object tabStrings {
    
    @JSImport("@material/tabs", "tabStrings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/tabs", "tabStrings.SELECTED_EVENT")
    @js.native
    def SELECTED_EVENT: String = js.native
    @scala.inline
    def SELECTED_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SELECTED_EVENT")(x.asInstanceOf[js.Any])
  }
}

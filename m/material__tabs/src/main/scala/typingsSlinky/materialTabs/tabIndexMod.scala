package typingsSlinky.materialTabs

import org.scalajs.dom.raw.Element
import typingsSlinky.materialTabs.anon.ACTIVE
import typingsSlinky.materialTabs.anon.PartialMDCTabAdapter
import typingsSlinky.materialTabs.anon.SELECTEDEVENT
import typingsSlinky.materialTabs.tabAdapterMod.MDCTabAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabIndexMod {
  
  @JSImport("@material/tabs/tab/index", "MDCTab")
  @js.native
  class MDCTab protected ()
    extends typingsSlinky.materialTabs.tabComponentMod.MDCTab {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(
      root: Element,
      foundation: typingsSlinky.materialTabs.tabFoundationMod.MDCTabFoundation,
      args: js.Any*
    ) = this()
  }
  /* static members */
  object MDCTab {
    
    @JSImport("@material/tabs/tab/index", "MDCTab.attachTo")
    @js.native
    def attachTo(root: Element): typingsSlinky.materialTabs.tabComponentMod.MDCTab = js.native
  }
  
  @JSImport("@material/tabs/tab/index", "MDCTabFoundation")
  @js.native
  class MDCTabFoundation ()
    extends typingsSlinky.materialTabs.tabFoundationMod.MDCTabFoundation {
    def this(adapter: PartialMDCTabAdapter) = this()
  }
  /* static members */
  object MDCTabFoundation {
    
    @JSImport("@material/tabs/tab/index", "MDCTabFoundation.cssClasses")
    @js.native
    val cssClasses: ACTIVE = js.native
    
    @JSImport("@material/tabs/tab/index", "MDCTabFoundation.defaultAdapter")
    @js.native
    val defaultAdapter: MDCTabAdapter = js.native
    
    @JSImport("@material/tabs/tab/index", "MDCTabFoundation.strings")
    @js.native
    val strings: SELECTEDEVENT = js.native
  }
  
  object tabCssClasses {
    
    @JSImport("@material/tabs/tab/index", "tabCssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/tabs/tab/index", "tabCssClasses.ACTIVE")
    @js.native
    def ACTIVE: String = js.native
    @scala.inline
    def ACTIVE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ACTIVE")(x.asInstanceOf[js.Any])
  }
  
  object tabStrings {
    
    @JSImport("@material/tabs/tab/index", "tabStrings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/tabs/tab/index", "tabStrings.SELECTED_EVENT")
    @js.native
    def SELECTED_EVENT: String = js.native
    @scala.inline
    def SELECTED_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SELECTED_EVENT")(x.asInstanceOf[js.Any])
  }
}

package typingsSlinky.materialTabBar

import org.scalajs.dom.raw.KeyboardEvent
import typingsSlinky.materialBase.foundationMod.MDCFoundation
import typingsSlinky.materialTab.typesMod.MDCTabInteractionEvent
import typingsSlinky.materialTabBar.adapterMod.MDCTabBarAdapter
import typingsSlinky.materialTabBar.anon.PartialMDCTabBarAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foundationMod {
  
  @JSImport("@material/tab-bar/foundation", JSImport.Default)
  @js.native
  class default () extends MDCTabBarFoundation {
    def this(adapter: PartialMDCTabBarAdapter) = this()
  }
  
  @JSImport("@material/tab-bar/foundation", "MDCTabBarFoundation")
  @js.native
  class MDCTabBarFoundation () extends MDCFoundation[MDCTabBarAdapter] {
    def this(adapter: PartialMDCTabBarAdapter) = this()
    
    def activateTab(index: Double): Unit = js.native
    
    def handleKeyDown(evt: KeyboardEvent): Unit = js.native
    
    /**
      * Handles the MDCTab:interacted event
      */
    def handleTabInteraction(evt: MDCTabInteractionEvent): Unit = js.native
    
    /**
      * Scrolls the tab at the given index into view
      * @param index The tab index to make visible
      */
    def scrollIntoView(index: Double): Unit = js.native
    
    /**
      * Switches between automatic and manual activation modes.
      * See https://www.w3.org/TR/wai-aria-practices/#tabpanel for examples.
      */
    def setUseAutomaticActivation(useAutomaticActivation: Boolean): Unit = js.native
  }
}

package typingsSlinky.materialTabBar

import org.scalajs.dom.raw.KeyboardEvent
import typingsSlinky.materialBase.foundationMod.MDCFoundation
import typingsSlinky.materialTab.typesMod.MDCTabInteractionEvent
import typingsSlinky.materialTabBar.adapterMod.MDCTabBarAdapter
import typingsSlinky.materialTabBar.anon.ARROWLEFTKEY
import typingsSlinky.materialTabBar.anon.ARROWLEFTKEYCODE
import typingsSlinky.materialTabBar.anon.PartialMDCTabBarAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/tab-bar/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  
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
  /* static members */
  @js.native
  object MDCTabBarFoundation extends js.Object {
    
    def defaultAdapter: MDCTabBarAdapter = js.native
    
    def numbers: ARROWLEFTKEYCODE = js.native
    
    def strings: ARROWLEFTKEY = js.native
  }
  
  @js.native
  class default () extends MDCTabBarFoundation {
    def this(adapter: PartialMDCTabBarAdapter) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    def defaultAdapter: MDCTabBarAdapter = js.native
    
    def numbers: ARROWLEFTKEYCODE = js.native
    
    def strings: ARROWLEFTKEY = js.native
  }
}

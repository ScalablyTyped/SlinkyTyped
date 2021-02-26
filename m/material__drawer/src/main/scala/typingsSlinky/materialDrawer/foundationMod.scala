package typingsSlinky.materialDrawer

import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.TransitionEvent
import typingsSlinky.materialBase.foundationMod.MDCFoundation
import typingsSlinky.materialDrawer.adapterMod.MDCDrawerAdapter
import typingsSlinky.materialDrawer.anon.PartialMDCDrawerAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foundationMod {
  
  @JSImport("@material/drawer/dismissible/foundation", JSImport.Default)
  @js.native
  class default () extends MDCDismissibleDrawerFoundation {
    def this(adapter: PartialMDCDrawerAdapter) = this()
  }
  
  @JSImport("@material/drawer/dismissible/foundation", "MDCDismissibleDrawerFoundation")
  @js.native
  class MDCDismissibleDrawerFoundation () extends MDCFoundation[MDCDrawerAdapter] {
    def this(adapter: PartialMDCDrawerAdapter) = this()
    
    /**
      * Closes the drawer from the open state.
      */
    def close(): Unit = js.native
    
    /**
      * Extension point for when drawer finishes close animation.
      */
    /* protected */ def closed_(): Unit = js.native
    
    /**
      * Keydown handler to close drawer when key is escape.
      */
    def handleKeydown(evt: KeyboardEvent): Unit = js.native
    
    /**
      * Handles the `transitionend` event when the drawer finishes opening/closing.
      */
    def handleTransitionEnd(evt: TransitionEvent): Unit = js.native
    
    /**
      * Returns true if the drawer is animating closed.
      * @return true if drawer is animating closed.
      */
    def isClosing(): Boolean = js.native
    
    /**
      * Returns true if the drawer is in the open position.
      * @return true if drawer is in open state.
      */
    def isOpen(): Boolean = js.native
    
    /**
      * Returns true if the drawer is animating open.
      * @return true if drawer is animating open.
      */
    def isOpening(): Boolean = js.native
    
    /**
      * Opens the drawer from the closed state.
      */
    def open(): Unit = js.native
    
    /**
      * Extension point for when drawer finishes open animation.
      */
    /* protected */ def opened_(): Unit = js.native
  }
}

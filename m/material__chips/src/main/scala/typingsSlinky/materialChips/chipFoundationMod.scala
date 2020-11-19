package typingsSlinky.materialChips

import org.scalajs.dom.raw.ClientRect
import org.scalajs.dom.raw.FocusEvent
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.TransitionEvent
import typingsSlinky.materialBase.foundationMod.MDCFoundation
import typingsSlinky.materialChips.anon.ADDEDANNOUNCEMENTATTRIBUTE
import typingsSlinky.materialChips.anon.CHECKMARK
import typingsSlinky.materialChips.anon.PartialMDCChipAdapter
import typingsSlinky.materialChips.chipAdapterMod.MDCChipAdapter
import typingsSlinky.materialChips.trailingactionTypesMod.MDCChipTrailingActionNavigationEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/chips/chip/foundation", JSImport.Namespace)
@js.native
object chipFoundationMod extends js.Object {
  
  @js.native
  class MDCChipFoundation () extends MDCFoundation[MDCChipAdapter] {
    def this(adapter: PartialMDCChipAdapter) = this()
    
    /**
      * Begins the exit animation which leads to removal of the chip.
      */
    def beginExit(): Unit = js.native
    
    /**
      * Called by the chip set to focus the primary action.
      *
      */
    def focusPrimaryAction(): Unit = js.native
    
    /**
      * Called by the chip set to focus the trailing action (if present), otherwise
      * gives focus to the trailing action.
      */
    def focusTrailingAction(): Unit = js.native
    
    def getDimensions(): ClientRect = js.native
    
    def getShouldRemoveOnTrailingIconClick(): Boolean = js.native
    
    def handleClick(): Unit = js.native
    
    def handleDoubleClick(): Unit = js.native
    
    def handleFocusIn(evt: FocusEvent): Unit = js.native
    
    def handleFocusOut(evt: FocusEvent): Unit = js.native
    
    /**
      * Handles a keydown event from the root element.
      */
    def handleKeydown(evt: KeyboardEvent): Unit = js.native
    
    /**
      * Handles an interaction event on the trailing icon element. This is used to
      * prevent the ripple from activating on interaction with the trailing icon.
      */
    def handleTrailingActionInteraction(): Unit = js.native
    
    def handleTrailingActionNavigation(evt: MDCChipTrailingActionNavigationEvent): Unit = js.native
    
    /**
      * Handles a transition end event on the root element.
      */
    def handleTransitionEnd(evt: TransitionEvent): Unit = js.native
    
    def isEditable(): Boolean = js.native
    
    def isEditing(): Boolean = js.native
    
    def isSelected(): Boolean = js.native
    
    /**
      * Called by the chip set to remove focus from the chip actions.
      */
    def removeFocus(): Unit = js.native
    
    def setSelected(selected: Boolean): Unit = js.native
    
    def setSelectedFromChipSet(selected: Boolean, shouldNotifyClients: Boolean): Unit = js.native
    
    def setShouldFocusPrimaryActionOnClick(shouldFocus: Boolean): Unit = js.native
    
    def setShouldRemoveOnTrailingIconClick(shouldRemove: Boolean): Unit = js.native
  }
  /* static members */
  @js.native
  object MDCChipFoundation extends js.Object {
    
    def cssClasses: CHECKMARK = js.native
    
    def defaultAdapter: MDCChipAdapter = js.native
    
    def strings: ADDEDANNOUNCEMENTATTRIBUTE = js.native
  }
  
  @js.native
  class default () extends MDCChipFoundation {
    def this(adapter: PartialMDCChipAdapter) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    def cssClasses: CHECKMARK = js.native
    
    def defaultAdapter: MDCChipAdapter = js.native
    
    def strings: ADDEDANNOUNCEMENTATTRIBUTE = js.native
  }
}

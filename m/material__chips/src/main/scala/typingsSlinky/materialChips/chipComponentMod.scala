package typingsSlinky.materialChips

import org.scalajs.dom.raw.Element
import typingsSlinky.materialBase.componentMod.MDCComponent
import typingsSlinky.materialChips.chipFoundationMod.MDCChipFoundation
import typingsSlinky.materialChips.trailingactionComponentMod.MDCChipTrailingActionFactory
import typingsSlinky.materialRipple.componentMod.MDCRipple
import typingsSlinky.materialRipple.componentMod.MDCRippleFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/chips/chip/component", JSImport.Namespace)
@js.native
object chipComponentMod extends js.Object {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.materialRipple.typesMod.MDCRippleCapableSurface because var conflicts: root. Inlined disabled, unbounded */ @js.native
  class MDCChip () extends MDCComponent[MDCChipFoundation] {
    
    /**
      * Begins the exit animation which leads to removal of the chip.
      */
    def beginExit(): Unit = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    def focusPrimaryAction(): Unit = js.native
    
    def focusTrailingAction(): Unit = js.native
    
    def id: String = js.native
    
    def initialize(): Unit = js.native
    def initialize(rippleFactory: js.UndefOr[scala.Nothing], trailingActionFactory: MDCChipTrailingActionFactory): Unit = js.native
    def initialize(rippleFactory: MDCRippleFactory): Unit = js.native
    def initialize(rippleFactory: MDCRippleFactory, trailingActionFactory: MDCChipTrailingActionFactory): Unit = js.native
    
    def remove(): Unit = js.native
    
    def removeFocus(): Unit = js.native
    
    def ripple: MDCRipple = js.native
    
    /**
      * @return Whether the chip is selected.
      */
    def selected: Boolean = js.native
    /**
      * Sets selected state on the chip.
      */
    def selected_=(selected: Boolean): Unit = js.native
    
    def setSelectedFromChipSet(selected: Boolean, shouldNotifyClients: Boolean): Unit = js.native
    
    /**
      * Sets whether a clicking on the chip should focus the primary action.
      */
    def setShouldFocusPrimaryActionOnClick_=(shouldFocus: Boolean): Unit = js.native
    
    /**
      * @return Whether a trailing icon click should trigger exit/removal of the chip.
      */
    def shouldRemoveOnTrailingIconClick: Boolean = js.native
    /**
      * Sets whether a trailing icon click should trigger exit/removal of the chip.
      */
    def shouldRemoveOnTrailingIconClick_=(shouldRemove: Boolean): Unit = js.native
    
    var unbounded: js.UndefOr[Boolean] = js.native
  }
  /* static members */
  @js.native
  object MDCChip extends js.Object {
    
    def attachTo(root: Element): MDCChip = js.native
  }
  
  type MDCChipFactory = js.Function2[/* el */ Element, /* foundation */ js.UndefOr[MDCChipFoundation], MDCChip]
}

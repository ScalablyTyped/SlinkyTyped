package typingsSlinky.materialChips

import org.scalajs.dom.raw.Element
import typingsSlinky.materialBase.componentMod.MDCComponent
import typingsSlinky.materialChips.trailingactionFoundationMod.MDCChipTrailingActionFoundation
import typingsSlinky.materialRipple.componentMod.MDCRipple
import typingsSlinky.materialRipple.componentMod.MDCRippleFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trailingactionComponentMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.materialRipple.typesMod.MDCRippleCapableSurface because var conflicts: root. Inlined disabled, unbounded */ @JSImport("@material/chips/trailingaction/component", "MDCChipTrailingAction")
  @js.native
  class MDCChipTrailingAction protected () extends MDCComponent[MDCChipTrailingActionFoundation] {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(root: Element, foundation: MDCChipTrailingActionFoundation, args: js.Any*) = this()
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    def focus(): Unit = js.native
    
    def initialize(): Unit = js.native
    def initialize(rippleFactory: MDCRippleFactory): Unit = js.native
    
    def isNavigable(): Boolean = js.native
    
    def removeFocus(): Unit = js.native
    
    def ripple: MDCRipple = js.native
    
    var unbounded: js.UndefOr[Boolean] = js.native
  }
  /* static members */
  object MDCChipTrailingAction {
    
    @JSImport("@material/chips/trailingaction/component", "MDCChipTrailingAction.attachTo")
    @js.native
    def attachTo(root: Element): MDCChipTrailingAction = js.native
  }
  
  type MDCChipTrailingActionFactory = js.Function2[
    /* el */ Element, 
    /* foundation */ js.UndefOr[MDCChipTrailingActionFoundation], 
    MDCChipTrailingAction
  ]
}

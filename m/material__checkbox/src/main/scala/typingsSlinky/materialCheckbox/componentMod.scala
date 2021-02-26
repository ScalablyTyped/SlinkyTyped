package typingsSlinky.materialCheckbox

import org.scalajs.dom.raw.Element
import typingsSlinky.materialBase.componentMod.MDCComponent
import typingsSlinky.materialCheckbox.foundationMod.MDCCheckboxFoundation
import typingsSlinky.materialRipple.componentMod.MDCRipple
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.materialRipple.typesMod.MDCRippleCapableSurface because var conflicts: root. Inlined disabled, unbounded */ @JSImport("@material/checkbox/component", "MDCCheckbox")
  @js.native
  class MDCCheckbox protected () extends MDCComponent[MDCCheckboxFoundation] {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(root: Element, foundation: MDCCheckboxFoundation, args: js.Any*) = this()
    
    def checked: Boolean = js.native
    def checked_=(checked: Boolean): Unit = js.native
    
    def disabled: Boolean = js.native
    def disabled_=(disabled: Boolean): Unit = js.native
    @JSName("disabled")
    var disabled_FMDCCheckbox: js.UndefOr[Boolean] = js.native
    
    def indeterminate: Boolean = js.native
    def indeterminate_=(indeterminate: Boolean): Unit = js.native
    
    def initialize(): Unit = js.native
    
    def ripple: MDCRipple = js.native
    
    var unbounded: js.UndefOr[Boolean] = js.native
    
    def value: String = js.native
    def value_=(value: String): Unit = js.native
  }
  /* static members */
  object MDCCheckbox {
    
    @JSImport("@material/checkbox/component", "MDCCheckbox.attachTo")
    @js.native
    def attachTo(root: Element): MDCCheckbox = js.native
  }
  
  type MDCCheckboxFactory = js.Function2[/* el */ Element, /* foundation */ js.UndefOr[MDCCheckboxFoundation], MDCCheckbox]
}

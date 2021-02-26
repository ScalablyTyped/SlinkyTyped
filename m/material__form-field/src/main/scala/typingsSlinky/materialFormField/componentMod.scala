package typingsSlinky.materialFormField

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.materialBase.componentMod.MDCComponent
import typingsSlinky.materialFormField.foundationMod.MDCFormFieldFoundation
import typingsSlinky.materialRipple.componentMod.MDCRipple
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("@material/form-field/component", "MDCFormField")
  @js.native
  class MDCFormField protected () extends MDCComponent[MDCFormFieldFoundation] {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(root: Element, foundation: MDCFormFieldFoundation, args: js.Any*) = this()
    
    var input: js.UndefOr[MDCFormFieldInput] = js.native
  }
  /* static members */
  object MDCFormField {
    
    @JSImport("@material/form-field/component", "MDCFormField.attachTo")
    @js.native
    def attachTo(root: HTMLElement): MDCFormField = js.native
  }
  
  @js.native
  trait MDCFormFieldInput extends StObject {
    
    val ripple: js.UndefOr[MDCRipple] = js.native
  }
  object MDCFormFieldInput {
    
    @scala.inline
    def apply(): MDCFormFieldInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MDCFormFieldInput]
    }
    
    @scala.inline
    implicit class MDCFormFieldInputMutableBuilder[Self <: MDCFormFieldInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRipple(value: MDCRipple): Self = StObject.set(x, "ripple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRippleUndefined: Self = StObject.set(x, "ripple", js.undefined)
    }
  }
}

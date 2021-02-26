package typingsSlinky.materialTextfield

import org.scalajs.dom.raw.Element
import typingsSlinky.materialBase.componentMod.MDCComponent
import typingsSlinky.materialTextfield.iconFoundationMod.MDCTextFieldIconFoundation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconComponentMod {
  
  @JSImport("@material/textfield/icon/component", "MDCTextFieldIcon")
  @js.native
  class MDCTextFieldIcon protected () extends MDCComponent[MDCTextFieldIconFoundation] {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(root: Element, foundation: MDCTextFieldIconFoundation, args: js.Any*) = this()
    
    def foundationForTextField: MDCTextFieldIconFoundation = js.native
  }
  /* static members */
  object MDCTextFieldIcon {
    
    @JSImport("@material/textfield/icon/component", "MDCTextFieldIcon.attachTo")
    @js.native
    def attachTo(root: Element): MDCTextFieldIcon = js.native
  }
  
  type MDCTextFieldIconFactory = js.Function2[
    /* el */ Element, 
    /* foundation */ js.UndefOr[MDCTextFieldIconFoundation], 
    MDCTextFieldIcon
  ]
}

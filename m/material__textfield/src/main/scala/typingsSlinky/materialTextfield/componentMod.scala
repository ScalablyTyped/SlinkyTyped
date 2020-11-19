package typingsSlinky.materialTextfield

import org.scalajs.dom.raw.Element
import typingsSlinky.materialBase.componentMod.MDCComponent
import typingsSlinky.materialTextfield.foundationMod.MDCTextFieldCharacterCounterFoundation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/textfield/character-counter/component", JSImport.Namespace)
@js.native
object componentMod extends js.Object {
  
  @js.native
  class MDCTextFieldCharacterCounter () extends MDCComponent[MDCTextFieldCharacterCounterFoundation] {
    
    def foundationForTextField: MDCTextFieldCharacterCounterFoundation = js.native
  }
  /* static members */
  @js.native
  object MDCTextFieldCharacterCounter extends js.Object {
    
    def attachTo(root: Element): MDCTextFieldCharacterCounter = js.native
  }
  
  type MDCTextFieldCharacterCounterFactory = js.Function2[
    /* el */ Element, 
    /* foundation */ js.UndefOr[MDCTextFieldCharacterCounterFoundation], 
    MDCTextFieldCharacterCounter
  ]
}

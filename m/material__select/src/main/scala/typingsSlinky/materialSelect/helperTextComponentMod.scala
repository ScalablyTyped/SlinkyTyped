package typingsSlinky.materialSelect

import org.scalajs.dom.raw.Element
import typingsSlinky.materialBase.componentMod.MDCComponent
import typingsSlinky.materialSelect.helperTextFoundationMod.MDCSelectHelperTextFoundation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/select/helper-text/component", JSImport.Namespace)
@js.native
object helperTextComponentMod extends js.Object {
  
  @js.native
  class MDCSelectHelperText () extends MDCComponent[MDCSelectHelperTextFoundation] {
    
    def foundationForSelect: MDCSelectHelperTextFoundation = js.native
  }
  /* static members */
  @js.native
  object MDCSelectHelperText extends js.Object {
    
    def attachTo(root: Element): MDCSelectHelperText = js.native
  }
  
  type MDCSelectHelperTextFactory = js.Function2[
    /* el */ Element, 
    /* foundation */ js.UndefOr[MDCSelectHelperTextFoundation], 
    MDCSelectHelperText
  ]
}

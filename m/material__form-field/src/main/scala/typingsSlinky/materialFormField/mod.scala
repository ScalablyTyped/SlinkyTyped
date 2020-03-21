package typingsSlinky.materialFormField

import org.scalajs.dom.raw.Element
import typingsSlinky.materialFormField.adapterMod.MDCFormFieldAdapter
import typingsSlinky.materialFormField.foundationMod.default
import typingsSlinky.materialSelectionControl.mod.MDCSelectionControl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/form-field", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class MDCFormField ()
    extends typingsSlinky.materialBase.componentMod.default[MDCFormFieldAdapter, default] {
    var input: MDCSelectionControl = js.native
  }
  
  @js.native
  class MDCFormFieldFoundation () extends default
  
  /* static members */
  @js.native
  object MDCFormField extends js.Object {
    def attachTo(root: Element): MDCFormField = js.native
  }
  
  /* static members */
  @js.native
  object MDCFormFieldFoundation extends js.Object {
    val cssClasses: typingsSlinky.materialFormField.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCFormFieldAdapter = js.native
    val strings: typingsSlinky.materialFormField.constantsMod.strings = js.native
  }
  
}


package typingsSlinky.atMaterialFormDashField

import org.scalajs.dom.raw.Element
import typingsSlinky.atMaterialFormDashField.adapterMod.MDCFormFieldAdapter
import typingsSlinky.atMaterialFormDashField.foundationMod.default
import typingsSlinky.atMaterialSelectionDashControl.atMaterialSelectionDashControlMod.MDCSelectionControl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/form-field", JSImport.Namespace)
@js.native
object atMaterialFormDashFieldMod extends js.Object {
  @js.native
  class MDCFormField ()
    extends typingsSlinky.atMaterialBase.componentMod.default[MDCFormFieldAdapter, default] {
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
    val cssClasses: typingsSlinky.atMaterialFormDashField.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCFormFieldAdapter = js.native
    val strings: typingsSlinky.atMaterialFormDashField.constantsMod.strings = js.native
  }
  
}


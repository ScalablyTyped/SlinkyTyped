package typingsSlinky.materialComponentsWeb.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.materialFormField.adapterMod.MDCFormFieldAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "formField")
@js.native
object formField extends js.Object {
  @js.native
  class MDCFormField ()
    extends typingsSlinky.materialFormField.mod.MDCFormField
  
  @js.native
  class MDCFormFieldFoundation ()
    extends typingsSlinky.materialFormField.mod.MDCFormFieldFoundation
  
  /* static members */
  @js.native
  object MDCFormField extends js.Object {
    def attachTo(root: Element): typingsSlinky.materialFormField.mod.MDCFormField = js.native
  }
  
  /* static members */
  @js.native
  object MDCFormFieldFoundation extends js.Object {
    val cssClasses: typingsSlinky.materialFormField.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCFormFieldAdapter = js.native
    val strings: typingsSlinky.materialFormField.constantsMod.strings = js.native
  }
  
}


package typingsSlinky.materialFormField

import typingsSlinky.materialFormField.adapterMod.MDCFormFieldAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/form-field/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  @js.native
  class default ()
    extends typingsSlinky.materialBase.foundationMod.default[MDCFormFieldAdapter]
  
  /* static members */
  @js.native
  object default extends js.Object {
    val cssClasses: typingsSlinky.materialFormField.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCFormFieldAdapter = js.native
    val strings: typingsSlinky.materialFormField.constantsMod.strings = js.native
  }
  
  type MDCFormFieldFoundation = typingsSlinky.materialBase.foundationMod.default[MDCFormFieldAdapter]
}


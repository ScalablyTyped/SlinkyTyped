package typingsSlinky.rcFieldForm.components

import typingsSlinky.rcFieldForm.fieldMod.FieldProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Field {
  
  @JSImport("rc-field-form", "Field")
  @js.native
  object component extends js.Object
  
  def withProps(p: FieldProps): SharedBuilder_FieldProps1867252267 = new SharedBuilder_FieldProps1867252267(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Field.type): SharedBuilder_FieldProps1867252267 = new SharedBuilder_FieldProps1867252267(js.Array(this.component, js.Dictionary.empty))()
}

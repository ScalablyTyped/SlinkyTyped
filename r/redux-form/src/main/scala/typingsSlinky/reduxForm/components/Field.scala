package typingsSlinky.reduxForm.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from P because couldn't resolve ClassTree. */
object Field {
  @JSImport("redux-form", "Field")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[/* <: typingsSlinky.reduxForm.fieldMod.GenericFieldHTMLAttributes | typingsSlinky.reduxForm.fieldMod.BaseFieldProps[js.Object] */ P] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reduxForm.mod.Field[P]]
  
  def apply[/* <: typingsSlinky.reduxForm.fieldMod.GenericFieldHTMLAttributes | typingsSlinky.reduxForm.fieldMod.BaseFieldProps[js.Object] */ P](p: P): Builder[P] = new Builder[P](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[/* <: typingsSlinky.reduxForm.fieldMod.GenericFieldHTMLAttributes | typingsSlinky.reduxForm.fieldMod.BaseFieldProps[js.Object] */ P](companion: Field.type): Builder[P] = new Builder[P](js.Array(this.component, js.Dictionary.empty))()
}


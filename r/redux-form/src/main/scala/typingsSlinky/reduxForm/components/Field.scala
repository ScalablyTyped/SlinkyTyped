package typingsSlinky.reduxForm.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reduxForm.fieldMod.BaseFieldProps
import typingsSlinky.reduxForm.fieldMod.GenericFieldHTMLAttributes
import typingsSlinky.reduxForm.fieldMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from P because couldn't resolve ClassTree. */
object Field {
  @JSImport("redux-form/lib/Field", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[P <: GenericFieldHTMLAttributes | BaseFieldProps[js.Object]] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default[js.Any]]
  
  def apply[P <: GenericFieldHTMLAttributes | BaseFieldProps[js.Object]](p: P): Builder[P] = new Builder[P](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[P <: GenericFieldHTMLAttributes | BaseFieldProps[js.Object]](companion: Field.type): Builder[P] = new Builder[P](js.Array(this.component, js.Dictionary.empty))()
}


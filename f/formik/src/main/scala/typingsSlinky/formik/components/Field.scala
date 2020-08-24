package typingsSlinky.formik.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.formik.fieldMod.FieldAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsSlinky.formik.fieldMod.FieldAttributes[js.Any] because: IArray(Could't extract props from js.Any because couldn't resolve ClassTree.) */
object Field {
  @JSImport("formik", "Field")
  @js.native
  object component extends js.Object
  
  def apply(p: FieldAttributes[js.Any]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Field.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
}


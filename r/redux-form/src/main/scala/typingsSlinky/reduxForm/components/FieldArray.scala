package typingsSlinky.reduxForm.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reduxForm.fieldArrayMod.BaseFieldArrayProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsSlinky.reduxForm.fieldArrayMod.BaseFieldArrayProps[P, FieldValue] because: IArray(Could't extract props from P because couldn't resolve ClassTree.) */
object FieldArray {
  
  def apply[P, FieldValue](p: BaseFieldArrayProps[P, FieldValue]): Builder[P, FieldValue] = new Builder[P, FieldValue](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("redux-form", "FieldArray")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder[P, FieldValue] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reduxForm.mod.FieldArray[P, FieldValue]]
  
  implicit def make[P, FieldValue](companion: FieldArray.type): Builder[P, FieldValue] = new Builder[P, FieldValue](js.Array(this.component, js.Dictionary.empty))()
}

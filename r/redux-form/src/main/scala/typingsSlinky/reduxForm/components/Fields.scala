package typingsSlinky.reduxForm.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reduxForm.fieldsMod.BaseFieldsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsSlinky.reduxForm.fieldsMod.BaseFieldsProps[P] with P because: IArray(Could't extract props from P because couldn't resolve ClassTree.) */
object Fields {
  
  def apply[P](p: BaseFieldsProps[P] with P): Builder[P] = new Builder[P](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("redux-form", "Fields")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder[P] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reduxForm.mod.Fields[P]]
  
  implicit def make[P](companion: Fields.type): Builder[P] = new Builder[P](js.Array(this.component, js.Dictionary.empty))()
}

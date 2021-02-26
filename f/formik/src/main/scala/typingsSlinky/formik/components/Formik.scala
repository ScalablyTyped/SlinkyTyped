package typingsSlinky.formik.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.formik.typesMod.FormikConfig
import typingsSlinky.formik.typesMod.FormikValues
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsSlinky.formik.typesMod.FormikConfig[Values] with ExtraProps because: IArray(Could't extract props from ExtraProps because couldn't resolve ClassTree.) */
object Formik {
  
  def apply[Values /* <: FormikValues */, ExtraProps](p: FormikConfig[Values] with ExtraProps): Builder[Values, ExtraProps] = new Builder[Values, ExtraProps](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("formik", "Formik")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder[Values /* <: FormikValues */, ExtraProps] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object]
  
  implicit def make[Values /* <: FormikValues */, ExtraProps](companion: Formik.type): Builder[Values, ExtraProps] = new Builder[Values, ExtraProps](js.Array(this.component, js.Dictionary.empty))()
}

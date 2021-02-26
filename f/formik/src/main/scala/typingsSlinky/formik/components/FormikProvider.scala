package typingsSlinky.formik.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.formik.typesMod.FormikContextType
import typingsSlinky.react.mod.ProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FormikProvider {
  
  @scala.inline
  def apply(value: FormikContextType[js.Any]): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ProviderProps[FormikContextType[js.Any]]]))
  }
  
  @JSImport("formik", "FormikProvider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ProviderProps[FormikContextType[js.Any]]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}

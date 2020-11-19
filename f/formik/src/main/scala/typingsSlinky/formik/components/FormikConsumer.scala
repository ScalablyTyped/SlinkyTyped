package typingsSlinky.formik.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.formik.typesMod.FormikContextType
import typingsSlinky.react.mod.ConsumerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FormikConsumer {
  
  @JSImport("formik", "FormikConsumer")
  @js.native
  object component extends js.Object
  
  def withProps(p: ConsumerProps[FormikContextType[js.Any]]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(children: FormikContextType[js.Any] => ReactElement): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ConsumerProps[FormikContextType[js.Any]]]))
  }
}

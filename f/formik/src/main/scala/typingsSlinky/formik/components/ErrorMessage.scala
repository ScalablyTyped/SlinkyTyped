package typingsSlinky.formik.components

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.formik.errorMessageMod.ErrorMessageProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ErrorMessage {
  @JSImport("formik", "ErrorMessage")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.formik.mod.ErrorMessage] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def componentFunctionComponent(value: ReactComponentClass[js.Object]): this.type = set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def componentComponentClass(value: ReactComponentClass[js.Object]): this.type = set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def component(value: String | ReactComponentClass[js.Object]): this.type = set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def render(value: /* errorMessage */ String => TagMod[Any]): this.type = set("render", js.Any.fromFunction1(value))
  }
  
  def withProps(p: ErrorMessageProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(name: String): Builder = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ErrorMessageProps]))
  }
}


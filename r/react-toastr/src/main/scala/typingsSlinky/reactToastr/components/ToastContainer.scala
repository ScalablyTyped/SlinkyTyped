package typingsSlinky.reactToastr.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactToastr.anon.ClassName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ToastContainer {
  @JSImport("react-toastr", "ToastContainer")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactToastr.mod.ToastContainer] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ClassName): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(toastMessageFactory: js.Any): Builder = {
    val __props = js.Dynamic.literal(toastMessageFactory = toastMessageFactory.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ClassName]))
  }
}


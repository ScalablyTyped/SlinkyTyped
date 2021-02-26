package typingsSlinky.reactToastr.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactToastr.anon.ClassName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ToastContainer {
  
  @scala.inline
  def apply(toastMessageFactory: js.Any): Builder = {
    val __props = js.Dynamic.literal(toastMessageFactory = toastMessageFactory.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ClassName]))
  }
  
  @JSImport("react-toastr", "ToastContainer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactToastr.mod.ToastContainer] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ClassName): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

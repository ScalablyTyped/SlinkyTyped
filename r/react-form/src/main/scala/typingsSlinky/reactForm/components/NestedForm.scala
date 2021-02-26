package typingsSlinky.reactForm.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ReactText
import typingsSlinky.reactForm.mod.FieldProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NestedForm {
  
  @JSImport("react-form", "NestedForm")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def errorBefore(value: Boolean): this.type = set("errorBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def field(value: String | (js.Array[js.Array[ReactText] | ReactText | String])): this.type = set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fieldVarargs(value: (js.Array[ReactText] | ReactText | String)*): this.type = set("field", js.Array(value :_*))
    
    @scala.inline
    def isForm(value: Boolean): this.type = set("isForm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showErrors(value: Boolean): this.type = set("showErrors", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: NestedForm.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: FieldProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

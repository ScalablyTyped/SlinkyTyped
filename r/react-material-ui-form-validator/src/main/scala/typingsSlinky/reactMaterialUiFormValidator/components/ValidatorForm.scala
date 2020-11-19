package typingsSlinky.reactMaterialUiFormValidator.components

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import slinky.core.SyntheticEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactMaterialUiFormValidator.mod.ValidatorFormProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ValidatorForm {
  
  @JSImport("react-material-ui-form-validator", "ValidatorForm")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactMaterialUiFormValidator.mod.ValidatorForm] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def debounceTime(value: Double): this.type = set("debounceTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def instantValidate(value: Boolean): this.type = set("instantValidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onError(value: /* errors */ js.Array[_] => Unit): this.type = set("onError", js.Any.fromFunction1(value))
  }
  
  def withProps(p: ValidatorFormProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(onSubmit: SyntheticEvent[EventTarget with Element, Event] => Unit): Builder = {
    val __props = js.Dynamic.literal(onSubmit = js.Any.fromFunction1(onSubmit))
    new Builder(js.Array(this.component, __props.asInstanceOf[ValidatorFormProps]))
  }
}

package typingsSlinky.reactMaterialUiFormValidator.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactMaterialUiFormValidator.mod.ValidatorComponentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ValidatorComponent {
  
  @scala.inline
  def apply(name: String, value: js.Any): Builder = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ValidatorComponentProps]))
  }
  
  @JSImport("react-material-ui-form-validator", "ValidatorComponent")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactMaterialUiFormValidator.mod.ValidatorComponent] {
    
    @scala.inline
    def errorMessages(value: js.Array[_] | String): this.type = set("errorMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def errorMessagesVarargs(value: js.Any*): this.type = set("errorMessages", js.Array(value :_*))
    
    @scala.inline
    def validatorListener(value: /* isValid */ Boolean => Unit): this.type = set("validatorListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def validators(value: js.Array[_]): this.type = set("validators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def validatorsVarargs(value: js.Any*): this.type = set("validators", js.Array(value :_*))
    
    @scala.inline
    def withRequiredValidator(value: Boolean): this.type = set("withRequiredValidator", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ValidatorComponentProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

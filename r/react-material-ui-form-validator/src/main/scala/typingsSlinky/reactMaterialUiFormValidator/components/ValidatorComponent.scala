package typingsSlinky.reactMaterialUiFormValidator.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactMaterialUiFormValidator.mod.ValidatorComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ValidatorComponent
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactMaterialUiFormValidator.mod.ValidatorComponent] {
  @JSImport("react-material-ui-form-validator", "ValidatorComponent")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    name: String,
    value: js.Any,
    errorMessages: js.Array[_] | String = null,
    validatorListener: /* isValid */ Boolean => Unit = null,
    validators: js.Array[_] = null,
    withRequiredValidator: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactMaterialUiFormValidator.mod.ValidatorComponent] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (errorMessages != null) __obj.updateDynamic("errorMessages")(errorMessages.asInstanceOf[js.Any])
    if (validatorListener != null) __obj.updateDynamic("validatorListener")(js.Any.fromFunction1(validatorListener))
    if (validators != null) __obj.updateDynamic("validators")(validators.asInstanceOf[js.Any])
    if (!js.isUndefined(withRequiredValidator)) __obj.updateDynamic("withRequiredValidator")(withRequiredValidator.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ValidatorComponentProps
}


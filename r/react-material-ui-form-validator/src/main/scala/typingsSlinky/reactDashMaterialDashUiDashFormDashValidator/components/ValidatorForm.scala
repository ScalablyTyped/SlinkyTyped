package typingsSlinky.reactDashMaterialDashUiDashFormDashValidator.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.FormEvent
import typingsSlinky.reactDashMaterialDashUiDashFormDashValidator.reactDashMaterialDashUiDashFormDashValidatorMod.ValidatorFormProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ValidatorForm
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashMaterialDashUiDashFormDashValidator.reactDashMaterialDashUiDashFormDashValidatorMod.ValidatorForm
    ] {
  @JSImport("react-material-ui-form-validator", "ValidatorForm")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, onError */
  def apply(
    onSubmit: FormEvent[org.scalajs.dom.raw.Element] => Unit,
    debounceTime: Int | Double = null,
    instantValidate: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashMaterialDashUiDashFormDashValidator.reactDashMaterialDashUiDashFormDashValidatorMod.ValidatorForm
  ] = {
    val __obj = js.Dynamic.literal(onSubmit = js.Any.fromFunction1(onSubmit))
    if (debounceTime != null) __obj.updateDynamic("debounceTime")(debounceTime.asInstanceOf[js.Any])
    if (!js.isUndefined(instantValidate)) __obj.updateDynamic("instantValidate")(instantValidate.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ValidatorFormProps
}


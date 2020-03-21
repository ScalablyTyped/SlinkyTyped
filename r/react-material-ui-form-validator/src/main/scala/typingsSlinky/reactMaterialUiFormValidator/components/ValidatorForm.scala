package typingsSlinky.reactMaterialUiFormValidator.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.EventTarget
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.SyntheticEvent
import slinky.web.html.`*`.tag
import typingsSlinky.reactMaterialUiFormValidator.mod.ValidatorFormProps
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ValidatorForm
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactMaterialUiFormValidator.mod.ValidatorForm] {
  @JSImport("react-material-ui-form-validator", "ValidatorForm")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    onSubmit: SyntheticEvent[EventTarget with org.scalajs.dom.raw.Element, Event_] => Unit,
    debounceTime: Int | Double = null,
    instantValidate: js.UndefOr[Boolean] = js.undefined,
    onError: /* errors */ js.Array[_] => Unit = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactMaterialUiFormValidator.mod.ValidatorForm] = {
    val __obj = js.Dynamic.literal(onSubmit = js.Any.fromFunction1(onSubmit))
    if (debounceTime != null) __obj.updateDynamic("debounceTime")(debounceTime.asInstanceOf[js.Any])
    if (!js.isUndefined(instantValidate)) __obj.updateDynamic("instantValidate")(instantValidate.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ValidatorFormProps
}


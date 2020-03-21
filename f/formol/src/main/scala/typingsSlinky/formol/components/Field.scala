package typingsSlinky.formol.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.formol.mod.FieldProps
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Field
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.formol.mod.Field] {
  @JSImport("formol", "Field")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, disabled, name, readOnly, required, size, title, type */
  def apply(
    TypeField: ReactComponentClass[js.Object] = null,
    choices: js.Array[_] = null,
    classNameModifiers: js.Any = null,
    dangerousRawHTMLLabels: js.UndefOr[Boolean] = js.undefined,
    error: TagMod[Any] = null,
    extras: TagMod[Any] = null,
    formatter: js.Any => js.Any = null,
    handleChange: (/* name */ String, js.Any) => Unit = null,
    handleEntered: (/* name */ String, js.Any) => Unit = null,
    i18n: js.Any = null,
    max: Int | Double = null,
    minLength: Int | Double = null,
    modified: js.UndefOr[Boolean] = js.undefined,
    normalizer: js.Any => js.Any = null,
    register: (/* name */ String, /* element */ Ref[_], /* validator */ js.Any, /* validityErrors */ js.Any) => Unit = null,
    unformatter: js.Any => js.Any = null,
    unit: TagMod[Any] = null,
    unregister: /* name */ String => Unit = null,
    validator: js.Any => String = null,
    validityErrors: js.Any = null,
    value: js.Any = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.formol.mod.Field] = {
    val __obj = js.Dynamic.literal()
    if (TypeField != null) __obj.updateDynamic("TypeField")(TypeField.asInstanceOf[js.Any])
    if (choices != null) __obj.updateDynamic("choices")(choices.asInstanceOf[js.Any])
    if (classNameModifiers != null) __obj.updateDynamic("classNameModifiers")(classNameModifiers.asInstanceOf[js.Any])
    if (!js.isUndefined(dangerousRawHTMLLabels)) __obj.updateDynamic("dangerousRawHTMLLabels")(dangerousRawHTMLLabels.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (extras != null) __obj.updateDynamic("extras")(extras.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction1(formatter))
    if (handleChange != null) __obj.updateDynamic("handleChange")(js.Any.fromFunction2(handleChange))
    if (handleEntered != null) __obj.updateDynamic("handleEntered")(js.Any.fromFunction2(handleEntered))
    if (i18n != null) __obj.updateDynamic("i18n")(i18n.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (!js.isUndefined(modified)) __obj.updateDynamic("modified")(modified.asInstanceOf[js.Any])
    if (normalizer != null) __obj.updateDynamic("normalizer")(js.Any.fromFunction1(normalizer))
    if (register != null) __obj.updateDynamic("register")(js.Any.fromFunction4(register))
    if (unformatter != null) __obj.updateDynamic("unformatter")(js.Any.fromFunction1(unformatter))
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (unregister != null) __obj.updateDynamic("unregister")(js.Any.fromFunction1(unregister))
    if (validator != null) __obj.updateDynamic("validator")(js.Any.fromFunction1(validator))
    if (validityErrors != null) __obj.updateDynamic("validityErrors")(validityErrors.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.formol.mod.Field] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.formol.mod.Field](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = FieldProps[js.Any]
}


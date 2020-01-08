package typingsSlinky.baseui.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.baseui.Anon_Select
import typingsSlinky.baseui.baseuiStrings.`12`
import typingsSlinky.baseui.baseuiStrings.`24`
import typingsSlinky.baseui.timepickerMod.TimePickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TimePicker
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.baseui.timepickerMod.TimePicker] {
  @JSImport("baseui/timepicker", "TimePicker")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: disabled, onChange, placeholder */
  def apply(
    creatable: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    format: `12` | `24` = null,
    nullable: js.UndefOr[Boolean] = js.undefined,
    overrides: Anon_Select = null,
    positive: js.UndefOr[Boolean] = js.undefined,
    step: Int | Double = null,
    value: js.Date = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.baseui.timepickerMod.TimePicker] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(creatable)) __obj.updateDynamic("creatable")(creatable.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(nullable)) __obj.updateDynamic("nullable")(nullable.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(positive)) __obj.updateDynamic("positive")(positive.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.baseui.timepickerMod.TimePicker] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.baseui.timepickerMod.TimePicker](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = TimePickerProps
}


package typingsSlinky.baseui.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.input.tag
import typingsSlinky.baseui.baseuiStrings.bottom
import typingsSlinky.baseui.baseuiStrings.horizontal
import typingsSlinky.baseui.baseuiStrings.left
import typingsSlinky.baseui.baseuiStrings.right
import typingsSlinky.baseui.baseuiStrings.top
import typingsSlinky.baseui.baseuiStrings.vertical
import typingsSlinky.baseui.radioMod.RadioGroupOverrides
import typingsSlinky.baseui.radioMod.RadioGroupProps
import typingsSlinky.baseui.radioMod.RadioOverrides
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RadioGroup
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.baseui.radioMod.RadioGroup] {
  @JSImport("baseui/radio", "RadioGroup")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: autoFocus, disabled, name, onBlur, onChange, onFocus, onMouseEnter, onMouseLeave, required */
  def apply(
    align: horizontal | vertical = null,
    `aria-label`: String = null,
    `aria-labelledby`: String = null,
    isError: js.UndefOr[Boolean] = js.undefined,
    labelPlacement: top | right | bottom | left = null,
    overrides: RadioOverrides with RadioGroupOverrides = null,
    value: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.baseui.radioMod.RadioGroup] = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
    if (!js.isUndefined(isError)) __obj.updateDynamic("isError")(isError.asInstanceOf[js.Any])
    if (labelPlacement != null) __obj.updateDynamic("labelPlacement")(labelPlacement.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.baseui.radioMod.RadioGroup] = new slinky.core.BuildingComponent[slinky.web.html.input.tag.type, typingsSlinky.baseui.radioMod.RadioGroup](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = RadioGroupProps
}


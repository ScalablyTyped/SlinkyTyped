package typingsSlinky.baseui.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.input.tag
import typingsSlinky.baseui.baseuiStrings.bottom
import typingsSlinky.baseui.baseuiStrings.default_
import typingsSlinky.baseui.baseuiStrings.left
import typingsSlinky.baseui.baseuiStrings.right
import typingsSlinky.baseui.baseuiStrings.toggle
import typingsSlinky.baseui.baseuiStrings.toggle_round
import typingsSlinky.baseui.baseuiStrings.top
import typingsSlinky.baseui.checkboxMod.CheckboxOverrides
import typingsSlinky.baseui.checkboxMod.CheckboxProps
import typingsSlinky.react.reactMod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Checkbox
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.baseui.checkboxMod.Checkbox] {
  @JSImport("baseui/checkbox", "Checkbox")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: autoFocus, checked, disabled, name, onBlur, onChange, onFocus, onMouseDown, onMouseEnter, onMouseLeave, onMouseUp, required, type */
  def apply(
    checkmarkType: default_ | toggle | toggle_round = null,
    inputRef: Ref[HTMLInputElement] = null,
    isError: js.UndefOr[Boolean] = js.undefined,
    isIndeterminate: js.UndefOr[Boolean] = js.undefined,
    labelPlacement: top | right | bottom | left = null,
    overrides: CheckboxOverrides = null,
    title: String = null,
    value: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.baseui.checkboxMod.Checkbox] = {
    val __obj = js.Dynamic.literal()
    if (checkmarkType != null) __obj.updateDynamic("checkmarkType")(checkmarkType.asInstanceOf[js.Any])
    if (inputRef != null) __obj.updateDynamic("inputRef")(inputRef.asInstanceOf[js.Any])
    if (!js.isUndefined(isError)) __obj.updateDynamic("isError")(isError.asInstanceOf[js.Any])
    if (!js.isUndefined(isIndeterminate)) __obj.updateDynamic("isIndeterminate")(isIndeterminate.asInstanceOf[js.Any])
    if (labelPlacement != null) __obj.updateDynamic("labelPlacement")(labelPlacement.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.baseui.checkboxMod.Checkbox] = new slinky.core.BuildingComponent[slinky.web.html.input.tag.type, typingsSlinky.baseui.checkboxMod.Checkbox](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = CheckboxProps
}


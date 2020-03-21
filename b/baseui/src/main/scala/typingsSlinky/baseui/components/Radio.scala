package typingsSlinky.baseui.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.input.tag
import typingsSlinky.baseui.baseuiStrings.bottom
import typingsSlinky.baseui.baseuiStrings.left
import typingsSlinky.baseui.baseuiStrings.right
import typingsSlinky.baseui.baseuiStrings.top
import typingsSlinky.baseui.radioMod.RadioGroupOverrides
import typingsSlinky.baseui.radioMod.RadioOverrides
import typingsSlinky.baseui.radioMod.RadioProps
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Radio
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.baseui.radioMod.Radio] {
  @JSImport("baseui/radio", "Radio")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: autoFocus, checked, disabled, name, onBlur, onFocus, onMouseDown, onMouseEnter, onMouseLeave, onMouseUp, required */
  def apply(
    description: String = null,
    inputRef: Ref[HTMLInputElement] = null,
    isError: js.UndefOr[Boolean] = js.undefined,
    isFocusVisible: js.UndefOr[Boolean] = js.undefined,
    isFocused: js.UndefOr[Boolean] = js.undefined,
    labelPlacement: top | right | bottom | left = null,
    onChange: ChangeEvent[HTMLInputElement] => Unit = null,
    overrides: RadioOverrides with RadioGroupOverrides = null,
    tabIndex: String = null,
    value: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.baseui.radioMod.Radio] = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (inputRef != null) __obj.updateDynamic("inputRef")(inputRef.asInstanceOf[js.Any])
    if (!js.isUndefined(isError)) __obj.updateDynamic("isError")(isError.asInstanceOf[js.Any])
    if (!js.isUndefined(isFocusVisible)) __obj.updateDynamic("isFocusVisible")(isFocusVisible.asInstanceOf[js.Any])
    if (!js.isUndefined(isFocused)) __obj.updateDynamic("isFocused")(isFocused.asInstanceOf[js.Any])
    if (labelPlacement != null) __obj.updateDynamic("labelPlacement")(labelPlacement.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.baseui.radioMod.Radio] = new slinky.core.BuildingComponent[slinky.web.html.input.tag.type, typingsSlinky.baseui.radioMod.Radio](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = RadioProps
}


package typingsSlinky.baseui.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.input.tag
import typingsSlinky.baseui.baseuiStrings.both
import typingsSlinky.baseui.baseuiStrings.compact
import typingsSlinky.baseui.baseuiStrings.default_
import typingsSlinky.baseui.baseuiStrings.large_
import typingsSlinky.baseui.baseuiStrings.left
import typingsSlinky.baseui.baseuiStrings.none
import typingsSlinky.baseui.baseuiStrings.right
import typingsSlinky.baseui.inputMod.InputOverrides
import typingsSlinky.baseui.inputMod.InputProps
import typingsSlinky.baseui.inputMod.SharedProps
import typingsSlinky.react.reactMod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Input
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.baseui.inputMod.Input] {
  @JSImport("baseui/input", "Input")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: autoComplete, autoFocus, disabled, id, name, onBlur, onChange, onFocus, onKeyDown, onKeyPress, onKeyUp, placeholder, required, rows, type */
  def apply(
    adjoined: none | left | right | both = null,
    `aria-describedby`: String = null,
    `aria-label`: String = null,
    `aria-labelledby`: String = null,
    clearable: js.UndefOr[Boolean] = js.undefined,
    `data-baseweb`: String = null,
    endEnhancer: (js.Function1[/* args */ SharedProps, TagMod[Any]]) | TagMod[Any] = null,
    error: js.UndefOr[Boolean] = js.undefined,
    inputRef: Ref[HTMLInputElement] = null,
    max: Int | Double = null,
    min: Int | Double = null,
    overrides: InputOverrides = null,
    positive: js.UndefOr[Boolean] = js.undefined,
    size: default_ | compact | large_ = null,
    startEnhancer: (js.Function1[/* args */ SharedProps, TagMod[Any]]) | TagMod[Any] = null,
    value: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.baseui.inputMod.Input] = {
    val __obj = js.Dynamic.literal()
    if (adjoined != null) __obj.updateDynamic("adjoined")(adjoined.asInstanceOf[js.Any])
    if (`aria-describedby` != null) __obj.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
    if (!js.isUndefined(clearable)) __obj.updateDynamic("clearable")(clearable.asInstanceOf[js.Any])
    if (`data-baseweb` != null) __obj.updateDynamic("data-baseweb")(`data-baseweb`.asInstanceOf[js.Any])
    if (endEnhancer != null) __obj.updateDynamic("endEnhancer")(endEnhancer.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (inputRef != null) __obj.updateDynamic("inputRef")(inputRef.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(positive)) __obj.updateDynamic("positive")(positive.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (startEnhancer != null) __obj.updateDynamic("startEnhancer")(startEnhancer.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.baseui.inputMod.Input] = new slinky.core.BuildingComponent[slinky.web.html.input.tag.type, typingsSlinky.baseui.inputMod.Input](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = InputProps
}


package typingsSlinky.atBlueprintjsCore.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.web.SyntheticKeyboardEvent
import slinky.web.html.`*`.tag
import typingsSlinky.atBlueprintjsCore.atBlueprintjsCoreBooleans.`false`
import typingsSlinky.atBlueprintjsCore.libEsmCommonIntentMod.Intent
import typingsSlinky.atBlueprintjsCore.libEsmCommonPropsMod.HTMLInputProps
import typingsSlinky.atBlueprintjsCore.libEsmCommonPropsMod.MaybeElement
import typingsSlinky.atBlueprintjsCore.libEsmComponentsTagDashInputTagInputMod.ITagInputProps
import typingsSlinky.atBlueprintjsCore.libEsmComponentsTagDashInputTagInputMod.TagInputAddMethod
import typingsSlinky.atBlueprintjsCore.libEsmComponentsTagTagMod.ITagProps
import typingsSlinky.atBlueprintjsIcons.libEsmIconNameMod.IconName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TagInput
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.atBlueprintjsCore.libEsmComponentsMod.TagInput] {
  @JSImport("@blueprintjs/core/lib/esm/components", "TagInput")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, disabled, onChange, placeholder */
  def apply(
    values: js.Array[TagMod[Any]],
    addOnBlur: js.UndefOr[Boolean] = js.undefined,
    addOnPaste: js.UndefOr[Boolean] = js.undefined,
    fill: js.UndefOr[Boolean] = js.undefined,
    inputProps: HTMLInputProps = null,
    inputRef: /* input */ HTMLInputElement | Null => Unit = null,
    inputValue: String = null,
    intent: Intent = null,
    large: js.UndefOr[Boolean] = js.undefined,
    leftIcon: IconName | MaybeElement = null,
    onAdd: (/* values */ js.Array[String], /* method */ TagInputAddMethod) => Boolean | Unit = null,
    onInputChange: SyntheticEvent[EventTarget with HTMLInputElement, Event] => Unit = null,
    onKeyDown: (/* event */ SyntheticKeyboardEvent[HTMLElement], /* index */ js.UndefOr[Double]) => Unit = null,
    onKeyUp: (/* event */ SyntheticKeyboardEvent[HTMLElement], /* index */ js.UndefOr[Double]) => Unit = null,
    onRemove: (/* value */ String, /* index */ Double) => Unit = null,
    rightElement: typingsSlinky.react.reactMod._Global_.JSX.Element = null,
    separator: String | js.RegExp | `false` = null,
    tagProps: ITagProps | (js.Function2[/* value */ TagMod[Any], /* index */ Double, ITagProps]) = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.atBlueprintjsCore.libEsmComponentsMod.TagInput] = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    if (!js.isUndefined(addOnBlur)) __obj.updateDynamic("addOnBlur")(addOnBlur.asInstanceOf[js.Any])
    if (!js.isUndefined(addOnPaste)) __obj.updateDynamic("addOnPaste")(addOnPaste.asInstanceOf[js.Any])
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (inputRef != null) __obj.updateDynamic("inputRef")(js.Any.fromFunction1(inputRef))
    if (inputValue != null) __obj.updateDynamic("inputValue")(inputValue.asInstanceOf[js.Any])
    if (intent != null) __obj.updateDynamic("intent")(intent.asInstanceOf[js.Any])
    if (!js.isUndefined(large)) __obj.updateDynamic("large")(large.asInstanceOf[js.Any])
    if (leftIcon != null) __obj.updateDynamic("leftIcon")(leftIcon.asInstanceOf[js.Any])
    if (onAdd != null) __obj.updateDynamic("onAdd")(js.Any.fromFunction2(onAdd))
    if (onInputChange != null) __obj.updateDynamic("onInputChange")(js.Any.fromFunction1(onInputChange))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction2(onKeyDown))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction2(onKeyUp))
    if (onRemove != null) __obj.updateDynamic("onRemove")(js.Any.fromFunction2(onRemove))
    if (rightElement != null) __obj.updateDynamic("rightElement")(rightElement.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (tagProps != null) __obj.updateDynamic("tagProps")(tagProps.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ITagInputProps
}


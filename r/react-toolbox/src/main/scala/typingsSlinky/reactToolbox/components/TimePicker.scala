package typingsSlinky.reactToolbox.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactToolbox.libTimePickerMod.default
import typingsSlinky.reactToolbox.libTimePickerTimePickerMod.TimePickerProps
import typingsSlinky.reactToolbox.libTimePickerTimePickerMod.TimePickerTheme
import typingsSlinky.reactToolbox.reactToolboxStrings.`24hr`
import typingsSlinky.reactToolbox.reactToolboxStrings.ampm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TimePicker
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-toolbox/lib/time_picker", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: label */
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    cancelLabel: String = null,
    error: String = null,
    format: `24hr` | ampm = null,
    icon: TagMod[Any] = null,
    inputClassName: String = null,
    okLabel: String = null,
    onChange: js.Function = null,
    onClick: js.Function = null,
    onDismiss: js.Function = null,
    onEscKeyDown: js.Function = null,
    onKeyPress: js.Function = null,
    onOverlayClick: js.Function = null,
    readonly: js.UndefOr[Boolean] = js.undefined,
    theme: TimePickerTheme = null,
    value: js.Date = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (cancelLabel != null) __obj.updateDynamic("cancelLabel")(cancelLabel.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (inputClassName != null) __obj.updateDynamic("inputClassName")(inputClassName.asInstanceOf[js.Any])
    if (okLabel != null) __obj.updateDynamic("okLabel")(okLabel.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(onDismiss.asInstanceOf[js.Any])
    if (onEscKeyDown != null) __obj.updateDynamic("onEscKeyDown")(onEscKeyDown.asInstanceOf[js.Any])
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(onKeyPress.asInstanceOf[js.Any])
    if (onOverlayClick != null) __obj.updateDynamic("onOverlayClick")(onOverlayClick.asInstanceOf[js.Any])
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactToolbox.libTimePickerMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = TimePickerProps
}


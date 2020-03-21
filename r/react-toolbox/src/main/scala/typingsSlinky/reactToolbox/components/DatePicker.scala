package typingsSlinky.reactToolbox.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactToolbox.libDatePickerDatePickerMod.DatePickerLocale
import typingsSlinky.reactToolbox.libDatePickerDatePickerMod.DatePickerProps
import typingsSlinky.reactToolbox.libDatePickerDatePickerMod.DatePickerTheme
import typingsSlinky.reactToolbox.libDatePickerMod.default
import typingsSlinky.reactToolbox.reactToolboxStrings.`zh-cn`
import typingsSlinky.reactToolbox.reactToolboxStrings.`zh-hk`
import typingsSlinky.reactToolbox.reactToolboxStrings.`zh-tw`
import typingsSlinky.reactToolbox.reactToolboxStrings.af
import typingsSlinky.reactToolbox.reactToolboxStrings.ar
import typingsSlinky.reactToolbox.reactToolboxStrings.be
import typingsSlinky.reactToolbox.reactToolboxStrings.bg
import typingsSlinky.reactToolbox.reactToolboxStrings.bn
import typingsSlinky.reactToolbox.reactToolboxStrings.bo
import typingsSlinky.reactToolbox.reactToolboxStrings.br
import typingsSlinky.reactToolbox.reactToolboxStrings.bs
import typingsSlinky.reactToolbox.reactToolboxStrings.ca
import typingsSlinky.reactToolbox.reactToolboxStrings.de
import typingsSlinky.reactToolbox.reactToolboxStrings.en
import typingsSlinky.reactToolbox.reactToolboxStrings.es
import typingsSlinky.reactToolbox.reactToolboxStrings.eu
import typingsSlinky.reactToolbox.reactToolboxStrings.fr
import typingsSlinky.reactToolbox.reactToolboxStrings.gl
import typingsSlinky.reactToolbox.reactToolboxStrings.it
import typingsSlinky.reactToolbox.reactToolboxStrings.no
import typingsSlinky.reactToolbox.reactToolboxStrings.pt
import typingsSlinky.reactToolbox.reactToolboxStrings.ru
import typingsSlinky.reactToolbox.reactToolboxStrings.ua
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DatePicker
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-toolbox/lib/date_picker", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, label, name, required, style */
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    autoOk: js.UndefOr[Boolean] = js.undefined,
    cancelLabel: String = null,
    disabledDates: js.Array[js.Date] = null,
    enabledDates: js.Array[js.Date] = null,
    error: String = null,
    icon: TagMod[Any] = null,
    inputClassName: String = null,
    inputFormat: js.Function = null,
    locale: de | no | en | es | af | ar | be | bg | bn | bo | br | bs | ca | gl | eu | pt | it | fr | ru | ua | `zh-cn` | `zh-hk` | `zh-tw` | DatePickerLocale = null,
    maxDate: js.Date = null,
    minDate: js.Date = null,
    okLabel: String = null,
    onChange: js.Function = null,
    onClick: js.Function = null,
    onContextMenu: js.Function = null,
    onDismiss: js.Function = null,
    onDoubleClick: js.Function = null,
    onDrag: js.Function = null,
    onDragEnd: js.Function = null,
    onDragEnter: js.Function = null,
    onDragExit: js.Function = null,
    onDragLeave: js.Function = null,
    onDragOver: js.Function = null,
    onDragStart: js.Function = null,
    onDrop: js.Function = null,
    onEscKeyDown: js.Function = null,
    onKeyPress: js.Function = null,
    onMouseDown: js.Function = null,
    onMouseEnter: js.Function = null,
    onMouseLeave: js.Function = null,
    onMouseMove: js.Function = null,
    onMouseOut: js.Function = null,
    onMouseOver: js.Function = null,
    onMouseUp: js.Function = null,
    onOverlayClick: js.Function = null,
    onTouchCancel: js.Function = null,
    onTouchEnd: js.Function = null,
    onTouchMove: js.Function = null,
    onTouchStart: js.Function = null,
    readonly: js.UndefOr[Boolean] = js.undefined,
    sundayFirstDayOfWeek: js.UndefOr[Boolean] = js.undefined,
    theme: DatePickerTheme = null,
    value: js.Date | String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (!js.isUndefined(autoOk)) __obj.updateDynamic("autoOk")(autoOk.asInstanceOf[js.Any])
    if (cancelLabel != null) __obj.updateDynamic("cancelLabel")(cancelLabel.asInstanceOf[js.Any])
    if (disabledDates != null) __obj.updateDynamic("disabledDates")(disabledDates.asInstanceOf[js.Any])
    if (enabledDates != null) __obj.updateDynamic("enabledDates")(enabledDates.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (inputClassName != null) __obj.updateDynamic("inputClassName")(inputClassName.asInstanceOf[js.Any])
    if (inputFormat != null) __obj.updateDynamic("inputFormat")(inputFormat.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (okLabel != null) __obj.updateDynamic("okLabel")(okLabel.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(onContextMenu.asInstanceOf[js.Any])
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(onDismiss.asInstanceOf[js.Any])
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(onDoubleClick.asInstanceOf[js.Any])
    if (onDrag != null) __obj.updateDynamic("onDrag")(onDrag.asInstanceOf[js.Any])
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(onDragEnd.asInstanceOf[js.Any])
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(onDragEnter.asInstanceOf[js.Any])
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(onDragExit.asInstanceOf[js.Any])
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(onDragLeave.asInstanceOf[js.Any])
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(onDragOver.asInstanceOf[js.Any])
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(onDragStart.asInstanceOf[js.Any])
    if (onDrop != null) __obj.updateDynamic("onDrop")(onDrop.asInstanceOf[js.Any])
    if (onEscKeyDown != null) __obj.updateDynamic("onEscKeyDown")(onEscKeyDown.asInstanceOf[js.Any])
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(onKeyPress.asInstanceOf[js.Any])
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(onMouseDown.asInstanceOf[js.Any])
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter.asInstanceOf[js.Any])
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave.asInstanceOf[js.Any])
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(onMouseMove.asInstanceOf[js.Any])
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(onMouseOut.asInstanceOf[js.Any])
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(onMouseOver.asInstanceOf[js.Any])
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(onMouseUp.asInstanceOf[js.Any])
    if (onOverlayClick != null) __obj.updateDynamic("onOverlayClick")(onOverlayClick.asInstanceOf[js.Any])
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(onTouchCancel.asInstanceOf[js.Any])
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(onTouchEnd.asInstanceOf[js.Any])
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(onTouchMove.asInstanceOf[js.Any])
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart.asInstanceOf[js.Any])
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly.asInstanceOf[js.Any])
    if (!js.isUndefined(sundayFirstDayOfWeek)) __obj.updateDynamic("sundayFirstDayOfWeek")(sundayFirstDayOfWeek.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactToolbox.libDatePickerMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = DatePickerProps
}


package typingsSlinky.antdMobile.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.antdMobile.AnonDatePickerLocale
import typingsSlinky.antdMobile.antdMobileStrings.date
import typingsSlinky.antdMobile.antdMobileStrings.datetime
import typingsSlinky.antdMobile.antdMobileStrings.month
import typingsSlinky.antdMobile.antdMobileStrings.time
import typingsSlinky.antdMobile.antdMobileStrings.year
import typingsSlinky.antdMobile.datePickerViewMod.default
import typingsSlinky.antdMobile.datePickerViewPropsTypeMod.DatePickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DatePickerView
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("antd-mobile/lib/date-picker-view", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, disabled */
  def apply(
    dismissText: TagMod[Any] = null,
    extra: String = null,
    format: String | (js.Function1[/* value */ js.Date, String]) = null,
    locale: AnonDatePickerLocale = null,
    maxDate: js.Date = null,
    minDate: js.Date = null,
    minuteStep: Int | Double = null,
    mode: datetime | date | year | month | time = null,
    okText: TagMod[Any] = null,
    onChange: /* value */ js.Date => Unit = null,
    onDismiss: () => Unit = null,
    onScrollChange: (/* newValue */ js.Any, /* vals */ js.Any, /* index */ Double) => Unit = null,
    onValueChange: (/* vals */ js.Any, /* index */ Double) => Unit = null,
    pickerPrefixCls: String = null,
    prefixCls: String = null,
    title: TagMod[Any] = null,
    value: js.Date = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (dismissText != null) __obj.updateDynamic("dismissText")(dismissText.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (minuteStep != null) __obj.updateDynamic("minuteStep")(minuteStep.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (okText != null) __obj.updateDynamic("okText")(okText.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction0(onDismiss))
    if (onScrollChange != null) __obj.updateDynamic("onScrollChange")(js.Any.fromFunction3(onScrollChange))
    if (onValueChange != null) __obj.updateDynamic("onValueChange")(js.Any.fromFunction2(onValueChange))
    if (pickerPrefixCls != null) __obj.updateDynamic("pickerPrefixCls")(pickerPrefixCls.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.antdMobile.datePickerViewMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = DatePickerProps
}


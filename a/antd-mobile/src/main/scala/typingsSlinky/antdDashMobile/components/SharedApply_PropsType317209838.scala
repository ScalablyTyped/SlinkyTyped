package typingsSlinky.antdDashMobile.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.antdDashMobile.Anon_DatePickerLocale
import typingsSlinky.antdDashMobile.antdDashMobileStrings.date
import typingsSlinky.antdDashMobile.antdDashMobileStrings.datetime
import typingsSlinky.antdDashMobile.antdDashMobileStrings.month
import typingsSlinky.antdDashMobile.antdDashMobileStrings.time
import typingsSlinky.antdDashMobile.antdDashMobileStrings.year
import typingsSlinky.antdDashMobile.libDateDashPickerMod.PropsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_PropsType317209838[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  /* The following DOM/SVG props were specified: className, disabled, onChange */
  def apply(
    dismissText: TagMod[Any] = null,
    extra: String = null,
    format: String | (js.Function1[/* value */ js.Date, String]) = null,
    locale: Anon_DatePickerLocale = null,
    maxDate: js.Date = null,
    minDate: js.Date = null,
    minuteStep: Int | Double = null,
    mode: datetime | date | year | month | time = null,
    okText: TagMod[Any] = null,
    onDismiss: () => Unit = null,
    onOk: /* x */ js.Any => Unit = null,
    onValueChange: (/* vals */ js.Any, /* index */ Double) => Unit = null,
    onVisibleChange: /* visible */ Boolean => Unit = null,
    pickerPrefixCls: String = null,
    popupPrefixCls: String = null,
    prefixCls: String = null,
    title: TagMod[Any] = null,
    use12Hours: js.UndefOr[Boolean] = js.undefined,
    value: js.Date = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
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
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction0(onDismiss))
    if (onOk != null) __obj.updateDynamic("onOk")(js.Any.fromFunction1(onOk))
    if (onValueChange != null) __obj.updateDynamic("onValueChange")(js.Any.fromFunction2(onValueChange))
    if (onVisibleChange != null) __obj.updateDynamic("onVisibleChange")(js.Any.fromFunction1(onVisibleChange))
    if (pickerPrefixCls != null) __obj.updateDynamic("pickerPrefixCls")(pickerPrefixCls.asInstanceOf[js.Any])
    if (popupPrefixCls != null) __obj.updateDynamic("popupPrefixCls")(popupPrefixCls.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(use12Hours)) __obj.updateDynamic("use12Hours")(use12Hours.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, ComponentRef] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, ComponentRef](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = PropsType
}


package typingsSlinky.rmcCalendar.timePickerMod

import typingsSlinky.rmcCalendar.dataTypesMod.Models.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropsType extends js.Object {
  var clientHeight: js.UndefOr[Double] = js.undefined
  var defaultValue: js.UndefOr[js.Date] = js.undefined
  var locale: Locale
  var maxDate: js.UndefOr[js.Date] = js.undefined
  var minDate: js.UndefOr[js.Date] = js.undefined
  var onValueChange: js.UndefOr[js.Function1[/* time */ js.Date, Unit]] = js.undefined
  var pickerPrefixCls: js.UndefOr[String] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[js.Date] = js.undefined
}

object PropsType {
  @scala.inline
  def apply(
    locale: Locale,
    clientHeight: Int | Double = null,
    defaultValue: js.Date = null,
    maxDate: js.Date = null,
    minDate: js.Date = null,
    onValueChange: /* time */ js.Date => Unit = null,
    pickerPrefixCls: String = null,
    prefixCls: String = null,
    title: String = null,
    value: js.Date = null
  ): PropsType = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    if (clientHeight != null) __obj.updateDynamic("clientHeight")(clientHeight.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (onValueChange != null) __obj.updateDynamic("onValueChange")(js.Any.fromFunction1(onValueChange))
    if (pickerPrefixCls != null) __obj.updateDynamic("pickerPrefixCls")(pickerPrefixCls.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsType]
  }
}


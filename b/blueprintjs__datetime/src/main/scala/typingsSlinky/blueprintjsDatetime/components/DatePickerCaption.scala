package typingsSlinky.blueprintjsDatetime.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.blueprintjsDatetime.datePickerCaptionMod.IDatePickerCaptionProps
import typingsSlinky.reactDayPicker.commonMod.ClassNames
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DatePickerCaption
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.blueprintjsDatetime.datePickerCaptionMod.DatePickerCaption] {
  @JSImport("@blueprintjs/datetime/lib/esm/datePickerCaption", "DatePickerCaption")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    classNames: ClassNames,
    date: js.Date,
    locale: String,
    localeUtils: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LocaleUtils */ js.Any,
    maxDate: js.Date,
    minDate: js.Date,
    months: js.Array[String] = null,
    onClick: SyntheticMouseEvent[HTMLElement] => Unit = null,
    onDateChange: /* date */ js.Date => Unit = null,
    onMonthChange: /* month */ Double => Unit = null,
    onYearChange: /* year */ Double => Unit = null,
    reverseMonthAndYearMenus: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.blueprintjsDatetime.datePickerCaptionMod.DatePickerCaption] = {
    val __obj = js.Dynamic.literal(classNames = classNames.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], localeUtils = localeUtils.asInstanceOf[js.Any], maxDate = maxDate.asInstanceOf[js.Any], minDate = minDate.asInstanceOf[js.Any])
    if (months != null) __obj.updateDynamic("months")(months.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onDateChange != null) __obj.updateDynamic("onDateChange")(js.Any.fromFunction1(onDateChange))
    if (onMonthChange != null) __obj.updateDynamic("onMonthChange")(js.Any.fromFunction1(onMonthChange))
    if (onYearChange != null) __obj.updateDynamic("onYearChange")(js.Any.fromFunction1(onYearChange))
    if (!js.isUndefined(reverseMonthAndYearMenus)) __obj.updateDynamic("reverseMonthAndYearMenus")(reverseMonthAndYearMenus.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IDatePickerCaptionProps
}


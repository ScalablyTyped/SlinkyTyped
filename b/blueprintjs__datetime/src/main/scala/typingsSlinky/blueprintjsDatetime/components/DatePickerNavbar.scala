package typingsSlinky.blueprintjsDatetime.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.blueprintjsDatetime.datePickerNavbarMod.IDatePickerNavbarProps
import typingsSlinky.reactDayPicker.AnonNextMonth
import typingsSlinky.reactDayPicker.commonMod.ClassNames
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DatePickerNavbar
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.blueprintjsDatetime.datePickerNavbarMod.DatePickerNavbar] {
  @JSImport("@blueprintjs/datetime/lib/esm/datePickerNavbar", "DatePickerNavbar")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: dir */
  def apply(
    className: String,
    classNames: ClassNames,
    labels: AnonNextMonth,
    locale: String,
    localeUtils: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LocaleUtils */ js.Any,
    maxDate: js.Date,
    minDate: js.Date,
    month: js.Date,
    nextMonth: js.Date,
    onNextClick: js.UndefOr[js.Function0[Unit]] => Unit,
    onPreviousClick: js.UndefOr[js.Function0[Unit]] => Unit,
    previousMonth: js.Date,
    showNextButton: Boolean,
    showPreviousButton: Boolean,
    hideLeftNavButton: js.UndefOr[Boolean] = js.undefined,
    hideRightNavButton: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.blueprintjsDatetime.datePickerNavbarMod.DatePickerNavbar] = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], classNames = classNames.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], localeUtils = localeUtils.asInstanceOf[js.Any], maxDate = maxDate.asInstanceOf[js.Any], minDate = minDate.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], nextMonth = nextMonth.asInstanceOf[js.Any], onNextClick = js.Any.fromFunction1(onNextClick), onPreviousClick = js.Any.fromFunction1(onPreviousClick), previousMonth = previousMonth.asInstanceOf[js.Any], showNextButton = showNextButton.asInstanceOf[js.Any], showPreviousButton = showPreviousButton.asInstanceOf[js.Any])
    if (!js.isUndefined(hideLeftNavButton)) __obj.updateDynamic("hideLeftNavButton")(hideLeftNavButton.asInstanceOf[js.Any])
    if (!js.isUndefined(hideRightNavButton)) __obj.updateDynamic("hideRightNavButton")(hideRightNavButton.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IDatePickerNavbarProps
}


package typingsSlinky.blueprintjsDatetime.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.blueprintjsDatetime.datePickerNavbarMod.IDatePickerNavbarProps
import typingsSlinky.reactDayPicker.anon.NextMonth
import typingsSlinky.reactDayPicker.classNamesMod.ClassNames
import typingsSlinky.reactDayPicker.localeUtilsMod.LocaleUtils
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DatePickerNavbar {
  @JSImport("@blueprintjs/datetime/lib/esm/datePickerNavbar", "DatePickerNavbar")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.blueprintjsDatetime.datePickerNavbarMod.DatePickerNavbar] {
    @scala.inline
    def dir(value: String): this.type = set("dir", value.asInstanceOf[js.Any])
    @scala.inline
    def hideLeftNavButton(value: Boolean): this.type = set("hideLeftNavButton", value.asInstanceOf[js.Any])
    @scala.inline
    def hideRightNavButton(value: Boolean): this.type = set("hideRightNavButton", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IDatePickerNavbarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    className: String,
    classNames: ClassNames,
    labels: NextMonth,
    locale: String,
    localeUtils: LocaleUtils,
    maxDate: js.Date,
    minDate: js.Date,
    month: js.Date,
    nextMonth: js.Date,
    onNextClick: js.UndefOr[js.Function0[Unit]] => Unit,
    onPreviousClick: js.UndefOr[js.Function0[Unit]] => Unit,
    previousMonth: js.Date,
    showNextButton: Boolean,
    showPreviousButton: Boolean
  ): Builder = {
    val __props = js.Dynamic.literal(className = className.asInstanceOf[js.Any], classNames = classNames.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], localeUtils = localeUtils.asInstanceOf[js.Any], maxDate = maxDate.asInstanceOf[js.Any], minDate = minDate.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], nextMonth = nextMonth.asInstanceOf[js.Any], onNextClick = js.Any.fromFunction1(onNextClick), onPreviousClick = js.Any.fromFunction1(onPreviousClick), previousMonth = previousMonth.asInstanceOf[js.Any], showNextButton = showNextButton.asInstanceOf[js.Any], showPreviousButton = showPreviousButton.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IDatePickerNavbarProps]))
  }
}


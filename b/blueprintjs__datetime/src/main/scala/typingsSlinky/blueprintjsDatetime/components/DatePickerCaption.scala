package typingsSlinky.blueprintjsDatetime.components

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.blueprintjsDatetime.datePickerCaptionMod.IDatePickerCaptionProps
import typingsSlinky.reactDayPicker.commonMod.ClassNames
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DatePickerCaption {
  @JSImport("@blueprintjs/datetime/lib/esm/datePickerCaption", "DatePickerCaption")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.blueprintjsDatetime.datePickerCaptionMod.DatePickerCaption] {
    @scala.inline
    def months(value: js.Array[String]): this.type = set("months", value.asInstanceOf[js.Any])
    @scala.inline
    def onClick(value: SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def onDateChange(value: /* date */ js.Date => Unit): this.type = set("onDateChange", js.Any.fromFunction1(value))
    @scala.inline
    def onMonthChange(value: /* month */ Double => Unit): this.type = set("onMonthChange", js.Any.fromFunction1(value))
    @scala.inline
    def onYearChange(value: /* year */ Double => Unit): this.type = set("onYearChange", js.Any.fromFunction1(value))
    @scala.inline
    def reverseMonthAndYearMenus(value: Boolean): this.type = set("reverseMonthAndYearMenus", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IDatePickerCaptionProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    classNames: ClassNames,
    date: js.Date,
    locale: String,
    localeUtils: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LocaleUtils */ js.Any,
    maxDate: js.Date,
    minDate: js.Date
  ): Builder = {
    val __props = js.Dynamic.literal(classNames = classNames.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], localeUtils = localeUtils.asInstanceOf[js.Any], maxDate = maxDate.asInstanceOf[js.Any], minDate = minDate.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IDatePickerCaptionProps]))
  }
}


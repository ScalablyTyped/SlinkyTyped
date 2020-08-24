package typingsSlinky.reactInputCalendar.components

import org.scalajs.dom.raw.Event
import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactInputCalendar.reactInputCalendar.ReactInputCalendarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactInputCalendar {
  @JSGlobal("reactInputCalendar.ReactInputCalendar")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[
          tag.type, 
          typingsSlinky.reactInputCalendar.global.reactInputCalendar.ReactInputCalendar
        ] {
    @scala.inline
    def closeOnSelect(value: Boolean): this.type = set("closeOnSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def computableFormat(value: String): this.type = set("computableFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def dateDate(value: js.Date): this.type = set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def date(value: String | js.Date): this.type = set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def format(value: String): this.type = set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def inputFieldClass(value: String): this.type = set("inputFieldClass", value.asInstanceOf[js.Any])
    @scala.inline
    def inputFieldId(value: String): this.type = set("inputFieldId", value.asInstanceOf[js.Any])
    @scala.inline
    def maxDateDate(value: js.Date): this.type = set("maxDate", value.asInstanceOf[js.Any])
    @scala.inline
    def maxDate(value: String | js.Date): this.type = set("maxDate", value.asInstanceOf[js.Any])
    @scala.inline
    def minDateDate(value: js.Date): this.type = set("minDate", value.asInstanceOf[js.Any])
    @scala.inline
    def minDate(value: String | js.Date): this.type = set("minDate", value.asInstanceOf[js.Any])
    @scala.inline
    def minView(value: Double): this.type = set("minView", value.asInstanceOf[js.Any])
    @scala.inline
    def onBlur(
      value: (/* event */ SyntheticEvent[Event, ReactComponentClass[ReactInputCalendarProps]], /* computableDate */ String) => Unit
    ): this.type = set("onBlur", js.Any.fromFunction2(value))
    @scala.inline
    def onChange(value: /* computableDate */ String => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def onFocus(value: /* event */ SyntheticEvent[Event, ReactComponentClass[ReactInputCalendarProps]] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    @scala.inline
    def openOnInputFocus(value: Boolean): this.type = set("openOnInputFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ReactInputCalendarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ReactInputCalendar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}


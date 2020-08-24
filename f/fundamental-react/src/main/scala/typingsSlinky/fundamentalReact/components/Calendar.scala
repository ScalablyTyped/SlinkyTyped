package typingsSlinky.fundamentalReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.fundamentalReact.anon.NextMonth
import typingsSlinky.fundamentalReact.calendarMod.CalendarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Calendar {
  @JSImport("fundamental-react", "Calendar")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.fundamentalReact.mod.Calendar] {
    @scala.inline
    def blockedDatesVarargs(value: js.Date*): this.type = set("blockedDates", js.Array(value :_*))
    @scala.inline
    def blockedDates(value: js.Array[js.Date]): this.type = set("blockedDates", value.asInstanceOf[js.Any])
    @scala.inline
    def disableAfterDate(value: js.Date): this.type = set("disableAfterDate", value.asInstanceOf[js.Any])
    @scala.inline
    def disableBeforeDate(value: js.Date): this.type = set("disableBeforeDate", value.asInstanceOf[js.Any])
    @scala.inline
    def disableFutureDates(value: Boolean): this.type = set("disableFutureDates", value.asInstanceOf[js.Any])
    @scala.inline
    def disablePastDates(value: Boolean): this.type = set("disablePastDates", value.asInstanceOf[js.Any])
    @scala.inline
    def disableStyles(value: Boolean): this.type = set("disableStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def disableWeekdayVarargs(value: String*): this.type = set("disableWeekday", js.Array(value :_*))
    @scala.inline
    def disableWeekday(value: js.Array[String]): this.type = set("disableWeekday", value.asInstanceOf[js.Any])
    @scala.inline
    def disableWeekends(value: Boolean): this.type = set("disableWeekends", value.asInstanceOf[js.Any])
    @scala.inline
    def disabledDatesVarargs(value: js.Date*): this.type = set("disabledDates", js.Array(value :_*))
    @scala.inline
    def disabledDates(value: js.Array[js.Date]): this.type = set("disabledDates", value.asInstanceOf[js.Any])
    @scala.inline
    def localizedText(value: NextMonth): this.type = set("localizedText", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(value: /* date */ js.Date => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
  }
  
  def withProps(p: CalendarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Calendar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}


package typingsSlinky.atlaskitCalendar.components

import org.scalajs.dom.raw.HTMLDivElement
import slinky.web.SyntheticFocusEvent
import slinky.web.html.div.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.atlaskitCalendar.mod.ChangeEvent
import typingsSlinky.atlaskitCalendar.mod.Props
import typingsSlinky.atlaskitCalendar.mod.SelectEvent
import typingsSlinky.atlaskitCalendar.mod.default
import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Calendar {
  @JSImport("@atlaskit/calendar", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def day(value: Double): this.type = set("day", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultDay(value: Double): this.type = set("defaultDay", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultDisabledVarargs(value: String*): this.type = set("defaultDisabled", js.Array(value :_*))
    @scala.inline
    def defaultDisabled(value: js.Array[String]): this.type = set("defaultDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultMonth(value: Double): this.type = set("defaultMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultPreviouslySelectedVarargs(value: String*): this.type = set("defaultPreviouslySelected", js.Array(value :_*))
    @scala.inline
    def defaultPreviouslySelected(value: js.Array[String]): this.type = set("defaultPreviouslySelected", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultSelectedVarargs(value: String*): this.type = set("defaultSelected", js.Array(value :_*))
    @scala.inline
    def defaultSelected(value: js.Array[String]): this.type = set("defaultSelected", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultYear(value: Double): this.type = set("defaultYear", value.asInstanceOf[js.Any])
    @scala.inline
    def disabledVarargs(value: String*): this.type = set("disabled", js.Array(value :_*))
    @scala.inline
    def disabled(value: js.Array[String]): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def innerProps(value: HTMLAttributes[HTMLDivElement]): this.type = set("innerProps", value.asInstanceOf[js.Any])
    @scala.inline
    def month(value: Double): this.type = set("month", value.asInstanceOf[js.Any])
    @scala.inline
    def onBlur(value: /* e */ js.UndefOr[SyntheticFocusEvent[HTMLDivElement]] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    @scala.inline
    def onChange(value: /* e */ ChangeEvent => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def onFocus(value: /* e */ js.UndefOr[SyntheticFocusEvent[HTMLDivElement]] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    @scala.inline
    def onSelect(value: /* e */ SelectEvent => Unit): this.type = set("onSelect", js.Any.fromFunction1(value))
    @scala.inline
    def previouslySelectedVarargs(value: String*): this.type = set("previouslySelected", js.Array(value :_*))
    @scala.inline
    def previouslySelected(value: js.Array[String]): this.type = set("previouslySelected", value.asInstanceOf[js.Any])
    @scala.inline
    def selectedVarargs(value: String*): this.type = set("selected", js.Array(value :_*))
    @scala.inline
    def selected(value: js.Array[String]): this.type = set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def today(value: String): this.type = set("today", value.asInstanceOf[js.Any])
    @scala.inline
    def year(value: Double): this.type = set("year", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Calendar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}


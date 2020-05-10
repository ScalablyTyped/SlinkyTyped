package typingsSlinky.reactWidgets.components

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactWidgets.dateTimePickerMod.DateTimePickerMessages
import typingsSlinky.reactWidgets.dateTimePickerMod.DateTimePickerProps
import typingsSlinky.reactWidgets.dateTimePickerMod.Open
import typingsSlinky.reactWidgets.mod.DateTimePicker.^
import typingsSlinky.reactWidgets.reactWidgetsStrings.century
import typingsSlinky.reactWidgets.reactWidgetsStrings.decade
import typingsSlinky.reactWidgets.reactWidgetsStrings.month
import typingsSlinky.reactWidgets.reactWidgetsStrings.year
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DateTimePicker {
  @JSImport("react-widgets", "DateTimePicker")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, ^] {
    @scala.inline
    def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def calendar(value: Boolean): this.type = set("calendar", value.asInstanceOf[js.Any])
    @scala.inline
    def containerClassName(value: String): this.type = set("containerClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def culture(value: String): this.type = set("culture", value.asInstanceOf[js.Any])
    @scala.inline
    def currentDate(value: js.Date): this.type = set("currentDate", value.asInstanceOf[js.Any])
    @scala.inline
    def date(value: Boolean): this.type = set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def dateIcon(value: ReactElement): this.type = set("dateIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultCurrentDate(value: js.Date): this.type = set("defaultCurrentDate", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultOpen(value: Open): this.type = set("defaultOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultValue(value: js.Date): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean | js.Array[_]): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def dropUp(value: Boolean): this.type = set("dropUp", value.asInstanceOf[js.Any])
    @scala.inline
    def duration(value: Double): this.type = set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def editFormat(value: String): this.type = set("editFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def finalView(value: month | year | decade | century): this.type = set("finalView", value.asInstanceOf[js.Any])
    @scala.inline
    def format(value: String): this.type = set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def initialView(value: month | year | decade | century): this.type = set("initialView", value.asInstanceOf[js.Any])
    @scala.inline
    def inputProps(value: js.Object): this.type = set("inputProps", value.asInstanceOf[js.Any])
    @scala.inline
    def isRtl(value: Boolean): this.type = set("isRtl", value.asInstanceOf[js.Any])
    @scala.inline
    def max(value: js.Date): this.type = set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def messages(value: DateTimePickerMessages): this.type = set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def min(value: js.Date): this.type = set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def onBlur(value: () => Unit): this.type = set("onBlur", js.Any.fromFunction0(value))
    @scala.inline
    def onChange(value: (/* date */ js.UndefOr[js.Date], /* dateStr */ js.UndefOr[String]) => Unit): this.type = set("onChange", js.Any.fromFunction2(value))
    @scala.inline
    def onCurrentDateChange(value: /* date */ js.UndefOr[js.Date] => Unit): this.type = set("onCurrentDateChange", js.Any.fromFunction1(value))
    @scala.inline
    def onFocus(value: () => Unit): this.type = set("onFocus", js.Any.fromFunction0(value))
    @scala.inline
    def onKeyDown(value: /* event */ SyntheticKeyboardEvent[_] => Unit): this.type = set("onKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def onKeyPress(value: /* event */ SyntheticKeyboardEvent[_] => Unit): this.type = set("onKeyPress", js.Any.fromFunction1(value))
    @scala.inline
    def onSelect(value: /* date */ js.UndefOr[js.Date] => Unit): this.type = set("onSelect", js.Any.fromFunction1(value))
    @scala.inline
    def onToggle(value: /* isOpen */ Open => Unit): this.type = set("onToggle", js.Any.fromFunction1(value))
    @scala.inline
    def open(value: Open): this.type = set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def parseFunction1(value: /* str */ String => js.Date): this.type = set("parse", js.Any.fromFunction1(value))
    @scala.inline
    def parse(value: (js.Function1[/* str */ String, js.Date]) | js.Array[String] | String): this.type = set("parse", value.asInstanceOf[js.Any])
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def popupTransitionFunctionComponent(value: ReactComponentClass[_]): this.type = set("popupTransition", value.asInstanceOf[js.Any])
    @scala.inline
    def popupTransitionComponentClass(value: ReactComponentClass[_]): this.type = set("popupTransition", value.asInstanceOf[js.Any])
    @scala.inline
    def popupTransition(value: ReactComponentClass[_] | String): this.type = set("popupTransition", value.asInstanceOf[js.Any])
    @scala.inline
    def readOnly(value: Boolean | js.Array[_]): this.type = set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def step(value: Double | Boolean): this.type = set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def time(value: Boolean): this.type = set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def timeComponentFunctionComponent(value: ReactComponentClass[_]): this.type = set("timeComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def timeComponentComponentClass(value: ReactComponentClass[_]): this.type = set("timeComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def timeComponent(value: ReactComponentClass[_] | String): this.type = set("timeComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def timeFormat(value: String): this.type = set("timeFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def timeIcon(value: ReactElement): this.type = set("timeIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: js.Date): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DateTimePickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: DateTimePicker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}


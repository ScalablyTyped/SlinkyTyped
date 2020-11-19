package typingsSlinky.reactWidgets.components

import org.scalajs.dom.raw.KeyboardEvent
import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ReactType
import typingsSlinky.reactWidgets.calendarMod.CalendarMessages
import typingsSlinky.reactWidgets.calendarMod.CalendarProps
import typingsSlinky.reactWidgets.calendarMod.CalendarView
import typingsSlinky.reactWidgets.mod.Calendar.^
import typingsSlinky.reactWidgets.reactWidgetsStrings.century
import typingsSlinky.reactWidgets.reactWidgetsStrings.decade
import typingsSlinky.reactWidgets.reactWidgetsStrings.month
import typingsSlinky.reactWidgets.reactWidgetsStrings.year
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Calendar {
  
  @JSImport("react-widgets", "Calendar")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, ^] {
    
    @scala.inline
    def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def centuryFormatFunction1(value: /* day */ js.Date => String): this.type = set("centuryFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def centuryFormat(value: String | (js.Function1[/* day */ js.Date, String])): this.type = set("centuryFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def culture(value: String): this.type = set("culture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def currentDate(value: js.Date): this.type = set("currentDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dateFormatFunction1(value: /* day */ js.Date => String): this.type = set("dateFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def dateFormat(value: String | (js.Function1[/* day */ js.Date, String])): this.type = set("dateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dayComponentFunctionComponent(value: ReactComponentClass[_]): this.type = set("dayComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dayComponentComponentClass(value: ReactComponentClass[_]): this.type = set("dayComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dayComponent(value: ReactType[_]): this.type = set("dayComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dayFormatFunction1(value: /* day */ js.Date => String): this.type = set("dayFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def dayFormat(value: String | (js.Function1[/* day */ js.Date, String])): this.type = set("dayFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def decadeFormatFunction1(value: /* day */ js.Date => String): this.type = set("decadeFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def decadeFormat(value: String | (js.Function1[/* day */ js.Date, String])): this.type = set("decadeFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultValue(value: js.Date): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultView(value: CalendarView): this.type = set("defaultView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabledVarargs(value: js.Any*): this.type = set("disabled", js.Array(value :_*))
    
    @scala.inline
    def disabled(value: Boolean | js.Array[_]): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def finalView(value: month | year | decade | century): this.type = set("finalView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def footer(value: Boolean): this.type = set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def footerFormatFunction1(value: /* day */ js.Date => String): this.type = set("footerFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def footerFormat(value: String | (js.Function1[/* day */ js.Date, String])): this.type = set("footerFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def headerFormatFunction1(value: /* day */ js.Date => String): this.type = set("headerFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def headerFormat(value: String | (js.Function1[/* day */ js.Date, String])): this.type = set("headerFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def initialView(value: month | year | decade | century): this.type = set("initialView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isRtl(value: Boolean): this.type = set("isRtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def max(value: js.Date): this.type = set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def messages(value: CalendarMessages): this.type = set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def min(value: js.Date): this.type = set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def monthFormatFunction1(value: /* day */ js.Date => String): this.type = set("monthFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def monthFormat(value: String | (js.Function1[/* day */ js.Date, String])): this.type = set("monthFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: /* date */ js.UndefOr[js.Date] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCurrentDateChange(value: /* date */ js.UndefOr[js.Date] => Unit): this.type = set("onCurrentDateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyDown(value: /* event */ KeyboardEvent => Unit): this.type = set("onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def onNavigate(value: (/* date */ js.Date, /* direction */ String, /* view */ String) => Unit): this.type = set("onNavigate", js.Any.fromFunction3(value))
    
    @scala.inline
    def onViewChange(value: () => Unit): this.type = set("onViewChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def readOnlyVarargs(value: js.Any*): this.type = set("readOnly", js.Array(value :_*))
    
    @scala.inline
    def readOnly(value: Boolean | js.Array[_]): this.type = set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: js.Date): this.type = set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def view(value: CalendarView): this.type = set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def viewsVarargs(value: CalendarView*): this.type = set("views", js.Array(value :_*))
    
    @scala.inline
    def views(value: js.Array[CalendarView]): this.type = set("views", value.asInstanceOf[js.Any])
    
    @scala.inline
    def yearFormatFunction1(value: /* day */ js.Date => String): this.type = set("yearFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def yearFormat(value: String | (js.Function1[/* day */ js.Date, String])): this.type = set("yearFormat", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CalendarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Calendar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

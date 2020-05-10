package typingsSlinky.reactCalendarHeatmap.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactCalendarHeatmap.mod.Props
import typingsSlinky.reactCalendarHeatmap.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactCalendarHeatmap {
  @JSImport("react-calendar-heatmap", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def classForValue(value: /* value */ js.Any => _): this.type = set("classForValue", js.Any.fromFunction1(value))
    @scala.inline
    def endDateDate(value: js.Date): this.type = set("endDate", value.asInstanceOf[js.Any])
    @scala.inline
    def endDate(value: String | Double | js.Date): this.type = set("endDate", value.asInstanceOf[js.Any])
    @scala.inline
    def gutterSize(value: Double): this.type = set("gutterSize", value.asInstanceOf[js.Any])
    @scala.inline
    def horizontal(value: Boolean): this.type = set("horizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def monthLabels(value: js.Array[String]): this.type = set("monthLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def numDays(value: Double): this.type = set("numDays", value.asInstanceOf[js.Any])
    @scala.inline
    def onClick(value: /* value */ js.Any => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseLeave(value: (/* e */ js.Any, /* value */ js.Any) => Unit): this.type = set("onMouseLeave", js.Any.fromFunction2(value))
    @scala.inline
    def onMouseOver(value: (/* e */ js.Any, /* value */ js.Any) => Unit): this.type = set("onMouseOver", js.Any.fromFunction2(value))
    @scala.inline
    def showMonthLabels(value: Boolean): this.type = set("showMonthLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def showOutOfRangeDays(value: Boolean): this.type = set("showOutOfRangeDays", value.asInstanceOf[js.Any])
    @scala.inline
    def showWeekdayLabels(value: Boolean): this.type = set("showWeekdayLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def startDateDate(value: js.Date): this.type = set("startDate", value.asInstanceOf[js.Any])
    @scala.inline
    def startDate(value: String | Double | js.Date): this.type = set("startDate", value.asInstanceOf[js.Any])
    @scala.inline
    def titleForValue(value: /* value */ js.Any => _): this.type = set("titleForValue", js.Any.fromFunction1(value))
    @scala.inline
    def tooltipDataAttrs(value: js.Object): this.type = set("tooltipDataAttrs", value.asInstanceOf[js.Any])
    @scala.inline
    def transformDayElement(value: (/* rect */ js.Any, /* value */ js.Any, /* index */ Double) => _): this.type = set("transformDayElement", js.Any.fromFunction3(value))
    @scala.inline
    def weekdayLabels(value: js.Array[String]): this.type = set("weekdayLabels", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(values: js.Array[_]): Builder = {
    val __props = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
}


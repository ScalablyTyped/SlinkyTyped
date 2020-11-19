package typingsSlinky.nivoCalendar.components

import org.scalajs.dom.raw.SVGRectElement
import slinky.core.ReactComponentClass
import slinky.web.SyntheticMouseEvent
import slinky.web.svg.rect.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.nivoCalendar.mod.CalendarDayData
import typingsSlinky.nivoCalendar.mod.CalendarDirection
import typingsSlinky.nivoCalendar.mod.CalendarLegend
import typingsSlinky.nivoCalendar.nivoCalendarStrings.auto
import typingsSlinky.nivoCore.mod.Box
import typingsSlinky.nivoCore.mod.BoxAlign
import typingsSlinky.nivoCore.mod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_CalendarSvgPropsDimensions_1359497114[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
  @scala.inline
  def align(value: BoxAlign): this.type = set("align", value.asInstanceOf[js.Any])
  
  @scala.inline
  def colorsVarargs(value: String*): this.type = set("colors", js.Array(value :_*))
  
  @scala.inline
  def colors(value: js.Array[String]): this.type = set("colors", value.asInstanceOf[js.Any])
  
  @scala.inline
  def dayBorderColor(value: String): this.type = set("dayBorderColor", value.asInstanceOf[js.Any])
  
  @scala.inline
  def dayBorderWidth(value: Double): this.type = set("dayBorderWidth", value.asInstanceOf[js.Any])
  
  @scala.inline
  def daySpacing(value: Double): this.type = set("daySpacing", value.asInstanceOf[js.Any])
  
  @scala.inline
  def direction(value: CalendarDirection): this.type = set("direction", value.asInstanceOf[js.Any])
  
  @scala.inline
  def emptyColor(value: String): this.type = set("emptyColor", value.asInstanceOf[js.Any])
  
  @scala.inline
  def isInteractive(value: Boolean): this.type = set("isInteractive", value.asInstanceOf[js.Any])
  
  @scala.inline
  def legendsVarargs(value: CalendarLegend*): this.type = set("legends", js.Array(value :_*))
  
  @scala.inline
  def legends(value: js.Array[CalendarLegend]): this.type = set("legends", value.asInstanceOf[js.Any])
  
  @scala.inline
  def margin(value: Box): this.type = set("margin", value.asInstanceOf[js.Any])
  
  @scala.inline
  def maxValue(value: auto | Double): this.type = set("maxValue", value.asInstanceOf[js.Any])
  
  @scala.inline
  def minValue(value: auto | Double): this.type = set("minValue", value.asInstanceOf[js.Any])
  
  @scala.inline
  def monthBorderColor(value: String): this.type = set("monthBorderColor", value.asInstanceOf[js.Any])
  
  @scala.inline
  def monthBorderWidth(value: Double): this.type = set("monthBorderWidth", value.asInstanceOf[js.Any])
  
  @scala.inline
  def monthLegend(value: (/* year */ Double, /* month */ Double, /* date */ js.Date) => String | Double): this.type = set("monthLegend", js.Any.fromFunction3(value))
  
  @scala.inline
  def monthLegendOffset(value: Double): this.type = set("monthLegendOffset", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onClick(value: (/* datum */ CalendarDayData, /* event */ SyntheticMouseEvent[SVGRectElement]) => Unit): this.type = set("onClick", js.Any.fromFunction2(value))
  
  @scala.inline
  def theme(value: Theme): this.type = set("theme", value.asInstanceOf[js.Any])
  
  @scala.inline
  def tooltip(value: ReactComponentClass[CalendarDayData]): this.type = set("tooltip", value.asInstanceOf[js.Any])
  
  @scala.inline
  def tooltipFormat(value: /* value */ Double => String | Double): this.type = set("tooltipFormat", js.Any.fromFunction1(value))
  
  @scala.inline
  def yearLegend(value: /* year */ Double => String | Double): this.type = set("yearLegend", js.Any.fromFunction1(value))
  
  @scala.inline
  def yearLegendOffset(value: Double): this.type = set("yearLegendOffset", value.asInstanceOf[js.Any])
  
  @scala.inline
  def yearSpacing(value: Double): this.type = set("yearSpacing", value.asInstanceOf[js.Any])
}

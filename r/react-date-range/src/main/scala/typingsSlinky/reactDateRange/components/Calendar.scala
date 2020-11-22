package typingsSlinky.reactDateRange.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactDateRange.anon.PartialClassNames
import typingsSlinky.reactDateRange.mod.AnyDate
import typingsSlinky.reactDateRange.mod.CalendarProps
import typingsSlinky.reactDateRange.mod.CalendarTheme
import typingsSlinky.reactDateRange.mod.DateInputType
import typingsSlinky.reactDateRange.mod.LanguageType
import typingsSlinky.reactDateRange.mod.OnChangeProps
import typingsSlinky.reactDateRange.mod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Calendar {
  
  @JSImport("react-date-range", "Calendar")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactDateRange.mod.Calendar] {
    
    @scala.inline
    def classNames(value: PartialClassNames): this.type = set("classNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def firstDayOfWeek(value: Double): this.type = set("firstDayOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def format(value: String): this.type = set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def lang(value: LanguageType): this.type = set("lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxDateDate(value: js.Date): this.type = set("maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxDateFunction1(value: /* now */ js.Date => AnyDate): this.type = set("maxDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def maxDate(value: DateInputType): this.type = set("maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minDateDate(value: js.Date): this.type = set("minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minDateFunction1(value: /* now */ js.Date => AnyDate): this.type = set("minDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def minDate(value: DateInputType): this.type = set("minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: /* range */ OnChangeProps => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onInit(value: /* range */ Range => Unit): this.type = set("onInit", js.Any.fromFunction1(value))
    
    @scala.inline
    def theme(value: CalendarTheme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CalendarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(date: DateInputType): Builder = {
    val __props = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[CalendarProps]))
  }
}

package typingsSlinky.dayzed.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.dayzed.dayzedNumbers.`0`
import typingsSlinky.dayzed.dayzedNumbers.`1`
import typingsSlinky.dayzed.dayzedNumbers.`2`
import typingsSlinky.dayzed.dayzedNumbers.`3`
import typingsSlinky.dayzed.dayzedNumbers.`4`
import typingsSlinky.dayzed.dayzedNumbers.`5`
import typingsSlinky.dayzed.dayzedNumbers.`6`
import typingsSlinky.dayzed.mod.DateObj
import typingsSlinky.dayzed.mod.Props
import typingsSlinky.dayzed.mod.RenderProps
import typingsSlinky.dayzed.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Dayzed {
  
  @scala.inline
  def apply(onDateSelected: DateObj => Unit): Builder = {
    val __props = js.Dynamic.literal(onDateSelected = js.Any.fromFunction1(onDateSelected))
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("dayzed", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def children(value: /* renderProps */ RenderProps => ReactElement): this.type = set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def date(value: js.Date): this.type = set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def firstDayOfWeek(value: `0` | `1` | `2` | `3` | `4` | `5` | `6`): this.type = set("firstDayOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxDate(value: js.Date): this.type = set("maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minDate(value: js.Date): this.type = set("minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def monthsToDisplay(value: Double): this.type = set("monthsToDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def offset(value: Double): this.type = set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onOffsetChanged(value: /* offset */ Double => Unit): this.type = set("onOffsetChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def render(value: /* renderProps */ RenderProps => ReactElement): this.type = set("render", js.Any.fromFunction1(value))
    
    @scala.inline
    def selected(value: js.Date | js.Array[js.Date]): this.type = set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectedDate(value: js.Date): this.type = set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectedVarargs(value: js.Date*): this.type = set("selected", js.Array(value :_*))
    
    @scala.inline
    def showOutsideDays(value: Boolean): this.type = set("showOutsideDays", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

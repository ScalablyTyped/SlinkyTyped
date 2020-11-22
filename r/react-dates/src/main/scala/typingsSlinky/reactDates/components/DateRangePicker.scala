package typingsSlinky.reactDates.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactDates.mod.DateRangePickerCls
import typingsSlinky.reactDates.mod.DateRangePickerShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Support for combinations of intersection and union types not implemented */
object DateRangePicker {
  
  @JSImport("react-dates", "DateRangePicker")
  @js.native
  object component extends js.Object
  
  def apply(p: DateRangePickerShape): Default[tag.type, DateRangePickerCls] = new Default[tag.type, DateRangePickerCls](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: DateRangePicker.type): Default[tag.type, DateRangePickerCls] = new Default[tag.type, DateRangePickerCls](js.Array(this.component, js.Dictionary.empty))()
}

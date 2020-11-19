package typingsSlinky.reactDateRange.components

import typingsSlinky.reactDateRange.mod.DateRangeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DateRangePicker {
  
  @JSImport("react-date-range", "DateRangePicker")
  @js.native
  object component extends js.Object
  
  def withProps(p: DateRangeProps): SharedBuilder_DateRangeProps_475329904[typingsSlinky.reactDateRange.mod.DateRangePicker] = new SharedBuilder_DateRangeProps_475329904[typingsSlinky.reactDateRange.mod.DateRangePicker](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: DateRangePicker.type): SharedBuilder_DateRangeProps_475329904[typingsSlinky.reactDateRange.mod.DateRangePicker] = new SharedBuilder_DateRangeProps_475329904[typingsSlinky.reactDateRange.mod.DateRangePicker](js.Array(this.component, js.Dictionary.empty))()
}

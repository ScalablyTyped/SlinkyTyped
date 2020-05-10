package typingsSlinky.reactDateRange.components

import typingsSlinky.reactDateRange.mod.DateRangeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DateRange {
  @JSImport("react-date-range", "DateRange")
  @js.native
  object component extends js.Object
  
  def withProps(p: DateRangeProps): SharedBuilder_DateRangeProps_475329904[typingsSlinky.reactDateRange.mod.DateRange] = new SharedBuilder_DateRangeProps_475329904[typingsSlinky.reactDateRange.mod.DateRange](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: DateRange.type): SharedBuilder_DateRangeProps_475329904[typingsSlinky.reactDateRange.mod.DateRange] = new SharedBuilder_DateRangeProps_475329904[typingsSlinky.reactDateRange.mod.DateRange](js.Array(this.component, js.Dictionary.empty))()
}


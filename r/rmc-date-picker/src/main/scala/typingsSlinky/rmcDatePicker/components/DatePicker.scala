package typingsSlinky.rmcDatePicker.components

import typingsSlinky.rmcDatePicker.datePickerMod.default
import typingsSlinky.rmcDatePicker.idatepickerpropsMod.IDatePickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DatePicker {
  
  @JSImport("rmc-date-picker/lib/DatePicker", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: IDatePickerProps): SharedBuilder_IDatePickerProps1819010111[default] = new SharedBuilder_IDatePickerProps1819010111[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: DatePicker.type): SharedBuilder_IDatePickerProps1819010111[default] = new SharedBuilder_IDatePickerProps1819010111[default](js.Array(this.component, js.Dictionary.empty))()
}

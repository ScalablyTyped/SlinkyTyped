package typingsSlinky.rmcDatePicker.components

import typingsSlinky.rmcDatePicker.datePickerMod.default
import typingsSlinky.rmcDatePicker.idatepickerpropsMod.IDatePickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DatePicker {
  
  @JSImport("rmc-date-picker/lib/DatePicker", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: DatePicker.type): SharedBuilder_IDatePickerProps1819010111[default] = new SharedBuilder_IDatePickerProps1819010111[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IDatePickerProps): SharedBuilder_IDatePickerProps1819010111[default] = new SharedBuilder_IDatePickerProps1819010111[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}

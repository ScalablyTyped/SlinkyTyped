package typingsSlinky.antd.components

import typingsSlinky.antd.PickPickPickerDatePropsMo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MonthPicker {
  @JSImport("antd/lib/date-picker", "default.MonthPicker")
  @js.native
  object component extends js.Object
  
  def withProps(p: PickPickPickerDatePropsMo): SharedBuilder_PickPickPickerDatePropsMo1183398999 = new SharedBuilder_PickPickPickerDatePropsMo1183398999(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: MonthPicker.type): SharedBuilder_PickPickPickerDatePropsMo1183398999 = new SharedBuilder_PickPickPickerDatePropsMo1183398999(js.Array(this.component, js.Dictionary.empty))()
}


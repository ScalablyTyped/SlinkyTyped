package typingsSlinky.antd.components

import typingsSlinky.antd.anon.PickPickPickerDatePropsMo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MonthPicker {
  @JSImport("antd/lib/date-picker", "default.MonthPicker")
  @js.native
  object component extends js.Object
  
  def withProps(p: PickPickPickerDatePropsMo): SharedBuilder_PickPickPickerDatePropsMo273792519 = new SharedBuilder_PickPickPickerDatePropsMo273792519(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: MonthPicker.type): SharedBuilder_PickPickPickerDatePropsMo273792519 = new SharedBuilder_PickPickPickerDatePropsMo273792519(js.Array(this.component, js.Dictionary.empty))()
}


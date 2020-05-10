package typingsSlinky.antd.components

import typingsSlinky.antd.PickPickPickerTimePropsMo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TimePicker {
  @JSImport("antd/lib/date-picker", "default.TimePicker")
  @js.native
  object component extends js.Object
  
  def withProps(p: PickPickPickerTimePropsMo): SharedBuilder_PickPickPickerTimePropsMo144279754 = new SharedBuilder_PickPickPickerTimePropsMo144279754(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: TimePicker.type): SharedBuilder_PickPickPickerTimePropsMo144279754 = new SharedBuilder_PickPickPickerTimePropsMo144279754(js.Array(this.component, js.Dictionary.empty))()
}


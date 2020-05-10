package typingsSlinky.reactDayPicker.components

import typingsSlinky.reactDayPicker.dayPickerMod.default
import typingsSlinky.reactDayPicker.propsMod.DayPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DayPicker {
  @JSImport("react-day-picker/types/DayPicker", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: DayPickerProps): SharedBuilder_DayPickerProps821347195[default] = new SharedBuilder_DayPickerProps821347195[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: DayPicker.type): SharedBuilder_DayPickerProps821347195[default] = new SharedBuilder_DayPickerProps821347195[default](js.Array(this.component, js.Dictionary.empty))()
}


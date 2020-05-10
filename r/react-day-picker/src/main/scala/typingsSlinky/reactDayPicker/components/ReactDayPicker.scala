package typingsSlinky.reactDayPicker.components

import typingsSlinky.reactDayPicker.mod.default
import typingsSlinky.reactDayPicker.propsMod.DayPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDayPicker {
  @JSImport("react-day-picker", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: DayPickerProps): SharedBuilder_DayPickerProps821347195[default] = new SharedBuilder_DayPickerProps821347195[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ReactDayPicker.type): SharedBuilder_DayPickerProps821347195[default] = new SharedBuilder_DayPickerProps821347195[default](js.Array(this.component, js.Dictionary.empty))()
}


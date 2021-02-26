package typingsSlinky.reactDayPicker.components

import typingsSlinky.reactDayPicker.mod.default
import typingsSlinky.reactDayPicker.propsMod.DayPickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactDayPicker {
  
  @JSImport("react-day-picker", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ReactDayPicker.type): SharedBuilder_DayPickerProps821347195[default] = new SharedBuilder_DayPickerProps821347195[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DayPickerProps): SharedBuilder_DayPickerProps821347195[default] = new SharedBuilder_DayPickerProps821347195[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}

package typingsSlinky.baseui.components

import typingsSlinky.baseui.datepickerMod.DatePicker_
import typingsSlinky.baseui.datepickerMod.DatepickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DatePicker {
  
  @JSImport("baseui/datepicker", "DatePicker")
  @js.native
  object component extends js.Object
  
  def withProps(p: DatepickerProps): SharedBuilder_DatepickerProps_1418582127[DatePicker_] = new SharedBuilder_DatepickerProps_1418582127[DatePicker_](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: DatePicker.type): SharedBuilder_DatepickerProps_1418582127[DatePicker_] = new SharedBuilder_DatepickerProps_1418582127[DatePicker_](js.Array(this.component, js.Dictionary.empty))()
}

object Datepicker {
  
  @JSImport("baseui/datepicker", "Datepicker")
  @js.native
  object component extends js.Object
  
  def withProps(p: DatepickerProps): SharedBuilder_DatepickerProps_1418582127[typingsSlinky.baseui.datepickerMod.Datepicker] = new SharedBuilder_DatepickerProps_1418582127[typingsSlinky.baseui.datepickerMod.Datepicker](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Datepicker.type): SharedBuilder_DatepickerProps_1418582127[typingsSlinky.baseui.datepickerMod.Datepicker] = new SharedBuilder_DatepickerProps_1418582127[typingsSlinky.baseui.datepickerMod.Datepicker](js.Array(this.component, js.Dictionary.empty))()
}

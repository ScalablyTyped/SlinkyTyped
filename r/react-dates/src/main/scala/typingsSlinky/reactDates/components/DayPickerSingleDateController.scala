package typingsSlinky.reactDates.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactDates.mod.DayPickerSingleDateControllerCls
import typingsSlinky.reactDates.mod.DayPickerSingleDateControllerShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Support for combinations of intersection and union types not implemented */
object DayPickerSingleDateController {
  
  @JSImport("react-dates", "DayPickerSingleDateController")
  @js.native
  object component extends js.Object
  
  def apply(p: DayPickerSingleDateControllerShape): Default[tag.type, DayPickerSingleDateControllerCls] = new Default[tag.type, DayPickerSingleDateControllerCls](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: DayPickerSingleDateController.type): Default[tag.type, DayPickerSingleDateControllerCls] = new Default[tag.type, DayPickerSingleDateControllerCls](js.Array(this.component, js.Dictionary.empty))()
}

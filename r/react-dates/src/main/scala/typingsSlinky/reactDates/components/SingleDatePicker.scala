package typingsSlinky.reactDates.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactDates.mod.SingleDatePickerCls
import typingsSlinky.reactDates.mod.SingleDatePickerShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Support for combinations of intersection and union types not implemented */
object SingleDatePicker {
  
  def apply(p: SingleDatePickerShape): Default[tag.type, SingleDatePickerCls] = new Default[tag.type, SingleDatePickerCls](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("react-dates", "SingleDatePicker")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: SingleDatePicker.type): Default[tag.type, SingleDatePickerCls] = new Default[tag.type, SingleDatePickerCls](js.Array(this.component, js.Dictionary.empty))()
}

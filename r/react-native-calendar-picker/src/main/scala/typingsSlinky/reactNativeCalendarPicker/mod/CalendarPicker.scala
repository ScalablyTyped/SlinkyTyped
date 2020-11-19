package typingsSlinky.reactNativeCalendarPicker.mod

import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalendarPicker
  extends Component[CalendarPickerProps, js.Object, js.Any] {
  
  def handleOnPressDay(day: Double): Unit = js.native
  
  def handleOnPressNext(): Unit = js.native
  
  def handleOnPressPrevious(): Unit = js.native
  
  def resetSelections(): Unit = js.native
}

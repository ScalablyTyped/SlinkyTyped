package typingsSlinky.reactNativeCalendars.mod

import typingsSlinky.reactNativeCalendars.AnonColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactNativeCalendars.mod.CustomMarking
  - typingsSlinky.reactNativeCalendars.mod.DotMarking
  - typingsSlinky.reactNativeCalendars.mod.MultiDotMarking
  - typingsSlinky.reactNativeCalendars.mod.MultiPeriodMarking
  - typingsSlinky.reactNativeCalendars.mod.PeriodMarking
*/
trait Marking extends js.Object

object Marking {
  @scala.inline
  def MultiPeriodMarking(periods: js.Array[AnonColor]): Marking = {
    val __obj = js.Dynamic.literal(periods = periods.asInstanceOf[js.Any])
    __obj.asInstanceOf[Marking]
  }
  @scala.inline
  def CustomMarking(customStyles: MarkedDateCustomStyles): Marking = {
    val __obj = js.Dynamic.literal(customStyles = customStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Marking]
  }
  @scala.inline
  def DotMarking(): Marking = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Marking]
  }
  @scala.inline
  def PeriodMarking(): Marking = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Marking]
  }
  @scala.inline
  def MultiDotMarking(dots: js.Array[CalendarDot]): Marking = {
    val __obj = js.Dynamic.literal(dots = dots.asInstanceOf[js.Any])
    __obj.asInstanceOf[Marking]
  }
}


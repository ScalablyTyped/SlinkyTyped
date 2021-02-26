package typingsSlinky.reactNativeCalendars.mod

import typingsSlinky.reactNativeCalendars.anon.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactNativeCalendars.mod.CustomMarking
  - typingsSlinky.reactNativeCalendars.mod.DotMarking
  - typingsSlinky.reactNativeCalendars.mod.MultiDotMarking
  - typingsSlinky.reactNativeCalendars.mod.MultiPeriodMarking
  - typingsSlinky.reactNativeCalendars.mod.PeriodMarking
*/
trait Marking extends StObject
object Marking {
  
  @scala.inline
  def CustomMarking(customStyles: MarkedDateCustomStyles): typingsSlinky.reactNativeCalendars.mod.CustomMarking = {
    val __obj = js.Dynamic.literal(customStyles = customStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reactNativeCalendars.mod.CustomMarking]
  }
  
  @scala.inline
  def DotMarking(): typingsSlinky.reactNativeCalendars.mod.DotMarking = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typingsSlinky.reactNativeCalendars.mod.DotMarking]
  }
  
  @scala.inline
  def MultiDotMarking(dots: js.Array[CalendarDot]): typingsSlinky.reactNativeCalendars.mod.MultiDotMarking = {
    val __obj = js.Dynamic.literal(dots = dots.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reactNativeCalendars.mod.MultiDotMarking]
  }
  
  @scala.inline
  def MultiPeriodMarking(periods: js.Array[Color]): typingsSlinky.reactNativeCalendars.mod.MultiPeriodMarking = {
    val __obj = js.Dynamic.literal(periods = periods.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reactNativeCalendars.mod.MultiPeriodMarking]
  }
  
  @scala.inline
  def PeriodMarking(): typingsSlinky.reactNativeCalendars.mod.PeriodMarking = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typingsSlinky.reactNativeCalendars.mod.PeriodMarking]
  }
}

package typingsSlinky.reactNativeCalendars.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Date
  - typingsSlinky.reactNativeCalendars.mod.DateObject
  - scala.Double
  - java.lang.String
  - / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XDate * / js.Any
*/
trait TCalendarDate extends js.Object

object TCalendarDate {
  @scala.inline
  implicit def apply(
    value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XDate */ js.Any
  ): TCalendarDate = value.asInstanceOf[TCalendarDate]
  @scala.inline
  implicit def apply(value: js.Date): TCalendarDate = value.asInstanceOf[TCalendarDate]
  @scala.inline
  implicit def apply(value: DateObject): TCalendarDate = value.asInstanceOf[TCalendarDate]
  @scala.inline
  implicit def apply(value: Double): TCalendarDate = value.asInstanceOf[TCalendarDate]
  @scala.inline
  implicit def apply(value: String): TCalendarDate = value.asInstanceOf[TCalendarDate]
}


package typingsSlinky.momentMini.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Function2[
/ * m * / js.UndefOr[typingsSlinky.momentMini.mod.MomentInput], 
/ * now * / js.UndefOr[typingsSlinky.momentMini.mod.Moment], 
java.lang.String]
*/
trait CalendarSpecVal extends js.Object

object CalendarSpecVal {
  @scala.inline
  implicit def apply(value: js.Function2[/* m */ js.UndefOr[MomentInput], /* now */ js.UndefOr[Moment], String]): CalendarSpecVal = value.asInstanceOf[CalendarSpecVal]
  @scala.inline
  implicit def apply(value: String): CalendarSpecVal = value.asInstanceOf[CalendarSpecVal]
}


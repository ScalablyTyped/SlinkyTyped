package typingsSlinky.flatpickr.optionsMod

import typingsSlinky.flatpickr.globalsMod.global.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - D
  - typingsSlinky.flatpickr.optionsMod.DateRangeLimit[D]
  - js.Function1[/ * date * / typingsSlinky.flatpickr.globalsMod.global.Date, scala.Boolean]
*/
trait DateLimit[D] extends js.Object

object DateLimit {
  @scala.inline
  implicit def apply[D](value: D): DateLimit[D] = value.asInstanceOf[DateLimit[D]]
  @scala.inline
  implicit def apply[D](value: DateRangeLimit[D]): DateLimit[D] = value.asInstanceOf[DateLimit[D]]
  @scala.inline
  implicit def apply[D](value: js.Function1[/* date */ Date, Boolean]): DateLimit[D] = value.asInstanceOf[DateLimit[D]]
}


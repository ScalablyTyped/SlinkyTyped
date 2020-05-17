package typingsSlinky.reactDateRange.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactDateRange.mod.AnyDate
  - typingsSlinky.reactDateRange.mod.DateFunc
*/
trait DateInputType extends js.Object

object DateInputType {
  @scala.inline
  implicit def apply(value: AnyDate): DateInputType = value.asInstanceOf[DateInputType]
  @scala.inline
  implicit def apply(value: DateFunc): DateInputType = value.asInstanceOf[DateInputType]
}


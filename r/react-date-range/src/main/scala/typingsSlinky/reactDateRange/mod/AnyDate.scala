package typingsSlinky.reactDateRange.mod

import typingsSlinky.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.moment.mod.Moment
*/
trait AnyDate extends DateInputType

object AnyDate {
  @scala.inline
  implicit def apply(value: Moment): AnyDate = value.asInstanceOf[AnyDate]
  @scala.inline
  implicit def apply(value: String): AnyDate = value.asInstanceOf[AnyDate]
}


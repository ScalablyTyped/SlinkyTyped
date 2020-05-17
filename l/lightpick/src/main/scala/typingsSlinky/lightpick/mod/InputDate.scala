package typingsSlinky.lightpick.mod

import typingsSlinky.moment.mod.MomentInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.moment.mod.MomentInput
  - scala.Null
*/
trait InputDate extends DisabledDate

object InputDate {
  @scala.inline
  implicit def apply(value: MomentInput): InputDate = value.asInstanceOf[InputDate]
  @scala.inline
  implicit def apply(value: Null): InputDate = value.asInstanceOf[InputDate]
}


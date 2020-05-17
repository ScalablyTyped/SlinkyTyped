package typingsSlinky.fullcalendar.inputTypesMod

import typingsSlinky.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.moment.mod.Moment
  - typingsSlinky.std.Date
  - js.Object
  - java.lang.String
  - scala.Double
*/
trait MomentInput extends js.Object

object MomentInput {
  @scala.inline
  implicit def apply(value: js.Date): MomentInput = value.asInstanceOf[MomentInput]
  @scala.inline
  implicit def apply(value: Double): MomentInput = value.asInstanceOf[MomentInput]
  @scala.inline
  implicit def apply(value: Moment): MomentInput = value.asInstanceOf[MomentInput]
  @scala.inline
  implicit def apply(value: js.Object): MomentInput = value.asInstanceOf[MomentInput]
  @scala.inline
  implicit def apply(value: String): MomentInput = value.asInstanceOf[MomentInput]
}


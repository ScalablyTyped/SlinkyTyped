package typingsSlinky.momentMini.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.momentMini.mod.Moment
  - typingsSlinky.std.Date
  - java.lang.String
  - scala.Double
  - js.Array[scala.Double | java.lang.String]
  - typingsSlinky.momentMini.mod.MomentInputObject
  - scala.Unit
*/
trait MomentInput extends js.Object

object MomentInput {
  @scala.inline
  implicit def apply(value: js.Array[Double | String]): MomentInput = value.asInstanceOf[MomentInput]
  @scala.inline
  implicit def apply(value: js.Date): MomentInput = value.asInstanceOf[MomentInput]
  @scala.inline
  implicit def apply(value: Double): MomentInput = value.asInstanceOf[MomentInput]
  @scala.inline
  implicit def apply(value: Moment): MomentInput = value.asInstanceOf[MomentInput]
  @scala.inline
  implicit def apply(value: MomentInputObject): MomentInput = value.asInstanceOf[MomentInput]
  @scala.inline
  implicit def apply(value: String): MomentInput = value.asInstanceOf[MomentInput]
  @scala.inline
  implicit def apply(value: Unit): MomentInput = value.asInstanceOf[MomentInput]
}


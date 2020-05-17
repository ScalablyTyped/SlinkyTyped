package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fridaGum.ArmRegister
  - scala.Double
  - typingsSlinky.fridaGum.UInt64
  - typingsSlinky.fridaGum.Int64
  - typingsSlinky.fridaGum.NativePointerValue
*/
trait ArmCallArgument extends js.Object

object ArmCallArgument {
  @scala.inline
  implicit def apply(value: ArmRegister): ArmCallArgument = value.asInstanceOf[ArmCallArgument]
  @scala.inline
  implicit def apply(value: Double): ArmCallArgument = value.asInstanceOf[ArmCallArgument]
  @scala.inline
  implicit def apply(value: Int64): ArmCallArgument = value.asInstanceOf[ArmCallArgument]
  @scala.inline
  implicit def apply(value: NativePointerValue): ArmCallArgument = value.asInstanceOf[ArmCallArgument]
  @scala.inline
  implicit def apply(value: UInt64): ArmCallArgument = value.asInstanceOf[ArmCallArgument]
}


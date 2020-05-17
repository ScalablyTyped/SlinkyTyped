package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fridaGum.Arm64Register
  - scala.Double
  - typingsSlinky.fridaGum.UInt64
  - typingsSlinky.fridaGum.Int64
  - typingsSlinky.fridaGum.NativePointerValue
*/
trait Arm64CallArgument extends js.Object

object Arm64CallArgument {
  @scala.inline
  implicit def apply(value: Arm64Register): Arm64CallArgument = value.asInstanceOf[Arm64CallArgument]
  @scala.inline
  implicit def apply(value: Double): Arm64CallArgument = value.asInstanceOf[Arm64CallArgument]
  @scala.inline
  implicit def apply(value: Int64): Arm64CallArgument = value.asInstanceOf[Arm64CallArgument]
  @scala.inline
  implicit def apply(value: NativePointerValue): Arm64CallArgument = value.asInstanceOf[Arm64CallArgument]
  @scala.inline
  implicit def apply(value: UInt64): Arm64CallArgument = value.asInstanceOf[Arm64CallArgument]
}


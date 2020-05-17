package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fridaGum.X86Register
  - scala.Double
  - typingsSlinky.fridaGum.UInt64
  - typingsSlinky.fridaGum.Int64
  - typingsSlinky.fridaGum.NativePointerValue
*/
trait X86CallArgument extends js.Object

object X86CallArgument {
  @scala.inline
  implicit def apply(value: Double): X86CallArgument = value.asInstanceOf[X86CallArgument]
  @scala.inline
  implicit def apply(value: Int64): X86CallArgument = value.asInstanceOf[X86CallArgument]
  @scala.inline
  implicit def apply(value: NativePointerValue): X86CallArgument = value.asInstanceOf[X86CallArgument]
  @scala.inline
  implicit def apply(value: UInt64): X86CallArgument = value.asInstanceOf[X86CallArgument]
  @scala.inline
  implicit def apply(value: X86Register): X86CallArgument = value.asInstanceOf[X86CallArgument]
}


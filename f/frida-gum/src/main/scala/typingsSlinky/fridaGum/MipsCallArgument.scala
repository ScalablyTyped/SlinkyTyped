package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fridaGum.MipsRegister
  - scala.Double
  - typingsSlinky.fridaGum.UInt64
  - typingsSlinky.fridaGum.Int64
  - typingsSlinky.fridaGum.NativePointerValue
*/
trait MipsCallArgument extends js.Object

object MipsCallArgument {
  @scala.inline
  implicit def apply(value: Double): MipsCallArgument = value.asInstanceOf[MipsCallArgument]
  @scala.inline
  implicit def apply(value: Int64): MipsCallArgument = value.asInstanceOf[MipsCallArgument]
  @scala.inline
  implicit def apply(value: MipsRegister): MipsCallArgument = value.asInstanceOf[MipsCallArgument]
  @scala.inline
  implicit def apply(value: NativePointerValue): MipsCallArgument = value.asInstanceOf[MipsCallArgument]
  @scala.inline
  implicit def apply(value: UInt64): MipsCallArgument = value.asInstanceOf[MipsCallArgument]
}


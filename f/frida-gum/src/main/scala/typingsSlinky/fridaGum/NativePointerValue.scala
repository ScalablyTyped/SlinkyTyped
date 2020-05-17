package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fridaGum.NativePointer
  - typingsSlinky.fridaGum.ObjectWrapper
*/
trait NativePointerValue
  extends Arm64CallArgument
     with ArmCallArgument
     with MipsCallArgument
     with NativeArgumentValue
     with X86CallArgument

object NativePointerValue {
  @scala.inline
  implicit def apply(value: NativePointer): NativePointerValue = value.asInstanceOf[NativePointerValue]
  @scala.inline
  implicit def apply(value: ObjectWrapper): NativePointerValue = value.asInstanceOf[NativePointerValue]
}


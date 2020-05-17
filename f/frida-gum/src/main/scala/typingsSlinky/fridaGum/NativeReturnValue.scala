package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fridaGum.NativePointer
  - typingsSlinky.fridaGum.UInt64
  - typingsSlinky.fridaGum.Int64
  - scala.Double
  - scala.Boolean
  - js.Array[js.Any]
*/
trait NativeReturnValue extends js.Object

object NativeReturnValue {
  @scala.inline
  implicit def apply(value: js.Array[js.Any]): NativeReturnValue = value.asInstanceOf[NativeReturnValue]
  @scala.inline
  implicit def apply(value: Boolean): NativeReturnValue = value.asInstanceOf[NativeReturnValue]
  @scala.inline
  implicit def apply(value: Double): NativeReturnValue = value.asInstanceOf[NativeReturnValue]
  @scala.inline
  implicit def apply(value: Int64): NativeReturnValue = value.asInstanceOf[NativeReturnValue]
  @scala.inline
  implicit def apply(value: NativePointer): NativeReturnValue = value.asInstanceOf[NativeReturnValue]
  @scala.inline
  implicit def apply(value: UInt64): NativeReturnValue = value.asInstanceOf[NativeReturnValue]
}


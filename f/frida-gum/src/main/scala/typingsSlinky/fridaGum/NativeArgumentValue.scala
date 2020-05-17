package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fridaGum.NativePointerValue
  - typingsSlinky.fridaGum.UInt64
  - typingsSlinky.fridaGum.Int64
  - scala.Double
  - scala.Boolean
  - js.Array[js.Any]
*/
trait NativeArgumentValue extends js.Object

object NativeArgumentValue {
  @scala.inline
  implicit def apply(value: js.Array[js.Any]): NativeArgumentValue = value.asInstanceOf[NativeArgumentValue]
  @scala.inline
  implicit def apply(value: Boolean): NativeArgumentValue = value.asInstanceOf[NativeArgumentValue]
  @scala.inline
  implicit def apply(value: Double): NativeArgumentValue = value.asInstanceOf[NativeArgumentValue]
  @scala.inline
  implicit def apply(value: Int64): NativeArgumentValue = value.asInstanceOf[NativeArgumentValue]
  @scala.inline
  implicit def apply(value: NativePointerValue): NativeArgumentValue = value.asInstanceOf[NativeArgumentValue]
  @scala.inline
  implicit def apply(value: UInt64): NativeArgumentValue = value.asInstanceOf[NativeArgumentValue]
}


package typingsSlinky.ioredis.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.node.Buffer
  - scala.Double
  - js.Array[js.Any]
*/
trait ValueType extends js.Object

object ValueType {
  @scala.inline
  implicit def apply(value: js.Array[js.Any]): ValueType = value.asInstanceOf[ValueType]
  @scala.inline
  implicit def apply(value: Buffer): ValueType = value.asInstanceOf[ValueType]
  @scala.inline
  implicit def apply(value: Double): ValueType = value.asInstanceOf[ValueType]
  @scala.inline
  implicit def apply(value: String): ValueType = value.asInstanceOf[ValueType]
}


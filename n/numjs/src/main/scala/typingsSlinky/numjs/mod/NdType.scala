package typingsSlinky.numjs.mod

import typingsSlinky.ndarray.mod.Data
import typingsSlinky.ndarray.mod.DataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ndarray.mod.DataType
  - typingsSlinky.ndarray.mod.Data[T]
*/
trait NdType[T] extends js.Object

object NdType {
  @scala.inline
  implicit def apply[T](value: Data[T]): NdType[T] = value.asInstanceOf[NdType[T]]
  @scala.inline
  implicit def apply[T](value: DataType): NdType[T] = value.asInstanceOf[NdType[T]]
}


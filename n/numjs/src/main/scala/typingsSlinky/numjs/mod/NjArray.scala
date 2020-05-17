package typingsSlinky.numjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.numjs.mod.NdArrayData[T]
  - typingsSlinky.numjs.mod.NdArray[T]
*/
trait NjArray[T] extends NjParam[T]

object NjArray {
  @scala.inline
  implicit def apply[T](value: NdArray[T]): NjArray[T] = value.asInstanceOf[NjArray[T]]
  @scala.inline
  implicit def apply[T](value: NdArrayData[T]): NjArray[T] = value.asInstanceOf[NjArray[T]]
}


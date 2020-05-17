package typingsSlinky.numjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.numjs.mod.NjArray[T]
  - scala.Double
*/
trait NjParam[T] extends js.Object

object NjParam {
  @scala.inline
  implicit def apply[T](value: Double): NjParam[T] = value.asInstanceOf[NjParam[T]]
  @scala.inline
  implicit def apply[T](value: NjArray[T]): NjParam[T] = value.asInstanceOf[NjParam[T]]
}


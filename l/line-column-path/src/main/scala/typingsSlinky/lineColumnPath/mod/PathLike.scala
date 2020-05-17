package typingsSlinky.lineColumnPath.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.lineColumnPath.mod.PathDescriptor
*/
trait PathLike extends js.Object

object PathLike {
  @scala.inline
  implicit def apply(value: PathDescriptor): PathLike = value.asInstanceOf[PathLike]
  @scala.inline
  implicit def apply(value: String): PathLike = value.asInstanceOf[PathLike]
}


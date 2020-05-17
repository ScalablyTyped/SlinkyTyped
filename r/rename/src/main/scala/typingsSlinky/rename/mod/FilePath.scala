package typingsSlinky.rename.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.rename.mod.Specification
*/
trait FilePath extends Transformer

object FilePath {
  @scala.inline
  implicit def apply(value: Specification): FilePath = value.asInstanceOf[FilePath]
  @scala.inline
  implicit def apply(value: String): FilePath = value.asInstanceOf[FilePath]
}


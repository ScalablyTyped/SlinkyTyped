package typingsSlinky.rename.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function1[/ * spec * / typingsSlinky.rename.mod.FileObject, typingsSlinky.rename.mod.FilePath]
  - typingsSlinky.rename.mod.FilePath
*/
trait Transformer extends js.Object

object Transformer {
  @scala.inline
  implicit def apply(value: FilePath): Transformer = value.asInstanceOf[Transformer]
  @scala.inline
  implicit def apply(value: js.Function1[/* spec */ FileObject, FilePath]): Transformer = value.asInstanceOf[Transformer]
}


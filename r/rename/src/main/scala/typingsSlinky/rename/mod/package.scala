package typingsSlinky.rename

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type FilePath = java.lang.String | typingsSlinky.rename.mod.Specification
  type Transformer = (js.Function1[/* spec */ typingsSlinky.rename.mod.FileObject, typingsSlinky.rename.mod.FilePath]) | typingsSlinky.rename.mod.FilePath
}

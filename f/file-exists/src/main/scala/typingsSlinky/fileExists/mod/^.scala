package typingsSlinky.fileExists.mod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("file-exists", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(filepath: String): Unit = js.native
  def apply(filepath: String, callback: js.Function2[/* err */ Error | Null, /* exists */ Boolean, Unit]): Unit = js.native
  def apply(filepath: String, options: Options): Unit = js.native
  def apply(
    filepath: String,
    options: Options,
    callback: js.Function2[/* err */ js.Error | Null, /* exists */ Boolean, Unit]
  ): Unit = js.native
}


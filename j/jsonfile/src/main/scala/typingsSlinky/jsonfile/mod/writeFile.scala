package typingsSlinky.jsonfile.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonfile", "writeFile")
@js.native
object writeFile extends js.Object {
  def apply(file: Path, obj: js.Any): js.Promise[Unit] = js.native
  def apply(file: Path, obj: js.Any, callback: WriteCallback): Unit = js.native
  def apply(file: Path, obj: js.Any, options: JFWriteOptions): js.Promise[Unit] = js.native
  def apply(file: Path, obj: js.Any, options: JFWriteOptions, callback: WriteCallback): Unit = js.native
}


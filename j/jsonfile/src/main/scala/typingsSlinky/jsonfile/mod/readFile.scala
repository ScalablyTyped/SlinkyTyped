package typingsSlinky.jsonfile.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonfile", "readFile")
@js.native
object readFile extends js.Object {
  def apply(file: Path): js.Promise[_] = js.native
  def apply(file: Path, callback: ReadCallback): Unit = js.native
  def apply(file: Path, options: JFReadOptions): js.Promise[_] = js.native
  def apply(file: Path, options: JFReadOptions, callback: ReadCallback): Unit = js.native
}


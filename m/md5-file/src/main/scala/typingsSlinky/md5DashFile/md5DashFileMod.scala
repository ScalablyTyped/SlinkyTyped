package typingsSlinky.md5DashFile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("md5-file", JSImport.Namespace)
@js.native
object md5DashFileMod extends js.Object {
  def apply(filename: String, cb: js.Function2[/* err */ js.Error, /* hash */ String, Unit]): Unit = js.native
  def sync(filename: String): String = js.native
}


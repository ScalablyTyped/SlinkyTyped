package typingsSlinky.gulp.mod

import typingsSlinky.node.NodeJS.ReadWriteStream
import typingsSlinky.vinyl.mod.File
import typingsSlinky.vinylFs.mod.DestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DestMethod extends js.Object {
  def apply(folder: String): ReadWriteStream = js.native
  def apply(folder: String, opt: DestOptions): ReadWriteStream = js.native
  def apply(getFolderPath: js.Function1[/* file */ File, String]): ReadWriteStream = js.native
}


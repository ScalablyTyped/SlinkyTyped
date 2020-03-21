package typingsSlinky.gulp

import typingsSlinky.node.NodeJS.ReadWriteStream
import typingsSlinky.vinyl.mod.File
import typingsSlinky.vinylFs.AnonCwd
import typingsSlinky.vinylFs.AnonDirMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply(folder: String): ReadWriteStream = js.native
  def apply(folder: String, opts: AnonCwd): ReadWriteStream = js.native
  def apply(getFolderPath: js.Function1[/* File */ File, String]): ReadWriteStream = js.native
  def apply(getFolderPath: js.Function1[/* File */ File, String], opts: AnonDirMode): ReadWriteStream = js.native
}


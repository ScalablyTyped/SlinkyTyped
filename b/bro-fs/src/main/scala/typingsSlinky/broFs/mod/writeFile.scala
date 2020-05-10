package typingsSlinky.broFs.mod

import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.File
import typingsSlinky.filesystem.FileEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bro-fs", "writeFile")
@js.native
object writeFile extends js.Object {
  def apply(path: String, data: String): js.Promise[FileEntry] = js.native
  def apply(path: String, data: js.typedarray.ArrayBuffer): js.Promise[FileEntry] = js.native
  def apply(path: String, data: Blob): js.Promise[FileEntry] = js.native
  def apply(path: String, data: File): js.Promise[FileEntry] = js.native
}


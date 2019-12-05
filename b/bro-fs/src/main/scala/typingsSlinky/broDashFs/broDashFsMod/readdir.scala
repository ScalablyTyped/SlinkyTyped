package typingsSlinky.broDashFs.broDashFsMod

import typingsSlinky.broDashFs.Anon_Deep
import typingsSlinky.filesystem.DirectoryEntry
import typingsSlinky.filesystem.FileEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bro-fs", "readdir")
@js.native
object readdir extends js.Object {
  def apply(path: String): js.Promise[js.Array[FileEntry]] = js.native
  def apply(path: String, options: Anon_Deep): js.Promise[js.Array[FileEntry]] = js.native
  def apply(path: DirectoryEntry): js.Promise[js.Array[FileEntry]] = js.native
  def apply(path: DirectoryEntry, options: Anon_Deep): js.Promise[js.Array[FileEntry]] = js.native
}


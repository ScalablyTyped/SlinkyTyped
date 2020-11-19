package typingsSlinky.broFs.mod

import typingsSlinky.broFs.anon.Deep
import typingsSlinky.filesystem.DirectoryEntry
import typingsSlinky.filesystem.FileEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bro-fs", "readdir")
@js.native
object readdir extends js.Object {
  
  def apply(path: String): js.Promise[js.Array[FileEntry]] = js.native
  def apply(path: String, options: Deep): js.Promise[js.Array[FileEntry]] = js.native
  def apply(path: DirectoryEntry): js.Promise[js.Array[FileEntry]] = js.native
  def apply(path: DirectoryEntry, options: Deep): js.Promise[js.Array[FileEntry]] = js.native
}

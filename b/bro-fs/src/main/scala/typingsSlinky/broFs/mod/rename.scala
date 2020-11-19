package typingsSlinky.broFs.mod

import typingsSlinky.broFs.anon.Create
import typingsSlinky.filesystem.FileEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bro-fs", "rename")
@js.native
object rename extends js.Object {
  
  def apply(oldPath: String, newPath: String): js.Promise[FileEntry] = js.native
  def apply(oldPath: String, newPath: String, options: Create): js.Promise[FileEntry] = js.native
  def apply(oldPath: FileEntry, newPath: String): js.Promise[FileEntry] = js.native
  def apply(oldPath: FileEntry, newPath: String, options: Create): js.Promise[FileEntry] = js.native
}

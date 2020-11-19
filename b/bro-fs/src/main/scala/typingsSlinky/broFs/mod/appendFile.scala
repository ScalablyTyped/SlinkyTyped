package typingsSlinky.broFs.mod

import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.File
import typingsSlinky.filesystem.FileEntry
import typingsSlinky.filesystem.FileSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bro-fs", "appendFile")
@js.native
object appendFile extends js.Object {
  
  def apply(path: String, data: String): js.Promise[FileSystem] = js.native
  def apply(path: String, data: js.typedarray.ArrayBuffer): js.Promise[FileSystem] = js.native
  def apply(path: String, data: Blob): js.Promise[FileSystem] = js.native
  def apply(path: String, data: File): js.Promise[FileSystem] = js.native
  def apply(path: FileEntry, data: String): js.Promise[FileSystem] = js.native
  def apply(path: FileEntry, data: js.typedarray.ArrayBuffer): js.Promise[FileSystem] = js.native
  def apply(path: FileEntry, data: Blob): js.Promise[FileSystem] = js.native
  def apply(path: FileEntry, data: File): js.Promise[FileSystem] = js.native
}

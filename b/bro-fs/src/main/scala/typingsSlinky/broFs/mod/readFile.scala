package typingsSlinky.broFs.mod

import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.File
import typingsSlinky.broFs.anon.Type
import typingsSlinky.broFs.anon.`0`
import typingsSlinky.broFs.anon.`1`
import typingsSlinky.broFs.anon.`2`
import typingsSlinky.filesystem.FileEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bro-fs", "readFile")
@js.native
object readFile extends js.Object {
  def apply(path: String): js.Promise[String] = js.native
  def apply(path: String, options: Type): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def apply(path: String, options: `0`): js.Promise[Blob] = js.native
  def apply(path: String, options: `1`): js.Promise[File] = js.native
  def apply(path: String, options: `2`): js.Promise[String] = js.native
  def apply(path: FileEntry): js.Promise[String] = js.native
  def apply(path: FileEntry, options: Type): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def apply(path: FileEntry, options: `0`): js.Promise[Blob] = js.native
  def apply(path: FileEntry, options: `1`): js.Promise[File] = js.native
  def apply(path: FileEntry, options: `2`): js.Promise[String] = js.native
}


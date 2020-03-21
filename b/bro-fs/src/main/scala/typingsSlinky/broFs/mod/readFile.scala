package typingsSlinky.broFs.mod

import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.File
import typingsSlinky.broFs.Anon0
import typingsSlinky.broFs.Anon1
import typingsSlinky.broFs.AnonType
import typingsSlinky.broFs.AnonTypeTextType
import typingsSlinky.filesystem.FileEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bro-fs", "readFile")
@js.native
object readFile extends js.Object {
  def apply(path: String): js.Promise[String] = js.native
  def apply(path: String, options: Anon0): js.Promise[Blob] = js.native
  def apply(path: String, options: Anon1): js.Promise[File] = js.native
  def apply(path: String, options: AnonType): js.Promise[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def apply(path: String, options: AnonTypeTextType): js.Promise[String] = js.native
  def apply(path: FileEntry): js.Promise[String] = js.native
  def apply(path: FileEntry, options: Anon0): js.Promise[Blob] = js.native
  def apply(path: FileEntry, options: Anon1): js.Promise[File] = js.native
  def apply(path: FileEntry, options: AnonType): js.Promise[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def apply(path: FileEntry, options: AnonTypeTextType): js.Promise[String] = js.native
}


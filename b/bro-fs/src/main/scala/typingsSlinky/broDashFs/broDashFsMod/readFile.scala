package typingsSlinky.broDashFs.broDashFsMod

import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.File
import typingsSlinky.broDashFs.Anon_ArrayBuffer
import typingsSlinky.broDashFs.Anon_Blob
import typingsSlinky.broDashFs.Anon_File
import typingsSlinky.broDashFs.Anon_Type
import typingsSlinky.filesystem.FileEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bro-fs", "readFile")
@js.native
object readFile extends js.Object {
  def apply(path: String): js.Promise[String] = js.native
  def apply(path: String, options: Anon_ArrayBuffer): js.Promise[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def apply(path: String, options: Anon_Blob): js.Promise[Blob] = js.native
  def apply(path: String, options: Anon_File): js.Promise[File] = js.native
  def apply(path: String, options: Anon_Type): js.Promise[String] = js.native
  def apply(path: FileEntry): js.Promise[String] = js.native
  def apply(path: FileEntry, options: Anon_ArrayBuffer): js.Promise[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def apply(path: FileEntry, options: Anon_Blob): js.Promise[Blob] = js.native
  def apply(path: FileEntry, options: Anon_File): js.Promise[File] = js.native
  def apply(path: FileEntry, options: Anon_Type): js.Promise[String] = js.native
}


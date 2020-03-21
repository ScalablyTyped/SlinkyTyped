package typingsSlinky.fsMerger

import typingsSlinky.fsMerger.fsMergerStrings.buffer
import typingsSlinky.node.Anon4
import typingsSlinky.node.Anon5
import typingsSlinky.node.AnonEncodingWithFileTypes
import typingsSlinky.node.Buffer
import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.fsMod.Dirent
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallPathOptions extends js.Object {
  def apply(path: PathLike): js.Array[Buffer | String] = js.native
  def apply(path: PathLike, options: String): js.Array[Buffer | String] = js.native
  def apply(path: PathLike, options: buffer): js.Array[Buffer] = js.native
  def apply(path: PathLike, options: Anon4): js.Array[Buffer | String] = js.native
  def apply(path: PathLike, options: Anon5): js.Array[Dirent] = js.native
  def apply(path: PathLike, options: AnonEncodingWithFileTypes): js.Array[Buffer] = js.native
  def apply(path: PathLike, options: typingsSlinky.node.AnonWithFileTypes): js.Array[String] = js.native
  def apply(path: PathLike, options: BufferEncoding): js.Array[String] = js.native
}


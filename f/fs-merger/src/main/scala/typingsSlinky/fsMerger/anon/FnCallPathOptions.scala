package typingsSlinky.fsMerger.anon

import typingsSlinky.fsMerger.fsMergerStrings.buffer
import typingsSlinky.node.Buffer
import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.anon.EncodingWithFileTypes
import typingsSlinky.node.anon.`4`
import typingsSlinky.node.anon.`5`
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
  def apply(path: PathLike, options: BufferEncoding): js.Array[String] = js.native
  def apply(path: PathLike, options: EncodingWithFileTypes): js.Array[Buffer] = js.native
  def apply(path: PathLike, options: typingsSlinky.node.anon.WithFileTypes): js.Array[String] = js.native
  def apply(path: PathLike, options: `4`): js.Array[Buffer | String] = js.native
  def apply(path: PathLike, options: `5`): js.Array[Dirent] = js.native
}


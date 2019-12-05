package typingsSlinky.hexoDashFs.hexoDashFsMod

import typingsSlinky.hexoDashFs.Anon_BufferEncoding
import typingsSlinky.hexoDashFs.Anon_Encoding
import typingsSlinky.hexoDashFs.Anon_EncodingNull
import typingsSlinky.node.Buffer
import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "readdir")
@js.native
object readdir extends js.Object {
  def apply(path: PathLike): typingsSlinky.bluebird.bluebirdMod.^[js.Array[String]] = js.native
  def apply(path: PathLike, options: String): typingsSlinky.bluebird.bluebirdMod.^[js.Array[String | Buffer]] = js.native
  def apply(path: PathLike, options: Anon_BufferEncoding): typingsSlinky.bluebird.bluebirdMod.^[js.Array[Buffer]] = js.native
  def apply(path: PathLike, options: Anon_Encoding): typingsSlinky.bluebird.bluebirdMod.^[js.Array[String]] = js.native
  def apply(path: PathLike, options: Anon_EncodingNull): typingsSlinky.bluebird.bluebirdMod.^[js.Array[String | Buffer]] = js.native
  def apply(path: PathLike, options: BufferEncoding): typingsSlinky.bluebird.bluebirdMod.^[js.Array[String]] = js.native
}


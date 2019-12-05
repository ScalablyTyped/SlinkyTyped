package typingsSlinky.hexoDashFs.hexoDashFsMod

import typingsSlinky.hexoDashFs.Anon_BufferEncoding
import typingsSlinky.hexoDashFs.Anon_EncodingBufferEncoding
import typingsSlinky.hexoDashFs.Anon_EncodingNull
import typingsSlinky.node.Buffer
import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "readlink")
@js.native
object readlink extends js.Object {
  def apply(path: PathLike): typingsSlinky.bluebird.bluebirdMod.^[String] = js.native
  def apply(path: PathLike, options: String): typingsSlinky.bluebird.bluebirdMod.^[String | Buffer] = js.native
  def apply(path: PathLike, options: Anon_BufferEncoding): typingsSlinky.bluebird.bluebirdMod.^[Buffer] = js.native
  def apply(path: PathLike, options: Anon_EncodingBufferEncoding): typingsSlinky.bluebird.bluebirdMod.^[String] = js.native
  def apply(path: PathLike, options: Anon_EncodingNull): typingsSlinky.bluebird.bluebirdMod.^[String | Buffer] = js.native
  def apply(path: PathLike, options: BufferEncoding): typingsSlinky.bluebird.bluebirdMod.^[String] = js.native
}


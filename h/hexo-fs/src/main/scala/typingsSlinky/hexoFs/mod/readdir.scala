package typingsSlinky.hexoFs.mod

import typingsSlinky.hexoFs.Anon0
import typingsSlinky.hexoFs.Anon1
import typingsSlinky.hexoFs.AnonEncoding
import typingsSlinky.node.Buffer
import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "readdir")
@js.native
object readdir extends js.Object {
  def apply(path: PathLike): typingsSlinky.bluebird.mod.^[js.Array[String]] = js.native
  def apply(path: PathLike, options: String): typingsSlinky.bluebird.mod.^[js.Array[String | Buffer]] = js.native
  def apply(path: PathLike, options: Anon0): typingsSlinky.bluebird.mod.^[js.Array[Buffer]] = js.native
  def apply(path: PathLike, options: Anon1): typingsSlinky.bluebird.mod.^[js.Array[String | Buffer]] = js.native
  def apply(path: PathLike, options: AnonEncoding): typingsSlinky.bluebird.mod.^[js.Array[String]] = js.native
  def apply(path: PathLike, options: BufferEncoding): typingsSlinky.bluebird.mod.^[js.Array[String]] = js.native
}


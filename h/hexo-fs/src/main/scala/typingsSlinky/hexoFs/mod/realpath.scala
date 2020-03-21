package typingsSlinky.hexoFs.mod

import typingsSlinky.hexoFs.Anon0
import typingsSlinky.hexoFs.Anon1
import typingsSlinky.hexoFs.Anon2
import typingsSlinky.node.Buffer
import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "realpath")
@js.native
object realpath extends js.Object {
  def apply(path: PathLike): typingsSlinky.bluebird.mod.^[String] = js.native
  def apply(path: PathLike, options: String): typingsSlinky.bluebird.mod.^[String | Buffer] = js.native
  def apply(path: PathLike, options: Anon0): typingsSlinky.bluebird.mod.^[Buffer] = js.native
  def apply(path: PathLike, options: Anon1): typingsSlinky.bluebird.mod.^[String | Buffer] = js.native
  def apply(path: PathLike, options: Anon2): typingsSlinky.bluebird.mod.^[String] = js.native
  def apply(path: PathLike, options: BufferEncoding): typingsSlinky.bluebird.mod.^[String] = js.native
}


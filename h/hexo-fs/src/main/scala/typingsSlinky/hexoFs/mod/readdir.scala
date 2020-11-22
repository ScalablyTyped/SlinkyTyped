package typingsSlinky.hexoFs.mod

import typingsSlinky.hexoFs.anon.Encoding
import typingsSlinky.hexoFs.anon.`0`
import typingsSlinky.hexoFs.anon.`1`
import typingsSlinky.node.Buffer
import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hexo-fs", "readdir")
@js.native
object readdir extends js.Object {
  
  def apply(path: PathLike): typingsSlinky.bluebird.mod.^[js.Array[String]] = js.native
  def apply(path: PathLike, options: String): typingsSlinky.bluebird.mod.^[js.Array[String | Buffer]] = js.native
  def apply(path: PathLike, options: Encoding): typingsSlinky.bluebird.mod.^[js.Array[String]] = js.native
  def apply(path: PathLike, options: `0`): typingsSlinky.bluebird.mod.^[js.Array[Buffer]] = js.native
  def apply(path: PathLike, options: `1`): typingsSlinky.bluebird.mod.^[js.Array[String | Buffer]] = js.native
  def apply(path: PathLike, options: BufferEncoding): typingsSlinky.bluebird.mod.^[js.Array[String]] = js.native
}

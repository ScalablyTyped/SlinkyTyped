package typingsSlinky.hexoFs.mod

import typingsSlinky.hexoFs.anon.`0`
import typingsSlinky.hexoFs.anon.`1`
import typingsSlinky.hexoFs.anon.`2`
import typingsSlinky.node.Buffer
import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hexo-fs", "readlink")
@js.native
object readlink extends js.Object {
  
  def apply(path: PathLike): typingsSlinky.bluebird.mod.^[String] = js.native
  def apply(path: PathLike, options: String): typingsSlinky.bluebird.mod.^[String | Buffer] = js.native
  def apply(path: PathLike, options: `0`): typingsSlinky.bluebird.mod.^[Buffer] = js.native
  def apply(path: PathLike, options: `1`): typingsSlinky.bluebird.mod.^[String | Buffer] = js.native
  def apply(path: PathLike, options: `2`): typingsSlinky.bluebird.mod.^[String] = js.native
  def apply(path: PathLike, options: BufferEncoding): typingsSlinky.bluebird.mod.^[String] = js.native
}

package typingsSlinky.gracefulFs.mod

import typingsSlinky.node.anon.EmitClose
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graceful-fs", "createWriteStream")
@js.native
object createWriteStream extends js.Object {
  
  def apply(path: PathLike): typingsSlinky.node.fsMod.WriteStream = js.native
  def apply(path: PathLike, options: String): typingsSlinky.node.fsMod.WriteStream = js.native
  def apply(path: PathLike, options: EmitClose): typingsSlinky.node.fsMod.WriteStream = js.native
}

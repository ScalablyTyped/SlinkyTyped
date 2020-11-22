package typingsSlinky.hexoFs.mod

import typingsSlinky.node.fsMod.BigIntOptions
import typingsSlinky.node.fsMod.BigIntStats
import typingsSlinky.node.fsMod.PathLike
import typingsSlinky.node.fsMod.StatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hexo-fs", "statSync")
@js.native
object statSync extends js.Object {
  
  def apply(path: PathLike): typingsSlinky.node.fsMod.Stats = js.native
  def apply(path: PathLike, options: BigIntOptions): BigIntStats = js.native
  def apply(path: PathLike, options: StatOptions): typingsSlinky.node.fsMod.Stats | BigIntStats = js.native
}

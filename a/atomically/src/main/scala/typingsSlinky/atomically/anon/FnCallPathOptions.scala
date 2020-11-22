package typingsSlinky.atomically.anon

import typingsSlinky.node.fsMod.BigIntOptions
import typingsSlinky.node.fsMod.BigIntStats
import typingsSlinky.node.fsMod.PathLike
import typingsSlinky.node.fsMod.StatOptions
import typingsSlinky.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallPathOptions extends js.Object {
  
  def apply(path: PathLike): Stats = js.native
  def apply(path: PathLike, options: BigIntOptions): BigIntStats = js.native
  def apply(path: PathLike, options: StatOptions): Stats | BigIntStats = js.native
}

package typingsSlinky.ionicUtilsFs.mod

import typingsSlinky.node.fsMod.BigIntOptions
import typingsSlinky.node.fsMod.PathLike
import typingsSlinky.node.fsMod.StatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/utils-fs", "statSync")
@js.native
object statSync extends js.Object {
  
  def apply(path: PathLike): typingsSlinky.node.fsMod.Stats = js.native
  def apply(path: PathLike, options: BigIntOptions): typingsSlinky.node.fsMod.BigIntStats = js.native
  def apply(path: PathLike, options: StatOptions): typingsSlinky.node.fsMod.Stats | typingsSlinky.node.fsMod.BigIntStats = js.native
}

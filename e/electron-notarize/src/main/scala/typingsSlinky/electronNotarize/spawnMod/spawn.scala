package typingsSlinky.electronNotarize.spawnMod

import typingsSlinky.node.childProcessMod.SpawnOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("electron-notarize/lib/spawn", "spawn")
@js.native
object spawn extends js.Object {
  
  def apply(cmd: String): js.Promise[SpawnResult] = js.native
  def apply(cmd: String, args: js.UndefOr[scala.Nothing], opts: SpawnOptions): js.Promise[SpawnResult] = js.native
  def apply(cmd: String, args: js.Array[String]): js.Promise[SpawnResult] = js.native
  def apply(cmd: String, args: js.Array[String], opts: SpawnOptions): js.Promise[SpawnResult] = js.native
}

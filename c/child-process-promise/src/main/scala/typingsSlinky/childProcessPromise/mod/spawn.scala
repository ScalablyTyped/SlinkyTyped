package typingsSlinky.childProcessPromise.mod

import typingsSlinky.childProcessPromise.anon.ReadonlyOptionsSpawnOptio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("child-process-promise", "spawn")
@js.native
object spawn extends js.Object {
  
  def apply(command: String): ChildProcessPromise[SpawnPromiseResult] = js.native
  def apply(command: String, args: js.UndefOr[scala.Nothing], options: ReadonlyOptionsSpawnOptio): ChildProcessPromise[SpawnPromiseResult] = js.native
  def apply(command: String, args: js.Array[String]): ChildProcessPromise[SpawnPromiseResult] = js.native
  def apply(command: String, args: js.Array[String], options: ReadonlyOptionsSpawnOptio): ChildProcessPromise[SpawnPromiseResult] = js.native
  def apply(command: String, args: Null, options: ReadonlyOptionsSpawnOptio): ChildProcessPromise[SpawnPromiseResult] = js.native
}

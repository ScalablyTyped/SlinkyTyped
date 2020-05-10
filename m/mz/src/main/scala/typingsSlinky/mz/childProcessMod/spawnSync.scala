package typingsSlinky.mz.childProcessMod

import typingsSlinky.node.Buffer
import typingsSlinky.node.childProcessMod.SpawnSyncOptions
import typingsSlinky.node.childProcessMod.SpawnSyncOptionsWithBufferEncoding
import typingsSlinky.node.childProcessMod.SpawnSyncOptionsWithStringEncoding
import typingsSlinky.node.childProcessMod.SpawnSyncReturns
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mz/child_process", "spawnSync")
@js.native
object spawnSync extends js.Object {
  def apply(command: String): SpawnSyncReturns[Buffer] = js.native
  def apply(command: String, args: js.Array[String]): SpawnSyncReturns[String] = js.native
  def apply(command: String, args: js.Array[String], options: SpawnSyncOptions): SpawnSyncReturns[Buffer] = js.native
  def apply(command: String, args: js.Array[String], options: SpawnSyncOptionsWithBufferEncoding): SpawnSyncReturns[Buffer] = js.native
  def apply(command: String, args: js.Array[String], options: SpawnSyncOptionsWithStringEncoding): SpawnSyncReturns[String] = js.native
  def apply(command: String, options: SpawnSyncOptions): SpawnSyncReturns[Buffer] = js.native
  def apply(command: String, options: SpawnSyncOptionsWithBufferEncoding): SpawnSyncReturns[Buffer] = js.native
  def apply(command: String, options: SpawnSyncOptionsWithStringEncoding): SpawnSyncReturns[String] = js.native
}


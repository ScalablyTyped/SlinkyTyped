package typingsSlinky.crossDashSpawn

import typingsSlinky.node.Buffer
import typingsSlinky.node.childUnderscoreProcessMod.ChildProcess
import typingsSlinky.node.childUnderscoreProcessMod.ChildProcessByStdio
import typingsSlinky.node.childUnderscoreProcessMod.ChildProcessWithoutNullStreams
import typingsSlinky.node.childUnderscoreProcessMod.SpawnOptions
import typingsSlinky.node.childUnderscoreProcessMod.SpawnOptionsWithStdioTuple
import typingsSlinky.node.childUnderscoreProcessMod.SpawnOptionsWithoutStdio
import typingsSlinky.node.childUnderscoreProcessMod.SpawnSyncOptions
import typingsSlinky.node.childUnderscoreProcessMod.SpawnSyncOptionsWithBufferEncoding
import typingsSlinky.node.childUnderscoreProcessMod.SpawnSyncOptionsWithStringEncoding
import typingsSlinky.node.childUnderscoreProcessMod.SpawnSyncReturns
import typingsSlinky.node.childUnderscoreProcessMod.StdioNull
import typingsSlinky.node.childUnderscoreProcessMod.StdioPipe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cross-spawn", JSImport.Namespace)
@js.native
object crossDashSpawnMod extends js.Object {
  def apply(command: String): ChildProcess = js.native
  def apply(command: String, args: js.Array[String]): ChildProcess = js.native
  def apply(command: String, args: js.Array[String], options: SpawnOptions): ChildProcess = js.native
  /**
    * The `spawn()` method spawns a new process using the given `command`, with
    * command line arguments in `args`. If omitted, `args` defaults to an empty array.
    */
  def apply(command: String, options: SpawnOptions): ChildProcess = js.native
  /**
  	 * The `spawn()` method spawns a new process using the given `command`, with
  	 * command line arguments in `args`. If omitted, `args` defaults to an empty array.
  	 */
  @js.native
  object spawn extends js.Object {
    def apply(command: String): ChildProcessWithoutNullStreams = js.native
    def apply(command: String, args: js.Array[String]): ChildProcessWithoutNullStreams = js.native
    def apply(command: String, args: js.Array[String], options: SpawnOptions): ChildProcess = js.native
    def apply(
      command: String,
      args: js.Array[String],
      options: SpawnOptionsWithStdioTuple[StdioNull | StdioPipe, StdioNull | StdioPipe, StdioNull | StdioPipe]
    ): ChildProcessByStdio[Null, Null, Null] = js.native
    def apply(command: String, args: js.Array[String], options: SpawnOptionsWithoutStdio): ChildProcessWithoutNullStreams = js.native
    def apply(command: String, options: SpawnOptions): ChildProcess = js.native
    def apply(
      command: String,
      options: SpawnOptionsWithStdioTuple[StdioNull | StdioPipe, StdioNull | StdioPipe, StdioNull | StdioPipe]
    ): ChildProcessByStdio[Null, Null, Null] = js.native
    def apply(command: String, options: SpawnOptionsWithoutStdio): ChildProcessWithoutNullStreams = js.native
  }
  
  /**
  	 * The `spawn.sync()` method spawns a new process using the given `command`, with
  	 * command line arguments in `args`. If omitted, `args` defaults to an empty array.
  	 */
  @js.native
  object sync extends js.Object {
    def apply(command: String): SpawnSyncReturns[Buffer] = js.native
    def apply(command: String, args: js.Array[String]): SpawnSyncReturns[Buffer] = js.native
    def apply(command: String, args: js.Array[String], options: SpawnSyncOptions): SpawnSyncReturns[Buffer] = js.native
    def apply(command: String, args: js.Array[String], options: SpawnSyncOptionsWithBufferEncoding): SpawnSyncReturns[Buffer] = js.native
    def apply(command: String, args: js.Array[String], options: SpawnSyncOptionsWithStringEncoding): SpawnSyncReturns[String] = js.native
    def apply(command: String, options: SpawnSyncOptions): SpawnSyncReturns[Buffer] = js.native
    def apply(command: String, options: SpawnSyncOptionsWithBufferEncoding): SpawnSyncReturns[Buffer] = js.native
    def apply(command: String, options: SpawnSyncOptionsWithStringEncoding): SpawnSyncReturns[String] = js.native
  }
  
}


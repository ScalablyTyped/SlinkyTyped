package typingsSlinky.npmDashRun.npmDashRunMod

import typingsSlinky.node.Buffer
import typingsSlinky.node.childUnderscoreProcessMod.ChildProcess
import typingsSlinky.node.childUnderscoreProcessMod.ChildProcessByStdio
import typingsSlinky.node.childUnderscoreProcessMod.ChildProcessWithoutNullStreams
import typingsSlinky.node.childUnderscoreProcessMod.ExecSyncOptions
import typingsSlinky.node.childUnderscoreProcessMod.ExecSyncOptionsWithBufferEncoding
import typingsSlinky.node.childUnderscoreProcessMod.ExecSyncOptionsWithStringEncoding
import typingsSlinky.node.childUnderscoreProcessMod.SpawnOptions
import typingsSlinky.node.childUnderscoreProcessMod.SpawnOptionsWithStdioTuple
import typingsSlinky.node.childUnderscoreProcessMod.SpawnOptionsWithoutStdio
import typingsSlinky.node.childUnderscoreProcessMod.SpawnSyncOptions
import typingsSlinky.node.childUnderscoreProcessMod.SpawnSyncOptionsWithBufferEncoding
import typingsSlinky.node.childUnderscoreProcessMod.SpawnSyncOptionsWithStringEncoding
import typingsSlinky.node.childUnderscoreProcessMod.SpawnSyncReturns
import typingsSlinky.node.childUnderscoreProcessMod.StdioNull
import typingsSlinky.node.childUnderscoreProcessMod.StdioPipe
import typingsSlinky.npmDashRun.Fn_Args
import typingsSlinky.npmDashRun.Fn_ArgsCommand
import typingsSlinky.npmDashRun.Fn_Command
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Runner extends ExecFunction {
  var exec: ExecFunction = js.native
  @JSName("execSync")
  var execSync_Original: Fn_Command = js.native
  @JSName("spawnSync")
  var spawnSync_Original: Fn_Args = js.native
  @JSName("spawn")
  var spawn_Original: Fn_ArgsCommand = js.native
  @JSName("sync")
  var sync_Original: Fn_Command = js.native
  def execSync(command: String): String = js.native
  def execSync(command: String, options: ExecSyncOptions): Buffer = js.native
  def execSync(command: String, options: ExecSyncOptionsWithBufferEncoding): Buffer = js.native
  def execSync(command: String, options: ExecSyncOptionsWithStringEncoding): String = js.native
  @JSName("execSync")
  def execSync_Buffer(command: String): Buffer = js.native
  def spawn(command: String): ChildProcessWithoutNullStreams = js.native
  def spawn(command: String, args: js.Array[String]): ChildProcessWithoutNullStreams = js.native
  def spawn(command: String, args: js.Array[String], options: SpawnOptions): ChildProcess = js.native
  def spawn(
    command: String,
    args: js.Array[String],
    options: SpawnOptionsWithStdioTuple[StdioNull | StdioPipe, StdioNull | StdioPipe, StdioNull | StdioPipe]
  ): ChildProcessByStdio[Null, Null, Null] = js.native
  def spawn(command: String, args: js.Array[String], options: SpawnOptionsWithoutStdio): ChildProcessWithoutNullStreams = js.native
  def spawn(command: String, options: SpawnOptions): ChildProcess = js.native
  def spawn(
    command: String,
    options: SpawnOptionsWithStdioTuple[StdioNull | StdioPipe, StdioNull | StdioPipe, StdioNull | StdioPipe]
  ): ChildProcessByStdio[Null, Null, Null] = js.native
  def spawn(command: String, options: SpawnOptionsWithoutStdio): ChildProcessWithoutNullStreams = js.native
  def spawnSync(command: String): SpawnSyncReturns[Buffer] = js.native
  def spawnSync(command: String, args: js.Array[String]): SpawnSyncReturns[Buffer] = js.native
  def spawnSync(command: String, args: js.Array[String], options: SpawnSyncOptions): SpawnSyncReturns[Buffer] = js.native
  def spawnSync(command: String, args: js.Array[String], options: SpawnSyncOptionsWithBufferEncoding): SpawnSyncReturns[Buffer] = js.native
  def spawnSync(command: String, args: js.Array[String], options: SpawnSyncOptionsWithStringEncoding): SpawnSyncReturns[String] = js.native
  def spawnSync(command: String, options: SpawnSyncOptions): SpawnSyncReturns[Buffer] = js.native
  def spawnSync(command: String, options: SpawnSyncOptionsWithBufferEncoding): SpawnSyncReturns[Buffer] = js.native
  def spawnSync(command: String, options: SpawnSyncOptionsWithStringEncoding): SpawnSyncReturns[String] = js.native
  def sync(command: String): String = js.native
  def sync(command: String, options: ExecSyncOptions): Buffer = js.native
  def sync(command: String, options: ExecSyncOptionsWithBufferEncoding): Buffer = js.native
  def sync(command: String, options: ExecSyncOptionsWithStringEncoding): String = js.native
  @JSName("sync")
  def sync_Buffer(command: String): Buffer = js.native
}


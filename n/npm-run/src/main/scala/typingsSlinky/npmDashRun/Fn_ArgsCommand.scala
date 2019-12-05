package typingsSlinky.npmDashRun

import typingsSlinky.node.childUnderscoreProcessMod.ChildProcess
import typingsSlinky.node.childUnderscoreProcessMod.ChildProcessByStdio
import typingsSlinky.node.childUnderscoreProcessMod.ChildProcessWithoutNullStreams
import typingsSlinky.node.childUnderscoreProcessMod.SpawnOptions
import typingsSlinky.node.childUnderscoreProcessMod.SpawnOptionsWithStdioTuple
import typingsSlinky.node.childUnderscoreProcessMod.SpawnOptionsWithoutStdio
import typingsSlinky.node.childUnderscoreProcessMod.StdioNull
import typingsSlinky.node.childUnderscoreProcessMod.StdioPipe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_ArgsCommand extends js.Object {
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


package typingsSlinky.mz.childProcessMod

import typingsSlinky.node.childProcessMod.ChildProcess
import typingsSlinky.node.childProcessMod.ChildProcessByStdio
import typingsSlinky.node.childProcessMod.ChildProcessWithoutNullStreams
import typingsSlinky.node.childProcessMod.SpawnOptions
import typingsSlinky.node.childProcessMod.SpawnOptionsWithStdioTuple
import typingsSlinky.node.childProcessMod.SpawnOptionsWithoutStdio
import typingsSlinky.node.childProcessMod.StdioNull
import typingsSlinky.node.childProcessMod.StdioPipe
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mz/child_process", "spawn")
@js.native
object spawn extends js.Object {
  // overloads of spawn without 'args'
  def apply(command: String): ChildProcessWithoutNullStreams = js.native
  def apply(command: String, args: js.Array[String]): ChildProcessWithoutNullStreams = js.native
  def apply(command: String, args: js.Array[String], options: SpawnOptions): ChildProcess = js.native
  def apply(
    command: String,
    args: js.Array[String],
    options: SpawnOptionsWithStdioTuple[StdioNull | StdioPipe, StdioNull | StdioPipe, StdioNull | StdioPipe]
  ): ChildProcessByStdio[Writable, Readable, Readable] = js.native
  def apply(command: String, args: js.Array[String], options: SpawnOptionsWithoutStdio): ChildProcessWithoutNullStreams = js.native
  def apply(command: String, options: SpawnOptions): ChildProcess = js.native
  def apply(
    command: String,
    options: SpawnOptionsWithStdioTuple[StdioNull | StdioPipe, StdioNull | StdioPipe, StdioNull | StdioPipe]
  ): ChildProcessByStdio[Writable, Readable, Readable] = js.native
  def apply(command: String, options: SpawnOptionsWithoutStdio): ChildProcessWithoutNullStreams = js.native
}


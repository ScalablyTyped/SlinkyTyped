package typingsSlinky.atJestConsole

import typingsSlinky.atJestConsole.buildBufferedConsoleMod.default
import typingsSlinky.atJestConsole.buildCustomConsoleMod.Formatter
import typingsSlinky.atJestConsole.buildTypesMod.ConsoleBuffer
import typingsSlinky.atJestConsole.buildTypesMod.LogEntry
import typingsSlinky.atJestConsole.buildTypesMod.LogMessage
import typingsSlinky.atJestConsole.buildTypesMod.LogType
import typingsSlinky.atJestSourceDashMap.buildTypesMod.SourceMapRegistry
import typingsSlinky.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/console", JSImport.Namespace)
@js.native
object atJestConsoleMod extends js.Object {
  @js.native
  class BufferedConsole protected () extends default {
    def this(getSourceMaps: js.Function0[js.UndefOr[SourceMapRegistry | Null]]) = this()
  }
  
  @js.native
  class CustomConsole protected ()
    extends typingsSlinky.atJestConsole.buildCustomConsoleMod.default {
    def this(stdout: WritableStream, stderr: WritableStream) = this()
    def this(stdout: WritableStream, stderr: WritableStream, formatBuffer: Formatter) = this()
  }
  
  @js.native
  class NullConsole ()
    extends typingsSlinky.atJestConsole.buildNullConsoleMod.NullConsole
  
  def getConsoleOutput(root: String, verbose: Boolean, buffer: js.Array[LogEntry]): String = js.native
  /* static members */
  @js.native
  object BufferedConsole extends js.Object {
    def write(buffer: ConsoleBuffer, `type`: LogType, message: LogMessage): js.Array[LogEntry] = js.native
    def write(buffer: ConsoleBuffer, `type`: LogType, message: LogMessage, level: Double): js.Array[LogEntry] = js.native
    def write(
      buffer: ConsoleBuffer,
      `type`: LogType,
      message: LogMessage,
      level: Double,
      sourceMaps: SourceMapRegistry
    ): js.Array[LogEntry] = js.native
    def write(
      buffer: ConsoleBuffer,
      `type`: LogType,
      message: LogMessage,
      level: Null,
      sourceMaps: SourceMapRegistry
    ): js.Array[LogEntry] = js.native
  }
  
}


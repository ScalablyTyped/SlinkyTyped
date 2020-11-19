package typingsSlinky.jestConsole

import typingsSlinky.jestConsole.bufferedConsoleMod.default
import typingsSlinky.jestConsole.customConsoleMod.Formatter
import typingsSlinky.jestConsole.typesMod.ConsoleBuffer
import typingsSlinky.jestConsole.typesMod.LogEntry
import typingsSlinky.jestConsole.typesMod.LogMessage
import typingsSlinky.jestConsole.typesMod.LogType
import typingsSlinky.jestSourceMap.typesMod.SourceMapRegistry
import typingsSlinky.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jest/console", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def getConsoleOutput(root: String, verbose: Boolean, buffer: js.Array[LogEntry]): String = js.native
  
  @js.native
  class BufferedConsole protected () extends default {
    def this(getSourceMaps: js.Function0[js.UndefOr[SourceMapRegistry | Null]]) = this()
  }
  /* static members */
  @js.native
  object BufferedConsole extends js.Object {
    
    def write(buffer: ConsoleBuffer, `type`: LogType, message: LogMessage): js.Array[LogEntry] = js.native
    def write(
      buffer: ConsoleBuffer,
      `type`: LogType,
      message: LogMessage,
      level: js.UndefOr[scala.Nothing],
      sourceMaps: SourceMapRegistry
    ): js.Array[LogEntry] = js.native
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
  
  @js.native
  class CustomConsole protected ()
    extends typingsSlinky.jestConsole.customConsoleMod.default {
    def this(stdout: WritableStream, stderr: WritableStream) = this()
    def this(stdout: WritableStream, stderr: WritableStream, formatBuffer: Formatter) = this()
  }
  
  @js.native
  class NullConsole ()
    extends typingsSlinky.jestConsole.nullConsoleMod.NullConsole
}

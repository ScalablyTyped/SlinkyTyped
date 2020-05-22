package typingsSlinky.jestConsole

import typingsSlinky.jestConsole.typesMod.ConsoleBuffer
import typingsSlinky.jestConsole.typesMod.LogEntry
import typingsSlinky.jestConsole.typesMod.LogMessage
import typingsSlinky.jestConsole.typesMod.LogType
import typingsSlinky.jestSourceMap.typesMod.SourceMapRegistry
import typingsSlinky.std.Console
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/console/build/BufferedConsole", JSImport.Namespace)
@js.native
object bufferedConsoleMod extends js.Object {
  @js.native
  trait BufferedConsole extends Console {
    var _buffer: js.Any = js.native
    var _counters: js.Any = js.native
    var _getSourceMaps: js.Any = js.native
    var _groupDepth: js.Any = js.native
    var _log: js.Any = js.native
    var _timers: js.Any = js.native
    def assert(value: js.Any): Unit = js.native
    def assert(value: js.Any, message: String): Unit = js.native
    def assert(value: js.Any, message: js.Error): Unit = js.native
    def debug(firstArg: js.Any, rest: js.Any*): Unit = js.native
    def dir(firstArg: js.Any, rest: js.Any*): Unit = js.native
    def dirxml(firstArg: js.Any, rest: js.Any*): Unit = js.native
    def error(firstArg: js.Any, rest: js.Any*): Unit = js.native
    def getBuffer(): js.UndefOr[js.Array[LogEntry]] = js.native
    def group(): Unit = js.native
    def group(title: String, rest: js.Any*): Unit = js.native
    def groupCollapsed(): Unit = js.native
    def groupCollapsed(title: String, rest: js.Any*): Unit = js.native
    def info(firstArg: js.Any, rest: js.Any*): Unit = js.native
    def log(firstArg: js.Any, rest: js.Any*): Unit = js.native
    def warn(firstArg: js.Any, rest: js.Any*): Unit = js.native
  }
  
  @js.native
  class default protected () extends BufferedConsole {
    def this(getSourceMaps: js.Function0[js.UndefOr[SourceMapRegistry | Null]]) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
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


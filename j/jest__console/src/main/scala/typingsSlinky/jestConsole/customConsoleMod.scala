package typingsSlinky.jestConsole

import typingsSlinky.jestConsole.typesMod.LogMessage
import typingsSlinky.jestConsole.typesMod.LogType
import typingsSlinky.node.NodeJS.WritableStream
import typingsSlinky.std.Console
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/console/build/CustomConsole", JSImport.Namespace)
@js.native
object customConsoleMod extends js.Object {
  @js.native
  trait CustomConsole extends Console {
    var _counters: js.Any = js.native
    var _formatBuffer: js.Any = js.native
    var _groupDepth: js.Any = js.native
    var _log: js.Any = js.native
    var _logError: js.Any = js.native
    var _stderr: js.Any = js.native
    var _stdout: js.Any = js.native
    var _timers: js.Any = js.native
    def assert(value: js.Any): Unit = js.native
    def assert(value: js.Any, message: String): Unit = js.native
    def assert(value: js.Any, message: js.Error): Unit = js.native
    def countReset(): Unit = js.native
    def countReset(label: String): Unit = js.native
    def dirxml(firstArg: js.Any, args: js.Any*): Unit = js.native
    def getBuffer(): js.UndefOr[scala.Nothing] = js.native
  }
  
  @js.native
  class default protected () extends CustomConsole {
    def this(stdout: WritableStream, stderr: WritableStream) = this()
    def this(stdout: WritableStream, stderr: WritableStream, formatBuffer: Formatter) = this()
  }
  
  type Formatter = js.Function2[/* type */ LogType, /* message */ LogMessage, String]
}


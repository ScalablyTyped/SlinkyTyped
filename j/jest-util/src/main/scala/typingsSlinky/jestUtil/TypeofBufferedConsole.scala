package typingsSlinky.jestUtil

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.jestConsole.mod.BufferedConsole
import typingsSlinky.jestConsole.typesMod.ConsoleBuffer
import typingsSlinky.jestConsole.typesMod.LogEntry
import typingsSlinky.jestConsole.typesMod.LogMessage
import typingsSlinky.jestConsole.typesMod.LogType
import typingsSlinky.jestSourceMap.typesMod.SourceMapRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofBufferedConsole
  extends Instantiable1[
      /* getSourceMaps */ js.Function0[js.UndefOr[SourceMapRegistry | Null]], 
      BufferedConsole
    ] {
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


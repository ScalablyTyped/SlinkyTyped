package typingsSlinky.jestDashUtil

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.atJestConsole.atJestConsoleMod.BufferedConsole
import typingsSlinky.atJestConsole.buildTypesMod.ConsoleBuffer
import typingsSlinky.atJestConsole.buildTypesMod.LogEntry
import typingsSlinky.atJestConsole.buildTypesMod.LogMessage
import typingsSlinky.atJestConsole.buildTypesMod.LogType
import typingsSlinky.atJestSourceDashMap.buildTypesMod.SourceMapRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassBufferedConsole
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


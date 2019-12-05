package typingsSlinky.ionic

import typingsSlinky.atIonicCliDashFramework.atIonicCliDashFrameworkMod.StreamHandler
import typingsSlinky.atIonicCliDashFramework.libLoggerMod.CreateTaggedFormatterOptions
import typingsSlinky.atIonicCliDashFramework.libLoggerMod.LoggerFormatter
import typingsSlinky.atIonicCliDashFramework.libLoggerMod.LoggerLevelWeight
import typingsSlinky.ionic.definitionsMod.ILogger
import typingsSlinky.node.NodeJS.WritableStream
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/utils/logger", JSImport.Namespace)
@js.native
object libUtilsLoggerMod extends js.Object {
  @js.native
  class Logger () extends ILogger
  
  def createDefaultLoggerHandlers(): Set[StreamHandler] = js.native
  def createDefaultLoggerHandlers(formatter: LoggerFormatter): Set[StreamHandler] = js.native
  def createFormatter(): LoggerFormatter = js.native
  def createFormatter(options: CreateTaggedFormatterOptions): LoggerFormatter = js.native
  def createPrefixedWriteStream(log: ILogger, prefix: String): WritableStream = js.native
  def createPrefixedWriteStream(log: ILogger, prefix: String, level: LoggerLevelWeight): WritableStream = js.native
}


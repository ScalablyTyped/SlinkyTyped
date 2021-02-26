package typingsSlinky.ionic

import typingsSlinky.ionic.definitionsMod.ILogger
import typingsSlinky.ionicCliFramework.loggerMod.CreateTaggedFormatterOptions
import typingsSlinky.ionicCliFramework.loggerMod.LoggerFormatter
import typingsSlinky.ionicCliFramework.loggerMod.LoggerLevelWeight
import typingsSlinky.ionicCliFramework.loggerMod.LoggerOptions
import typingsSlinky.ionicCliFramework.mod.StreamHandler
import typingsSlinky.node.NodeJS.WritableStream
import typingsSlinky.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggerMod {
  
  @JSImport("ionic/lib/utils/logger", "Logger")
  @js.native
  class Logger () extends ILogger {
    def this(hasLevelHandlers: LoggerOptions) = this()
  }
  
  @JSImport("ionic/lib/utils/logger", "createDefaultLoggerHandlers")
  @js.native
  def createDefaultLoggerHandlers(): Set[StreamHandler] = js.native
  @JSImport("ionic/lib/utils/logger", "createDefaultLoggerHandlers")
  @js.native
  def createDefaultLoggerHandlers(formatter: LoggerFormatter): Set[StreamHandler] = js.native
  
  @JSImport("ionic/lib/utils/logger", "createFormatter")
  @js.native
  def createFormatter(): LoggerFormatter = js.native
  @JSImport("ionic/lib/utils/logger", "createFormatter")
  @js.native
  def createFormatter(options: CreateTaggedFormatterOptions): LoggerFormatter = js.native
  
  @JSImport("ionic/lib/utils/logger", "createPrefixedWriteStream")
  @js.native
  def createPrefixedWriteStream(log: ILogger, prefix: String): WritableStream = js.native
  @JSImport("ionic/lib/utils/logger", "createPrefixedWriteStream")
  @js.native
  def createPrefixedWriteStream(log: ILogger, prefix: String, level: LoggerLevelWeight): WritableStream = js.native
}

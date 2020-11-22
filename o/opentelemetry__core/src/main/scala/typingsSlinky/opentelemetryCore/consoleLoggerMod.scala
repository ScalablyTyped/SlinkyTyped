package typingsSlinky.opentelemetryCore

import typingsSlinky.opentelemetryApi.loggerMod.Logger
import typingsSlinky.opentelemetryCore.typesMod.LogLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/core/build/src/common/ConsoleLogger", JSImport.Namespace)
@js.native
object consoleLoggerMod extends js.Object {
  
  @js.native
  class ConsoleLogger () extends Logger {
    def this(level: LogLevel) = this()
  }
}

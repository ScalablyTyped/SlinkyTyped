package typingsSlinky.opentelemetryCore

import typingsSlinky.opentelemetryApi.loggerMod.Logger
import typingsSlinky.opentelemetryCore.typesMod.LogLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object consoleLoggerMod {
  
  @JSImport("@opentelemetry/core/build/src/common/ConsoleLogger", "ConsoleLogger")
  @js.native
  class ConsoleLogger () extends Logger {
    def this(level: LogLevel) = this()
  }
}

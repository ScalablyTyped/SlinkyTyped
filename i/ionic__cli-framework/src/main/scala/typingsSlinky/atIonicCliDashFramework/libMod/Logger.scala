package typingsSlinky.atIonicCliDashFramework.libMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.atIonicCliDashFramework.libLoggerMod.LoggerHandler
import typingsSlinky.atIonicCliDashFramework.libLoggerMod.LoggerOptions
import typingsSlinky.std.ReadonlySet
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib", "Logger")
@js.native
class Logger ()
  extends typingsSlinky.atIonicCliDashFramework.libLoggerMod.Logger {
  def this(hasLevelHandlers: LoggerOptions) = this()
}

/* static members */
@JSImport("@ionic/cli-framework/lib", "Logger")
@js.native
object Logger extends js.Object {
  def cloneHandlers(handlers: ReadonlySet[LoggerHandler]): Set[LoggerHandler] = js.native
}

@JSImport("@ionic/cli-framework/lib", "logger")
@js.native
object logger
  extends TopLevel[typingsSlinky.atIonicCliDashFramework.libLoggerMod.Logger]


package typingsSlinky.ionicCliFramework.libMod

import typingsSlinky.ionicCliFramework.loggerMod.Logger
import typingsSlinky.ionicCliFramework.loggerMod.LoggerHandler
import typingsSlinky.ionicCliFramework.loggerMod.LoggerOptions
import typingsSlinky.std.ReadonlySet
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/cli-framework/lib", "Logger")
@js.native
class Logger_ () extends Logger {
  def this(hasLevelHandlers: LoggerOptions) = this()
}
/* static members */
@JSImport("@ionic/cli-framework/lib", "Logger")
@js.native
object Logger_ extends js.Object {
  
  def cloneHandlers(handlers: ReadonlySet[LoggerHandler]): Set[LoggerHandler] = js.native
}

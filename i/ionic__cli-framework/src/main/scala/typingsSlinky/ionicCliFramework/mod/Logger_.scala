package typingsSlinky.ionicCliFramework.mod

import typingsSlinky.ionicCliFramework.loggerMod.LoggerHandler
import typingsSlinky.ionicCliFramework.loggerMod.LoggerOptions
import typingsSlinky.std.ReadonlySet
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/cli-framework", "Logger")
@js.native
class Logger_ ()
  extends typingsSlinky.ionicCliFramework.libMod.Logger_ {
  def this(hasLevelHandlers: LoggerOptions) = this()
}
/* static members */
@JSImport("@ionic/cli-framework", "Logger")
@js.native
object Logger_ extends js.Object {
  
  def cloneHandlers(handlers: ReadonlySet[LoggerHandler]): Set[LoggerHandler] = js.native
}

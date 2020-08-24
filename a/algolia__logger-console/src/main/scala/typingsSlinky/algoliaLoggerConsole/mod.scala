package typingsSlinky.algoliaLoggerConsole

import typingsSlinky.algoliaLoggerCommon.mod.LogLevelType
import typingsSlinky.algoliaLoggerCommon.mod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/logger-console", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def createConsoleLogger(logLevel: LogLevelType): Logger = js.native
}


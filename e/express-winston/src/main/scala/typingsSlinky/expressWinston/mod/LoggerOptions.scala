package typingsSlinky.expressWinston.mod

import typingsSlinky.winston.mod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.expressWinston.mod.LoggerOptionsWithTransports
  - typingsSlinky.expressWinston.mod.LoggerOptionsWithWinstonInstance
*/
trait LoggerOptions extends js.Object

object LoggerOptions {
  @scala.inline
  def LoggerOptionsWithTransports(transports: js.Array[typingsSlinky.winstonTransport.mod.^]): LoggerOptions = {
    val __obj = js.Dynamic.literal(transports = transports.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggerOptions]
  }
  @scala.inline
  def LoggerOptionsWithWinstonInstance(winstonInstance: Logger): LoggerOptions = {
    val __obj = js.Dynamic.literal(winstonInstance = winstonInstance.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggerOptions]
  }
}


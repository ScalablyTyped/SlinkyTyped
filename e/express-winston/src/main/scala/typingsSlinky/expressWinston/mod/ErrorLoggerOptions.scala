package typingsSlinky.expressWinston.mod

import typingsSlinky.winston.mod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.expressWinston.mod.ErrorLoggerOptionsWithTransports
  - typingsSlinky.expressWinston.mod.ErrorLoggerOptionsWithWinstonInstance
*/
trait ErrorLoggerOptions extends js.Object
object ErrorLoggerOptions {
  
  @scala.inline
  def ErrorLoggerOptionsWithTransports(transports: js.Array[typingsSlinky.winstonTransport.mod.^]): ErrorLoggerOptions = {
    val __obj = js.Dynamic.literal(transports = transports.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorLoggerOptions]
  }
  
  @scala.inline
  def ErrorLoggerOptionsWithWinstonInstance(winstonInstance: Logger): ErrorLoggerOptions = {
    val __obj = js.Dynamic.literal(winstonInstance = winstonInstance.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorLoggerOptions]
  }
}

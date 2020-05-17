package typingsSlinky.expressWinston.mod

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
  implicit def apply(value: LoggerOptionsWithTransports): LoggerOptions = value.asInstanceOf[LoggerOptions]
  @scala.inline
  implicit def apply(value: LoggerOptionsWithWinstonInstance): LoggerOptions = value.asInstanceOf[LoggerOptions]
}


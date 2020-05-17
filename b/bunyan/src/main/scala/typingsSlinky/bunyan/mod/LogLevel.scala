package typingsSlinky.bunyan.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.bunyan.mod.LogLevelString
  - scala.Double
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  implicit def apply(value: Double): LogLevel = value.asInstanceOf[LogLevel]
  @scala.inline
  implicit def apply(value: LogLevelString): LogLevel = value.asInstanceOf[LogLevel]
}


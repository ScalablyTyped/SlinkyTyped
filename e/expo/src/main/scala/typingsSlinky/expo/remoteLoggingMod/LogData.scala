package typingsSlinky.expo.remoteLoggingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.expo.remoteLoggingMod.LogErrorData
*/
trait LogData extends js.Object

object LogData {
  @scala.inline
  implicit def apply(value: LogErrorData): LogData = value.asInstanceOf[LogData]
  @scala.inline
  implicit def apply(value: String): LogData = value.asInstanceOf[LogData]
}


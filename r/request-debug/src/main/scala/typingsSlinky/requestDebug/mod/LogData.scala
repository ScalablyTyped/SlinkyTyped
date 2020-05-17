package typingsSlinky.requestDebug.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.requestDebug.mod.RequestData
  - typingsSlinky.requestDebug.mod.ResponseData
  - typingsSlinky.requestDebug.mod.RedirectData
*/
trait LogData extends js.Object

object LogData {
  @scala.inline
  implicit def apply(value: RedirectData): LogData = value.asInstanceOf[LogData]
  @scala.inline
  implicit def apply(value: RequestData): LogData = value.asInstanceOf[LogData]
  @scala.inline
  implicit def apply(value: ResponseData): LogData = value.asInstanceOf[LogData]
}


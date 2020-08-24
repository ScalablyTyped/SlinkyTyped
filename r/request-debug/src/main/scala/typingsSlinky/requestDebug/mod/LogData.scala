package typingsSlinky.requestDebug.mod

import typingsSlinky.request.mod.Headers
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
  def RequestData(debugId: Double, headers: Headers, method: String, uri: String): LogData = {
    val __obj = js.Dynamic.literal(debugId = debugId.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogData]
  }
  @scala.inline
  def ResponseData(debugId: Double, headers: Headers, statusCode: Double): LogData = {
    val __obj = js.Dynamic.literal(debugId = debugId.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogData]
  }
  @scala.inline
  def RedirectData(debugId: Double, headers: Headers, statusCode: Double, uri: String): LogData = {
    val __obj = js.Dynamic.literal(debugId = debugId.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogData]
  }
}


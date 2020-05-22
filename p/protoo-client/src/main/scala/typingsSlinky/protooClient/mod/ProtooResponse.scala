package typingsSlinky.protooClient.mod

import typingsSlinky.protooClient.protooClientBooleans.`false`
import typingsSlinky.protooClient.protooClientBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.protooClient.anon.Data
  - typingsSlinky.protooClient.anon.ErrorCode
*/
trait ProtooResponse extends js.Object

object ProtooResponse {
  @scala.inline
  def Data(data: js.Any, id: Double, ok: `true`, response: `true`): ProtooResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtooResponse]
  }
  @scala.inline
  def ErrorCode(errorCode: Double, errorReason: String, id: Double, ok: `false`, response: `true`): ProtooResponse = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], errorReason = errorReason.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtooResponse]
  }
}


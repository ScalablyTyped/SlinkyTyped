package typingsSlinky.protooClient.anon

import typingsSlinky.protooClient.mod.ProtooResponse
import typingsSlinky.protooClient.protooClientBooleans.`false`
import typingsSlinky.protooClient.protooClientBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorCode extends ProtooResponse {
  var errorCode: Double
  var errorReason: String
  var id: Double
  var ok: `false`
  var response: `true`
}

object ErrorCode {
  @scala.inline
  def apply(errorCode: Double, errorReason: String, id: Double, ok: `false`, response: `true`): ErrorCode = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], errorReason = errorReason.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorCode]
  }
}


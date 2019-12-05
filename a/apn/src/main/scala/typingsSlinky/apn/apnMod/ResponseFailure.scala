package typingsSlinky.apn.apnMod

import typingsSlinky.apn.Anon_Reason
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseFailure extends js.Object {
  var device: String
  var error: js.UndefOr[js.Error] = js.undefined
  var response: js.UndefOr[Anon_Reason] = js.undefined
  var status: js.UndefOr[String] = js.undefined
}

object ResponseFailure {
  @scala.inline
  def apply(device: String, error: js.Error = null, response: Anon_Reason = null, status: String = null): ResponseFailure = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseFailure]
  }
}


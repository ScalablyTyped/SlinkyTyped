package typingsSlinky.facebookJsSdk.facebook

import typingsSlinky.facebookJsSdk.facebookJsSdkStrings.create
import typingsSlinky.facebookJsSdk.facebookJsSdkStrings.iframe
import typingsSlinky.facebookJsSdk.facebookJsSdkStrings.live_broadcast
import typingsSlinky.facebookJsSdk.facebookJsSdkStrings.popup
import typingsSlinky.facebookJsSdk.facebookJsSdkStrings.publish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveDialogParams extends DialogParams {
  var broadcast_data: js.UndefOr[LiveDialogResponse] = js.undefined
  @JSName("display")
  var display_LiveDialogParams: popup | iframe
  var method: live_broadcast
  var phase: create | publish
}

object LiveDialogParams {
  @scala.inline
  def apply(
    display: popup | iframe,
    method: live_broadcast,
    phase: create | publish,
    app_id: String = null,
    broadcast_data: LiveDialogResponse = null,
    redirect_uri: String = null
  ): LiveDialogParams = {
    val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], phase = phase.asInstanceOf[js.Any])
    if (app_id != null) __obj.updateDynamic("app_id")(app_id.asInstanceOf[js.Any])
    if (broadcast_data != null) __obj.updateDynamic("broadcast_data")(broadcast_data.asInstanceOf[js.Any])
    if (redirect_uri != null) __obj.updateDynamic("redirect_uri")(redirect_uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveDialogParams]
  }
}


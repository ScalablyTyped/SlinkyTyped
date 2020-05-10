package typingsSlinky.facebookJsSdk.facebook

import typingsSlinky.facebookJsSdk.facebookJsSdkStrings.create
import typingsSlinky.facebookJsSdk.facebookJsSdkStrings.iframe
import typingsSlinky.facebookJsSdk.facebookJsSdkStrings.live_broadcast
import typingsSlinky.facebookJsSdk.facebookJsSdkStrings.popup
import typingsSlinky.facebookJsSdk.facebookJsSdkStrings.publish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveDialogParams extends DialogParams {
  var broadcast_data: js.UndefOr[LiveDialogResponse] = js.native
  @JSName("display")
  var display_LiveDialogParams: popup | iframe = js.native
  var method: live_broadcast = js.native
  var phase: create | publish = js.native
}

object LiveDialogParams {
  @scala.inline
  def apply(display: popup | iframe, method: live_broadcast, phase: create | publish): LiveDialogParams = {
    val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], phase = phase.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveDialogParams]
  }
  @scala.inline
  implicit class LiveDialogParamsOps[Self <: LiveDialogParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplay(value: popup | iframe): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethod(value: live_broadcast): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhase(value: create | publish): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBroadcast_data(value: LiveDialogResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("broadcast_data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBroadcast_data: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("broadcast_data")(js.undefined)
        ret
    }
  }
  
}


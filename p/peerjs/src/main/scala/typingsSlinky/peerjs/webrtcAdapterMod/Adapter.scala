package typingsSlinky.peerjs.webrtcAdapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Adapter extends js.Object {
  var browserDetails: BrowserDetails = js.native
}

object Adapter {
  @scala.inline
  def apply(browserDetails: BrowserDetails): Adapter = {
    val __obj = js.Dynamic.literal(browserDetails = browserDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[Adapter]
  }
  @scala.inline
  implicit class AdapterOps[Self <: Adapter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrowserDetails(value: BrowserDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserDetails")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


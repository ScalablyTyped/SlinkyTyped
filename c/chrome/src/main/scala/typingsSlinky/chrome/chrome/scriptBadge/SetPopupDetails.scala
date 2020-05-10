package typingsSlinky.chrome.chrome.scriptBadge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetPopupDetails extends js.Object {
  var popup: String = js.native
  var tabId: Double = js.native
}

object SetPopupDetails {
  @scala.inline
  def apply(popup: String, tabId: Double): SetPopupDetails = {
    val __obj = js.Dynamic.literal(popup = popup.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetPopupDetails]
  }
  @scala.inline
  implicit class SetPopupDetailsOps[Self <: SetPopupDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPopup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.naverWhale.whale.pageAction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopupDetails extends js.Object {
  /** The html file to show in a popup. If set to the empty string (''), no popup is shown. */
  var popup: String = js.native
  /** The id of the tab for which you want to modify the page action. */
  var tabId: Double = js.native
}

object PopupDetails {
  @scala.inline
  def apply(popup: String, tabId: Double): PopupDetails = {
    val __obj = js.Dynamic.literal(popup = popup.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupDetails]
  }
  @scala.inline
  implicit class PopupDetailsOps[Self <: PopupDetails] (val x: Self) extends AnyVal {
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


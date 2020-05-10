package typingsSlinky.naverWhale.whale.webNavigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebNavigationReplacementCallbackDetails
  extends typingsSlinky.chrome.chrome.webNavigation.WebNavigationCallbackDetails {
  /** The ID of the tab that was replaced. */
  var replacedTabId: Double = js.native
}

object WebNavigationReplacementCallbackDetails {
  @scala.inline
  def apply(replacedTabId: Double, tabId: Double, timeStamp: Double): WebNavigationReplacementCallbackDetails = {
    val __obj = js.Dynamic.literal(replacedTabId = replacedTabId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebNavigationReplacementCallbackDetails]
  }
  @scala.inline
  implicit class WebNavigationReplacementCallbackDetailsOps[Self <: WebNavigationReplacementCallbackDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReplacedTabId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacedTabId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


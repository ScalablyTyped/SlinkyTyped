package typingsSlinky.chrome.chrome.browserAction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabDetails extends js.Object {
  /** Optional. Specify the tab to get the information. If no tab is specified, the non-tab-specific information is returned.  */
  var tabId: js.UndefOr[Double] = js.native
}

object TabDetails {
  @scala.inline
  def apply(): TabDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabDetails]
  }
  @scala.inline
  implicit class TabDetailsOps[Self <: TabDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTabId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabId")(js.undefined)
        ret
    }
  }
  
}


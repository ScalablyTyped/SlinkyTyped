package typingsSlinky.naverWhale.whale.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZoomChangeInfo extends js.Object {
  var newZoomFactor: Double = js.native
  var oldZoomFactor: Double = js.native
  var tabId: Double = js.native
  var zoomSettings: typingsSlinky.chrome.chrome.tabs.ZoomSettings = js.native
}

object ZoomChangeInfo {
  @scala.inline
  def apply(
    newZoomFactor: Double,
    oldZoomFactor: Double,
    tabId: Double,
    zoomSettings: typingsSlinky.chrome.chrome.tabs.ZoomSettings
  ): ZoomChangeInfo = {
    val __obj = js.Dynamic.literal(newZoomFactor = newZoomFactor.asInstanceOf[js.Any], oldZoomFactor = oldZoomFactor.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], zoomSettings = zoomSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoomChangeInfo]
  }
  @scala.inline
  implicit class ZoomChangeInfoOps[Self <: ZoomChangeInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewZoomFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newZoomFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldZoomFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldZoomFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoomSettings(value: typingsSlinky.chrome.chrome.tabs.ZoomSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomSettings")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


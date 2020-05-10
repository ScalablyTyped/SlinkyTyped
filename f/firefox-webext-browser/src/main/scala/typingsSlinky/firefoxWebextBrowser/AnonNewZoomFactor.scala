package typingsSlinky.firefoxWebextBrowser

import typingsSlinky.firefoxWebextBrowser.browser.tabs.ZoomSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNewZoomFactor extends js.Object {
  var newZoomFactor: Double = js.native
  var oldZoomFactor: Double = js.native
  var tabId: Double = js.native
  var zoomSettings: ZoomSettings = js.native
}

object AnonNewZoomFactor {
  @scala.inline
  def apply(newZoomFactor: Double, oldZoomFactor: Double, tabId: Double, zoomSettings: ZoomSettings): AnonNewZoomFactor = {
    val __obj = js.Dynamic.literal(newZoomFactor = newZoomFactor.asInstanceOf[js.Any], oldZoomFactor = oldZoomFactor.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], zoomSettings = zoomSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNewZoomFactor]
  }
  @scala.inline
  implicit class AnonNewZoomFactorOps[Self <: AnonNewZoomFactor] (val x: Self) extends AnyVal {
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
    def withZoomSettings(value: ZoomSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomSettings")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


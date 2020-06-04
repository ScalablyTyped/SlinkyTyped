package typingsSlinky.expoWebBrowser.webBrowserTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenBrowserOptions extends js.Object {
  var browserPackage: js.UndefOr[String] = js.undefined
  /** iOS only */
  var controlsColor: js.UndefOr[String] = js.undefined
  var enableBarCollapsing: js.UndefOr[Boolean] = js.undefined
  /** Android only */
  var showInRecents: js.UndefOr[Boolean] = js.undefined
  var showTitle: js.UndefOr[Boolean] = js.undefined
  var toolbarColor: js.UndefOr[String] = js.undefined
  var windowFeatures: js.UndefOr[String] = js.undefined
  var windowName: js.UndefOr[String] = js.undefined
}

object OpenBrowserOptions {
  @scala.inline
  def apply(): OpenBrowserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenBrowserOptions]
  }
  @scala.inline
  implicit class OpenBrowserOptionsOps[Self <: OpenBrowserOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBrowserPackage(value: String): Self = this.set("browserPackage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrowserPackage: Self = this.set("browserPackage", js.undefined)
    @scala.inline
    def setControlsColor(value: String): Self = this.set("controlsColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControlsColor: Self = this.set("controlsColor", js.undefined)
    @scala.inline
    def setEnableBarCollapsing(value: Boolean): Self = this.set("enableBarCollapsing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableBarCollapsing: Self = this.set("enableBarCollapsing", js.undefined)
    @scala.inline
    def setShowInRecents(value: Boolean): Self = this.set("showInRecents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowInRecents: Self = this.set("showInRecents", js.undefined)
    @scala.inline
    def setShowTitle(value: Boolean): Self = this.set("showTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowTitle: Self = this.set("showTitle", js.undefined)
    @scala.inline
    def setToolbarColor(value: String): Self = this.set("toolbarColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolbarColor: Self = this.set("toolbarColor", js.undefined)
    @scala.inline
    def setWindowFeatures(value: String): Self = this.set("windowFeatures", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowFeatures: Self = this.set("windowFeatures", js.undefined)
    @scala.inline
    def setWindowName(value: String): Self = this.set("windowName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowName: Self = this.set("windowName", js.undefined)
  }
  
}


package typingsSlinky.expoWebBrowser.webBrowserTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenBrowserOptions extends js.Object {
  var browserPackage: js.UndefOr[String] = js.native
  /** iOS only */
  var controlsColor: js.UndefOr[String] = js.native
  var enableBarCollapsing: js.UndefOr[Boolean] = js.native
  /** Android only */
  var showInRecents: js.UndefOr[Boolean] = js.native
  var showTitle: js.UndefOr[Boolean] = js.native
  var toolbarColor: js.UndefOr[String] = js.native
  var windowFeatures: js.UndefOr[String] = js.native
  var windowName: js.UndefOr[String] = js.native
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
    def withBrowserPackage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserPackage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowserPackage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserPackage")(js.undefined)
        ret
    }
    @scala.inline
    def withControlsColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlsColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControlsColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlsColor")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableBarCollapsing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableBarCollapsing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableBarCollapsing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableBarCollapsing")(js.undefined)
        ret
    }
    @scala.inline
    def withShowInRecents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInRecents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowInRecents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInRecents")(js.undefined)
        ret
    }
    @scala.inline
    def withShowTitle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbarColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbarColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarColor")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowFeatures(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowFeatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowFeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowFeatures")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowName")(js.undefined)
        ret
    }
  }
  
}


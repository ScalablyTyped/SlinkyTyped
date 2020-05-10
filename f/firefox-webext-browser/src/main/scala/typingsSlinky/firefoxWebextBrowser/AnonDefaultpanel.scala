package typingsSlinky.firefoxWebextBrowser

import typingsSlinky.firefoxWebextBrowser.browser.manifest.IconPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDefaultpanel extends js.Object {
  var browser_style: js.UndefOr[Boolean] = js.native
  var default_icon: js.UndefOr[IconPath] = js.native
  var default_panel: String = js.native
  var default_title: js.UndefOr[String] = js.native
  /** Whether or not the sidebar is opened at install. Default is `true`. */
  var open_at_install: js.UndefOr[Boolean] = js.native
}

object AnonDefaultpanel {
  @scala.inline
  def apply(default_panel: String): AnonDefaultpanel = {
    val __obj = js.Dynamic.literal(default_panel = default_panel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefaultpanel]
  }
  @scala.inline
  implicit class AnonDefaultpanelOps[Self <: AnonDefaultpanel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefault_panel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_panel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBrowser_style(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browser_style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowser_style: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browser_style")(js.undefined)
        ret
    }
    @scala.inline
    def withDefault_icon(value: IconPath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault_icon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_icon")(js.undefined)
        ret
    }
    @scala.inline
    def withDefault_title(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault_title: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_title")(js.undefined)
        ret
    }
    @scala.inline
    def withOpen_at_install(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open_at_install")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpen_at_install: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open_at_install")(js.undefined)
        ret
    }
  }
  
}


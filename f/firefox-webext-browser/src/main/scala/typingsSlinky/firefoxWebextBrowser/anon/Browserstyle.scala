package typingsSlinky.firefoxWebextBrowser.anon

import typingsSlinky.firefoxWebextBrowser.browser.manifest.ExtensionURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Browserstyle extends js.Object {
  var browser_style: js.UndefOr[Boolean] = js.native
  var chrome_style: js.UndefOr[Boolean] = js.native
  var open_in_tab: js.UndefOr[Boolean] = js.native
  var page: ExtensionURL = js.native
}

object Browserstyle {
  @scala.inline
  def apply(page: ExtensionURL): Browserstyle = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[Browserstyle]
  }
  @scala.inline
  implicit class BrowserstyleOps[Self <: Browserstyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPage(value: ExtensionURL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
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
    def withChrome_style(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chrome_style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChrome_style: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chrome_style")(js.undefined)
        ret
    }
    @scala.inline
    def withOpen_in_tab(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open_in_tab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpen_in_tab: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open_in_tab")(js.undefined)
        ret
    }
  }
  
}


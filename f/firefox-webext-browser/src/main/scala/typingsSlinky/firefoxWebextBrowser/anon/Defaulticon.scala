package typingsSlinky.firefoxWebextBrowser.anon

import typingsSlinky.firefoxWebextBrowser.browser.manifest.IconPath
import typingsSlinky.firefoxWebextBrowser.browser.manifest.MatchPattern
import typingsSlinky.firefoxWebextBrowser.browser.manifest.MatchPatternRestricted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Defaulticon extends js.Object {
  var browser_style: js.UndefOr[Boolean] = js.native
  var default_icon: js.UndefOr[IconPath] = js.native
  var default_popup: js.UndefOr[String] = js.native
  var default_title: js.UndefOr[String] = js.native
  var hide_matches: js.UndefOr[js.Array[MatchPatternRestricted]] = js.native
  var pinned: js.UndefOr[Boolean] = js.native
  var show_matches: js.UndefOr[js.Array[MatchPattern]] = js.native
}

object Defaulticon {
  @scala.inline
  def apply(): Defaulticon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Defaulticon]
  }
  @scala.inline
  implicit class DefaulticonOps[Self <: Defaulticon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withDefault_popup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_popup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault_popup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_popup")(js.undefined)
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
    def withHide_matches(value: js.Array[MatchPatternRestricted]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide_matches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHide_matches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide_matches")(js.undefined)
        ret
    }
    @scala.inline
    def withPinned(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPinned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinned")(js.undefined)
        ret
    }
    @scala.inline
    def withShow_matches(value: js.Array[MatchPattern]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show_matches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShow_matches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show_matches")(js.undefined)
        ret
    }
  }
  
}


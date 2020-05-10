package typingsSlinky.jquerymobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FixedToolbarOptions extends js.Object {
  var disablePageZoom: js.UndefOr[Boolean] = js.native
  var fullscreen: js.UndefOr[Boolean] = js.native
  var hideDuringFocus: js.UndefOr[String] = js.native
  var initSelector: js.UndefOr[String] = js.native
  var supportBlacklist: js.UndefOr[js.Function] = js.native
  var tapToggle: js.UndefOr[Boolean] = js.native
  var tapToggleBlacklist: js.UndefOr[String] = js.native
  var transition: js.UndefOr[String] = js.native
  var updatePagePadding: js.UndefOr[Boolean] = js.native
  var visibleOnPageShow: js.UndefOr[Boolean] = js.native
}

object FixedToolbarOptions {
  @scala.inline
  def apply(): FixedToolbarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FixedToolbarOptions]
  }
  @scala.inline
  implicit class FixedToolbarOptionsOps[Self <: FixedToolbarOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisablePageZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disablePageZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisablePageZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disablePageZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withFullscreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullscreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreen")(js.undefined)
        ret
    }
    @scala.inline
    def withHideDuringFocus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideDuringFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideDuringFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideDuringFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withInitSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportBlacklist(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportBlacklist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportBlacklist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportBlacklist")(js.undefined)
        ret
    }
    @scala.inline
    def withTapToggle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tapToggle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTapToggle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tapToggle")(js.undefined)
        ret
    }
    @scala.inline
    def withTapToggleBlacklist(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tapToggleBlacklist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTapToggleBlacklist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tapToggleBlacklist")(js.undefined)
        ret
    }
    @scala.inline
    def withTransition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdatePagePadding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatePagePadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdatePagePadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatePagePadding")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibleOnPageShow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleOnPageShow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibleOnPageShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleOnPageShow")(js.undefined)
        ret
    }
  }
  
}


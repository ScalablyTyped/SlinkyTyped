package typingsSlinky.firefoxWebextBrowser

import typingsSlinky.firefoxWebextBrowser.browser.manifest.ThemeColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAccentcolor extends js.Object {
  /**
    * @deprecated Unsupported colors property, use 'theme.colors.frame', this alias is ignored in Firefox >=
    *     70.
    */
  var accentcolor: js.UndefOr[ThemeColor] = js.native
  var bookmark_text: js.UndefOr[ThemeColor] = js.native
  var button_background_active: js.UndefOr[ThemeColor] = js.native
  var button_background_hover: js.UndefOr[ThemeColor] = js.native
  var frame: js.UndefOr[ThemeColor] = js.native
  var frame_inactive: js.UndefOr[ThemeColor] = js.native
  var icons: js.UndefOr[ThemeColor] = js.native
  var icons_attention: js.UndefOr[ThemeColor] = js.native
  var ntp_background: js.UndefOr[ThemeColor] = js.native
  var ntp_text: js.UndefOr[ThemeColor] = js.native
  var popup: js.UndefOr[ThemeColor] = js.native
  var popup_border: js.UndefOr[ThemeColor] = js.native
  var popup_highlight: js.UndefOr[ThemeColor] = js.native
  var popup_highlight_text: js.UndefOr[ThemeColor] = js.native
  var popup_text: js.UndefOr[ThemeColor] = js.native
  var sidebar: js.UndefOr[ThemeColor] = js.native
  var sidebar_border: js.UndefOr[ThemeColor] = js.native
  var sidebar_highlight: js.UndefOr[ThemeColor] = js.native
  var sidebar_highlight_text: js.UndefOr[ThemeColor] = js.native
  var sidebar_text: js.UndefOr[ThemeColor] = js.native
  var tab_background_separator: js.UndefOr[ThemeColor] = js.native
  var tab_background_text: js.UndefOr[ThemeColor] = js.native
  var tab_line: js.UndefOr[ThemeColor] = js.native
  var tab_loading: js.UndefOr[ThemeColor] = js.native
  var tab_selected: js.UndefOr[ThemeColor] = js.native
  var tab_text: js.UndefOr[ThemeColor] = js.native
  /**
    * @deprecated Unsupported color property, use 'theme.colors.tab_background_text', this alias is ignored in
    *     Firefox >= 70.
    */
  var textcolor: js.UndefOr[ThemeColor] = js.native
  var toolbar: js.UndefOr[ThemeColor] = js.native
  var toolbar_bottom_separator: js.UndefOr[ThemeColor] = js.native
  var toolbar_field: js.UndefOr[ThemeColor] = js.native
  var toolbar_field_border: js.UndefOr[ThemeColor] = js.native
  var toolbar_field_border_focus: js.UndefOr[ThemeColor] = js.native
  var toolbar_field_focus: js.UndefOr[ThemeColor] = js.native
  var toolbar_field_highlight: js.UndefOr[ThemeColor] = js.native
  var toolbar_field_highlight_text: js.UndefOr[ThemeColor] = js.native
  var toolbar_field_separator: js.UndefOr[ThemeColor] = js.native
  var toolbar_field_text: js.UndefOr[ThemeColor] = js.native
  var toolbar_field_text_focus: js.UndefOr[ThemeColor] = js.native
  /** This color property is an alias of 'bookmark_text'. */
  var toolbar_text: js.UndefOr[ThemeColor] = js.native
  var toolbar_top_separator: js.UndefOr[ThemeColor] = js.native
  var toolbar_vertical_separator: js.UndefOr[ThemeColor] = js.native
}

object AnonAccentcolor {
  @scala.inline
  def apply(): AnonAccentcolor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAccentcolor]
  }
  @scala.inline
  implicit class AnonAccentcolorOps[Self <: AnonAccentcolor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccentcolor(value: ThemeColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accentcolor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccentcolor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accentcolor")(js.undefined)
        ret
    }
    @scala.inline
    def withBookmark_text(value: ThemeColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bookmark_text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBookmark_text: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bookmark_text")(js.undefined)
        ret
    }
    @scala.inline
    def withButton_background_active(value: ThemeColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button_background_active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButton_background_active: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button_background_active")(js.undefined)
        ret
    }
    @scala.inline
    def withButton_background_hover(value: ThemeColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button_background_hover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButton_background_hover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button_background_hover")(js.undefined)
        ret
    }
    @scala.inline
    def withFrame(value: ThemeColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrame: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frame")(js.undefined)
        ret
    }
    @scala.inline
    def withFrame_inactive(value: ThemeColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frame_inactive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrame_inactive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frame_inactive")(js.undefined)
        ret
    }
    @scala.inline
    def withIcons(value: ThemeColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icons")(js.undefined)
        ret
    }
    @scala.inline
    def withIcons_attention(value: ThemeColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icons_attention")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcons_attention: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icons_attention")(js.undefined)
        ret
    }
    @scala.inline
    def withNtp_background(value: ThemeColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ntp_background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNtp_background: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ntp_background")(js.undefined)
        ret
    }
    @scala.inline
    def withNtp_text(value: ThemeColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ntp_text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNtp_text: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ntp_text")(js.undefined)
        ret
    }
    @scala.inline
    def withPopup(value: ThemeColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popup")(js.undefined)
        ret
    }
    @scala.inline
    def withPopup_border(value: ThemeColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popup_border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopup_border: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popup_border")(js.undefined)
        ret
    }
    @scala.inline
    def withPopup_highlight(value: ThemeColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popup_highlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopup_highlight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popup_highlight")(js.undefined)
        ret
    }
    @scala.inline
    def withPopup_highlight_text(value: ThemeColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popup_highlight_text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopup_highlight_text: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popup_highlight_text")(js.undefined)
        ret
    }
    @scala.inline
    def withPopup_text(value: ThemeColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popup_text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopup_text: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popup_text")(js.undefined)
        ret
    }
    @scala.inline
    def withSidebar(value: ThemeColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSidebar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebar")(js.undefined)
        ret
    }
    @scala.inline
    def withSidebar_border(value: ThemeColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebar_border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSidebar_border: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebar_border")(js.undefined)
        ret
    }
    @scala.inline
    def withSidebar_highlight(value: ThemeColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebar_highlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSidebar_highlight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebar_highlight")(js.undefined)
        ret
    }
    @scala.inline
    def withSidebar_highlight_text(value: ThemeColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebar_highlight_text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSidebar_highlight_text: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebar_highlight_text")(js.undefined)
        ret
    }
    @scala.inline
    def withSidebar_text(value: ThemeColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebar_text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSidebar_text: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebar_text")(js.undefined)
        ret
    }
    @scala.inline
    def withTab_background_separator(value: ThemeColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tab_background_separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTab_background_separator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tab_background_separator")(js.undefined)
        ret
    }
    @scala.inline
    def withTab_background_text(value: ThemeColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tab_background_text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTab_background_text: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tab_background_text")(js.undefined)
        ret
    }
    @scala.inline
    def withTab_line(value: ThemeColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tab_line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTab_line: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tab_line")(js.undefined)
        ret
    }
    @scala.inline
    def withTab_loading(value: ThemeColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tab_loading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTab_loading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tab_loading")(js.undefined)
        ret
    }
    @scala.inline
    def withTab_selected(value: ThemeColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tab_selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTab_selected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tab_selected")(js.undefined)
        ret
    }
    @scala.inline
    def withTab_text(value: ThemeColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tab_text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTab_text: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tab_text")(js.undefined)
        ret
    }
    @scala.inline
    def withTextcolor(value: ThemeColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textcolor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextcolor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textcolor")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbar(value: ThemeColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbar_bottom_separator(value: ThemeColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar_bottom_separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbar_bottom_separator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar_bottom_separator")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbar_field(value: ThemeColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar_field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbar_field: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar_field")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbar_field_border(value: ThemeColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar_field_border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbar_field_border: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar_field_border")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbar_field_border_focus(value: ThemeColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar_field_border_focus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbar_field_border_focus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar_field_border_focus")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbar_field_focus(value: ThemeColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar_field_focus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbar_field_focus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar_field_focus")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbar_field_highlight(value: ThemeColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar_field_highlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbar_field_highlight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar_field_highlight")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbar_field_highlight_text(value: ThemeColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar_field_highlight_text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbar_field_highlight_text: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar_field_highlight_text")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbar_field_separator(value: ThemeColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar_field_separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbar_field_separator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar_field_separator")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbar_field_text(value: ThemeColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar_field_text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbar_field_text: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar_field_text")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbar_field_text_focus(value: ThemeColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar_field_text_focus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbar_field_text_focus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar_field_text_focus")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbar_text(value: ThemeColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar_text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbar_text: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar_text")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbar_top_separator(value: ThemeColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar_top_separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbar_top_separator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar_top_separator")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbar_vertical_separator(value: ThemeColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar_vertical_separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbar_vertical_separator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar_vertical_separator")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.antDesignProLayout.defaultSettingsMod

import typingsSlinky.antDesignProLayout.AnonDefaultOpenAll
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.realDark
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.sidemenu
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.topmenu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Settings extends js.Object {
  var colorWeak: js.UndefOr[Boolean] = js.native
  /**
    * layout of content: `Fluid` or `Fixed`, only works when layout is topmenu
    */
  var contentWidth: ContentWidth = js.native
  /**
    * sticky siderbar
    */
  var fixSiderbar: Boolean = js.native
  /**
    * sticky header
    */
  var fixedHeader: Boolean = js.native
  var iconfontUrl: String = js.native
  /**
    * nav menu position: `sidemenu` or `topmenu`
    */
  var layout: sidemenu | topmenu = js.native
  var menu: AnonDefaultOpenAll = js.native
  /**
    * theme for nav menu
    */
  var navTheme: js.UndefOr[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MenuTheme */ js.Any) | realDark
  ] = js.native
  var primaryColor: String = js.native
  var title: String = js.native
}

object Settings {
  @scala.inline
  def apply(
    contentWidth: ContentWidth,
    fixSiderbar: Boolean,
    fixedHeader: Boolean,
    iconfontUrl: String,
    layout: sidemenu | topmenu,
    menu: AnonDefaultOpenAll,
    primaryColor: String,
    title: String
  ): Settings = {
    val __obj = js.Dynamic.literal(contentWidth = contentWidth.asInstanceOf[js.Any], fixSiderbar = fixSiderbar.asInstanceOf[js.Any], fixedHeader = fixedHeader.asInstanceOf[js.Any], iconfontUrl = iconfontUrl.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], primaryColor = primaryColor.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentWidth(value: ContentWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFixSiderbar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixSiderbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFixedHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIconfontUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconfontUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayout(value: sidemenu | topmenu): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenu(value: AnonDefaultOpenAll): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorWeak(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorWeak")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorWeak: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorWeak")(js.undefined)
        ret
    }
    @scala.inline
    def withNavTheme(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MenuTheme */ js.Any) | realDark
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navTheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navTheme")(js.undefined)
        ret
    }
  }
  
}


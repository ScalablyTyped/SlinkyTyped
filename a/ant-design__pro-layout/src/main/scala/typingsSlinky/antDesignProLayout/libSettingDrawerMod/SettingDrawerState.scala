package typingsSlinky.antDesignProLayout.libSettingDrawerMod

import typingsSlinky.antDesignProLayout.anon.DefaultOpenAll
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.realDark
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.sidemenu
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.topmenu
import typingsSlinky.antDesignProLayout.defaultSettingsMod.ContentWidth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent @ant-design/pro-layout.@ant-design/pro-layout/lib/SettingDrawer.MergerSettingsType<@ant-design/pro-layout.@ant-design/pro-layout/lib/defaultSettings.Settings> */
@js.native
trait SettingDrawerState extends js.Object {
  var collapse: js.UndefOr[Boolean] = js.native
  var colorWeak: js.UndefOr[Boolean] = js.native
  var contentWidth: js.UndefOr[ContentWidth] = js.native
  var fixSiderbar: js.UndefOr[Boolean] = js.native
  var fixedHeader: js.UndefOr[Boolean] = js.native
  var iconfontUrl: js.UndefOr[String] = js.native
  var language: js.UndefOr[String] = js.native
  var layout: js.UndefOr[sidemenu | topmenu] = js.native
  var menu: js.UndefOr[DefaultOpenAll] = js.native
  var navTheme: js.UndefOr[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MenuTheme */ js.Any) | realDark
  ] = js.native
  var primaryColor: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
}

object SettingDrawerState {
  @scala.inline
  def apply(): SettingDrawerState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettingDrawerState]
  }
  @scala.inline
  implicit class SettingDrawerStateOps[Self <: SettingDrawerState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollapse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapse")(js.undefined)
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
    def withContentWidth(value: ContentWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withFixSiderbar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixSiderbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixSiderbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixSiderbar")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withIconfontUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconfontUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconfontUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconfontUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: sidemenu | topmenu): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
        ret
    }
    @scala.inline
    def withMenu(value: DefaultOpenAll): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menu")(js.undefined)
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
    @scala.inline
    def withPrimaryColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}


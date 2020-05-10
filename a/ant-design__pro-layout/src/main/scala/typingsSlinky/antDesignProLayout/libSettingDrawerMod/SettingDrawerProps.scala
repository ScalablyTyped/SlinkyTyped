package typingsSlinky.antDesignProLayout.libSettingDrawerMod

import typingsSlinky.antDesignProLayout.MergerSettingsTypeSetting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SettingDrawerProps extends js.Object {
  var collapse: js.UndefOr[Boolean] = js.native
  var getContainer: js.UndefOr[js.Any] = js.native
  var hideColors: js.UndefOr[Boolean] = js.native
  var hideCopyButton: js.UndefOr[Boolean] = js.native
  var hideHintAlert: js.UndefOr[Boolean] = js.native
  var hideLoading: js.UndefOr[Boolean] = js.native
  var onCollapseChange: js.UndefOr[js.Function1[/* collapse */ Boolean, Unit]] = js.native
  var onSettingChange: js.UndefOr[js.Function1[/* settings */ MergerSettingsTypeSetting, Unit]] = js.native
  var publicPath: js.UndefOr[String] = js.native
  var settings: js.UndefOr[MergerSettingsTypeSetting] = js.native
}

object SettingDrawerProps {
  @scala.inline
  def apply(): SettingDrawerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettingDrawerProps]
  }
  @scala.inline
  implicit class SettingDrawerPropsOps[Self <: SettingDrawerProps] (val x: Self) extends AnyVal {
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
    def withGetContainer(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withHideColors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideColors")(js.undefined)
        ret
    }
    @scala.inline
    def withHideCopyButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideCopyButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideCopyButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideCopyButton")(js.undefined)
        ret
    }
    @scala.inline
    def withHideHintAlert(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideHintAlert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideHintAlert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideHintAlert")(js.undefined)
        ret
    }
    @scala.inline
    def withHideLoading(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideLoading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideLoading")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCollapseChange(value: /* collapse */ Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCollapseChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCollapseChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCollapseChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSettingChange(value: /* settings */ MergerSettingsTypeSetting => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSettingChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSettingChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSettingChange")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicPath")(js.undefined)
        ret
    }
    @scala.inline
    def withSettings(value: MergerSettingsTypeSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(js.undefined)
        ret
    }
  }
  
}


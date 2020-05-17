package typingsSlinky.reactNavigationMaterialBottomTabs.anon

import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveColorDark extends js.Object {
  var activeColorDark: js.UndefOr[String] = js.native
  var activeColorLight: js.UndefOr[String] = js.native
  var barStyleDark: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var barStyleLight: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var inactiveColorDark: js.UndefOr[String] = js.native
  var inactiveColorLight: js.UndefOr[String] = js.native
}

object ActiveColorDark {
  @scala.inline
  def apply(): ActiveColorDark = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActiveColorDark]
  }
  @scala.inline
  implicit class ActiveColorDarkOps[Self <: ActiveColorDark] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveColorDark(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeColorDark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveColorDark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeColorDark")(js.undefined)
        ret
    }
    @scala.inline
    def withActiveColorLight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeColorLight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveColorLight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeColorLight")(js.undefined)
        ret
    }
    @scala.inline
    def withBarStyleDark(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barStyleDark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarStyleDark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barStyleDark")(js.undefined)
        ret
    }
    @scala.inline
    def withBarStyleDarkNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barStyleDark")(null)
        ret
    }
    @scala.inline
    def withBarStyleLight(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barStyleLight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarStyleLight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barStyleLight")(js.undefined)
        ret
    }
    @scala.inline
    def withBarStyleLightNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barStyleLight")(null)
        ret
    }
    @scala.inline
    def withInactiveColorDark(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactiveColorDark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInactiveColorDark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactiveColorDark")(js.undefined)
        ret
    }
    @scala.inline
    def withInactiveColorLight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactiveColorLight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInactiveColorLight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactiveColorLight")(js.undefined)
        ret
    }
  }
  
}


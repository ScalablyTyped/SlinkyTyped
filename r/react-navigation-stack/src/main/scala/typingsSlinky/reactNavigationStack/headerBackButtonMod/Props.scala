package typingsSlinky.reactNavigationStack.headerBackButtonMod

import slinky.core.TagMod
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNavigationStack.anon.TintColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<react-navigation-stack.react-navigation-stack/lib/typescript/types.HeaderBackButtonProps, 'layoutPreset' | 'scene'> */
@js.native
trait Props extends js.Object {
  var allowFontScaling: js.UndefOr[Boolean] = js.native
  var backImage: js.UndefOr[js.Function1[/* props */ TintColor, TagMod[Any]]] = js.native
  var backTitleVisible: js.UndefOr[Boolean] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var onPress: js.Function0[Unit] = js.native
  var pressColorAndroid: js.UndefOr[String] = js.native
  var tintColor: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  var truncatedTitle: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double] = js.native
}

object Props {
  @scala.inline
  def apply(onPress: () => Unit): Props = {
    val __obj = js.Dynamic.literal(onPress = js.Any.fromFunction0(onPress))
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnPress(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPress")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAllowFontScaling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFontScaling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowFontScaling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFontScaling")(js.undefined)
        ret
    }
    @scala.inline
    def withBackImage(value: /* props */ TintColor => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backImage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBackImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backImage")(js.undefined)
        ret
    }
    @scala.inline
    def withBackTitleVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backTitleVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackTitleVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backTitleVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withPressColorAndroid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressColorAndroid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPressColorAndroid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressColorAndroid")(js.undefined)
        ret
    }
    @scala.inline
    def withTintColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tintColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTintColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tintColor")(js.undefined)
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
    @scala.inline
    def withTitleStyle(value: StyleProp[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleStyle")(null)
        ret
    }
    @scala.inline
    def withTruncatedTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncatedTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTruncatedTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncatedTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}


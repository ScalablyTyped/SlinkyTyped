package typingsSlinky.reactNavigationStack.headerBackButtonMod

import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNavigationStack.anon.TintColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<react-navigation-stack.react-navigation-stack/lib/typescript/types.HeaderBackButtonProps, 'layoutPreset' | 'scene'> */
trait Props extends js.Object {
  var allowFontScaling: js.UndefOr[Boolean] = js.undefined
  var backImage: js.UndefOr[js.Function1[/* props */ TintColor, ReactElement]] = js.undefined
  var backTitleVisible: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var onPress: js.Function0[Unit]
  var pressColorAndroid: js.UndefOr[String] = js.undefined
  var tintColor: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var truncatedTitle: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnPress(value: () => Unit): Self = this.set("onPress", js.Any.fromFunction0(value))
    @scala.inline
    def setAllowFontScaling(value: Boolean): Self = this.set("allowFontScaling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowFontScaling: Self = this.set("allowFontScaling", js.undefined)
    @scala.inline
    def setBackImage(value: /* props */ TintColor => ReactElement): Self = this.set("backImage", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBackImage: Self = this.set("backImage", js.undefined)
    @scala.inline
    def setBackTitleVisible(value: Boolean): Self = this.set("backTitleVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackTitleVisible: Self = this.set("backTitleVisible", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setPressColorAndroid(value: String): Self = this.set("pressColorAndroid", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePressColorAndroid: Self = this.set("pressColorAndroid", js.undefined)
    @scala.inline
    def setTintColor(value: String): Self = this.set("tintColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTintColor: Self = this.set("tintColor", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTitleStyle(value: StyleProp[TextStyle]): Self = this.set("titleStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleStyle: Self = this.set("titleStyle", js.undefined)
    @scala.inline
    def setTitleStyleNull: Self = this.set("titleStyle", null)
    @scala.inline
    def setTruncatedTitle(value: String): Self = this.set("truncatedTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTruncatedTitle: Self = this.set("truncatedTitle", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}


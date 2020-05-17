package typingsSlinky.reactNavigationStack.modularHeaderBackButtonMod

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNavigationStack.anon.TintColor
import typingsSlinky.reactNavigationStack.typesMod.HeaderLayoutPreset
import typingsSlinky.reactNavigationStack.typesMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-navigation-stack.react-navigation-stack/lib/typescript/types.HeaderBackButtonProps & {  LabelContainerComponent  :react.react.ComponentType<{}>,   ButtonContainerComponent  :react.react.ComponentType<{}>} */
@js.native
trait Props extends js.Object {
  var ButtonContainerComponent: ReactComponentClass[js.Object] = js.native
  var LabelContainerComponent: ReactComponentClass[js.Object] = js.native
  var allowFontScaling: js.UndefOr[Boolean] = js.native
  var backImage: js.UndefOr[js.Function1[/* props */ TintColor, TagMod[Any]]] = js.native
  var backTitleVisible: js.UndefOr[Boolean] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var layoutPreset: HeaderLayoutPreset = js.native
  var pressColorAndroid: js.UndefOr[String] = js.native
  var scene: Scene = js.native
  var tintColor: js.UndefOr[String] = js.native
  var title: js.UndefOr[String | Null] = js.native
  var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  var truncatedTitle: js.UndefOr[String | Null] = js.native
  var width: js.UndefOr[Double] = js.native
  def onPress(): Unit = js.native
}

object Props {
  @scala.inline
  def apply(
    ButtonContainerComponent: ReactComponentClass[js.Object],
    LabelContainerComponent: ReactComponentClass[js.Object],
    layoutPreset: HeaderLayoutPreset,
    onPress: () => Unit,
    scene: Scene
  ): Props = {
    val __obj = js.Dynamic.literal(ButtonContainerComponent = ButtonContainerComponent.asInstanceOf[js.Any], LabelContainerComponent = LabelContainerComponent.asInstanceOf[js.Any], layoutPreset = layoutPreset.asInstanceOf[js.Any], onPress = js.Any.fromFunction0(onPress), scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButtonContainerComponent(value: ReactComponentClass[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ButtonContainerComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelContainerComponent(value: ReactComponentClass[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LabelContainerComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayoutPreset(value: HeaderLayoutPreset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutPreset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnPress(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPress")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withScene(value: Scene): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scene")(value.asInstanceOf[js.Any])
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
    def withTitleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(null)
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
    def withTruncatedTitleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncatedTitle")(null)
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


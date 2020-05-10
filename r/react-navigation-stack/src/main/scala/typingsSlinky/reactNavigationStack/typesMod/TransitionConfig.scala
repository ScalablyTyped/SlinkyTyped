package typingsSlinky.reactNavigationStack.typesMod

import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNavigationStack.AnonTimingFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitionConfig extends js.Object {
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var containerStyleDark: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var containerStyleLight: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var screenInterpolator: SceneInterpolator = js.native
  var transitionSpec: AnonTimingFunction = js.native
}

object TransitionConfig {
  @scala.inline
  def apply(
    screenInterpolator: /* props */ SceneInterpolatorProps => js.Any,
    transitionSpec: AnonTimingFunction
  ): TransitionConfig = {
    val __obj = js.Dynamic.literal(screenInterpolator = js.Any.fromFunction1(screenInterpolator), transitionSpec = transitionSpec.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionConfig]
  }
  @scala.inline
  implicit class TransitionConfigOps[Self <: TransitionConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScreenInterpolator(value: /* props */ SceneInterpolatorProps => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenInterpolator")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTransitionSpec(value: AnonTimingFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionSpec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainerStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyle")(null)
        ret
    }
    @scala.inline
    def withContainerStyleDark(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyleDark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerStyleDark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyleDark")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerStyleDarkNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyleDark")(null)
        ret
    }
    @scala.inline
    def withContainerStyleLight(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyleLight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerStyleLight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyleLight")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerStyleLightNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyleLight")(null)
        ret
    }
  }
  
}


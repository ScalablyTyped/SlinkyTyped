package typingsSlinky.reactNavigationStack.typesMod

import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNavigationStack.anon.TimingFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionConfig extends js.Object {
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var containerStyleDark: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var containerStyleLight: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var screenInterpolator: SceneInterpolator
  var transitionSpec: TimingFunction
}

object TransitionConfig {
  @scala.inline
  def apply(screenInterpolator: /* props */ SceneInterpolatorProps => js.Any, transitionSpec: TimingFunction): TransitionConfig = {
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setScreenInterpolator(value: /* props */ SceneInterpolatorProps => js.Any): Self = this.set("screenInterpolator", js.Any.fromFunction1(value))
    @scala.inline
    def setTransitionSpec(value: TimingFunction): Self = this.set("transitionSpec", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("containerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerStyle: Self = this.set("containerStyle", js.undefined)
    @scala.inline
    def setContainerStyleNull: Self = this.set("containerStyle", null)
    @scala.inline
    def setContainerStyleDark(value: StyleProp[ViewStyle]): Self = this.set("containerStyleDark", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerStyleDark: Self = this.set("containerStyleDark", js.undefined)
    @scala.inline
    def setContainerStyleDarkNull: Self = this.set("containerStyleDark", null)
    @scala.inline
    def setContainerStyleLight(value: StyleProp[ViewStyle]): Self = this.set("containerStyleLight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerStyleLight: Self = this.set("containerStyleLight", js.undefined)
    @scala.inline
    def setContainerStyleLightNull: Self = this.set("containerStyleLight", null)
  }
  
}


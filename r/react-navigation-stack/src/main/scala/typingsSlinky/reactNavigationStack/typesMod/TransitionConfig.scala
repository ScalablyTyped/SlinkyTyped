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
  def apply(
    screenInterpolator: /* props */ SceneInterpolatorProps => js.Any,
    transitionSpec: TimingFunction,
    containerStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    containerStyleDark: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    containerStyleLight: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined
  ): TransitionConfig = {
    val __obj = js.Dynamic.literal(screenInterpolator = js.Any.fromFunction1(screenInterpolator), transitionSpec = transitionSpec.asInstanceOf[js.Any])
    if (!js.isUndefined(containerStyle)) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(containerStyleDark)) __obj.updateDynamic("containerStyleDark")(containerStyleDark.asInstanceOf[js.Any])
    if (!js.isUndefined(containerStyleLight)) __obj.updateDynamic("containerStyleLight")(containerStyleLight.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionConfig]
  }
}


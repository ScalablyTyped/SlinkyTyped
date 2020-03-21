package typingsSlinky.reactNavigationStack.typesMod

import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNavigationStack.AnonTimingFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionConfig extends js.Object {
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var containerStyleDark: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var containerStyleLight: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var screenInterpolator: SceneInterpolator
  var transitionSpec: AnonTimingFunction
}

object TransitionConfig {
  @scala.inline
  def apply(
    screenInterpolator: /* props */ SceneInterpolatorProps => js.Any,
    transitionSpec: AnonTimingFunction,
    containerStyle: StyleProp[ViewStyle] = null,
    containerStyleDark: StyleProp[ViewStyle] = null,
    containerStyleLight: StyleProp[ViewStyle] = null
  ): TransitionConfig = {
    val __obj = js.Dynamic.literal(screenInterpolator = js.Any.fromFunction1(screenInterpolator), transitionSpec = transitionSpec.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (containerStyleDark != null) __obj.updateDynamic("containerStyleDark")(containerStyleDark.asInstanceOf[js.Any])
    if (containerStyleLight != null) __obj.updateDynamic("containerStyleLight")(containerStyleLight.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionConfig]
  }
}


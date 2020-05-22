package typingsSlinky.reactNavigationStack.anon

import typingsSlinky.reactNavigationStack.typesMod.SceneInterpolatorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScreenInterpolator extends js.Object {
  var transitionSpec: Easing
  def screenInterpolator(props: SceneInterpolatorProps): OpacityNumber | OpacityTransform | `1`
}

object ScreenInterpolator {
  @scala.inline
  def apply(
    screenInterpolator: SceneInterpolatorProps => OpacityNumber | OpacityTransform | `1`,
    transitionSpec: Easing
  ): ScreenInterpolator = {
    val __obj = js.Dynamic.literal(screenInterpolator = js.Any.fromFunction1(screenInterpolator), transitionSpec = transitionSpec.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreenInterpolator]
  }
}


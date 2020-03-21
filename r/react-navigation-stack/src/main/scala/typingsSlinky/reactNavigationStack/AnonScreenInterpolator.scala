package typingsSlinky.reactNavigationStack

import typingsSlinky.reactNavigationStack.typesMod.SceneInterpolatorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonScreenInterpolator extends js.Object {
  var transitionSpec: AnonEasing
  def screenInterpolator(props: SceneInterpolatorProps): AnonOpacityNumber | AnonOpacityTransform | Anon1
}

object AnonScreenInterpolator {
  @scala.inline
  def apply(
    screenInterpolator: SceneInterpolatorProps => AnonOpacityNumber | AnonOpacityTransform | Anon1,
    transitionSpec: AnonEasing
  ): AnonScreenInterpolator = {
    val __obj = js.Dynamic.literal(screenInterpolator = js.Any.fromFunction1(screenInterpolator), transitionSpec = transitionSpec.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonScreenInterpolator]
  }
}


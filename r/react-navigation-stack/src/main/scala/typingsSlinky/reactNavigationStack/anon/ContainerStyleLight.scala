package typingsSlinky.reactNavigationStack.anon

import typingsSlinky.reactNavigationStack.typesMod.SceneInterpolatorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerStyleLight extends js.Object {
  var containerStyleDark: BackgroundColor
  var containerStyleLight: BackgroundColor
  var transitionSpec: Damping | Duration
  def screenInterpolator(props: SceneInterpolatorProps): OpacityNumber | OpacityTransform | OpacityUndefinedTransformArray
}

object ContainerStyleLight {
  @scala.inline
  def apply(
    containerStyleDark: BackgroundColor,
    containerStyleLight: BackgroundColor,
    screenInterpolator: SceneInterpolatorProps => OpacityNumber | OpacityTransform | OpacityUndefinedTransformArray,
    transitionSpec: Damping | Duration
  ): ContainerStyleLight = {
    val __obj = js.Dynamic.literal(containerStyleDark = containerStyleDark.asInstanceOf[js.Any], containerStyleLight = containerStyleLight.asInstanceOf[js.Any], screenInterpolator = js.Any.fromFunction1(screenInterpolator), transitionSpec = transitionSpec.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerStyleLight]
  }
}


package typingsSlinky.reactNavigationStack.anon

import typingsSlinky.reactNavigationStack.typesMod.SceneInterpolatorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerStyleDark extends js.Object {
  var containerStyleDark: BackgroundColor
  var containerStyleLight: BackgroundColor
  var transitionSpec: Damping | Duration
  def screenInterpolator(props: SceneInterpolatorProps): OpacityNumber | OverlayOpacity | ShadowOpacity
}

object ContainerStyleDark {
  @scala.inline
  def apply(
    containerStyleDark: BackgroundColor,
    containerStyleLight: BackgroundColor,
    screenInterpolator: SceneInterpolatorProps => OpacityNumber | OverlayOpacity | ShadowOpacity,
    transitionSpec: Damping | Duration
  ): ContainerStyleDark = {
    val __obj = js.Dynamic.literal(containerStyleDark = containerStyleDark.asInstanceOf[js.Any], containerStyleLight = containerStyleLight.asInstanceOf[js.Any], screenInterpolator = js.Any.fromFunction1(screenInterpolator), transitionSpec = transitionSpec.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerStyleDark]
  }
}


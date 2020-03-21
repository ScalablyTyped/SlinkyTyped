package typingsSlinky.reactNavigationStack

import typingsSlinky.reactNavigationStack.typesMod.SceneInterpolatorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContainerStyleDark extends js.Object {
  var containerStyleDark: AnonBackgroundColor
  var containerStyleLight: AnonBackgroundColor
  var transitionSpec: AnonDamping | AnonDuration
  def screenInterpolator(props: SceneInterpolatorProps): AnonOpacityNumber | AnonOverlayOpacity | AnonShadowOpacity
}

object AnonContainerStyleDark {
  @scala.inline
  def apply(
    containerStyleDark: AnonBackgroundColor,
    containerStyleLight: AnonBackgroundColor,
    screenInterpolator: SceneInterpolatorProps => AnonOpacityNumber | AnonOverlayOpacity | AnonShadowOpacity,
    transitionSpec: AnonDamping | AnonDuration
  ): AnonContainerStyleDark = {
    val __obj = js.Dynamic.literal(containerStyleDark = containerStyleDark.asInstanceOf[js.Any], containerStyleLight = containerStyleLight.asInstanceOf[js.Any], screenInterpolator = js.Any.fromFunction1(screenInterpolator), transitionSpec = transitionSpec.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonContainerStyleDark]
  }
}


package typingsSlinky.reactNavigationStack.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionSpec extends js.Object {
  var containerStyleDark: BackgroundColor
  var containerStyleLight: BackgroundColor
  var transitionSpec: Timing
  def screenInterpolator(): js.Object
}

object TransitionSpec {
  @scala.inline
  def apply(
    containerStyleDark: BackgroundColor,
    containerStyleLight: BackgroundColor,
    screenInterpolator: () => js.Object,
    transitionSpec: Timing
  ): TransitionSpec = {
    val __obj = js.Dynamic.literal(containerStyleDark = containerStyleDark.asInstanceOf[js.Any], containerStyleLight = containerStyleLight.asInstanceOf[js.Any], screenInterpolator = js.Any.fromFunction0(screenInterpolator), transitionSpec = transitionSpec.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionSpec]
  }
}


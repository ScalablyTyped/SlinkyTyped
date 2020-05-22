package typingsSlinky.reactNativeNavigation.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsCustomTransition extends js.Object {
  var animations: js.Array[OptionsCustomTransitionAnimation]
  var duration: js.UndefOr[Double] = js.undefined
}

object OptionsCustomTransition {
  @scala.inline
  def apply(
    animations: js.Array[OptionsCustomTransitionAnimation],
    duration: js.UndefOr[Double] = js.undefined
  ): OptionsCustomTransition = {
    val __obj = js.Dynamic.literal(animations = animations.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsCustomTransition]
  }
}


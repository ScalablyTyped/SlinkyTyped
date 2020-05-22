package typingsSlinky.reactNativeNavigation.optionsMod

import typingsSlinky.reactNativeNavigation.reactNativeNavigationStrings.sharedElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsCustomTransitionAnimation extends js.Object {
  /**
    * Animation duration
    */
  var duration: js.UndefOr[Double] = js.undefined
  /**
    * Transition from element Id
    */
  var fromId: String
  /**
    * Animation spring Velocity
    */
  var springVelocity: js.UndefOr[Double] = js.undefined
  /**
    * Animation delay
    */
  var startDelay: js.UndefOr[Double] = js.undefined
  /**
    * Transition to element Id
    */
  var toId: String
  /**
    * Animation type, only support sharedElement currently
    */
  var `type`: sharedElement
}

object OptionsCustomTransitionAnimation {
  @scala.inline
  def apply(
    fromId: String,
    toId: String,
    `type`: sharedElement,
    duration: js.UndefOr[Double] = js.undefined,
    springVelocity: js.UndefOr[Double] = js.undefined,
    startDelay: js.UndefOr[Double] = js.undefined
  ): OptionsCustomTransitionAnimation = {
    val __obj = js.Dynamic.literal(fromId = fromId.asInstanceOf[js.Any], toId = toId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(springVelocity)) __obj.updateDynamic("springVelocity")(springVelocity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startDelay)) __obj.updateDynamic("startDelay")(startDelay.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsCustomTransitionAnimation]
  }
}


package typingsSlinky.figma.mod.global

import typingsSlinky.figma.figmaStrings.BOTTOM
import typingsSlinky.figma.figmaStrings.LEFT
import typingsSlinky.figma.figmaStrings.MOVE_IN
import typingsSlinky.figma.figmaStrings.MOVE_OUT
import typingsSlinky.figma.figmaStrings.PUSH
import typingsSlinky.figma.figmaStrings.RIGHT
import typingsSlinky.figma.figmaStrings.SLIDE_IN
import typingsSlinky.figma.figmaStrings.SLIDE_OUT
import typingsSlinky.figma.figmaStrings.TOP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectionalTransition extends Transition {
  val direction: LEFT | RIGHT | TOP | BOTTOM
  val duration: Double
  val easing: Easing
  val matchLayers: Boolean
  val `type`: MOVE_IN | MOVE_OUT | PUSH | SLIDE_IN | SLIDE_OUT
}

object DirectionalTransition {
  @scala.inline
  def apply(
    direction: LEFT | RIGHT | TOP | BOTTOM,
    duration: Double,
    easing: Easing,
    matchLayers: Boolean,
    `type`: MOVE_IN | MOVE_OUT | PUSH | SLIDE_IN | SLIDE_OUT
  ): DirectionalTransition = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], matchLayers = matchLayers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionalTransition]
  }
}


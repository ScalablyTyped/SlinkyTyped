package typingsSlinky.figma.mod.global

import typingsSlinky.figma.figmaStrings.BOTTOM
import typingsSlinky.figma.figmaStrings.DISSOLVE
import typingsSlinky.figma.figmaStrings.LEFT
import typingsSlinky.figma.figmaStrings.MOVE_IN
import typingsSlinky.figma.figmaStrings.MOVE_OUT
import typingsSlinky.figma.figmaStrings.PUSH
import typingsSlinky.figma.figmaStrings.RIGHT
import typingsSlinky.figma.figmaStrings.SLIDE_IN
import typingsSlinky.figma.figmaStrings.SLIDE_OUT
import typingsSlinky.figma.figmaStrings.SMART_ANIMATE
import typingsSlinky.figma.figmaStrings.TOP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.figma.mod.global.SimpleTransition
  - typingsSlinky.figma.mod.global.DirectionalTransition
*/
trait Transition extends js.Object
object Transition {
  
  @scala.inline
  def SimpleTransition(duration: Double, easing: Easing, `type`: DISSOLVE | SMART_ANIMATE): Transition = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transition]
  }
  
  @scala.inline
  def DirectionalTransition(
    direction: LEFT | RIGHT | TOP | BOTTOM,
    duration: Double,
    easing: Easing,
    matchLayers: Boolean,
    `type`: MOVE_IN | MOVE_OUT | PUSH | SLIDE_IN | SLIDE_OUT
  ): Transition = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], matchLayers = matchLayers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transition]
  }
}

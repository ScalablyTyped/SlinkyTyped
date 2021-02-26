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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectionalTransition extends Transition {
  
  val direction: LEFT | RIGHT | TOP | BOTTOM = js.native
  
  val duration: Double = js.native
  
  val easing: Easing = js.native
  
  val matchLayers: Boolean = js.native
  
  val `type`: MOVE_IN | MOVE_OUT | PUSH | SLIDE_IN | SLIDE_OUT = js.native
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
  
  @scala.inline
  implicit class DirectionalTransitionMutableBuilder[Self <: DirectionalTransition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: LEFT | RIGHT | TOP | BOTTOM): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasing(value: Easing): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchLayers(value: Boolean): Self = StObject.set(x, "matchLayers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MOVE_IN | MOVE_OUT | PUSH | SLIDE_IN | SLIDE_OUT): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

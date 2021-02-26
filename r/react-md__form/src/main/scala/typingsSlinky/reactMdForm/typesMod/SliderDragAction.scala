package typingsSlinky.reactMdForm.typesMod

import typingsSlinky.reactMdForm.reactMdFormStrings.drag
import typingsSlinky.reactMdForm.reactMdFormStrings.mousedown
import typingsSlinky.reactMdForm.reactMdFormStrings.mousemove
import typingsSlinky.reactMdForm.reactMdFormStrings.mouseup
import typingsSlinky.reactMdForm.reactMdFormStrings.touchend
import typingsSlinky.reactMdForm.reactMdFormStrings.touchmove
import typingsSlinky.reactMdForm.reactMdFormStrings.touchstart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SliderDragAction
  extends SliderDragValues
     with SliderAction {
  
  var eventType: mousedown | mousemove | mouseup | touchstart | touchmove | touchend = js.native
  
  var `type`: drag = js.native
}
object SliderDragAction {
  
  @scala.inline
  def apply(
    clientX: Double,
    clientY: Double,
    eventType: mousedown | mousemove | mouseup | touchstart | touchmove | touchend,
    height: Double,
    left: Double,
    max: Double,
    min: Double,
    reversed: Boolean,
    step: Double,
    top: Double,
    `type`: drag,
    vertical: Boolean,
    width: Double
  ): SliderDragAction = {
    val __obj = js.Dynamic.literal(clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], reversed = reversed.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderDragAction]
  }
  
  @scala.inline
  implicit class SliderDragActionMutableBuilder[Self <: SliderDragAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventType(value: mousedown | mousemove | mouseup | touchstart | touchmove | touchend): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: drag): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

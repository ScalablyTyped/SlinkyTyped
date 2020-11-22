package typingsSlinky.reactMdForm.typesMod

import typingsSlinky.reactMdForm.reactMdFormStrings.decrement
import typingsSlinky.reactMdForm.reactMdFormStrings.drag
import typingsSlinky.reactMdForm.reactMdFormStrings.increment
import typingsSlinky.reactMdForm.reactMdFormStrings.maximum
import typingsSlinky.reactMdForm.reactMdFormStrings.minimum
import typingsSlinky.reactMdForm.reactMdFormStrings.mousedown
import typingsSlinky.reactMdForm.reactMdFormStrings.mousemove
import typingsSlinky.reactMdForm.reactMdFormStrings.mouseup
import typingsSlinky.reactMdForm.reactMdFormStrings.setValue
import typingsSlinky.reactMdForm.reactMdFormStrings.stop
import typingsSlinky.reactMdForm.reactMdFormStrings.touchend
import typingsSlinky.reactMdForm.reactMdFormStrings.touchmove
import typingsSlinky.reactMdForm.reactMdFormStrings.touchstart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactMdForm.typesMod.SliderIncrementAction
  - typingsSlinky.reactMdForm.typesMod.SliderDecrementAction
  - typingsSlinky.reactMdForm.typesMod.SliderMinimumAction
  - typingsSlinky.reactMdForm.typesMod.SliderMaximumAction
  - typingsSlinky.reactMdForm.typesMod.SliderDragAction
  - typingsSlinky.reactMdForm.typesMod.SliderStopAction
  - typingsSlinky.reactMdForm.typesMod.SliderSetValueAction
*/
trait SliderAction extends js.Object
object SliderAction {
  
  @scala.inline
  def SliderMaximumAction(max: Double, `type`: maximum): SliderAction = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderAction]
  }
  
  @scala.inline
  def SliderIncrementAction(dragging: Boolean, max: Double, min: Double, step: Double, `type`: increment): SliderAction = {
    val __obj = js.Dynamic.literal(dragging = dragging.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderAction]
  }
  
  @scala.inline
  def SliderDragAction(
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
  ): SliderAction = {
    val __obj = js.Dynamic.literal(clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], reversed = reversed.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderAction]
  }
  
  @scala.inline
  def SliderStopAction(`type`: stop): SliderAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderAction]
  }
  
  @scala.inline
  def SliderDecrementAction(dragging: Boolean, max: Double, min: Double, step: Double, `type`: decrement): SliderAction = {
    val __obj = js.Dynamic.literal(dragging = dragging.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderAction]
  }
  
  @scala.inline
  def SliderSetValueAction(`type`: setValue, value: Double): SliderAction = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderAction]
  }
  
  @scala.inline
  def SliderMinimumAction(min: Double, `type`: minimum): SliderAction = {
    val __obj = js.Dynamic.literal(min = min.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderAction]
  }
}

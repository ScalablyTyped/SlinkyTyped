package typingsSlinky.reactMdForm.typesMod

import typingsSlinky.reactMdForm.reactMdFormStrings.increment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SliderIncrementAction
  extends SliderStepParts
     with SliderAction {
  
  var dragging: Boolean = js.native
  
  var `type`: increment = js.native
}
object SliderIncrementAction {
  
  @scala.inline
  def apply(dragging: Boolean, max: Double, min: Double, step: Double, `type`: increment): SliderIncrementAction = {
    val __obj = js.Dynamic.literal(dragging = dragging.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderIncrementAction]
  }
  
  @scala.inline
  implicit class SliderIncrementActionMutableBuilder[Self <: SliderIncrementAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDragging(value: Boolean): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: increment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

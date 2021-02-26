package typingsSlinky.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionCondition extends StObject {
  
  var action: js.UndefOr[`10`] = js.native
  
  var condition: js.UndefOr[CreatedBefore] = js.native
}
object ActionCondition {
  
  @scala.inline
  def apply(): ActionCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionCondition]
  }
  
  @scala.inline
  implicit class ActionConditionMutableBuilder[Self <: ActionCondition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: `10`): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setCondition(value: CreatedBefore): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
  }
}

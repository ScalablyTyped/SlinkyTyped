package typingsSlinky.mongorito.mod

import typingsSlinky.mongorito.mod.ActionTypes.UPDATED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdatedAction extends Action {
  
  var fields: js.Object = js.native
  
  var `type`: UPDATED = js.native
}
object UpdatedAction {
  
  @scala.inline
  def apply(fields: js.Object, `type`: UPDATED): UpdatedAction = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatedAction]
  }
  
  @scala.inline
  implicit class UpdatedActionMutableBuilder[Self <: UpdatedAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: js.Object): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: UPDATED): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

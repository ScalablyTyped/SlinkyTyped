package typingsSlinky.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionContext extends StObject {
  
  /**
    * The system-generated unique ID that corresponds to an action's execution.
    */
  var actionExecutionId: js.UndefOr[ActionExecutionId] = js.native
  
  /**
    * The name of the action in the context of a job.
    */
  var name: js.UndefOr[ActionName] = js.native
}
object ActionContext {
  
  @scala.inline
  def apply(): ActionContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionContext]
  }
  
  @scala.inline
  implicit class ActionContextMutableBuilder[Self <: ActionContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionExecutionId(value: ActionExecutionId): Self = StObject.set(x, "actionExecutionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionExecutionIdUndefined: Self = StObject.set(x, "actionExecutionId", js.undefined)
    
    @scala.inline
    def setName(value: ActionName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

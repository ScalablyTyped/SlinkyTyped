package typingsSlinky.awsSdk.stepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskTimedOutEventDetails extends StObject {
  
  /**
    * A more detailed explanation of the cause of the failure.
    */
  var cause: js.UndefOr[SensitiveCause] = js.native
  
  /**
    * The error code of the failure.
    */
  var error: js.UndefOr[SensitiveError] = js.native
  
  /**
    * The service name of the resource in a task state.
    */
  var resource: Name = js.native
  
  /**
    * The action of the resource called by a task state.
    */
  var resourceType: Name = js.native
}
object TaskTimedOutEventDetails {
  
  @scala.inline
  def apply(resource: Name, resourceType: Name): TaskTimedOutEventDetails = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskTimedOutEventDetails]
  }
  
  @scala.inline
  implicit class TaskTimedOutEventDetailsMutableBuilder[Self <: TaskTimedOutEventDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCause(value: SensitiveCause): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
    
    @scala.inline
    def setError(value: SensitiveError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setResource(value: Name): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceType(value: Name): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}

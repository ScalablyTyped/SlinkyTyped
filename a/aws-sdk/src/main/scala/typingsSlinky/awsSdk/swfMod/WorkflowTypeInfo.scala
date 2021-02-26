package typingsSlinky.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkflowTypeInfo extends StObject {
  
  /**
    * The date when this type was registered.
    */
  var creationDate: js.Date = js.native
  
  /**
    * If the type is in deprecated state, then it is set to the date when the type was deprecated.
    */
  var deprecationDate: js.UndefOr[js.Date] = js.native
  
  /**
    * The description of the type registered through RegisterWorkflowType.
    */
  var description: js.UndefOr[Description] = js.native
  
  /**
    * The current status of the workflow type.
    */
  var status: RegistrationStatus = js.native
  
  /**
    * The workflow type this information is about.
    */
  var workflowType: WorkflowType = js.native
}
object WorkflowTypeInfo {
  
  @scala.inline
  def apply(creationDate: js.Date, status: RegistrationStatus, workflowType: WorkflowType): WorkflowTypeInfo = {
    val __obj = js.Dynamic.literal(creationDate = creationDate.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], workflowType = workflowType.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowTypeInfo]
  }
  
  @scala.inline
  implicit class WorkflowTypeInfoMutableBuilder[Self <: WorkflowTypeInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationDate(value: js.Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecationDate(value: js.Date): Self = StObject.set(x, "deprecationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecationDateUndefined: Self = StObject.set(x, "deprecationDate", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setStatus(value: RegistrationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflowType(value: WorkflowType): Self = StObject.set(x, "workflowType", value.asInstanceOf[js.Any])
  }
}

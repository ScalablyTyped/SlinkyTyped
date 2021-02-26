package typingsSlinky.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWorkflowAssignment extends StObject {
  
  var AssignedTo_DEPRECATED: IPropertyValue = js.native
  
  def Clone_DEPRECATED(): IWorkflowAssignment = js.native
  
  var CompletedBy_DEPRECATED: IPropertyValue = js.native
  
  var Deadline_DEPRECATED: IPropertyValue = js.native
  
  var Description_DEPRECATED: IPropertyValue = js.native
  
  var MonitoredBy_DEPRECATED: IPropertyValue = js.native
}
object IWorkflowAssignment {
  
  @scala.inline
  def apply(
    AssignedTo_DEPRECATED: IPropertyValue,
    Clone_DEPRECATED: () => IWorkflowAssignment,
    CompletedBy_DEPRECATED: IPropertyValue,
    Deadline_DEPRECATED: IPropertyValue,
    Description_DEPRECATED: IPropertyValue,
    MonitoredBy_DEPRECATED: IPropertyValue
  ): IWorkflowAssignment = {
    val __obj = js.Dynamic.literal(AssignedTo_DEPRECATED = AssignedTo_DEPRECATED.asInstanceOf[js.Any], Clone_DEPRECATED = js.Any.fromFunction0(Clone_DEPRECATED), CompletedBy_DEPRECATED = CompletedBy_DEPRECATED.asInstanceOf[js.Any], Deadline_DEPRECATED = Deadline_DEPRECATED.asInstanceOf[js.Any], Description_DEPRECATED = Description_DEPRECATED.asInstanceOf[js.Any], MonitoredBy_DEPRECATED = MonitoredBy_DEPRECATED.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWorkflowAssignment]
  }
  
  @scala.inline
  implicit class IWorkflowAssignmentMutableBuilder[Self <: IWorkflowAssignment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssignedTo_DEPRECATED(value: IPropertyValue): Self = StObject.set(x, "AssignedTo_DEPRECATED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClone_DEPRECATED(value: () => IWorkflowAssignment): Self = StObject.set(x, "Clone_DEPRECATED", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompletedBy_DEPRECATED(value: IPropertyValue): Self = StObject.set(x, "CompletedBy_DEPRECATED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeadline_DEPRECATED(value: IPropertyValue): Self = StObject.set(x, "Deadline_DEPRECATED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription_DEPRECATED(value: IPropertyValue): Self = StObject.set(x, "Description_DEPRECATED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoredBy_DEPRECATED(value: IPropertyValue): Self = StObject.set(x, "MonitoredBy_DEPRECATED", value.asInstanceOf[js.Any])
  }
}

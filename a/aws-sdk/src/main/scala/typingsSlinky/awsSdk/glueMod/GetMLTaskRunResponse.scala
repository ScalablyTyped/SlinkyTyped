package typingsSlinky.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMLTaskRunResponse extends StObject {
  
  /**
    * The date and time when this task run was completed.
    */
  var CompletedOn: js.UndefOr[js.Date] = js.native
  
  /**
    * The error strings that are associated with the task run.
    */
  var ErrorString: js.UndefOr[GenericString] = js.native
  
  /**
    * The amount of time (in seconds) that the task run consumed resources.
    */
  var ExecutionTime: js.UndefOr[typingsSlinky.awsSdk.glueMod.ExecutionTime] = js.native
  
  /**
    * The date and time when this task run was last modified.
    */
  var LastModifiedOn: js.UndefOr[js.Date] = js.native
  
  /**
    * The names of the log groups that are associated with the task run.
    */
  var LogGroupName: js.UndefOr[GenericString] = js.native
  
  /**
    * The list of properties that are associated with the task run.
    */
  var Properties: js.UndefOr[TaskRunProperties] = js.native
  
  /**
    * The date and time when this task run started.
    */
  var StartedOn: js.UndefOr[js.Date] = js.native
  
  /**
    * The status for this task run.
    */
  var Status: js.UndefOr[TaskStatusType] = js.native
  
  /**
    * The unique run identifier associated with this run.
    */
  var TaskRunId: js.UndefOr[HashString] = js.native
  
  /**
    * The unique identifier of the task run.
    */
  var TransformId: js.UndefOr[HashString] = js.native
}
object GetMLTaskRunResponse {
  
  @scala.inline
  def apply(): GetMLTaskRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMLTaskRunResponse]
  }
  
  @scala.inline
  implicit class GetMLTaskRunResponseMutableBuilder[Self <: GetMLTaskRunResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompletedOn(value: js.Date): Self = StObject.set(x, "CompletedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletedOnUndefined: Self = StObject.set(x, "CompletedOn", js.undefined)
    
    @scala.inline
    def setErrorString(value: GenericString): Self = StObject.set(x, "ErrorString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorStringUndefined: Self = StObject.set(x, "ErrorString", js.undefined)
    
    @scala.inline
    def setExecutionTime(value: ExecutionTime): Self = StObject.set(x, "ExecutionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionTimeUndefined: Self = StObject.set(x, "ExecutionTime", js.undefined)
    
    @scala.inline
    def setLastModifiedOn(value: js.Date): Self = StObject.set(x, "LastModifiedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedOnUndefined: Self = StObject.set(x, "LastModifiedOn", js.undefined)
    
    @scala.inline
    def setLogGroupName(value: GenericString): Self = StObject.set(x, "LogGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogGroupNameUndefined: Self = StObject.set(x, "LogGroupName", js.undefined)
    
    @scala.inline
    def setProperties(value: TaskRunProperties): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "Properties", js.undefined)
    
    @scala.inline
    def setStartedOn(value: js.Date): Self = StObject.set(x, "StartedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartedOnUndefined: Self = StObject.set(x, "StartedOn", js.undefined)
    
    @scala.inline
    def setStatus(value: TaskStatusType): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTaskRunId(value: HashString): Self = StObject.set(x, "TaskRunId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskRunIdUndefined: Self = StObject.set(x, "TaskRunId", js.undefined)
    
    @scala.inline
    def setTransformId(value: HashString): Self = StObject.set(x, "TransformId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformIdUndefined: Self = StObject.set(x, "TransformId", js.undefined)
  }
}

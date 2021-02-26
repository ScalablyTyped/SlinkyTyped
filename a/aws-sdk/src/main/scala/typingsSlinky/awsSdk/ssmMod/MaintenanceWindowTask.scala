package typingsSlinky.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaintenanceWindowTask extends StObject {
  
  /**
    * A description of the task.
    */
  var Description: js.UndefOr[MaintenanceWindowDescription] = js.native
  
  /**
    * Information about an S3 bucket to write task-level logs to.   LoggingInfo has been deprecated. To specify an S3 bucket to contain logs, instead use the OutputS3BucketName and OutputS3KeyPrefix options in the TaskInvocationParameters structure. For information about how Systems Manager handles these options for the supported maintenance window task types, see MaintenanceWindowTaskInvocationParameters. 
    */
  var LoggingInfo: js.UndefOr[typingsSlinky.awsSdk.ssmMod.LoggingInfo] = js.native
  
  /**
    * The maximum number of targets this task can be run for, in parallel.
    */
  var MaxConcurrency: js.UndefOr[typingsSlinky.awsSdk.ssmMod.MaxConcurrency] = js.native
  
  /**
    * The maximum number of errors allowed before this task stops being scheduled.
    */
  var MaxErrors: js.UndefOr[typingsSlinky.awsSdk.ssmMod.MaxErrors] = js.native
  
  /**
    * The task name.
    */
  var Name: js.UndefOr[MaintenanceWindowName] = js.native
  
  /**
    * The priority of the task in the maintenance window. The lower the number, the higher the priority. Tasks that have the same priority are scheduled in parallel.
    */
  var Priority: js.UndefOr[MaintenanceWindowTaskPriority] = js.native
  
  /**
    * The ARN of the IAM service role to use to publish Amazon Simple Notification Service (Amazon SNS) notifications for maintenance window Run Command tasks.
    */
  var ServiceRoleArn: js.UndefOr[ServiceRole] = js.native
  
  /**
    * The targets (either instances or tags). Instances are specified using Key=instanceids,Values=&lt;instanceid1&gt;,&lt;instanceid2&gt;. Tags are specified using Key=&lt;tag name&gt;,Values=&lt;tag value&gt;.
    */
  var Targets: js.UndefOr[typingsSlinky.awsSdk.ssmMod.Targets] = js.native
  
  /**
    * The resource that the task uses during execution. For RUN_COMMAND and AUTOMATION task types, TaskArn is the Systems Manager document name or ARN. For LAMBDA tasks, it's the function name or ARN. For STEP_FUNCTIONS tasks, it's the state machine ARN.
    */
  var TaskArn: js.UndefOr[MaintenanceWindowTaskArn] = js.native
  
  /**
    * The parameters that should be passed to the task when it is run.   TaskParameters has been deprecated. To specify parameters to pass to a task when it runs, instead use the Parameters option in the TaskInvocationParameters structure. For information about how Systems Manager handles these options for the supported maintenance window task types, see MaintenanceWindowTaskInvocationParameters. 
    */
  var TaskParameters: js.UndefOr[MaintenanceWindowTaskParameters] = js.native
  
  /**
    * The type of task. The type can be one of the following: RUN_COMMAND, AUTOMATION, LAMBDA, or STEP_FUNCTIONS.
    */
  var Type: js.UndefOr[MaintenanceWindowTaskType] = js.native
  
  /**
    * The ID of the maintenance window where the task is registered.
    */
  var WindowId: js.UndefOr[MaintenanceWindowId] = js.native
  
  /**
    * The task ID.
    */
  var WindowTaskId: js.UndefOr[MaintenanceWindowTaskId] = js.native
}
object MaintenanceWindowTask {
  
  @scala.inline
  def apply(): MaintenanceWindowTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceWindowTask]
  }
  
  @scala.inline
  implicit class MaintenanceWindowTaskMutableBuilder[Self <: MaintenanceWindowTask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: MaintenanceWindowDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setLoggingInfo(value: LoggingInfo): Self = StObject.set(x, "LoggingInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingInfoUndefined: Self = StObject.set(x, "LoggingInfo", js.undefined)
    
    @scala.inline
    def setMaxConcurrency(value: MaxConcurrency): Self = StObject.set(x, "MaxConcurrency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxConcurrencyUndefined: Self = StObject.set(x, "MaxConcurrency", js.undefined)
    
    @scala.inline
    def setMaxErrors(value: MaxErrors): Self = StObject.set(x, "MaxErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxErrorsUndefined: Self = StObject.set(x, "MaxErrors", js.undefined)
    
    @scala.inline
    def setName(value: MaintenanceWindowName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setPriority(value: MaintenanceWindowTaskPriority): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "Priority", js.undefined)
    
    @scala.inline
    def setServiceRoleArn(value: ServiceRole): Self = StObject.set(x, "ServiceRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceRoleArnUndefined: Self = StObject.set(x, "ServiceRoleArn", js.undefined)
    
    @scala.inline
    def setTargets(value: Targets): Self = StObject.set(x, "Targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetsUndefined: Self = StObject.set(x, "Targets", js.undefined)
    
    @scala.inline
    def setTargetsVarargs(value: Target*): Self = StObject.set(x, "Targets", js.Array(value :_*))
    
    @scala.inline
    def setTaskArn(value: MaintenanceWindowTaskArn): Self = StObject.set(x, "TaskArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskArnUndefined: Self = StObject.set(x, "TaskArn", js.undefined)
    
    @scala.inline
    def setTaskParameters(value: MaintenanceWindowTaskParameters): Self = StObject.set(x, "TaskParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskParametersUndefined: Self = StObject.set(x, "TaskParameters", js.undefined)
    
    @scala.inline
    def setType(value: MaintenanceWindowTaskType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    @scala.inline
    def setWindowId(value: MaintenanceWindowId): Self = StObject.set(x, "WindowId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowIdUndefined: Self = StObject.set(x, "WindowId", js.undefined)
    
    @scala.inline
    def setWindowTaskId(value: MaintenanceWindowTaskId): Self = StObject.set(x, "WindowTaskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowTaskIdUndefined: Self = StObject.set(x, "WindowTaskId", js.undefined)
  }
}

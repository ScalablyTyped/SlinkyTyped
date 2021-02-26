package typingsSlinky.maximMazurokGapiClientCloudtasks.gapi.client.cloudtasks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateTaskRequest extends StObject {
  
  /**
    * The response_view specifies which subset of the Task will be returned. By default response_view is BASIC; not all information is retrieved by default because some data, such as
    * payloads, might be desirable to return only when needed because of its large size or because of the sensitivity of data that it contains. Authorization for FULL requires
    * `cloudtasks.tasks.fullView` [Google IAM](https://cloud.google.com/iam/) permission on the Task resource.
    */
  var responseView: js.UndefOr[String] = js.native
  
  /**
    * Required. The task to add. Task names have the following format: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`. The user can optionally specify a task
    * name. If a name is not specified then the system will generate a random unique task id, which will be set in the task returned in the response. If schedule_time is not set or is in
    * the past then Cloud Tasks will set it to the current time. Task De-duplication: Explicitly specifying a task ID enables task de-duplication. If a task's ID is identical to that of
    * an existing task or a task that was deleted or executed recently then the call will fail with ALREADY_EXISTS. If the task's queue was created using Cloud Tasks, then another task
    * with the same name can't be created for ~1hour after the original task was deleted or executed. If the task's queue was created using queue.yaml or queue.xml, then another task with
    * the same name can't be created for ~9days after the original task was deleted or executed. Because there is an extra lookup cost to identify duplicate task names, these CreateTask
    * calls have significantly increased latency. Using hashed strings for the task id or for the prefix of the task id is recommended. Choosing task ids that are sequential or have
    * sequential prefixes, for example using a timestamp, causes an increase in latency and error rates in all task commands. The infrastructure relies on an approximately uniform
    * distribution of task ids to store and serve tasks efficiently.
    */
  var task: js.UndefOr[Task] = js.native
}
object CreateTaskRequest {
  
  @scala.inline
  def apply(): CreateTaskRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTaskRequest]
  }
  
  @scala.inline
  implicit class CreateTaskRequestMutableBuilder[Self <: CreateTaskRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResponseView(value: String): Self = StObject.set(x, "responseView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseViewUndefined: Self = StObject.set(x, "responseView", js.undefined)
    
    @scala.inline
    def setTask(value: Task): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskUndefined: Self = StObject.set(x, "task", js.undefined)
  }
}

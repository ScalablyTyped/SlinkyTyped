package typingsSlinky.awsSdk.datapipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetTaskStatusInput extends StObject {
  
  /**
    * If an error occurred during the task, this value specifies the error code. This value is set on the physical attempt object. It is used to display error information to the user. It should not start with string "Service_" which is reserved by the system.
    */
  var errorId: js.UndefOr[String] = js.native
  
  /**
    * If an error occurred during the task, this value specifies a text description of the error. This value is set on the physical attempt object. It is used to display error information to the user. The web service does not parse this value.
    */
  var errorMessage: js.UndefOr[typingsSlinky.awsSdk.datapipelineMod.errorMessage] = js.native
  
  /**
    * If an error occurred during the task, this value specifies the stack trace associated with the error. This value is set on the physical attempt object. It is used to display error information to the user. The web service does not parse this value.
    */
  var errorStackTrace: js.UndefOr[String] = js.native
  
  /**
    * The ID of the task assigned to the task runner. This value is provided in the response for PollForTask.
    */
  var taskId: typingsSlinky.awsSdk.datapipelineMod.taskId = js.native
  
  /**
    * If FINISHED, the task successfully completed. If FAILED, the task ended unsuccessfully. Preconditions use false.
    */
  var taskStatus: TaskStatus = js.native
}
object SetTaskStatusInput {
  
  @scala.inline
  def apply(taskId: taskId, taskStatus: TaskStatus): SetTaskStatusInput = {
    val __obj = js.Dynamic.literal(taskId = taskId.asInstanceOf[js.Any], taskStatus = taskStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetTaskStatusInput]
  }
  
  @scala.inline
  implicit class SetTaskStatusInputMutableBuilder[Self <: SetTaskStatusInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorId(value: String): Self = StObject.set(x, "errorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorIdUndefined: Self = StObject.set(x, "errorId", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: errorMessage): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    @scala.inline
    def setErrorStackTrace(value: String): Self = StObject.set(x, "errorStackTrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorStackTraceUndefined: Self = StObject.set(x, "errorStackTrace", js.undefined)
    
    @scala.inline
    def setTaskId(value: taskId): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskStatus(value: TaskStatus): Self = StObject.set(x, "taskStatus", value.asInstanceOf[js.Any])
  }
}

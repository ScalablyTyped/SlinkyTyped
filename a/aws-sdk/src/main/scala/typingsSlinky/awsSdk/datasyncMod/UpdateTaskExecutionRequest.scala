package typingsSlinky.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateTaskExecutionRequest extends StObject {
  
  var Options: typingsSlinky.awsSdk.datasyncMod.Options = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the specific task execution that is being updated. 
    */
  var TaskExecutionArn: typingsSlinky.awsSdk.datasyncMod.TaskExecutionArn = js.native
}
object UpdateTaskExecutionRequest {
  
  @scala.inline
  def apply(Options: Options, TaskExecutionArn: TaskExecutionArn): UpdateTaskExecutionRequest = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any], TaskExecutionArn = TaskExecutionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTaskExecutionRequest]
  }
  
  @scala.inline
  implicit class UpdateTaskExecutionRequestMutableBuilder[Self <: UpdateTaskExecutionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: Options): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskExecutionArn(value: TaskExecutionArn): Self = StObject.set(x, "TaskExecutionArn", value.asInstanceOf[js.Any])
  }
}

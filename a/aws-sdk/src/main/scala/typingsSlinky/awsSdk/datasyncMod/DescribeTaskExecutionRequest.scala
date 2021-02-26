package typingsSlinky.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTaskExecutionRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the task that is being executed.
    */
  var TaskExecutionArn: typingsSlinky.awsSdk.datasyncMod.TaskExecutionArn = js.native
}
object DescribeTaskExecutionRequest {
  
  @scala.inline
  def apply(TaskExecutionArn: TaskExecutionArn): DescribeTaskExecutionRequest = {
    val __obj = js.Dynamic.literal(TaskExecutionArn = TaskExecutionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTaskExecutionRequest]
  }
  
  @scala.inline
  implicit class DescribeTaskExecutionRequestMutableBuilder[Self <: DescribeTaskExecutionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTaskExecutionArn(value: TaskExecutionArn): Self = StObject.set(x, "TaskExecutionArn", value.asInstanceOf[js.Any])
  }
}

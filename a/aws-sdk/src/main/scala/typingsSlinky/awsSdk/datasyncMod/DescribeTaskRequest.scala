package typingsSlinky.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTaskRequest extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the task to describe.
    */
  var TaskArn: typingsSlinky.awsSdk.datasyncMod.TaskArn = js.native
}
object DescribeTaskRequest {
  
  @scala.inline
  def apply(TaskArn: TaskArn): DescribeTaskRequest = {
    val __obj = js.Dynamic.literal(TaskArn = TaskArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTaskRequest]
  }
  
  @scala.inline
  implicit class DescribeTaskRequestOps[Self <: DescribeTaskRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTaskArn(value: TaskArn): Self = this.set("TaskArn", value.asInstanceOf[js.Any])
  }
}

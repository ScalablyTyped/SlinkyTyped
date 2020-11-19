package typingsSlinky.awsSdk.iotjobsdataplaneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeJobExecutionResponse extends js.Object {
  
  /**
    * Contains data about a job execution.
    */
  var execution: js.UndefOr[JobExecution] = js.native
}
object DescribeJobExecutionResponse {
  
  @scala.inline
  def apply(): DescribeJobExecutionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeJobExecutionResponse]
  }
  
  @scala.inline
  implicit class DescribeJobExecutionResponseOps[Self <: DescribeJobExecutionResponse] (val x: Self) extends AnyVal {
    
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
    def setExecution(value: JobExecution): Self = this.set("execution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecution: Self = this.set("execution", js.undefined)
  }
}

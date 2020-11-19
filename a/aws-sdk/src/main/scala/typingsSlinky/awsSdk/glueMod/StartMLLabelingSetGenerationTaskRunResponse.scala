package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartMLLabelingSetGenerationTaskRunResponse extends js.Object {
  
  /**
    * The unique run identifier that is associated with this task run.
    */
  var TaskRunId: js.UndefOr[HashString] = js.native
}
object StartMLLabelingSetGenerationTaskRunResponse {
  
  @scala.inline
  def apply(): StartMLLabelingSetGenerationTaskRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartMLLabelingSetGenerationTaskRunResponse]
  }
  
  @scala.inline
  implicit class StartMLLabelingSetGenerationTaskRunResponseOps[Self <: StartMLLabelingSetGenerationTaskRunResponse] (val x: Self) extends AnyVal {
    
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
    def setTaskRunId(value: HashString): Self = this.set("TaskRunId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaskRunId: Self = this.set("TaskRunId", js.undefined)
  }
}

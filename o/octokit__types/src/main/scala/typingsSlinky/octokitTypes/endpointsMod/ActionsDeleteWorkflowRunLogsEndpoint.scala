package typingsSlinky.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionsDeleteWorkflowRunLogsEndpoint extends js.Object {
  
  var owner: String = js.native
  
  var repo: String = js.native
  
  var run_id: Double = js.native
}
object ActionsDeleteWorkflowRunLogsEndpoint {
  
  @scala.inline
  def apply(owner: String, repo: String, run_id: Double): ActionsDeleteWorkflowRunLogsEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], run_id = run_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsDeleteWorkflowRunLogsEndpoint]
  }
  
  @scala.inline
  implicit class ActionsDeleteWorkflowRunLogsEndpointOps[Self <: ActionsDeleteWorkflowRunLogsEndpoint] (val x: Self) extends AnyVal {
    
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
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRun_id(value: Double): Self = this.set("run_id", value.asInstanceOf[js.Any])
  }
}

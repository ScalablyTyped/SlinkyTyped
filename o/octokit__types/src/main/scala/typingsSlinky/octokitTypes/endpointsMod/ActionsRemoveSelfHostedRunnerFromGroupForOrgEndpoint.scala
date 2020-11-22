package typingsSlinky.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionsRemoveSelfHostedRunnerFromGroupForOrgEndpoint extends js.Object {
  
  @JSName("org")
  var org_ : String = js.native
  
  /**
    * Unique identifier of the self-hosted runner group.
    */
  var runner_group_id: Double = js.native
  
  /**
    * Unique identifier of the self-hosted runner.
    */
  var runner_id: Double = js.native
}
object ActionsRemoveSelfHostedRunnerFromGroupForOrgEndpoint {
  
  @scala.inline
  def apply(org_ : String, runner_group_id: Double, runner_id: Double): ActionsRemoveSelfHostedRunnerFromGroupForOrgEndpoint = {
    val __obj = js.Dynamic.literal(runner_group_id = runner_group_id.asInstanceOf[js.Any], runner_id = runner_id.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsRemoveSelfHostedRunnerFromGroupForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ActionsRemoveSelfHostedRunnerFromGroupForOrgEndpointOps[Self <: ActionsRemoveSelfHostedRunnerFromGroupForOrgEndpoint] (val x: Self) extends AnyVal {
    
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
    def setOrg_(value: String): Self = this.set("org", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunner_group_id(value: Double): Self = this.set("runner_group_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunner_id(value: Double): Self = this.set("runner_id", value.asInstanceOf[js.Any])
  }
}

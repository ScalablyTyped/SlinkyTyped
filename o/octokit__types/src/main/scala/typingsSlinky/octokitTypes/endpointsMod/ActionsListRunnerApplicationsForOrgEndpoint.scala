package typingsSlinky.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionsListRunnerApplicationsForOrgEndpoint extends js.Object {
  
  @JSName("org")
  var org_ : String = js.native
}
object ActionsListRunnerApplicationsForOrgEndpoint {
  
  @scala.inline
  def apply(org_ : String): ActionsListRunnerApplicationsForOrgEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsListRunnerApplicationsForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ActionsListRunnerApplicationsForOrgEndpointOps[Self <: ActionsListRunnerApplicationsForOrgEndpoint] (val x: Self) extends AnyVal {
    
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
  }
}

package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.anon.Allowmergecommit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionsListRepoAccessToSelfHostedRunnerGroupInOrgResponseData extends js.Object {
  
  var repositories: js.Array[Allowmergecommit] = js.native
  
  var total_count: Double = js.native
}
object ActionsListRepoAccessToSelfHostedRunnerGroupInOrgResponseData {
  
  @scala.inline
  def apply(repositories: js.Array[Allowmergecommit], total_count: Double): ActionsListRepoAccessToSelfHostedRunnerGroupInOrgResponseData = {
    val __obj = js.Dynamic.literal(repositories = repositories.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsListRepoAccessToSelfHostedRunnerGroupInOrgResponseData]
  }
  
  @scala.inline
  implicit class ActionsListRepoAccessToSelfHostedRunnerGroupInOrgResponseDataOps[Self <: ActionsListRepoAccessToSelfHostedRunnerGroupInOrgResponseData] (val x: Self) extends AnyVal {
    
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
    def setRepositoriesVarargs(value: Allowmergecommit*): Self = this.set("repositories", js.Array(value :_*))
    
    @scala.inline
    def setRepositories(value: js.Array[Allowmergecommit]): Self = this.set("repositories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_count(value: Double): Self = this.set("total_count", value.asInstanceOf[js.Any])
  }
}

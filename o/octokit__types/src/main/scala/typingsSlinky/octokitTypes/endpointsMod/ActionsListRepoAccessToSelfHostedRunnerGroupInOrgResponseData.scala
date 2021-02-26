package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.anon.Allowmergecommit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionsListRepoAccessToSelfHostedRunnerGroupInOrgResponseData extends StObject {
  
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
  implicit class ActionsListRepoAccessToSelfHostedRunnerGroupInOrgResponseDataMutableBuilder[Self <: ActionsListRepoAccessToSelfHostedRunnerGroupInOrgResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRepositories(value: js.Array[Allowmergecommit]): Self = StObject.set(x, "repositories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoriesVarargs(value: Allowmergecommit*): Self = StObject.set(x, "repositories", js.Array(value :_*))
    
    @scala.inline
    def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}

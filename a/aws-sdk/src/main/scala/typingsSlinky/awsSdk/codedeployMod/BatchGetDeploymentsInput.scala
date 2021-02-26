package typingsSlinky.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetDeploymentsInput extends StObject {
  
  /**
    *  A list of deployment IDs, separated by spaces. The maximum number of deployment IDs you can specify is 25.
    */
  var deploymentIds: DeploymentsList = js.native
}
object BatchGetDeploymentsInput {
  
  @scala.inline
  def apply(deploymentIds: DeploymentsList): BatchGetDeploymentsInput = {
    val __obj = js.Dynamic.literal(deploymentIds = deploymentIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetDeploymentsInput]
  }
  
  @scala.inline
  implicit class BatchGetDeploymentsInputMutableBuilder[Self <: BatchGetDeploymentsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeploymentIds(value: DeploymentsList): Self = StObject.set(x, "deploymentIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentIdsVarargs(value: DeploymentId*): Self = StObject.set(x, "deploymentIds", js.Array(value :_*))
  }
}

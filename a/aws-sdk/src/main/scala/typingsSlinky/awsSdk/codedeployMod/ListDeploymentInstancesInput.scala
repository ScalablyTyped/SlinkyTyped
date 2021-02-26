package typingsSlinky.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDeploymentInstancesInput extends StObject {
  
  /**
    *  The unique ID of a deployment. 
    */
  var deploymentId: DeploymentId = js.native
  
  /**
    * A subset of instances to list by status:    Pending: Include those instances with pending deployments.    InProgress: Include those instances where deployments are still in progress.    Succeeded: Include those instances with successful deployments.    Failed: Include those instances with failed deployments.    Skipped: Include those instances with skipped deployments.    Unknown: Include those instances with deployments in an unknown state.  
    */
  var instanceStatusFilter: js.UndefOr[InstanceStatusList] = js.native
  
  /**
    * The set of instances in a blue/green deployment, either those in the original environment ("BLUE") or those in the replacement environment ("GREEN"), for which you want to view instance information.
    */
  var instanceTypeFilter: js.UndefOr[InstanceTypeList] = js.native
  
  /**
    * An identifier returned from the previous list deployment instances call. It can be used to return the next set of deployment instances in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object ListDeploymentInstancesInput {
  
  @scala.inline
  def apply(deploymentId: DeploymentId): ListDeploymentInstancesInput = {
    val __obj = js.Dynamic.literal(deploymentId = deploymentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDeploymentInstancesInput]
  }
  
  @scala.inline
  implicit class ListDeploymentInstancesInputMutableBuilder[Self <: ListDeploymentInstancesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeploymentId(value: DeploymentId): Self = StObject.set(x, "deploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceStatusFilter(value: InstanceStatusList): Self = StObject.set(x, "instanceStatusFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceStatusFilterUndefined: Self = StObject.set(x, "instanceStatusFilter", js.undefined)
    
    @scala.inline
    def setInstanceStatusFilterVarargs(value: InstanceStatus*): Self = StObject.set(x, "instanceStatusFilter", js.Array(value :_*))
    
    @scala.inline
    def setInstanceTypeFilter(value: InstanceTypeList): Self = StObject.set(x, "instanceTypeFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypeFilterUndefined: Self = StObject.set(x, "instanceTypeFilter", js.undefined)
    
    @scala.inline
    def setInstanceTypeFilterVarargs(value: InstanceType*): Self = StObject.set(x, "instanceTypeFilter", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}

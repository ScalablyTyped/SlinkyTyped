package typingsSlinky.awsDashSdk.clientsAppconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDeploymentStrategyRequest extends js.Object {
  /**
    * The ID of the deployment strategy to get.
    */
  var DeploymentStrategyId: typingsSlinky.awsDashSdk.clientsAppconfigMod.DeploymentStrategyId = js.native
}

object GetDeploymentStrategyRequest {
  @scala.inline
  def apply(DeploymentStrategyId: DeploymentStrategyId): GetDeploymentStrategyRequest = {
    val __obj = js.Dynamic.literal(DeploymentStrategyId = DeploymentStrategyId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetDeploymentStrategyRequest]
  }
}


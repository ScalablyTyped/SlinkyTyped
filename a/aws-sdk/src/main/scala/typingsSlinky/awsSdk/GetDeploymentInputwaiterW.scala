package typingsSlinky.awsSdk

import typingsSlinky.awsSdk.codedeployMod.DeploymentId
import typingsSlinky.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/codedeploy.GetDeploymentInput & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait GetDeploymentInputwaiterW extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    *  The unique ID of a deployment associated with the IAM user or AWS account. 
    */
  var deploymentId: DeploymentId = js.native
}


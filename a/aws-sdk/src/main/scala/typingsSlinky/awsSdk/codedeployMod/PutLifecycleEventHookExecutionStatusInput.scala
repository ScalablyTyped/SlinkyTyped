package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutLifecycleEventHookExecutionStatusInput extends js.Object {
  /**
    *  The unique ID of a deployment. Pass this ID to a Lambda function that validates a deployment lifecycle event. 
    */
  var deploymentId: js.UndefOr[DeploymentId] = js.native
  /**
    *  The execution ID of a deployment's lifecycle hook. A deployment lifecycle hook is specified in the hooks section of the AppSpec file. 
    */
  var lifecycleEventHookExecutionId: js.UndefOr[LifecycleEventHookExecutionId] = js.native
  /**
    * The result of a Lambda function that validates a deployment lifecycle event (Succeeded or Failed).
    */
  var status: js.UndefOr[LifecycleEventStatus] = js.native
}

object PutLifecycleEventHookExecutionStatusInput {
  @scala.inline
  def apply(): PutLifecycleEventHookExecutionStatusInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutLifecycleEventHookExecutionStatusInput]
  }
  @scala.inline
  implicit class PutLifecycleEventHookExecutionStatusInputOps[Self <: PutLifecycleEventHookExecutionStatusInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeploymentId(value: DeploymentId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentId")(js.undefined)
        ret
    }
    @scala.inline
    def withLifecycleEventHookExecutionId(value: LifecycleEventHookExecutionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifecycleEventHookExecutionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLifecycleEventHookExecutionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifecycleEventHookExecutionId")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: LifecycleEventStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}


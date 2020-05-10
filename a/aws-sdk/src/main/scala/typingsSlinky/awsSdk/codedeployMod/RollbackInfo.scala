package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RollbackInfo extends js.Object {
  /**
    * The ID of the deployment rollback.
    */
  var rollbackDeploymentId: js.UndefOr[DeploymentId] = js.native
  /**
    * Information that describes the status of a deployment rollback (for example, whether the deployment can't be rolled back, is in progress, failed, or succeeded). 
    */
  var rollbackMessage: js.UndefOr[Description] = js.native
  /**
    * The deployment ID of the deployment that was underway and triggered a rollback deployment because it failed or was stopped.
    */
  var rollbackTriggeringDeploymentId: js.UndefOr[DeploymentId] = js.native
}

object RollbackInfo {
  @scala.inline
  def apply(): RollbackInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RollbackInfo]
  }
  @scala.inline
  implicit class RollbackInfoOps[Self <: RollbackInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRollbackDeploymentId(value: DeploymentId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollbackDeploymentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRollbackDeploymentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollbackDeploymentId")(js.undefined)
        ret
    }
    @scala.inline
    def withRollbackMessage(value: Description): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollbackMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRollbackMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollbackMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withRollbackTriggeringDeploymentId(value: DeploymentId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollbackTriggeringDeploymentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRollbackTriggeringDeploymentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollbackTriggeringDeploymentId")(js.undefined)
        ret
    }
  }
  
}


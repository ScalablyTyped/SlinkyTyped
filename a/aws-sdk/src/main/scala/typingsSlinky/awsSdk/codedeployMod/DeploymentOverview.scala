package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentOverview extends js.Object {
  /**
    * The number of instances in the deployment in a failed state.
    */
  var Failed: js.UndefOr[InstanceCount] = js.native
  /**
    * The number of instances in which the deployment is in progress.
    */
  var InProgress: js.UndefOr[InstanceCount] = js.native
  /**
    * The number of instances in the deployment in a pending state.
    */
  var Pending: js.UndefOr[InstanceCount] = js.native
  /**
    * The number of instances in a replacement environment ready to receive traffic in a blue/green deployment.
    */
  var Ready: js.UndefOr[InstanceCount] = js.native
  /**
    * The number of instances in the deployment in a skipped state.
    */
  var Skipped: js.UndefOr[InstanceCount] = js.native
  /**
    * The number of instances in the deployment to which revisions have been successfully deployed.
    */
  var Succeeded: js.UndefOr[InstanceCount] = js.native
}

object DeploymentOverview {
  @scala.inline
  def apply(): DeploymentOverview = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentOverview]
  }
  @scala.inline
  implicit class DeploymentOverviewOps[Self <: DeploymentOverview] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailed(value: InstanceCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Failed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Failed")(js.undefined)
        ret
    }
    @scala.inline
    def withInProgress(value: InstanceCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InProgress")(js.undefined)
        ret
    }
    @scala.inline
    def withPending(value: InstanceCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPending: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pending")(js.undefined)
        ret
    }
    @scala.inline
    def withReady(value: InstanceCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ready")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReady: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ready")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipped(value: InstanceCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Skipped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Skipped")(js.undefined)
        ret
    }
    @scala.inline
    def withSucceeded(value: InstanceCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Succeeded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSucceeded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Succeeded")(js.undefined)
        ret
    }
  }
  
}


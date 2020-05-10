package typingsSlinky.pulumiKubernetes.inputMod.apps.v1beta1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DeploymentStrategy describes how to replace existing pods with new ones.
  */
@js.native
trait DeploymentStrategy extends js.Object {
  /**
    * Rolling update config params. Present only if DeploymentStrategyType = RollingUpdate.
    */
  var rollingUpdate: js.UndefOr[Input[RollingUpdateDeployment]] = js.native
  /**
    * Type of deployment. Can be "Recreate" or "RollingUpdate". Default is RollingUpdate.
    */
  var `type`: js.UndefOr[Input[String]] = js.native
}

object DeploymentStrategy {
  @scala.inline
  def apply(): DeploymentStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentStrategy]
  }
  @scala.inline
  implicit class DeploymentStrategyOps[Self <: DeploymentStrategy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRollingUpdate(value: Input[RollingUpdateDeployment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollingUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRollingUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollingUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}


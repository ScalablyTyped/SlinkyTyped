package typingsSlinky.pulumiKubernetes.outputMod.apps.v1

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
  val rollingUpdate: RollingUpdateDeployment = js.native
  /**
    * Type of deployment. Can be "Recreate" or "RollingUpdate". Default is RollingUpdate.
    */
  val `type`: String = js.native
}

object DeploymentStrategy {
  @scala.inline
  def apply(rollingUpdate: RollingUpdateDeployment, `type`: String): DeploymentStrategy = {
    val __obj = js.Dynamic.literal(rollingUpdate = rollingUpdate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentStrategy]
  }
  @scala.inline
  implicit class DeploymentStrategyOps[Self <: DeploymentStrategy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRollingUpdate(value: RollingUpdateDeployment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollingUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


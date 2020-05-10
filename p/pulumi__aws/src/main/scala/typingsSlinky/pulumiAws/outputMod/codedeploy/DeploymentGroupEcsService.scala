package typingsSlinky.pulumiAws.outputMod.codedeploy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentGroupEcsService extends js.Object {
  /**
    * The name of the ECS cluster.
    */
  var clusterName: String = js.native
  /**
    * The name of the ECS service.
    */
  var serviceName: String = js.native
}

object DeploymentGroupEcsService {
  @scala.inline
  def apply(clusterName: String, serviceName: String): DeploymentGroupEcsService = {
    val __obj = js.Dynamic.literal(clusterName = clusterName.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentGroupEcsService]
  }
  @scala.inline
  implicit class DeploymentGroupEcsServiceOps[Self <: DeploymentGroupEcsService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


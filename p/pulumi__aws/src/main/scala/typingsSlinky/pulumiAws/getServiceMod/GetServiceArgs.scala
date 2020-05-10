package typingsSlinky.pulumiAws.getServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetServiceArgs extends js.Object {
  /**
    * The arn of the ECS Cluster
    */
  val clusterArn: String = js.native
  /**
    * The name of the ECS Service
    */
  val serviceName: String = js.native
}

object GetServiceArgs {
  @scala.inline
  def apply(clusterArn: String, serviceName: String): GetServiceArgs = {
    val __obj = js.Dynamic.literal(clusterArn = clusterArn.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServiceArgs]
  }
  @scala.inline
  implicit class GetServiceArgsOps[Self <: GetServiceArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterArn")(value.asInstanceOf[js.Any])
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


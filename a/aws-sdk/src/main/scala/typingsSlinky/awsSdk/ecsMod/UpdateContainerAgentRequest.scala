package typingsSlinky.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateContainerAgentRequest extends js.Object {
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster that your container instance is running on. If you do not specify a cluster, the default cluster is assumed.
    */
  var cluster: js.UndefOr[String] = js.native
  /**
    * The container instance ID or full ARN entries for the container instance on which you would like to update the Amazon ECS container agent.
    */
  var containerInstance: String = js.native
}

object UpdateContainerAgentRequest {
  @scala.inline
  def apply(containerInstance: String): UpdateContainerAgentRequest = {
    val __obj = js.Dynamic.literal(containerInstance = containerInstance.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateContainerAgentRequest]
  }
  @scala.inline
  implicit class UpdateContainerAgentRequestOps[Self <: UpdateContainerAgentRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainerInstance(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerInstance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCluster(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cluster")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCluster: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cluster")(js.undefined)
        ret
    }
  }
  
}


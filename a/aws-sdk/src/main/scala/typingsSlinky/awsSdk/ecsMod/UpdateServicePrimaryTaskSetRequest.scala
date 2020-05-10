package typingsSlinky.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateServicePrimaryTaskSetRequest extends js.Object {
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service that the task set exists in.
    */
  var cluster: String = js.native
  /**
    * The short name or full Amazon Resource Name (ARN) of the task set to set as the primary task set in the deployment.
    */
  var primaryTaskSet: String = js.native
  /**
    * The short name or full Amazon Resource Name (ARN) of the service that the task set exists in.
    */
  var service: String = js.native
}

object UpdateServicePrimaryTaskSetRequest {
  @scala.inline
  def apply(cluster: String, primaryTaskSet: String, service: String): UpdateServicePrimaryTaskSetRequest = {
    val __obj = js.Dynamic.literal(cluster = cluster.asInstanceOf[js.Any], primaryTaskSet = primaryTaskSet.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateServicePrimaryTaskSetRequest]
  }
  @scala.inline
  implicit class UpdateServicePrimaryTaskSetRequestOps[Self <: UpdateServicePrimaryTaskSetRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCluster(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cluster")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryTaskSet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryTaskSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withService(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


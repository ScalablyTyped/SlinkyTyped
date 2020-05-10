package typingsSlinky.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTaskSetRequest extends js.Object {
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service that the task set exists in.
    */
  var cluster: String = js.native
  var scale: Scale = js.native
  /**
    * The short name or full Amazon Resource Name (ARN) of the service that the task set exists in.
    */
  var service: String = js.native
  /**
    * The short name or full Amazon Resource Name (ARN) of the task set to update.
    */
  var taskSet: String = js.native
}

object UpdateTaskSetRequest {
  @scala.inline
  def apply(cluster: String, scale: Scale, service: String, taskSet: String): UpdateTaskSetRequest = {
    val __obj = js.Dynamic.literal(cluster = cluster.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], taskSet = taskSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTaskSetRequest]
  }
  @scala.inline
  implicit class UpdateTaskSetRequestOps[Self <: UpdateTaskSetRequest] (val x: Self) extends AnyVal {
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
    def withScale(value: Scale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withService(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaskSet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskSet")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTaskSetRequest extends js.Object {
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service that the task set exists in to delete.
    */
  var cluster: String = js.native
  /**
    * If true, this allows you to delete a task set even if it hasn't been scaled down to zero.
    */
  var force: js.UndefOr[BoxedBoolean] = js.native
  /**
    * The short name or full Amazon Resource Name (ARN) of the service that hosts the task set to delete.
    */
  var service: String = js.native
  /**
    * The task set ID or full Amazon Resource Name (ARN) of the task set to delete.
    */
  var taskSet: String = js.native
}

object DeleteTaskSetRequest {
  @scala.inline
  def apply(cluster: String, service: String, taskSet: String): DeleteTaskSetRequest = {
    val __obj = js.Dynamic.literal(cluster = cluster.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], taskSet = taskSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTaskSetRequest]
  }
  @scala.inline
  implicit class DeleteTaskSetRequestOps[Self <: DeleteTaskSetRequest] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withForce(value: BoxedBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force")(js.undefined)
        ret
    }
  }
  
}


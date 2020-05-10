package typingsSlinky.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateContainerInstancesStateResponse extends js.Object {
  /**
    * The list of container instances.
    */
  var containerInstances: js.UndefOr[ContainerInstances] = js.native
  /**
    * Any failures associated with the call.
    */
  var failures: js.UndefOr[Failures] = js.native
}

object UpdateContainerInstancesStateResponse {
  @scala.inline
  def apply(): UpdateContainerInstancesStateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateContainerInstancesStateResponse]
  }
  @scala.inline
  implicit class UpdateContainerInstancesStateResponseOps[Self <: UpdateContainerInstancesStateResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainerInstances(value: ContainerInstances): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerInstances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerInstances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerInstances")(js.undefined)
        ret
    }
    @scala.inline
    def withFailures(value: Failures): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failures")(js.undefined)
        ret
    }
  }
  
}


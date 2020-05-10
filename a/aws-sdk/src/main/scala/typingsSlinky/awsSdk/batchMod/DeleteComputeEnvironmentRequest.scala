package typingsSlinky.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteComputeEnvironmentRequest extends js.Object {
  /**
    * The name or Amazon Resource Name (ARN) of the compute environment to delete.
    */
  var computeEnvironment: String = js.native
}

object DeleteComputeEnvironmentRequest {
  @scala.inline
  def apply(computeEnvironment: String): DeleteComputeEnvironmentRequest = {
    val __obj = js.Dynamic.literal(computeEnvironment = computeEnvironment.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteComputeEnvironmentRequest]
  }
  @scala.inline
  implicit class DeleteComputeEnvironmentRequestOps[Self <: DeleteComputeEnvironmentRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComputeEnvironment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeEnvironment")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


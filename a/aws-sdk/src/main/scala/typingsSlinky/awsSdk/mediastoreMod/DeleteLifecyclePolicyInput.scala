package typingsSlinky.awsSdk.mediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteLifecyclePolicyInput extends js.Object {
  /**
    * The name of the container that holds the object lifecycle policy.
    */
  var ContainerName: typingsSlinky.awsSdk.mediastoreMod.ContainerName = js.native
}

object DeleteLifecyclePolicyInput {
  @scala.inline
  def apply(ContainerName: ContainerName): DeleteLifecyclePolicyInput = {
    val __obj = js.Dynamic.literal(ContainerName = ContainerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLifecyclePolicyInput]
  }
  @scala.inline
  implicit class DeleteLifecyclePolicyInputOps[Self <: DeleteLifecyclePolicyInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainerName(value: ContainerName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContainerName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


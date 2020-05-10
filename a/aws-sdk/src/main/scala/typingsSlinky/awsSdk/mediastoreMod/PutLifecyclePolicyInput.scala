package typingsSlinky.awsSdk.mediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutLifecyclePolicyInput extends js.Object {
  /**
    * The name of the container that you want to assign the object lifecycle policy to.
    */
  var ContainerName: typingsSlinky.awsSdk.mediastoreMod.ContainerName = js.native
  /**
    * The object lifecycle policy to apply to the container.
    */
  var LifecyclePolicy: typingsSlinky.awsSdk.mediastoreMod.LifecyclePolicy = js.native
}

object PutLifecyclePolicyInput {
  @scala.inline
  def apply(ContainerName: ContainerName, LifecyclePolicy: LifecyclePolicy): PutLifecyclePolicyInput = {
    val __obj = js.Dynamic.literal(ContainerName = ContainerName.asInstanceOf[js.Any], LifecyclePolicy = LifecyclePolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutLifecyclePolicyInput]
  }
  @scala.inline
  implicit class PutLifecyclePolicyInputOps[Self <: PutLifecyclePolicyInput] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withLifecyclePolicy(value: LifecyclePolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LifecyclePolicy")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


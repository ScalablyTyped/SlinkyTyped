package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyClusterInput extends js.Object {
  /**
    * The unique identifier of the cluster.
    */
  var ClusterId: String = js.native
  /**
    * The number of steps that can be executed concurrently. You can specify a maximum of 256 steps. 
    */
  var StepConcurrencyLevel: js.UndefOr[Integer] = js.native
}

object ModifyClusterInput {
  @scala.inline
  def apply(ClusterId: String): ModifyClusterInput = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyClusterInput]
  }
  @scala.inline
  implicit class ModifyClusterInputOps[Self <: ModifyClusterInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStepConcurrencyLevel(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StepConcurrencyLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStepConcurrencyLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StepConcurrencyLevel")(js.undefined)
        ret
    }
  }
  
}


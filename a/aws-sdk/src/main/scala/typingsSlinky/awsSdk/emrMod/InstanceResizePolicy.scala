package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceResizePolicy extends js.Object {
  /**
    * Decommissioning timeout override for the specific list of instances to be terminated.
    */
  var InstanceTerminationTimeout: js.UndefOr[Integer] = js.native
  /**
    * Specific list of instances to be protected when shrinking an instance group.
    */
  var InstancesToProtect: js.UndefOr[EC2InstanceIdsList] = js.native
  /**
    * Specific list of instances to be terminated when shrinking an instance group.
    */
  var InstancesToTerminate: js.UndefOr[EC2InstanceIdsList] = js.native
}

object InstanceResizePolicy {
  @scala.inline
  def apply(): InstanceResizePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceResizePolicy]
  }
  @scala.inline
  implicit class InstanceResizePolicyOps[Self <: InstanceResizePolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceTerminationTimeout(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceTerminationTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceTerminationTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceTerminationTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withInstancesToProtect(value: EC2InstanceIdsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstancesToProtect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstancesToProtect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstancesToProtect")(js.undefined)
        ret
    }
    @scala.inline
    def withInstancesToTerminate(value: EC2InstanceIdsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstancesToTerminate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstancesToTerminate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstancesToTerminate")(js.undefined)
        ret
    }
  }
  
}


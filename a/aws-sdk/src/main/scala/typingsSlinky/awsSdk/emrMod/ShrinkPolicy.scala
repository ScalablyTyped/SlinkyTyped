package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShrinkPolicy extends js.Object {
  /**
    * The desired timeout for decommissioning an instance. Overrides the default YARN decommissioning timeout.
    */
  var DecommissionTimeout: js.UndefOr[Integer] = js.native
  /**
    * Custom policy for requesting termination protection or termination of specific instances when shrinking an instance group.
    */
  var InstanceResizePolicy: js.UndefOr[typingsSlinky.awsSdk.emrMod.InstanceResizePolicy] = js.native
}

object ShrinkPolicy {
  @scala.inline
  def apply(): ShrinkPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShrinkPolicy]
  }
  @scala.inline
  implicit class ShrinkPolicyOps[Self <: ShrinkPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecommissionTimeout(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DecommissionTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecommissionTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DecommissionTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceResizePolicy(value: InstanceResizePolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceResizePolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceResizePolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceResizePolicy")(js.undefined)
        ret
    }
  }
  
}


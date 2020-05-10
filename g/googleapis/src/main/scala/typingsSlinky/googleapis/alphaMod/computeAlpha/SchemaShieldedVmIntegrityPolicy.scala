package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The policy describes the baseline against which VM instance boot integrity
  * is measured.
  */
@js.native
trait SchemaShieldedVmIntegrityPolicy extends js.Object {
  /**
    * Updates the integrity policy baseline using the measurements from the VM
    * instance&#39;s most recent boot.
    */
  var updateAutoLearnPolicy: js.UndefOr[Boolean] = js.native
}

object SchemaShieldedVmIntegrityPolicy {
  @scala.inline
  def apply(): SchemaShieldedVmIntegrityPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShieldedVmIntegrityPolicy]
  }
  @scala.inline
  implicit class SchemaShieldedVmIntegrityPolicyOps[Self <: SchemaShieldedVmIntegrityPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUpdateAutoLearnPolicy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateAutoLearnPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateAutoLearnPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateAutoLearnPolicy")(js.undefined)
        ret
    }
  }
  
}


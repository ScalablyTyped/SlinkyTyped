package typingsSlinky.libraCore.admissionControlPbMod.SubmitTransactionResponse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var acStatus: js.UndefOr[typingsSlinky.libraCore.admissionControlPbMod.AdmissionControlStatus.AsObject] = js.native
  var mempoolStatus: js.UndefOr[typingsSlinky.libraCore.mempoolStatusPbMod.MempoolAddTransactionStatus.AsObject] = js.native
  var validatorId: js.typedarray.Uint8Array | String = js.native
  var vmStatus: js.UndefOr[typingsSlinky.libraCore.vmErrorsPbMod.VMStatus.AsObject] = js.native
}

object AsObject {
  @scala.inline
  def apply(validatorId: js.typedarray.Uint8Array | String): AsObject = {
    val __obj = js.Dynamic.literal(validatorId = validatorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValidatorIdUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validatorId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidatorId(value: js.typedarray.Uint8Array | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validatorId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAcStatus(value: typingsSlinky.libraCore.admissionControlPbMod.AdmissionControlStatus.AsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withMempoolStatus(value: typingsSlinky.libraCore.mempoolStatusPbMod.MempoolAddTransactionStatus.AsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mempoolStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMempoolStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mempoolStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withVmStatus(value: typingsSlinky.libraCore.vmErrorsPbMod.VMStatus.AsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVmStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmStatus")(js.undefined)
        ret
    }
  }
  
}


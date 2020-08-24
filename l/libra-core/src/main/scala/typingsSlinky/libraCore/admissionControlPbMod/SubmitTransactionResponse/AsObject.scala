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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setValidatorIdUint8Array(value: js.typedarray.Uint8Array): Self = this.set("validatorId", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidatorId(value: js.typedarray.Uint8Array | String): Self = this.set("validatorId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAcStatus(value: typingsSlinky.libraCore.admissionControlPbMod.AdmissionControlStatus.AsObject): Self = this.set("acStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcStatus: Self = this.set("acStatus", js.undefined)
    @scala.inline
    def setMempoolStatus(value: typingsSlinky.libraCore.mempoolStatusPbMod.MempoolAddTransactionStatus.AsObject): Self = this.set("mempoolStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMempoolStatus: Self = this.set("mempoolStatus", js.undefined)
    @scala.inline
    def setVmStatus(value: typingsSlinky.libraCore.vmErrorsPbMod.VMStatus.AsObject): Self = this.set("vmStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVmStatus: Self = this.set("vmStatus", js.undefined)
  }
  
}


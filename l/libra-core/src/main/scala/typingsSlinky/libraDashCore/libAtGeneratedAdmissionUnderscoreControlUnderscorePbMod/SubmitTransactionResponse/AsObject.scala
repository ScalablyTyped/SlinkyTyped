package typingsSlinky.libraDashCore.libAtGeneratedAdmissionUnderscoreControlUnderscorePbMod.SubmitTransactionResponse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var acStatus: js.UndefOr[
    typingsSlinky.libraDashCore.libAtGeneratedAdmissionUnderscoreControlUnderscorePbMod.AdmissionControlStatus.AsObject
  ] = js.undefined
  var mempoolStatus: js.UndefOr[
    typingsSlinky.libraDashCore.libAtGeneratedMempoolUnderscoreStatusUnderscorePbMod.MempoolAddTransactionStatus.AsObject
  ] = js.undefined
  var validatorId: scala.scalajs.js.typedarray.Uint8Array | String
  var vmStatus: js.UndefOr[
    typingsSlinky.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMStatus.AsObject
  ] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(
    validatorId: scala.scalajs.js.typedarray.Uint8Array | String,
    acStatus: typingsSlinky.libraDashCore.libAtGeneratedAdmissionUnderscoreControlUnderscorePbMod.AdmissionControlStatus.AsObject = null,
    mempoolStatus: typingsSlinky.libraDashCore.libAtGeneratedMempoolUnderscoreStatusUnderscorePbMod.MempoolAddTransactionStatus.AsObject = null,
    vmStatus: typingsSlinky.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMStatus.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(validatorId = validatorId.asInstanceOf[js.Any])
    if (acStatus != null) __obj.updateDynamic("acStatus")(acStatus.asInstanceOf[js.Any])
    if (mempoolStatus != null) __obj.updateDynamic("mempoolStatus")(mempoolStatus.asInstanceOf[js.Any])
    if (vmStatus != null) __obj.updateDynamic("vmStatus")(vmStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}


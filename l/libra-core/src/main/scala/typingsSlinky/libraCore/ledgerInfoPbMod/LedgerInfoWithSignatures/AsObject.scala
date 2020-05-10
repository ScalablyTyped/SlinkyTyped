package typingsSlinky.libraCore.ledgerInfoPbMod.LedgerInfoWithSignatures

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var ledgerInfo: js.UndefOr[typingsSlinky.libraCore.ledgerInfoPbMod.LedgerInfo.AsObject] = js.native
  var signaturesList: js.Array[typingsSlinky.libraCore.ledgerInfoPbMod.ValidatorSignature.AsObject] = js.native
}

object AsObject {
  @scala.inline
  def apply(signaturesList: js.Array[typingsSlinky.libraCore.ledgerInfoPbMod.ValidatorSignature.AsObject]): AsObject = {
    val __obj = js.Dynamic.literal(signaturesList = signaturesList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSignaturesList(value: js.Array[typingsSlinky.libraCore.ledgerInfoPbMod.ValidatorSignature.AsObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signaturesList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLedgerInfo(value: typingsSlinky.libraCore.ledgerInfoPbMod.LedgerInfo.AsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ledgerInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLedgerInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ledgerInfo")(js.undefined)
        ret
    }
  }
  
}


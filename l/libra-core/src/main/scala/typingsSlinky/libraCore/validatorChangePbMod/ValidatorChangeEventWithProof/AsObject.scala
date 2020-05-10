package typingsSlinky.libraCore.validatorChangePbMod.ValidatorChangeEventWithProof

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var eventWithProof: js.UndefOr[typingsSlinky.libraCore.eventsPbMod.EventWithProof.AsObject] = js.native
  var ledgerInfoWithSigs: js.UndefOr[typingsSlinky.libraCore.ledgerInfoPbMod.LedgerInfoWithSignatures.AsObject] = js.native
}

object AsObject {
  @scala.inline
  def apply(): AsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsObject]
  }
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventWithProof(value: typingsSlinky.libraCore.eventsPbMod.EventWithProof.AsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventWithProof")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventWithProof: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventWithProof")(js.undefined)
        ret
    }
    @scala.inline
    def withLedgerInfoWithSigs(value: typingsSlinky.libraCore.ledgerInfoPbMod.LedgerInfoWithSignatures.AsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ledgerInfoWithSigs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLedgerInfoWithSigs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ledgerInfoWithSigs")(js.undefined)
        ret
    }
  }
  
}


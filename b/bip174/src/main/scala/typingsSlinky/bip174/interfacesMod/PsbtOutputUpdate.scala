package typingsSlinky.bip174.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PsbtOutputUpdate extends js.Object {
  var bip32Derivation: js.UndefOr[js.Array[Bip32Derivation]] = js.native
  var redeemScript: js.UndefOr[RedeemScript] = js.native
  var witnessScript: js.UndefOr[WitnessScript] = js.native
}

object PsbtOutputUpdate {
  @scala.inline
  def apply(): PsbtOutputUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PsbtOutputUpdate]
  }
  @scala.inline
  implicit class PsbtOutputUpdateOps[Self <: PsbtOutputUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBip32Derivation(value: js.Array[Bip32Derivation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bip32Derivation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBip32Derivation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bip32Derivation")(js.undefined)
        ret
    }
    @scala.inline
    def withRedeemScript(value: RedeemScript): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redeemScript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedeemScript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redeemScript")(js.undefined)
        ret
    }
    @scala.inline
    def withWitnessScript(value: WitnessScript): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("witnessScript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWitnessScript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("witnessScript")(js.undefined)
        ret
    }
  }
  
}


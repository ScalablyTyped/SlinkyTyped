package typingsSlinky.bip174.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PsbtInputUpdate extends js.Object {
  var bip32Derivation: js.UndefOr[js.Array[Bip32Derivation]] = js.native
  var finalScriptSig: js.UndefOr[FinalScriptSig] = js.native
  var finalScriptWitness: js.UndefOr[FinalScriptWitness] = js.native
  var nonWitnessUtxo: js.UndefOr[NonWitnessUtxo] = js.native
  var partialSig: js.UndefOr[js.Array[PartialSig]] = js.native
  var porCommitment: js.UndefOr[PorCommitment] = js.native
  var redeemScript: js.UndefOr[RedeemScript] = js.native
  var sighashType: js.UndefOr[SighashType] = js.native
  var witnessScript: js.UndefOr[WitnessScript] = js.native
  var witnessUtxo: js.UndefOr[WitnessUtxo] = js.native
}

object PsbtInputUpdate {
  @scala.inline
  def apply(): PsbtInputUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PsbtInputUpdate]
  }
  @scala.inline
  implicit class PsbtInputUpdateOps[Self <: PsbtInputUpdate] (val x: Self) extends AnyVal {
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
    def withFinalScriptSig(value: FinalScriptSig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalScriptSig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinalScriptSig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalScriptSig")(js.undefined)
        ret
    }
    @scala.inline
    def withFinalScriptWitness(value: FinalScriptWitness): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalScriptWitness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinalScriptWitness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalScriptWitness")(js.undefined)
        ret
    }
    @scala.inline
    def withNonWitnessUtxo(value: NonWitnessUtxo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonWitnessUtxo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonWitnessUtxo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonWitnessUtxo")(js.undefined)
        ret
    }
    @scala.inline
    def withPartialSig(value: js.Array[PartialSig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partialSig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartialSig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partialSig")(js.undefined)
        ret
    }
    @scala.inline
    def withPorCommitment(value: PorCommitment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("porCommitment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPorCommitment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("porCommitment")(js.undefined)
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
    def withSighashType(value: SighashType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sighashType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSighashType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sighashType")(js.undefined)
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
    @scala.inline
    def withWitnessUtxo(value: WitnessUtxo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("witnessUtxo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWitnessUtxo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("witnessUtxo")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.bitcoinjsLib.psbtMod

import typingsSlinky.bip174.interfacesMod.Bip32Derivation
import typingsSlinky.bip174.interfacesMod.FinalScriptSig
import typingsSlinky.bip174.interfacesMod.FinalScriptWitness
import typingsSlinky.bip174.interfacesMod.KeyValue
import typingsSlinky.bip174.interfacesMod.NonWitnessUtxo
import typingsSlinky.bip174.interfacesMod.PartialSig
import typingsSlinky.bip174.interfacesMod.PorCommitment
import typingsSlinky.bip174.interfacesMod.PsbtInput
import typingsSlinky.bip174.interfacesMod.RedeemScript
import typingsSlinky.bip174.interfacesMod.SighashType
import typingsSlinky.bip174.interfacesMod.TransactionInput
import typingsSlinky.bip174.interfacesMod.WitnessScript
import typingsSlinky.bip174.interfacesMod.WitnessUtxo
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PsbtInputExtended
  extends PsbtInput
     with TransactionInput

object PsbtInputExtended {
  @scala.inline
  def apply(
    hash: String | Buffer,
    index: Double,
    bip32Derivation: js.Array[Bip32Derivation] = null,
    finalScriptSig: FinalScriptSig = null,
    finalScriptWitness: FinalScriptWitness = null,
    nonWitnessUtxo: NonWitnessUtxo = null,
    partialSig: js.Array[PartialSig] = null,
    porCommitment: PorCommitment = null,
    redeemScript: RedeemScript = null,
    sequence: js.UndefOr[Double] = js.undefined,
    sighashType: js.UndefOr[SighashType] = js.undefined,
    unknownKeyVals: js.Array[KeyValue] = null,
    witnessScript: WitnessScript = null,
    witnessUtxo: WitnessUtxo = null
  ): PsbtInputExtended = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    if (bip32Derivation != null) __obj.updateDynamic("bip32Derivation")(bip32Derivation.asInstanceOf[js.Any])
    if (finalScriptSig != null) __obj.updateDynamic("finalScriptSig")(finalScriptSig.asInstanceOf[js.Any])
    if (finalScriptWitness != null) __obj.updateDynamic("finalScriptWitness")(finalScriptWitness.asInstanceOf[js.Any])
    if (nonWitnessUtxo != null) __obj.updateDynamic("nonWitnessUtxo")(nonWitnessUtxo.asInstanceOf[js.Any])
    if (partialSig != null) __obj.updateDynamic("partialSig")(partialSig.asInstanceOf[js.Any])
    if (porCommitment != null) __obj.updateDynamic("porCommitment")(porCommitment.asInstanceOf[js.Any])
    if (redeemScript != null) __obj.updateDynamic("redeemScript")(redeemScript.asInstanceOf[js.Any])
    if (!js.isUndefined(sequence)) __obj.updateDynamic("sequence")(sequence.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sighashType)) __obj.updateDynamic("sighashType")(sighashType.get.asInstanceOf[js.Any])
    if (unknownKeyVals != null) __obj.updateDynamic("unknownKeyVals")(unknownKeyVals.asInstanceOf[js.Any])
    if (witnessScript != null) __obj.updateDynamic("witnessScript")(witnessScript.asInstanceOf[js.Any])
    if (witnessUtxo != null) __obj.updateDynamic("witnessUtxo")(witnessUtxo.asInstanceOf[js.Any])
    __obj.asInstanceOf[PsbtInputExtended]
  }
}


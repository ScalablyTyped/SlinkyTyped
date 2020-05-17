package typingsSlinky.bip174

import typingsSlinky.bip174.anon.CanAdd
import typingsSlinky.bip174.anon.CanAddToArray
import typingsSlinky.bip174.anon.TypeoffinalScriptSig
import typingsSlinky.bip174.anon.TypeoffinalScriptWitness
import typingsSlinky.bip174.anon.TypeofglobalXpub
import typingsSlinky.bip174.anon.TypeofnonWitnessUtxo
import typingsSlinky.bip174.anon.TypeofpartialSig
import typingsSlinky.bip174.anon.TypeofporCommitment
import typingsSlinky.bip174.anon.TypeofsighashType
import typingsSlinky.bip174.anon.TypeofunsignedTx
import typingsSlinky.bip174.anon.TypeofwitnessUtxo
import typingsSlinky.bip174.interfacesMod.KeyValue
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bip174/src/lib/converter", JSImport.Namespace)
@js.native
object converterMod extends js.Object {
  @js.native
  object globals extends js.Object {
    var globalXpub: TypeofglobalXpub = js.native
    var unsignedTx: TypeofunsignedTx = js.native
    def checkPubkey(keyVal: KeyValue): js.UndefOr[Buffer] = js.native
  }
  
  @js.native
  object inputs extends js.Object {
    var bip32Derivation: CanAddToArray = js.native
    var finalScriptSig: TypeoffinalScriptSig = js.native
    var finalScriptWitness: TypeoffinalScriptWitness = js.native
    var nonWitnessUtxo: TypeofnonWitnessUtxo = js.native
    var partialSig: TypeofpartialSig = js.native
    var porCommitment: TypeofporCommitment = js.native
    var redeemScript: CanAdd = js.native
    var sighashType: TypeofsighashType = js.native
    var witnessScript: CanAdd = js.native
    var witnessUtxo: TypeofwitnessUtxo = js.native
    def checkPubkey(keyVal: KeyValue): js.UndefOr[Buffer] = js.native
  }
  
  @js.native
  object outputs extends js.Object {
    var bip32Derivation: CanAddToArray = js.native
    var redeemScript: CanAdd = js.native
    var witnessScript: CanAdd = js.native
    def checkPubkey(keyVal: KeyValue): js.UndefOr[Buffer] = js.native
  }
  
}


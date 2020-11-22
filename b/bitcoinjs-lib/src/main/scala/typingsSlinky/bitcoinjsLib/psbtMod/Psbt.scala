package typingsSlinky.bitcoinjsLib.psbtMod

import typingsSlinky.bip174.interfacesMod.KeyValue
import typingsSlinky.bip174.interfacesMod.PsbtGlobalUpdate
import typingsSlinky.bip174.interfacesMod.PsbtInputUpdate
import typingsSlinky.bip174.interfacesMod.PsbtOutputUpdate
import typingsSlinky.bitcoinjsLib.ecpairMod.Signer
import typingsSlinky.bitcoinjsLib.ecpairMod.SignerAsync
import typingsSlinky.bitcoinjsLib.transactionMod.Transaction
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bitcoinjs-lib/types/psbt", "Psbt")
@js.native
class Psbt () extends js.Object {
  def this(opts: PsbtOptsOptional) = this()
  def this(opts: js.UndefOr[scala.Nothing], data: typingsSlinky.bip174.mod.Psbt) = this()
  def this(opts: PsbtOptsOptional, data: typingsSlinky.bip174.mod.Psbt) = this()
  
  var __CACHE: js.Any = js.native
  
  def addInput(inputData: PsbtInputExtended): this.type = js.native
  
  def addInputs(inputDatas: js.Array[PsbtInputExtended]): this.type = js.native
  
  def addOutput(outputData: PsbtOutputExtended): this.type = js.native
  
  def addOutputs(outputDatas: js.Array[PsbtOutputExtended]): this.type = js.native
  
  def addUnknownKeyValToGlobal(keyVal: KeyValue): this.type = js.native
  
  def addUnknownKeyValToInput(inputIndex: Double, keyVal: KeyValue): this.type = js.native
  
  def addUnknownKeyValToOutput(outputIndex: Double, keyVal: KeyValue): this.type = js.native
  
  def clearFinalizedInput(inputIndex: Double): this.type = js.native
  
  def combine(those: Psbt*): this.type = js.native
  
  val data: typingsSlinky.bip174.mod.Psbt = js.native
  
  def extractTransaction(): Transaction = js.native
  def extractTransaction(disableFeeCheck: Boolean): Transaction = js.native
  
  def finalizeAllInputs(): this.type = js.native
  
  def finalizeInput(inputIndex: Double): this.type = js.native
  def finalizeInput(inputIndex: Double, finalScriptsFunc: FinalScriptsFunc): this.type = js.native
  
  def getFee(): Double = js.native
  
  def getFeeRate(): Double = js.native
  
  def getInputType(inputIndex: Double): AllScriptType = js.native
  
  val inputCount: Double = js.native
  
  def inputHasHDKey(inputIndex: Double, root: HDSigner): Boolean = js.native
  
  def inputHasPubkey(inputIndex: Double, pubkey: Buffer): Boolean = js.native
  
  var locktime: Double = js.native
  
  var opts: js.Any = js.native
  
  def outputHasHDKey(outputIndex: Double, root: HDSigner): Boolean = js.native
  
  def outputHasPubkey(outputIndex: Double, pubkey: Buffer): Boolean = js.native
  
  def setInputSequence(inputIndex: Double, sequence: Double): this.type = js.native
  
  def setLocktime(locktime: Double): this.type = js.native
  
  def setMaximumFeeRate(satoshiPerByte: Double): Unit = js.native
  
  def setVersion(version: Double): this.type = js.native
  
  def signAllInputs(keyPair: Signer): this.type = js.native
  def signAllInputs(keyPair: Signer, sighashTypes: js.Array[Double]): this.type = js.native
  
  def signAllInputsAsync(keyPair: Signer): js.Promise[Unit] = js.native
  def signAllInputsAsync(keyPair: SignerAsync): js.Promise[Unit] = js.native
  def signAllInputsAsync(keyPair: SignerAsync, sighashTypes: js.Array[Double]): js.Promise[Unit] = js.native
  def signAllInputsAsync(keyPair: Signer, sighashTypes: js.Array[Double]): js.Promise[Unit] = js.native
  
  def signAllInputsHD(hdKeyPair: HDSigner): this.type = js.native
  def signAllInputsHD(hdKeyPair: HDSigner, sighashTypes: js.Array[Double]): this.type = js.native
  
  def signAllInputsHDAsync(hdKeyPair: HDSigner): js.Promise[Unit] = js.native
  def signAllInputsHDAsync(hdKeyPair: HDSignerAsync): js.Promise[Unit] = js.native
  def signAllInputsHDAsync(hdKeyPair: HDSignerAsync, sighashTypes: js.Array[Double]): js.Promise[Unit] = js.native
  def signAllInputsHDAsync(hdKeyPair: HDSigner, sighashTypes: js.Array[Double]): js.Promise[Unit] = js.native
  
  def signInput(inputIndex: Double, keyPair: Signer): this.type = js.native
  def signInput(inputIndex: Double, keyPair: Signer, sighashTypes: js.Array[Double]): this.type = js.native
  
  def signInputAsync(inputIndex: Double, keyPair: Signer): js.Promise[Unit] = js.native
  def signInputAsync(inputIndex: Double, keyPair: SignerAsync): js.Promise[Unit] = js.native
  def signInputAsync(inputIndex: Double, keyPair: SignerAsync, sighashTypes: js.Array[Double]): js.Promise[Unit] = js.native
  def signInputAsync(inputIndex: Double, keyPair: Signer, sighashTypes: js.Array[Double]): js.Promise[Unit] = js.native
  
  def signInputHD(inputIndex: Double, hdKeyPair: HDSigner): this.type = js.native
  def signInputHD(inputIndex: Double, hdKeyPair: HDSigner, sighashTypes: js.Array[Double]): this.type = js.native
  
  def signInputHDAsync(inputIndex: Double, hdKeyPair: HDSigner): js.Promise[Unit] = js.native
  def signInputHDAsync(inputIndex: Double, hdKeyPair: HDSignerAsync): js.Promise[Unit] = js.native
  def signInputHDAsync(inputIndex: Double, hdKeyPair: HDSignerAsync, sighashTypes: js.Array[Double]): js.Promise[Unit] = js.native
  def signInputHDAsync(inputIndex: Double, hdKeyPair: HDSigner, sighashTypes: js.Array[Double]): js.Promise[Unit] = js.native
  
  def toBase64(): String = js.native
  
  def toBuffer(): Buffer = js.native
  
  def toHex(): String = js.native
  
  val txInputs: js.Array[PsbtTxInput] = js.native
  
  val txOutputs: js.Array[PsbtTxOutput] = js.native
  
  def updateGlobal(updateData: PsbtGlobalUpdate): this.type = js.native
  
  def updateInput(inputIndex: Double, updateData: PsbtInputUpdate): this.type = js.native
  
  def updateOutput(outputIndex: Double, updateData: PsbtOutputUpdate): this.type = js.native
  
  def validateSignaturesOfAllInputs(): Boolean = js.native
  
  def validateSignaturesOfInput(inputIndex: Double): Boolean = js.native
  def validateSignaturesOfInput(inputIndex: Double, pubkey: Buffer): Boolean = js.native
  
  var version: Double = js.native
}
/* static members */
@JSImport("bitcoinjs-lib/types/psbt", "Psbt")
@js.native
object Psbt extends js.Object {
  
  def fromBase64(data: String): Psbt = js.native
  def fromBase64(data: String, opts: PsbtOptsOptional): Psbt = js.native
  
  def fromBuffer(buffer: Buffer): Psbt = js.native
  def fromBuffer(buffer: Buffer, opts: PsbtOptsOptional): Psbt = js.native
  
  def fromHex(data: String): Psbt = js.native
  def fromHex(data: String, opts: PsbtOptsOptional): Psbt = js.native
}

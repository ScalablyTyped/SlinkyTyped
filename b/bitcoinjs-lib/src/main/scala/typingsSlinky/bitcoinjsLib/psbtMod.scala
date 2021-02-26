package typingsSlinky.bitcoinjsLib

import typingsSlinky.bip174.interfacesMod.KeyValue
import typingsSlinky.bip174.interfacesMod.PsbtGlobalUpdate
import typingsSlinky.bip174.interfacesMod.PsbtInput
import typingsSlinky.bip174.interfacesMod.PsbtInputUpdate
import typingsSlinky.bip174.interfacesMod.PsbtOutput
import typingsSlinky.bip174.interfacesMod.PsbtOutputUpdate
import typingsSlinky.bip174.interfacesMod.TransactionInput
import typingsSlinky.bip174.interfacesMod.TransactionOutput
import typingsSlinky.bitcoinjsLib.anon.FinalScriptSig
import typingsSlinky.bitcoinjsLib.ecpairMod.Signer
import typingsSlinky.bitcoinjsLib.ecpairMod.SignerAsync
import typingsSlinky.bitcoinjsLib.networksMod.Network
import typingsSlinky.bitcoinjsLib.transactionMod.Transaction
import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object psbtMod {
  
  @JSImport("bitcoinjs-lib/types/psbt", "Psbt")
  @js.native
  class Psbt () extends StObject {
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
  object Psbt {
    
    @JSImport("bitcoinjs-lib/types/psbt", "Psbt.fromBase64")
    @js.native
    def fromBase64(data: String): Psbt = js.native
    @JSImport("bitcoinjs-lib/types/psbt", "Psbt.fromBase64")
    @js.native
    def fromBase64(data: String, opts: PsbtOptsOptional): Psbt = js.native
    
    @JSImport("bitcoinjs-lib/types/psbt", "Psbt.fromBuffer")
    @js.native
    def fromBuffer(buffer: Buffer): Psbt = js.native
    @JSImport("bitcoinjs-lib/types/psbt", "Psbt.fromBuffer")
    @js.native
    def fromBuffer(buffer: Buffer, opts: PsbtOptsOptional): Psbt = js.native
    
    @JSImport("bitcoinjs-lib/types/psbt", "Psbt.fromHex")
    @js.native
    def fromHex(data: String): Psbt = js.native
    @JSImport("bitcoinjs-lib/types/psbt", "Psbt.fromHex")
    @js.native
    def fromHex(data: String, opts: PsbtOptsOptional): Psbt = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.bitcoinjsLib.bitcoinjsLibStrings.witnesspubkeyhash
    - typingsSlinky.bitcoinjsLib.bitcoinjsLibStrings.pubkeyhash
    - typingsSlinky.bitcoinjsLib.bitcoinjsLibStrings.multisig
    - typingsSlinky.bitcoinjsLib.bitcoinjsLibStrings.pubkey
    - typingsSlinky.bitcoinjsLib.bitcoinjsLibStrings.nonstandard
    - typingsSlinky.bitcoinjsLib.bitcoinjsLibStrings.`p2sh-witnesspubkeyhash`
    - typingsSlinky.bitcoinjsLib.bitcoinjsLibStrings.`p2sh-pubkeyhash`
    - typingsSlinky.bitcoinjsLib.bitcoinjsLibStrings.`p2sh-multisig`
    - typingsSlinky.bitcoinjsLib.bitcoinjsLibStrings.`p2sh-pubkey`
    - typingsSlinky.bitcoinjsLib.bitcoinjsLibStrings.`p2sh-nonstandard`
    - typingsSlinky.bitcoinjsLib.bitcoinjsLibStrings.`p2wsh-pubkeyhash`
    - typingsSlinky.bitcoinjsLib.bitcoinjsLibStrings.`p2wsh-multisig`
    - typingsSlinky.bitcoinjsLib.bitcoinjsLibStrings.`p2wsh-pubkey`
    - typingsSlinky.bitcoinjsLib.bitcoinjsLibStrings.`p2wsh-nonstandard`
    - typingsSlinky.bitcoinjsLib.bitcoinjsLibStrings.`p2sh-p2wsh-pubkeyhash`
    - typingsSlinky.bitcoinjsLib.bitcoinjsLibStrings.`p2sh-p2wsh-multisig`
    - typingsSlinky.bitcoinjsLib.bitcoinjsLibStrings.`p2sh-p2wsh-pubkey`
    - typingsSlinky.bitcoinjsLib.bitcoinjsLibStrings.`p2sh-p2wsh-nonstandard`
  */
  trait AllScriptType extends StObject
  object AllScriptType {
    
    @scala.inline
    def multisig: typingsSlinky.bitcoinjsLib.bitcoinjsLibStrings.multisig = "multisig".asInstanceOf[typingsSlinky.bitcoinjsLib.bitcoinjsLibStrings.multisig]
    
    @scala.inline
    def nonstandard: typingsSlinky.bitcoinjsLib.bitcoinjsLibStrings.nonstandard = "nonstandard".asInstanceOf[typingsSlinky.bitcoinjsLib.bitcoinjsLibStrings.nonstandard]
    
    @scala.inline
    def `p2sh-multisig`: typingsSlinky.bitcoinjsLib.bitcoinjsLibStrings.`p2sh-multisig` = "p2sh-multisig".asInstanceOf[typingsSlinky.bitcoinjsLib.bitcoinjsLibStrings.`p2sh-multisig`]
    
    @scala.inline
    def `p2sh-nonstandard`: typingsSlinky.bitcoinjsLib.bitcoinjsLibStrings.`p2sh-nonstandard` = "p2sh-nonstandard".asInstanceOf[typingsSlinky.bitcoinjsLib.bitcoinjsLibStrings.`p2sh-nonstandard`]
    
    @scala.inline
    def `p2sh-p2wsh-multisig`: typingsSlinky.bitcoinjsLib.bitcoinjsLibStrings.`p2sh-p2wsh-multisig` = "p2sh-p2wsh-multisig".asInstanceOf[typingsSlinky.bitcoinjsLib.bitcoinjsLibStrings.`p2sh-p2wsh-multisig`]
    
    @scala.inline
    def `p2sh-p2wsh-nonstandard`: typingsSlinky.bitcoinjsLib.bitcoinjsLibStrings.`p2sh-p2wsh-nonstandard` = "p2sh-p2wsh-nonstandard".asInstanceOf[typingsSlinky.bitcoinjsLib.bitcoinjsLibStrings.`p2sh-p2wsh-nonstandard`]
    
    @scala.inline
    def `p2sh-p2wsh-pubkey`: typingsSlinky.bitcoinjsLib.bitcoinjsLibStrings.`p2sh-p2wsh-pubkey` = "p2sh-p2wsh-pubkey".asInstanceOf[typingsSlinky.bitcoinjsLib.bitcoinjsLibStrings.`p2sh-p2wsh-pubkey`]
    
    @scala.inline
    def `p2sh-p2wsh-pubkeyhash`: typingsSlinky.bitcoinjsLib.bitcoinjsLibStrings.`p2sh-p2wsh-pubkeyhash` = "p2sh-p2wsh-pubkeyhash".asInstanceOf[typingsSlinky.bitcoinjsLib.bitcoinjsLibStrings.`p2sh-p2wsh-pubkeyhash`]
    
    @scala.inline
    def `p2sh-pubkey`: typingsSlinky.bitcoinjsLib.bitcoinjsLibStrings.`p2sh-pubkey` = "p2sh-pubkey".asInstanceOf[typingsSlinky.bitcoinjsLib.bitcoinjsLibStrings.`p2sh-pubkey`]
    
    @scala.inline
    def `p2sh-pubkeyhash`: typingsSlinky.bitcoinjsLib.bitcoinjsLibStrings.`p2sh-pubkeyhash` = "p2sh-pubkeyhash".asInstanceOf[typingsSlinky.bitcoinjsLib.bitcoinjsLibStrings.`p2sh-pubkeyhash`]
    
    @scala.inline
    def `p2sh-witnesspubkeyhash`: typingsSlinky.bitcoinjsLib.bitcoinjsLibStrings.`p2sh-witnesspubkeyhash` = "p2sh-witnesspubkeyhash".asInstanceOf[typingsSlinky.bitcoinjsLib.bitcoinjsLibStrings.`p2sh-witnesspubkeyhash`]
    
    @scala.inline
    def `p2wsh-multisig`: typingsSlinky.bitcoinjsLib.bitcoinjsLibStrings.`p2wsh-multisig` = "p2wsh-multisig".asInstanceOf[typingsSlinky.bitcoinjsLib.bitcoinjsLibStrings.`p2wsh-multisig`]
    
    @scala.inline
    def `p2wsh-nonstandard`: typingsSlinky.bitcoinjsLib.bitcoinjsLibStrings.`p2wsh-nonstandard` = "p2wsh-nonstandard".asInstanceOf[typingsSlinky.bitcoinjsLib.bitcoinjsLibStrings.`p2wsh-nonstandard`]
    
    @scala.inline
    def `p2wsh-pubkey`: typingsSlinky.bitcoinjsLib.bitcoinjsLibStrings.`p2wsh-pubkey` = "p2wsh-pubkey".asInstanceOf[typingsSlinky.bitcoinjsLib.bitcoinjsLibStrings.`p2wsh-pubkey`]
    
    @scala.inline
    def `p2wsh-pubkeyhash`: typingsSlinky.bitcoinjsLib.bitcoinjsLibStrings.`p2wsh-pubkeyhash` = "p2wsh-pubkeyhash".asInstanceOf[typingsSlinky.bitcoinjsLib.bitcoinjsLibStrings.`p2wsh-pubkeyhash`]
    
    @scala.inline
    def pubkey: typingsSlinky.bitcoinjsLib.bitcoinjsLibStrings.pubkey = "pubkey".asInstanceOf[typingsSlinky.bitcoinjsLib.bitcoinjsLibStrings.pubkey]
    
    @scala.inline
    def pubkeyhash: typingsSlinky.bitcoinjsLib.bitcoinjsLibStrings.pubkeyhash = "pubkeyhash".asInstanceOf[typingsSlinky.bitcoinjsLib.bitcoinjsLibStrings.pubkeyhash]
    
    @scala.inline
    def witnesspubkeyhash: typingsSlinky.bitcoinjsLib.bitcoinjsLibStrings.witnesspubkeyhash = "witnesspubkeyhash".asInstanceOf[typingsSlinky.bitcoinjsLib.bitcoinjsLibStrings.witnesspubkeyhash]
  }
  
  /**
    * This function must do two things:
    * 1. Check if the `input` can be finalized. If it can not be finalized, throw.
    *   ie. `Can not finalize input #${inputIndex}`
    * 2. Create the finalScriptSig and finalScriptWitness Buffers.
    */
  type FinalScriptsFunc = js.Function6[
    /* inputIndex */ Double, 
    /* input */ PsbtInput, 
    /* script */ Buffer, 
    /* isSegwit */ Boolean, 
    /* isP2SH */ Boolean, 
    /* isP2WSH */ Boolean, 
    FinalScriptSig
  ]
  
  @js.native
  trait HDSigner extends HDSignerBase {
    
    /**
      * The path string must match /^m(\/\d+'?)+$/
      * ex. m/44'/0'/0'/1/23 levels with ' must be hard derivations
      */
    def derivePath(path: String): HDSigner = js.native
    
    /**
      * Input hash (the "message digest") for the signature algorithm
      * Return a 64 byte signature (32 byte r and 32 byte s in that order)
      */
    def sign(hash: Buffer): Buffer = js.native
  }
  object HDSigner {
    
    @scala.inline
    def apply(derivePath: String => HDSigner, fingerprint: Buffer, publicKey: Buffer, sign: Buffer => Buffer): HDSigner = {
      val __obj = js.Dynamic.literal(derivePath = js.Any.fromFunction1(derivePath), fingerprint = fingerprint.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any], sign = js.Any.fromFunction1(sign))
      __obj.asInstanceOf[HDSigner]
    }
    
    @scala.inline
    implicit class HDSignerMutableBuilder[Self <: HDSigner] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDerivePath(value: String => HDSigner): Self = StObject.set(x, "derivePath", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSign(value: Buffer => Buffer): Self = StObject.set(x, "sign", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * Same as above but with async sign method
    */
  @js.native
  trait HDSignerAsync extends HDSignerBase {
    
    def derivePath(path: String): HDSignerAsync = js.native
    
    def sign(hash: Buffer): js.Promise[Buffer] = js.native
  }
  object HDSignerAsync {
    
    @scala.inline
    def apply(
      derivePath: String => HDSignerAsync,
      fingerprint: Buffer,
      publicKey: Buffer,
      sign: Buffer => js.Promise[Buffer]
    ): HDSignerAsync = {
      val __obj = js.Dynamic.literal(derivePath = js.Any.fromFunction1(derivePath), fingerprint = fingerprint.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any], sign = js.Any.fromFunction1(sign))
      __obj.asInstanceOf[HDSignerAsync]
    }
    
    @scala.inline
    implicit class HDSignerAsyncMutableBuilder[Self <: HDSignerAsync] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDerivePath(value: String => HDSignerAsync): Self = StObject.set(x, "derivePath", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSign(value: Buffer => js.Promise[Buffer]): Self = StObject.set(x, "sign", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait HDSignerBase extends StObject {
    
    /**
      * The first 4 bytes of the sha256-ripemd160 of the publicKey
      */
    var fingerprint: Buffer = js.native
    
    /**
      * DER format compressed publicKey buffer
      */
    var publicKey: Buffer = js.native
  }
  object HDSignerBase {
    
    @scala.inline
    def apply(fingerprint: Buffer, publicKey: Buffer): HDSignerBase = {
      val __obj = js.Dynamic.literal(fingerprint = fingerprint.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[HDSignerBase]
    }
    
    @scala.inline
    implicit class HDSignerBaseMutableBuilder[Self <: HDSignerBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFingerprint(value: Buffer): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicKey(value: Buffer): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PsbtInputExtended
    extends PsbtInput
       with TransactionInput
  object PsbtInputExtended {
    
    @scala.inline
    def apply(hash: String | Buffer, index: Double): PsbtInputExtended = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[PsbtInputExtended]
    }
  }
  
  @js.native
  trait PsbtOptsOptional extends StObject {
    
    var maximumFeeRate: js.UndefOr[Double] = js.native
    
    var network: js.UndefOr[Network] = js.native
  }
  object PsbtOptsOptional {
    
    @scala.inline
    def apply(): PsbtOptsOptional = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PsbtOptsOptional]
    }
    
    @scala.inline
    implicit class PsbtOptsOptionalMutableBuilder[Self <: PsbtOptsOptional] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaximumFeeRate(value: Double): Self = StObject.set(x, "maximumFeeRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumFeeRateUndefined: Self = StObject.set(x, "maximumFeeRate", js.undefined)
      
      @scala.inline
      def setNetwork(value: Network): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.bitcoinjsLib.psbtMod.PsbtOutputExtendedAddress
    - typingsSlinky.bitcoinjsLib.psbtMod.PsbtOutputExtendedScript
  */
  trait PsbtOutputExtended extends StObject
  object PsbtOutputExtended {
    
    @scala.inline
    def PsbtOutputExtendedAddress(address: String, value: Double): typingsSlinky.bitcoinjsLib.psbtMod.PsbtOutputExtendedAddress = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.bitcoinjsLib.psbtMod.PsbtOutputExtendedAddress]
    }
    
    @scala.inline
    def PsbtOutputExtendedScript(script: Buffer, value: Double): typingsSlinky.bitcoinjsLib.psbtMod.PsbtOutputExtendedScript = {
      val __obj = js.Dynamic.literal(script = script.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.bitcoinjsLib.psbtMod.PsbtOutputExtendedScript]
    }
  }
  
  @js.native
  trait PsbtOutputExtendedAddress
    extends PsbtOutput
       with PsbtOutputExtended {
    
    var address: String = js.native
    
    var value: Double = js.native
  }
  object PsbtOutputExtendedAddress {
    
    @scala.inline
    def apply(address: String, value: Double): PsbtOutputExtendedAddress = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PsbtOutputExtendedAddress]
    }
    
    @scala.inline
    implicit class PsbtOutputExtendedAddressMutableBuilder[Self <: PsbtOutputExtendedAddress] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PsbtOutputExtendedScript
    extends PsbtOutput
       with PsbtOutputExtended {
    
    var script: Buffer = js.native
    
    var value: Double = js.native
  }
  object PsbtOutputExtendedScript {
    
    @scala.inline
    def apply(script: Buffer, value: Double): PsbtOutputExtendedScript = {
      val __obj = js.Dynamic.literal(script = script.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PsbtOutputExtendedScript]
    }
    
    @scala.inline
    implicit class PsbtOutputExtendedScriptMutableBuilder[Self <: PsbtOutputExtendedScript] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScript(value: Buffer): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PsbtTxInput extends TransactionInput {
    
    @JSName("hash")
    var hash_PsbtTxInput: Buffer = js.native
  }
  object PsbtTxInput {
    
    @scala.inline
    def apply(hash: Buffer, index: Double): PsbtTxInput = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[PsbtTxInput]
    }
    
    @scala.inline
    implicit class PsbtTxInputMutableBuilder[Self <: PsbtTxInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHash(value: Buffer): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PsbtTxOutput extends TransactionOutput {
    
    var address: js.UndefOr[String] = js.native
  }
  object PsbtTxOutput {
    
    @scala.inline
    def apply(script: Buffer, value: Double): PsbtTxOutput = {
      val __obj = js.Dynamic.literal(script = script.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PsbtTxOutput]
    }
    
    @scala.inline
    implicit class PsbtTxOutputMutableBuilder[Self <: PsbtTxOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    }
  }
}

package typingsSlinky.bitcoinjsLib

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.bip32.bip32Mod.BIP32Interface
import typingsSlinky.bitcoinjsLib.addressMod.Base58CheckResult
import typingsSlinky.bitcoinjsLib.addressMod.Bech32Result
import typingsSlinky.bitcoinjsLib.ecpairMod.ECPairOptions
import typingsSlinky.bitcoinjsLib.networksMod.Network
import typingsSlinky.bitcoinjsLib.paymentsMod.Payment
import typingsSlinky.bitcoinjsLib.paymentsMod.PaymentOpts
import typingsSlinky.bitcoinjsLib.paymentsMod.Stack
import typingsSlinky.bitcoinjsLib.psbtMod.PsbtOptsOptional
import typingsSlinky.bitcoinjsLib.scriptSignatureMod.ScriptSignature
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bitcoinjs-lib", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class Block ()
    extends typingsSlinky.bitcoinjsLib.blockMod.Block
  /* static members */
  @js.native
  object Block extends js.Object {
    
    def calculateMerkleRoot(transactions: js.Array[typingsSlinky.bitcoinjsLib.transactionMod.Transaction]): Buffer = js.native
    def calculateMerkleRoot(transactions: js.Array[typingsSlinky.bitcoinjsLib.transactionMod.Transaction], forWitness: Boolean): Buffer = js.native
    
    def calculateTarget(bits: Double): Buffer = js.native
    
    def fromBuffer(buffer: Buffer): typingsSlinky.bitcoinjsLib.blockMod.Block = js.native
    
    def fromHex(hex: String): typingsSlinky.bitcoinjsLib.blockMod.Block = js.native
  }
  
  @js.native
  object ECPair extends js.Object {
    
    def fromPrivateKey(buffer: Buffer): typingsSlinky.bitcoinjsLib.ecpairMod.ECPair = js.native
    def fromPrivateKey(buffer: Buffer, options: ECPairOptions): typingsSlinky.bitcoinjsLib.ecpairMod.ECPair = js.native
    
    def fromPublicKey(buffer: Buffer): typingsSlinky.bitcoinjsLib.ecpairMod.ECPair = js.native
    def fromPublicKey(buffer: Buffer, options: ECPairOptions): typingsSlinky.bitcoinjsLib.ecpairMod.ECPair = js.native
    
    def fromWIF(wifString: String): typingsSlinky.bitcoinjsLib.ecpairMod.ECPair = js.native
    def fromWIF(wifString: String, network: js.Array[Network]): typingsSlinky.bitcoinjsLib.ecpairMod.ECPair = js.native
    def fromWIF(wifString: String, network: Network): typingsSlinky.bitcoinjsLib.ecpairMod.ECPair = js.native
    
    def makeRandom(): typingsSlinky.bitcoinjsLib.ecpairMod.ECPair = js.native
    def makeRandom(options: ECPairOptions): typingsSlinky.bitcoinjsLib.ecpairMod.ECPair = js.native
  }
  
  @js.native
  class Psbt ()
    extends typingsSlinky.bitcoinjsLib.psbtMod.Psbt {
    def this(opts: PsbtOptsOptional) = this()
    def this(opts: js.UndefOr[scala.Nothing], data: typingsSlinky.bip174.mod.Psbt) = this()
    def this(opts: PsbtOptsOptional, data: typingsSlinky.bip174.mod.Psbt) = this()
  }
  /* static members */
  @js.native
  object Psbt extends js.Object {
    
    def fromBase64(data: String): typingsSlinky.bitcoinjsLib.psbtMod.Psbt = js.native
    def fromBase64(data: String, opts: PsbtOptsOptional): typingsSlinky.bitcoinjsLib.psbtMod.Psbt = js.native
    
    def fromBuffer(buffer: Buffer): typingsSlinky.bitcoinjsLib.psbtMod.Psbt = js.native
    def fromBuffer(buffer: Buffer, opts: PsbtOptsOptional): typingsSlinky.bitcoinjsLib.psbtMod.Psbt = js.native
    
    def fromHex(data: String): typingsSlinky.bitcoinjsLib.psbtMod.Psbt = js.native
    def fromHex(data: String, opts: PsbtOptsOptional): typingsSlinky.bitcoinjsLib.psbtMod.Psbt = js.native
  }
  
  @js.native
  class Transaction ()
    extends typingsSlinky.bitcoinjsLib.transactionMod.Transaction
  /* static members */
  @js.native
  object Transaction extends js.Object {
    
    val ADVANCED_TRANSACTION_FLAG: /* 1 */ Double = js.native
    
    val ADVANCED_TRANSACTION_MARKER: /* 0 */ Double = js.native
    
    val DEFAULT_SEQUENCE: /* 4294967295.0 */ Double = js.native
    
    val SIGHASH_ALL: /* 1 */ Double = js.native
    
    val SIGHASH_ANYONECANPAY: /* 128 */ Double = js.native
    
    val SIGHASH_NONE: /* 2 */ Double = js.native
    
    val SIGHASH_SINGLE: /* 3 */ Double = js.native
    
    def fromBuffer(buffer: Buffer): typingsSlinky.bitcoinjsLib.transactionMod.Transaction = js.native
    def fromBuffer(buffer: Buffer, _NO_STRICT: Boolean): typingsSlinky.bitcoinjsLib.transactionMod.Transaction = js.native
    
    def fromHex(hex: String): typingsSlinky.bitcoinjsLib.transactionMod.Transaction = js.native
    
    def isCoinbaseHash(buffer: Buffer): Boolean = js.native
  }
  
  @js.native
  class TransactionBuilder ()
    extends typingsSlinky.bitcoinjsLib.transactionBuilderMod.TransactionBuilder {
    def this(network: Network) = this()
    def this(network: js.UndefOr[scala.Nothing], maximumFeeRate: Double) = this()
    def this(network: Network, maximumFeeRate: Double) = this()
  }
  /* static members */
  @js.native
  object TransactionBuilder extends js.Object {
    
    def fromTransaction(transaction: typingsSlinky.bitcoinjsLib.transactionMod.Transaction): typingsSlinky.bitcoinjsLib.transactionBuilderMod.TransactionBuilder = js.native
    def fromTransaction(transaction: typingsSlinky.bitcoinjsLib.transactionMod.Transaction, network: Network): typingsSlinky.bitcoinjsLib.transactionBuilderMod.TransactionBuilder = js.native
  }
  
  @js.native
  object address extends js.Object {
    
    def fromBase58Check(address: String): Base58CheckResult = js.native
    
    def fromBech32(address: String): Bech32Result = js.native
    
    def fromOutputScript(output: Buffer): String = js.native
    def fromOutputScript(output: Buffer, network: Network): String = js.native
    
    def toBase58Check(hash: Buffer, version: Double): String = js.native
    
    def toBech32(data: Buffer, version: Double, prefix: String): String = js.native
    
    def toOutputScript(address: String): Buffer = js.native
    def toOutputScript(address: String, network: Network): Buffer = js.native
  }
  
  @js.native
  object bip32 extends js.Object {
    
    def fromBase58(inString: String): BIP32Interface = js.native
    def fromBase58(inString: String, network: typingsSlinky.bip32.bip32Mod.Network): BIP32Interface = js.native
    
    def fromPrivateKey(privateKey: Buffer, chainCode: Buffer): BIP32Interface = js.native
    def fromPrivateKey(privateKey: Buffer, chainCode: Buffer, network: typingsSlinky.bip32.bip32Mod.Network): BIP32Interface = js.native
    
    def fromPublicKey(publicKey: Buffer, chainCode: Buffer): BIP32Interface = js.native
    def fromPublicKey(publicKey: Buffer, chainCode: Buffer, network: typingsSlinky.bip32.bip32Mod.Network): BIP32Interface = js.native
    
    def fromSeed(seed: Buffer): BIP32Interface = js.native
    def fromSeed(seed: Buffer, network: typingsSlinky.bip32.bip32Mod.Network): BIP32Interface = js.native
  }
  
  @js.native
  object crypto extends js.Object {
    
    def hash160(buffer: Buffer): Buffer = js.native
    
    def hash256(buffer: Buffer): Buffer = js.native
    
    def ripemd160(buffer: Buffer): Buffer = js.native
    
    def sha1(buffer: Buffer): Buffer = js.native
    
    def sha256(buffer: Buffer): Buffer = js.native
  }
  
  @js.native
  object networks extends js.Object {
    
    val bitcoin: Network = js.native
    
    val regtest: Network = js.native
    
    val testnet: Network = js.native
  }
  
  @js.native
  object opcodes extends /* index */ StringDictionary[Double]
  
  @js.native
  object payments extends js.Object {
    
    def embed(a: Payment): Payment = js.native
    def embed(a: Payment, opts: PaymentOpts): Payment = js.native
    
    def p2ms(a: Payment): Payment = js.native
    def p2ms(a: Payment, opts: PaymentOpts): Payment = js.native
    
    def p2pk(a: Payment): Payment = js.native
    def p2pk(a: Payment, opts: PaymentOpts): Payment = js.native
    
    def p2pkh(a: Payment): Payment = js.native
    def p2pkh(a: Payment, opts: PaymentOpts): Payment = js.native
    
    def p2sh(a: Payment): Payment = js.native
    def p2sh(a: Payment, opts: PaymentOpts): Payment = js.native
    
    def p2wpkh(a: Payment): Payment = js.native
    def p2wpkh(a: Payment, opts: PaymentOpts): Payment = js.native
    
    def p2wsh(a: Payment): Payment = js.native
    def p2wsh(a: Payment, opts: PaymentOpts): Payment = js.native
  }
  
  @js.native
  object script extends js.Object {
    
    def compile(chunks: Stack): Buffer = js.native
    def compile(chunks: Buffer): Buffer = js.native
    
    def decompile(buffer: js.Array[Double | Buffer]): (js.Array[Double | Buffer]) | Null = js.native
    def decompile(buffer: Buffer): (js.Array[Double | Buffer]) | Null = js.native
    
    def fromASM(asm: String): Buffer = js.native
    
    def isCanonicalPubKey(buffer: Buffer): Boolean = js.native
    
    def isCanonicalScriptSignature(buffer: Buffer): Boolean = js.native
    
    def isDefinedHashType(hashType: Double): Boolean = js.native
    
    def isPushOnly(value: Stack): Boolean = js.native
    
    def toASM(chunks: js.Array[Double | Buffer]): String = js.native
    def toASM(chunks: Buffer): String = js.native
    
    def toStack(chunks: js.Array[Double | Buffer]): js.Array[Buffer] = js.native
    def toStack(chunks: Buffer): js.Array[Buffer] = js.native
    
    @js.native
    object OPS extends /* index */ StringDictionary[Double]
    
    @js.native
    object number extends js.Object {
      
      def decode(buffer: Buffer): Double = js.native
      def decode(buffer: Buffer, maxLength: js.UndefOr[scala.Nothing], minimal: Boolean): Double = js.native
      def decode(buffer: Buffer, maxLength: Double): Double = js.native
      def decode(buffer: Buffer, maxLength: Double, minimal: Boolean): Double = js.native
      
      def encode(_number: Double): Buffer = js.native
    }
    
    @js.native
    object signature extends js.Object {
      
      def decode(buffer: Buffer): ScriptSignature = js.native
      
      def encode(signature: Buffer, hashType: Double): Buffer = js.native
    }
  }
}

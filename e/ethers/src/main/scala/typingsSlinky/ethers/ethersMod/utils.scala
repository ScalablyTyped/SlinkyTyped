package typingsSlinky.ethers.ethersMod

import typingsSlinky.ethers.AnonFrom
import typingsSlinky.ethers.ethersStrings.Ξ
import typingsSlinky.ethers.typesMod.Arrayish
import typingsSlinky.ethers.typesMod.BigNumber
import typingsSlinky.ethers.typesMod.BigNumberish
import typingsSlinky.ethers.typesMod.CoerceFunc
import typingsSlinky.ethers.typesMod.ConnectionInfo
import typingsSlinky.ethers.typesMod.EventFragment
import typingsSlinky.ethers.typesMod.FunctionFragment
import typingsSlinky.ethers.typesMod.Network
import typingsSlinky.ethers.typesMod.Networkish
import typingsSlinky.ethers.typesMod.ParamType
import typingsSlinky.ethers.typesMod.Signature
import typingsSlinky.ethers.typesMod.Transaction
import typingsSlinky.ethers.typesMod.UnsignedTransaction
import typingsSlinky.ethers.utf8Mod.UnicodeNormalizationForm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/ethers", "utils")
@js.native
object utils extends js.Object {
  @js.native
  class AbiCoder ()
    extends typingsSlinky.ethers.utilsMod.AbiCoder {
    def this(coerceFunc: CoerceFunc) = this()
  }
  
  val defaultAbiCoder: typingsSlinky.ethers.abiCoderMod.AbiCoder = js.native
  val etherSymbol: Ξ = js.native
  def arrayify(value: Arrayish): scala.scalajs.js.typedarray.Uint8Array = js.native
  def arrayify(value: BigNumber): scala.scalajs.js.typedarray.Uint8Array = js.native
  def bigNumberify(value: BigNumberish): BigNumber = js.native
  def computePublicKey(key: Arrayish): String = js.native
  def computePublicKey(key: Arrayish, compressed: Boolean): String = js.native
  def concat(objects: js.Array[Arrayish]): scala.scalajs.js.typedarray.Uint8Array = js.native
  def defineFrozen(`object`: js.Any, name: String, value: js.Any): Unit = js.native
  def defineReadOnly(`object`: js.Any, name: String, value: js.Any): Unit = js.native
  def fetchJson(connection: String, json: String, processFunc: js.Function1[/* value */ js.Any, _]): js.Promise[_] = js.native
  def fetchJson(connection: ConnectionInfo, json: String, processFunc: js.Function1[/* value */ js.Any, _]): js.Promise[_] = js.native
  def formatEther(wei: BigNumberish): String = js.native
  def formatEther(wei: BigNumberish, options: js.Any): String = js.native
  def formatParamType(paramType: ParamType): String = js.native
  def formatSignature(fragment: EventFragment): String = js.native
  def formatSignature(fragment: FunctionFragment): String = js.native
  def formatUnits(value: BigNumberish): String = js.native
  def formatUnits(value: BigNumberish, unitType: String): String = js.native
  def formatUnits(value: BigNumberish, unitType: String, options: js.Any): String = js.native
  def formatUnits(value: BigNumberish, unitType: Double): String = js.native
  def formatUnits(value: BigNumberish, unitType: Double, options: js.Any): String = js.native
  def getAddress(address: String): String = js.native
  def getContractAddress(transaction: AnonFrom): String = js.native
  def getIcapAddress(address: String): String = js.native
  def getJsonWalletAddress(json: String): String = js.native
  def getNetwork(network: Networkish): Network = js.native
  def hashMessage(message: String): String = js.native
  def hashMessage(message: Arrayish): String = js.native
  def hexDataLength(data: String): Double = js.native
  def hexDataSlice(data: String, offset: Double): String = js.native
  def hexDataSlice(data: String, offset: Double, length: Double): String = js.native
  def hexStripZeros(value: String): String = js.native
  def hexZeroPad(value: String, length: Double): String = js.native
  def hexlify(value: Double): String = js.native
  def hexlify(value: Arrayish): String = js.native
  def hexlify(value: BigNumber): String = js.native
  def id(text: String): String = js.native
  def joinSignature(signature: Signature): String = js.native
  def keccak256(data: Arrayish): String = js.native
  def namehash(name: String): String = js.native
  def padZeros(value: Arrayish, length: Double): scala.scalajs.js.typedarray.Uint8Array = js.native
  def parseEther(ether: String): BigNumber = js.native
  def parseParamType(`type`: String): ParamType = js.native
  def parseSignature(fragment: String): EventFragment | FunctionFragment = js.native
  def parseTransaction(rawTransaction: Arrayish): Transaction = js.native
  def parseUnits(value: String): BigNumber = js.native
  def parseUnits(value: String, unitType: String): BigNumber = js.native
  def parseUnits(value: String, unitType: Double): BigNumber = js.native
  def randomBytes(length: Double): scala.scalajs.js.typedarray.Uint8Array = js.native
  def resolveProperties(`object`: js.Any): js.Promise[_] = js.native
  def serializeTransaction(transaction: UnsignedTransaction): String = js.native
  def serializeTransaction(transaction: UnsignedTransaction, signature: Arrayish): String = js.native
  def serializeTransaction(transaction: UnsignedTransaction, signature: Signature): String = js.native
  def sha256(data: Arrayish): String = js.native
  def shallowCopy(`object`: js.Any): js.Any = js.native
  def solidityKeccak256(types: js.Array[String], values: js.Array[_]): String = js.native
  def solidityPack(types: js.Array[String], values: js.Array[_]): String = js.native
  def soliditySha256(types: js.Array[String], values: js.Array[_]): String = js.native
  def splitSignature(signature: Arrayish): Signature = js.native
  def splitSignature(signature: Signature): Signature = js.native
  def stripZeros(value: Arrayish): scala.scalajs.js.typedarray.Uint8Array = js.native
  def toUtf8Bytes(str: String): scala.scalajs.js.typedarray.Uint8Array = js.native
  def toUtf8Bytes(str: String, form: UnicodeNormalizationForm): scala.scalajs.js.typedarray.Uint8Array = js.native
  def toUtf8String(bytes: Arrayish): String = js.native
  def verifyMessage(message: String, signature: String): String = js.native
  def verifyMessage(message: String, signature: Signature): String = js.native
  def verifyMessage(message: Arrayish, signature: String): String = js.native
  def verifyMessage(message: Arrayish, signature: Signature): String = js.native
  @js.native
  object RLP extends js.Object {
    def decode(data: Arrayish): js.Any = js.native
    def encode(`object`: js.Any): String = js.native
  }
  
  @js.native
  object base64 extends js.Object {
    def decode(textData: String): scala.scalajs.js.typedarray.Uint8Array = js.native
    def encode(data: Arrayish): String = js.native
  }
  
  @js.native
  object constants extends js.Object {
    var AddressZero: String = js.native
    var HashZero: String = js.native
    var NegativeOne: BigNumber = js.native
    var One: BigNumber = js.native
    var Two: BigNumber = js.native
    var WeiPerEther: BigNumber = js.native
    var Zero: BigNumber = js.native
  }
  
  @js.native
  object errors extends js.Object {
    val CALL_EXCEPTION: typingsSlinky.ethers.ethersStrings.CALL_EXCEPTION = js.native
    val INVALID_ARGUMENT: typingsSlinky.ethers.ethersStrings.INVALID_ARGUMENT = js.native
    val MISSING_ARGUMENT: typingsSlinky.ethers.ethersStrings.MISSING_ARGUMENT = js.native
    val MISSING_NEW: typingsSlinky.ethers.ethersStrings.MISSING_NEW = js.native
    val NOT_IMPLEMENTED: typingsSlinky.ethers.ethersStrings.NOT_IMPLEMENTED = js.native
    val NUMERIC_FAULT: typingsSlinky.ethers.ethersStrings.NUMERIC_FAULT = js.native
    val UNEXPECTED_ARGUMENT: typingsSlinky.ethers.ethersStrings.UNEXPECTED_ARGUMENT = js.native
    val UNKNOWN_ERROR: typingsSlinky.ethers.ethersStrings.UNKNOWN_ERROR = js.native
    val UNSUPPORTED_OPERATION: typingsSlinky.ethers.ethersStrings.UNSUPPORTED_OPERATION = js.native
    def checkArgumentCount(count: Double, expectedCount: Double): Unit = js.native
    def checkArgumentCount(count: Double, expectedCount: Double, suffix: String): Unit = js.native
    def checkNew(self: js.Any, kind: js.Any): Unit = js.native
    def setCensorship(censorship: Boolean): Unit = js.native
    def setCensorship(censorship: Boolean, permanent: Boolean): Unit = js.native
    def throwError(message: String, code: String, params: js.Any): scala.Nothing = js.native
  }
  
  @js.native
  object types extends js.Object {
    @js.native
    abstract class BigNumber ()
      extends typingsSlinky.ethers.typesMod.BigNumber
    
    @js.native
    abstract class HDNode ()
      extends typingsSlinky.ethers.typesMod.HDNode
    
    @js.native
    abstract class Indexed ()
      extends typingsSlinky.ethers.typesMod.Indexed
    
    @js.native
    abstract class MinimalProvider ()
      extends typingsSlinky.ethers.typesMod.MinimalProvider
    
    @js.native
    abstract class Signer ()
      extends typingsSlinky.ethers.typesMod.Signer
    
  }
  
}


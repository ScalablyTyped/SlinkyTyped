package typingsSlinky.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ethersprojectAbi.abiCoderMod.AbiCoder
import typingsSlinky.ethersprojectAbi.abstractCoderMod.Result
import typingsSlinky.ethersprojectAbi.anon.Error
import typingsSlinky.ethersprojectAbstractSigner.mod.TypedDataDomain
import typingsSlinky.ethersprojectAbstractSigner.mod.TypedDataField
import typingsSlinky.ethersprojectAddress.anon.From
import typingsSlinky.ethersprojectBasex.mod.BaseX
import typingsSlinky.ethersprojectBignumber.bignumberMod.BigNumberish
import typingsSlinky.ethersprojectBignumber.mod.BigNumber
import typingsSlinky.ethersprojectBytes.mod.Bytes
import typingsSlinky.ethersprojectBytes.mod.BytesLike
import typingsSlinky.ethersprojectBytes.mod.DataOptions
import typingsSlinky.ethersprojectBytes.mod.Hexable
import typingsSlinky.ethersprojectBytes.mod.Signature
import typingsSlinky.ethersprojectBytes.mod.SignatureLike
import typingsSlinky.ethersprojectProperties.mod.Deferrable
import typingsSlinky.ethersprojectSha2.typesMod.SupportedAlgorithm
import typingsSlinky.ethersprojectStrings.utf8Mod.UnicodeNormalizationForm
import typingsSlinky.ethersprojectStrings.utf8Mod.Utf8ErrorFunc
import typingsSlinky.ethersprojectTransactions.mod.Transaction
import typingsSlinky.ethersprojectTransactions.mod.UnsignedTransaction
import typingsSlinky.ethersprojectWeb.mod.ConnectionInfo
import typingsSlinky.ethersprojectWeb.mod.FetchJsonResponse
import typingsSlinky.ethersprojectWeb.mod.PollOptions
import typingsSlinky.ethersprojectWordlists.mod.Wordlist
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofutils extends js.Object {
  
  var AbiCoder: Instantiable0[typingsSlinky.ethers.mod.ethers.utils.AbiCoder] = js.native
  
  var EventFragment: TypeofEventFragment = js.native
  
  val FormatTypes: StringDictionary[String] = js.native
  
  var Fragment: TypeofFragment = js.native
  
  var FunctionFragment: TypeofFunctionFragment = js.native
  
  var HDNode: TypeofHDNode = js.native
  
  var Indexed: TypeofIndexed = js.native
  
  var Interface: TypeofInterface = js.native
  
  var LogDescription: Instantiable0[typingsSlinky.ethers.mod.ethers.utils.LogDescription] = js.native
  
  var Logger: TypeofLogger = js.native
  
  var ParamType: TypeofParamType = js.native
  
  val RLP: TypeofRLP = js.native
  
  var SigningKey: TypeofSigningKey = js.native
  
  var TransactionDescription: Instantiable0[typingsSlinky.ethers.mod.ethers.utils.TransactionDescription] = js.native
  
  val Utf8ErrorFuncs: StringDictionary[Utf8ErrorFunc] = js.native
  
  var _TypedDataEncoder: TypeofTypedDataEncoder = js.native
  
  def _fetchData[T](connection: String): js.Promise[T] = js.native
  def _fetchData[T](
    connection: String,
    body: js.UndefOr[scala.Nothing],
    processFunc: js.Function2[/* value */ js.typedarray.Uint8Array, /* response */ FetchJsonResponse, T]
  ): js.Promise[T] = js.native
  def _fetchData[T](connection: String, body: js.typedarray.Uint8Array): js.Promise[T] = js.native
  def _fetchData[T](
    connection: String,
    body: js.typedarray.Uint8Array,
    processFunc: js.Function2[/* value */ js.typedarray.Uint8Array, /* response */ FetchJsonResponse, T]
  ): js.Promise[T] = js.native
  def _fetchData[T](connection: ConnectionInfo): js.Promise[T] = js.native
  def _fetchData[T](
    connection: ConnectionInfo,
    body: js.UndefOr[scala.Nothing],
    processFunc: js.Function2[/* value */ js.typedarray.Uint8Array, /* response */ FetchJsonResponse, T]
  ): js.Promise[T] = js.native
  def _fetchData[T](connection: ConnectionInfo, body: js.typedarray.Uint8Array): js.Promise[T] = js.native
  def _fetchData[T](
    connection: ConnectionInfo,
    body: js.typedarray.Uint8Array,
    processFunc: js.Function2[/* value */ js.typedarray.Uint8Array, /* response */ FetchJsonResponse, T]
  ): js.Promise[T] = js.native
  
  def _toEscapedUtf8String(bytes: BytesLike): String = js.native
  def _toEscapedUtf8String(bytes: BytesLike, onError: Utf8ErrorFunc): String = js.native
  
  def arrayify(value: Double): js.typedarray.Uint8Array = js.native
  def arrayify(value: Double, options: DataOptions): js.typedarray.Uint8Array = js.native
  def arrayify(value: BytesLike): js.typedarray.Uint8Array = js.native
  def arrayify(value: BytesLike, options: DataOptions): js.typedarray.Uint8Array = js.native
  def arrayify(value: Hexable): js.typedarray.Uint8Array = js.native
  def arrayify(value: Hexable, options: DataOptions): js.typedarray.Uint8Array = js.native
  
  val base58: BaseX = js.native
  
  val base64: Typeofbase64 = js.native
  
  def checkProperties(`object`: js.Any, properties: StringDictionary[Boolean]): Unit = js.native
  
  def checkResultErrors(result: Result): js.Array[Error] = js.native
  
  def commify(value: String): String = js.native
  def commify(value: Double): String = js.native
  
  def computeAddress(key: String): String = js.native
  def computeAddress(key: BytesLike): String = js.native
  
  def computeHmac(algorithm: SupportedAlgorithm, key: BytesLike, data: BytesLike): String = js.native
  
  def computePublicKey(key: BytesLike): String = js.native
  def computePublicKey(key: BytesLike, compressed: Boolean): String = js.native
  
  def concat(items: js.Array[BytesLike]): js.typedarray.Uint8Array = js.native
  
  def deepCopy[T](`object`: T): T = js.native
  
  val defaultAbiCoder: AbiCoder = js.native
  
  val defaultPath: /* "m/44'/60'/0'/0/0" */ String = js.native
  
  def defineReadOnly[T, K /* <: /* keyof T */ String */](
    `object`: T,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ): Unit = js.native
  
  def entropyToMnemonic(entropy: BytesLike): String = js.native
  def entropyToMnemonic(entropy: BytesLike, wordlist: String): String = js.native
  def entropyToMnemonic(entropy: BytesLike, wordlist: Wordlist): String = js.native
  
  def fetchJson(connection: String): js.Promise[_] = js.native
  def fetchJson(
    connection: String,
    json: js.UndefOr[scala.Nothing],
    processFunc: js.Function2[/* value */ js.Any, /* response */ FetchJsonResponse, _]
  ): js.Promise[_] = js.native
  def fetchJson(connection: String, json: String): js.Promise[_] = js.native
  def fetchJson(
    connection: String,
    json: String,
    processFunc: js.Function2[/* value */ js.Any, /* response */ FetchJsonResponse, _]
  ): js.Promise[_] = js.native
  def fetchJson(connection: ConnectionInfo): js.Promise[_] = js.native
  def fetchJson(
    connection: ConnectionInfo,
    json: js.UndefOr[scala.Nothing],
    processFunc: js.Function2[/* value */ js.Any, /* response */ FetchJsonResponse, _]
  ): js.Promise[_] = js.native
  def fetchJson(connection: ConnectionInfo, json: String): js.Promise[_] = js.native
  def fetchJson(
    connection: ConnectionInfo,
    json: String,
    processFunc: js.Function2[/* value */ js.Any, /* response */ FetchJsonResponse, _]
  ): js.Promise[_] = js.native
  
  def formatBytes32String(text: String): String = js.native
  
  def formatEther(wei: BigNumberish): String = js.native
  
  def formatUnits(value: BigNumberish): String = js.native
  def formatUnits(value: BigNumberish, unitName: String): String = js.native
  def formatUnits(value: BigNumberish, unitName: BigNumberish): String = js.native
  
  def getAddress(address: String): String = js.native
  
  def getContractAddress(transaction: From): String = js.native
  
  def getCreate2Address(from: String, salt: BytesLike, initCodeHash: BytesLike): String = js.native
  
  def getIcapAddress(address: String): String = js.native
  
  def getJsonWalletAddress(json: String): String = js.native
  
  def getStatic[T](ctor: js.Any, key: String): T = js.native
  
  def hashMessage(message: String): String = js.native
  def hashMessage(message: Bytes): String = js.native
  
  def hexConcat(items: js.Array[BytesLike]): String = js.native
  
  def hexDataLength(data: BytesLike): Double = js.native
  
  def hexDataSlice(data: BytesLike, offset: Double): String = js.native
  def hexDataSlice(data: BytesLike, offset: Double, endOffset: Double): String = js.native
  
  def hexStripZeros(value: BytesLike): String = js.native
  
  def hexValue(value: Double): String = js.native
  def hexValue(value: BytesLike): String = js.native
  def hexValue(value: Hexable): String = js.native
  
  def hexZeroPad(value: BytesLike, length: Double): String = js.native
  
  def hexlify(value: Double): String = js.native
  def hexlify(value: Double, options: DataOptions): String = js.native
  def hexlify(value: BytesLike): String = js.native
  def hexlify(value: BytesLike, options: DataOptions): String = js.native
  def hexlify(value: Hexable): String = js.native
  def hexlify(value: Hexable, options: DataOptions): String = js.native
  
  def id(text: String): String = js.native
  
  def isAddress(address: String): Boolean = js.native
  
  def isBytes(value: js.Any): /* is @ethersproject/bytes.@ethersproject/bytes.Bytes */ Boolean = js.native
  
  def isBytesLike(value: js.Any): /* is @ethersproject/bytes.@ethersproject/bytes.BytesLike */ Boolean = js.native
  
  def isHexString(value: js.Any): Boolean = js.native
  def isHexString(value: js.Any, length: Double): Boolean = js.native
  
  def isValidMnemonic(mnemonic: String): Boolean = js.native
  def isValidMnemonic(mnemonic: String, wordlist: Wordlist): Boolean = js.native
  
  def isValidName(name: String): Boolean = js.native
  
  def joinSignature(signature: SignatureLike): String = js.native
  
  def keccak256(data: BytesLike): String = js.native
  
  def mnemonicToEntropy(mnemonic: String): String = js.native
  def mnemonicToEntropy(mnemonic: String, wordlist: String): String = js.native
  def mnemonicToEntropy(mnemonic: String, wordlist: Wordlist): String = js.native
  
  def mnemonicToSeed(mnemonic: String): String = js.native
  def mnemonicToSeed(mnemonic: String, password: String): String = js.native
  
  def namehash(name: String): String = js.native
  
  def nameprep(value: String): String = js.native
  
  def parseBytes32String(bytes: BytesLike): String = js.native
  
  def parseEther(ether: String): BigNumber = js.native
  
  def parseTransaction(rawTransaction: BytesLike): Transaction = js.native
  
  def parseUnits(value: String): BigNumber = js.native
  def parseUnits(value: String, unitName: BigNumberish): BigNumber = js.native
  
  def poll[T](func: js.Function0[js.Promise[T]]): js.Promise[T] = js.native
  def poll[T](func: js.Function0[js.Promise[T]], options: PollOptions): js.Promise[T] = js.native
  
  def randomBytes(length: Double): js.typedarray.Uint8Array = js.native
  
  def recoverAddress(digest: BytesLike, signature: SignatureLike): String = js.native
  
  def recoverPublicKey(digest: BytesLike, signature: SignatureLike): String = js.native
  
  def resolveProperties[T](`object`: Deferrable[T]): js.Promise[T] = js.native
  
  def ripemd160(data: BytesLike): String = js.native
  
  def serializeTransaction(transaction: UnsignedTransaction): String = js.native
  def serializeTransaction(transaction: UnsignedTransaction, signature: SignatureLike): String = js.native
  
  def sha256(data: BytesLike): String = js.native
  
  def sha512(data: BytesLike): String = js.native
  
  def shallowCopy[T](`object`: T): T = js.native
  
  def shuffled(array: js.Array[_]): js.Array[_] = js.native
  
  def solidityKeccak256(types: js.Array[String], values: js.Array[_]): String = js.native
  
  def solidityPack(types: js.Array[String], values: js.Array[_]): String = js.native
  
  def soliditySha256(types: js.Array[String], values: js.Array[_]): String = js.native
  
  def splitSignature(signature: SignatureLike): Signature = js.native
  
  def stripZeros(value: BytesLike): js.typedarray.Uint8Array = js.native
  
  def toUtf8Bytes(str: String): js.typedarray.Uint8Array = js.native
  def toUtf8Bytes(str: String, form: UnicodeNormalizationForm): js.typedarray.Uint8Array = js.native
  
  def toUtf8CodePoints(str: String): js.Array[Double] = js.native
  def toUtf8CodePoints(str: String, form: UnicodeNormalizationForm): js.Array[Double] = js.native
  
  def toUtf8String(bytes: BytesLike): String = js.native
  def toUtf8String(bytes: BytesLike, onError: Utf8ErrorFunc): String = js.native
  
  def verifyMessage(message: String, signature: SignatureLike): String = js.native
  def verifyMessage(message: Bytes, signature: SignatureLike): String = js.native
  
  def verifyTypedData(
    domain: TypedDataDomain,
    types: Record[String, js.Array[TypedDataField]],
    value: Record[String, _],
    signature: SignatureLike
  ): String = js.native
  
  def zeroPad(value: BytesLike, length: Double): js.typedarray.Uint8Array = js.native
}

package typingsSlinky.ethersprojectWallet

import typingsSlinky.ethersprojectAbstractProvider.mod.Provider
import typingsSlinky.ethersprojectAbstractProvider.mod.TransactionRequest
import typingsSlinky.ethersprojectAbstractSigner.mod.ExternallyOwnedAccount
import typingsSlinky.ethersprojectAbstractSigner.mod.Signer
import typingsSlinky.ethersprojectAbstractSigner.mod.TypedDataDomain
import typingsSlinky.ethersprojectAbstractSigner.mod.TypedDataField
import typingsSlinky.ethersprojectAbstractSigner.mod.TypedDataSigner
import typingsSlinky.ethersprojectBytes.mod.Bytes
import typingsSlinky.ethersprojectBytes.mod.BytesLike
import typingsSlinky.ethersprojectBytes.mod.SignatureLike
import typingsSlinky.ethersprojectHdnode.mod.Mnemonic
import typingsSlinky.ethersprojectJsonWallets.keystoreMod.ProgressCallback
import typingsSlinky.ethersprojectSigningKey.mod.SigningKey
import typingsSlinky.ethersprojectWordlists.mod.Wordlist
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/wallet", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def verifyMessage(message: String, signature: SignatureLike): String = js.native
  def verifyMessage(message: Bytes, signature: SignatureLike): String = js.native
  
  def verifyTypedData(
    domain: TypedDataDomain,
    types: Record[String, js.Array[TypedDataField]],
    value: Record[String, _],
    signature: SignatureLike
  ): String = js.native
  
  @js.native
  class Wallet protected ()
    extends Signer
       with ExternallyOwnedAccount
       with TypedDataSigner {
    def this(privateKey: ExternallyOwnedAccount) = this()
    def this(privateKey: BytesLike) = this()
    def this(privateKey: SigningKey) = this()
    def this(privateKey: ExternallyOwnedAccount, provider: Provider) = this()
    def this(privateKey: BytesLike, provider: Provider) = this()
    def this(privateKey: SigningKey, provider: Provider) = this()
    
    def _mnemonic(): Mnemonic = js.native
    
    def _signingKey(): SigningKey = js.native
    
    def encrypt(password: String): js.Promise[String] = js.native
    def encrypt(password: String, options: js.UndefOr[scala.Nothing], progressCallback: ProgressCallback): js.Promise[String] = js.native
    def encrypt(password: String, options: js.Any): js.Promise[String] = js.native
    def encrypt(password: String, options: js.Any, progressCallback: ProgressCallback): js.Promise[String] = js.native
    def encrypt(password: Bytes): js.Promise[String] = js.native
    def encrypt(password: Bytes, options: js.UndefOr[scala.Nothing], progressCallback: ProgressCallback): js.Promise[String] = js.native
    def encrypt(password: Bytes, options: js.Any): js.Promise[String] = js.native
    def encrypt(password: Bytes, options: js.Any, progressCallback: ProgressCallback): js.Promise[String] = js.native
    
    def mnemonic: Mnemonic = js.native
    
    @JSName("privateKey")
    def privateKey_MWallet: String = js.native
    
    @JSName("provider")
    val provider_Wallet: Provider = js.native
    
    def publicKey: String = js.native
    
    def signTransaction(transaction: TransactionRequest): js.Promise[String] = js.native
  }
  /* static members */
  @js.native
  object Wallet extends js.Object {
    
    /**
      *  Static methods to create Wallet instances.
      */
    def createRandom(): Wallet = js.native
    def createRandom(options: js.Any): Wallet = js.native
    
    def fromEncryptedJson(json: String, password: String): js.Promise[Wallet] = js.native
    def fromEncryptedJson(json: String, password: String, progressCallback: ProgressCallback): js.Promise[Wallet] = js.native
    def fromEncryptedJson(json: String, password: Bytes): js.Promise[Wallet] = js.native
    def fromEncryptedJson(json: String, password: Bytes, progressCallback: ProgressCallback): js.Promise[Wallet] = js.native
    
    def fromEncryptedJsonSync(json: String, password: String): Wallet = js.native
    def fromEncryptedJsonSync(json: String, password: Bytes): Wallet = js.native
    
    def fromMnemonic(mnemonic: String): Wallet = js.native
    def fromMnemonic(mnemonic: String, path: js.UndefOr[scala.Nothing], wordlist: Wordlist): Wallet = js.native
    def fromMnemonic(mnemonic: String, path: String): Wallet = js.native
    def fromMnemonic(mnemonic: String, path: String, wordlist: Wordlist): Wallet = js.native
  }
}

package typingsSlinky.ethereumCryptography

import typingsSlinky.secp256k1.anon.Recid
import typingsSlinky.secp256k1.mod.SignOptions
import typingsSlinky.secp256k1.mod.ecdhOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethereum-cryptography/secp256k1", JSImport.Namespace)
@js.native
object secp256k1Mod extends js.Object {
  
  def createPrivateKey(): js.Promise[js.typedarray.Uint8Array] = js.native
  
  def createPrivateKeySync(): js.typedarray.Uint8Array = js.native
  
  def ecdh(publicKey: js.typedarray.Uint8Array, privateKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  def ecdh(publicKey: js.typedarray.Uint8Array, privateKey: js.typedarray.Uint8Array, opt: ecdhOptions): js.typedarray.Uint8Array = js.native
  
  def ecdsaRecover(signature: js.typedarray.Uint8Array, recid: Double, message: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  def ecdsaRecover(
    signature: js.typedarray.Uint8Array,
    recid: Double,
    message: js.typedarray.Uint8Array,
    compressed: Boolean
  ): js.typedarray.Uint8Array = js.native
  
  def ecdsaSign(message: js.typedarray.Uint8Array, privateKey: js.typedarray.Uint8Array): Recid = js.native
  def ecdsaSign(message: js.typedarray.Uint8Array, privateKey: js.typedarray.Uint8Array, options: SignOptions): Recid = js.native
  
  def ecdsaVerify(
    signature: js.typedarray.Uint8Array,
    message: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array
  ): Boolean = js.native
  
  def privateKeyExport(privateKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  def privateKeyExport(privateKey: js.typedarray.Uint8Array, compressed: Boolean): js.typedarray.Uint8Array = js.native
  
  def privateKeyImport(privateKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  
  def privateKeyModInverse(privateKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  
  def privateKeyNegate(privateKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  
  def privateKeyTweakAdd(privateKey: js.typedarray.Uint8Array, tweak: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  
  def privateKeyTweakMul(privateKey: js.typedarray.Uint8Array, tweak: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  
  def privateKeyVerify(privateKey: js.typedarray.Uint8Array): Boolean = js.native
  
  def publicKeyCombine(publicKeys: js.Array[js.typedarray.Uint8Array]): js.typedarray.Uint8Array = js.native
  def publicKeyCombine(publicKeys: js.Array[js.typedarray.Uint8Array], compressed: Boolean): js.typedarray.Uint8Array = js.native
  
  def publicKeyConvert(publicKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  def publicKeyConvert(publicKey: js.typedarray.Uint8Array, compressed: Boolean): js.typedarray.Uint8Array = js.native
  
  def publicKeyCreate(privateKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  def publicKeyCreate(privateKey: js.typedarray.Uint8Array, compressed: Boolean): js.typedarray.Uint8Array = js.native
  
  def publicKeyTweakAdd(publicKey: js.typedarray.Uint8Array, tweak: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  def publicKeyTweakAdd(publicKey: js.typedarray.Uint8Array, tweak: js.typedarray.Uint8Array, compressed: Boolean): js.typedarray.Uint8Array = js.native
  
  def publicKeyTweakMul(publicKey: js.typedarray.Uint8Array, tweak: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  def publicKeyTweakMul(publicKey: js.typedarray.Uint8Array, tweak: js.typedarray.Uint8Array, compressed: Boolean): js.typedarray.Uint8Array = js.native
  
  def publicKeyVerify(publicKey: js.typedarray.Uint8Array): Boolean = js.native
  
  def signatureExport(signature: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  
  def signatureImport(signature: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  
  def signatureNormalize(signature: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
}

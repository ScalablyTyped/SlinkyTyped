package typingsSlinky.ethereumCryptography

import typingsSlinky.secp256k1.anon.Recid
import typingsSlinky.secp256k1.mod.SignOptions
import typingsSlinky.secp256k1.mod.ecdhOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object secp256k1Mod {
  
  @JSImport("ethereum-cryptography/secp256k1", "createPrivateKey")
  @js.native
  def createPrivateKey(): js.Promise[js.typedarray.Uint8Array] = js.native
  
  @JSImport("ethereum-cryptography/secp256k1", "createPrivateKeySync")
  @js.native
  def createPrivateKeySync(): js.typedarray.Uint8Array = js.native
  
  @JSImport("ethereum-cryptography/secp256k1", "ecdh")
  @js.native
  def ecdh(publicKey: js.typedarray.Uint8Array, privateKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  @JSImport("ethereum-cryptography/secp256k1", "ecdh")
  @js.native
  def ecdh(publicKey: js.typedarray.Uint8Array, privateKey: js.typedarray.Uint8Array, opt: ecdhOptions): js.typedarray.Uint8Array = js.native
  
  @JSImport("ethereum-cryptography/secp256k1", "ecdsaRecover")
  @js.native
  def ecdsaRecover(signature: js.typedarray.Uint8Array, recid: Double, message: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  @JSImport("ethereum-cryptography/secp256k1", "ecdsaRecover")
  @js.native
  def ecdsaRecover(
    signature: js.typedarray.Uint8Array,
    recid: Double,
    message: js.typedarray.Uint8Array,
    compressed: Boolean
  ): js.typedarray.Uint8Array = js.native
  
  @JSImport("ethereum-cryptography/secp256k1", "ecdsaSign")
  @js.native
  def ecdsaSign(message: js.typedarray.Uint8Array, privateKey: js.typedarray.Uint8Array): Recid = js.native
  @JSImport("ethereum-cryptography/secp256k1", "ecdsaSign")
  @js.native
  def ecdsaSign(message: js.typedarray.Uint8Array, privateKey: js.typedarray.Uint8Array, options: SignOptions): Recid = js.native
  
  @JSImport("ethereum-cryptography/secp256k1", "ecdsaVerify")
  @js.native
  def ecdsaVerify(
    signature: js.typedarray.Uint8Array,
    message: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array
  ): Boolean = js.native
  
  @JSImport("ethereum-cryptography/secp256k1", "privateKeyExport")
  @js.native
  def privateKeyExport(privateKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  @JSImport("ethereum-cryptography/secp256k1", "privateKeyExport")
  @js.native
  def privateKeyExport(privateKey: js.typedarray.Uint8Array, compressed: Boolean): js.typedarray.Uint8Array = js.native
  
  @JSImport("ethereum-cryptography/secp256k1", "privateKeyImport")
  @js.native
  def privateKeyImport(privateKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  
  @JSImport("ethereum-cryptography/secp256k1", "privateKeyModInverse")
  @js.native
  def privateKeyModInverse(privateKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  
  @JSImport("ethereum-cryptography/secp256k1", "privateKeyNegate")
  @js.native
  def privateKeyNegate(privateKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  
  @JSImport("ethereum-cryptography/secp256k1", "privateKeyTweakAdd")
  @js.native
  def privateKeyTweakAdd(privateKey: js.typedarray.Uint8Array, tweak: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  
  @JSImport("ethereum-cryptography/secp256k1", "privateKeyTweakMul")
  @js.native
  def privateKeyTweakMul(privateKey: js.typedarray.Uint8Array, tweak: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  
  @JSImport("ethereum-cryptography/secp256k1", "privateKeyVerify")
  @js.native
  def privateKeyVerify(privateKey: js.typedarray.Uint8Array): Boolean = js.native
  
  @JSImport("ethereum-cryptography/secp256k1", "publicKeyCombine")
  @js.native
  def publicKeyCombine(publicKeys: js.Array[js.typedarray.Uint8Array]): js.typedarray.Uint8Array = js.native
  @JSImport("ethereum-cryptography/secp256k1", "publicKeyCombine")
  @js.native
  def publicKeyCombine(publicKeys: js.Array[js.typedarray.Uint8Array], compressed: Boolean): js.typedarray.Uint8Array = js.native
  
  @JSImport("ethereum-cryptography/secp256k1", "publicKeyConvert")
  @js.native
  def publicKeyConvert(publicKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  @JSImport("ethereum-cryptography/secp256k1", "publicKeyConvert")
  @js.native
  def publicKeyConvert(publicKey: js.typedarray.Uint8Array, compressed: Boolean): js.typedarray.Uint8Array = js.native
  
  @JSImport("ethereum-cryptography/secp256k1", "publicKeyCreate")
  @js.native
  def publicKeyCreate(privateKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  @JSImport("ethereum-cryptography/secp256k1", "publicKeyCreate")
  @js.native
  def publicKeyCreate(privateKey: js.typedarray.Uint8Array, compressed: Boolean): js.typedarray.Uint8Array = js.native
  
  @JSImport("ethereum-cryptography/secp256k1", "publicKeyTweakAdd")
  @js.native
  def publicKeyTweakAdd(publicKey: js.typedarray.Uint8Array, tweak: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  @JSImport("ethereum-cryptography/secp256k1", "publicKeyTweakAdd")
  @js.native
  def publicKeyTweakAdd(publicKey: js.typedarray.Uint8Array, tweak: js.typedarray.Uint8Array, compressed: Boolean): js.typedarray.Uint8Array = js.native
  
  @JSImport("ethereum-cryptography/secp256k1", "publicKeyTweakMul")
  @js.native
  def publicKeyTweakMul(publicKey: js.typedarray.Uint8Array, tweak: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  @JSImport("ethereum-cryptography/secp256k1", "publicKeyTweakMul")
  @js.native
  def publicKeyTweakMul(publicKey: js.typedarray.Uint8Array, tweak: js.typedarray.Uint8Array, compressed: Boolean): js.typedarray.Uint8Array = js.native
  
  @JSImport("ethereum-cryptography/secp256k1", "publicKeyVerify")
  @js.native
  def publicKeyVerify(publicKey: js.typedarray.Uint8Array): Boolean = js.native
  
  @JSImport("ethereum-cryptography/secp256k1", "signatureExport")
  @js.native
  def signatureExport(signature: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  
  @JSImport("ethereum-cryptography/secp256k1", "signatureImport")
  @js.native
  def signatureImport(signature: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  
  @JSImport("ethereum-cryptography/secp256k1", "signatureNormalize")
  @js.native
  def signatureNormalize(signature: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
}

package typingsSlinky.ipfsCore.anon

import typingsSlinky.ipfsCore.ipfsCoreStrings.Ed25519
import typingsSlinky.ipfsCore.ipfsCoreStrings.RSA
import typingsSlinky.ipfsCore.ipfsCoreStrings.secp256k1
import typingsSlinky.libp2pCrypto.anon.GenSharedKey
import typingsSlinky.libp2pCrypto.mod.CipherType
import typingsSlinky.libp2pCrypto.mod.CurveType
import typingsSlinky.libp2pCrypto.mod.HashType
import typingsSlinky.libp2pCrypto.mod.KeyType
import typingsSlinky.libp2pCrypto.mod.PrivateKey
import typingsSlinky.libp2pCrypto.mod.PublicKey
import typingsSlinky.libp2pCrypto.mod.StretchPair
import typingsSlinky.libp2pCrypto.mod.keys.supportedKeys.ed25519.Ed25519PrivateKey
import typingsSlinky.libp2pCrypto.mod.keys.supportedKeys.rsa.RsaPrivateKey
import typingsSlinky.libp2pCrypto.mod.keys.supportedKeys.secp256k1.Secp256k1PrivateKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofkeys extends js.Object {
  
  /**
    * Converts a PEM password protected private key into its representative object.
    * @param pem Password protected private key in PEM format.
    * @param password The password used to protect the key.
    */
  def _import(pem: String, password: String): js.Promise[RsaPrivateKey] = js.native
  def _import(pem: String, password: String, format: String): js.Promise[RsaPrivateKey] = js.native
  
  def generateEphemeralKeyPair(curve: String): js.Promise[GenSharedKey] = js.native
  def generateEphemeralKeyPair(curve: CurveType): js.Promise[GenSharedKey] = js.native
  
  def generateKeyPair(`type`: String, bits: Double): js.Promise[PrivateKey] = js.native
  def generateKeyPair(`type`: KeyType, bits: Double): js.Promise[PrivateKey] = js.native
  
  def generateKeyPairFromSeed(`type`: String, seed: js.typedarray.Uint8Array, bits: Double): js.Promise[PrivateKey] = js.native
  def generateKeyPairFromSeed(`type`: KeyType, seed: js.typedarray.Uint8Array, bits: Double): js.Promise[PrivateKey] = js.native
  @JSName("generateKeyPairFromSeed")
  def generateKeyPairFromSeed_Ed25519(`type`: Ed25519, seed: js.typedarray.Uint8Array, bits: Double): js.Promise[Ed25519PrivateKey] = js.native
  
  @JSName("generateKeyPair")
  def generateKeyPair_Ed25519(`type`: Ed25519): js.Promise[Ed25519PrivateKey] = js.native
  @JSName("generateKeyPair")
  def generateKeyPair_RSA(`type`: RSA, bits: Double): js.Promise[RsaPrivateKey] = js.native
  @JSName("generateKeyPair")
  def generateKeyPair_secp256k1(`type`: secp256k1): js.Promise[Secp256k1PrivateKey] = js.native
  
  def keyStretcher(cipherType: String, hashType: String, secret: String): js.Promise[StretchPair] = js.native
  def keyStretcher(cipherType: String, hashType: String, secret: js.typedarray.Uint8Array): js.Promise[StretchPair] = js.native
  def keyStretcher(cipherType: String, hashType: HashType, secret: String): js.Promise[StretchPair] = js.native
  def keyStretcher(cipherType: String, hashType: HashType, secret: js.typedarray.Uint8Array): js.Promise[StretchPair] = js.native
  def keyStretcher(cipherType: CipherType, hashType: String, secret: String): js.Promise[StretchPair] = js.native
  def keyStretcher(cipherType: CipherType, hashType: String, secret: js.typedarray.Uint8Array): js.Promise[StretchPair] = js.native
  def keyStretcher(cipherType: CipherType, hashType: HashType, secret: String): js.Promise[StretchPair] = js.native
  def keyStretcher(cipherType: CipherType, hashType: HashType, secret: js.typedarray.Uint8Array): js.Promise[StretchPair] = js.native
  
  val keysPBM: js.Any = js.native
  
  def marshalPrivateKey(key: PrivateKey): js.typedarray.Uint8Array = js.native
  def marshalPrivateKey(key: PrivateKey, `type`: String): js.typedarray.Uint8Array = js.native
  def marshalPrivateKey(key: PrivateKey, `type`: KeyType): js.typedarray.Uint8Array = js.native
  
  def marshalPublicKey(key: PublicKey): js.typedarray.Uint8Array = js.native
  def marshalPublicKey(key: PublicKey, `type`: String): js.typedarray.Uint8Array = js.native
  def marshalPublicKey(key: PublicKey, `type`: KeyType): js.typedarray.Uint8Array = js.native
  
  val supportedKeys: TypeofsupportedKeys = js.native
  
  def unmarshalPrivateKey(buf: js.typedarray.Uint8Array): js.Promise[PrivateKey] = js.native
  
  def unmarshalPublicKey(buf: js.typedarray.Uint8Array): PublicKey = js.native
}

package typingsSlinky.nodeDashForge.nodeDashForgeMod.pki

import typingsSlinky.node.Buffer
import typingsSlinky.nodeDashForge.Anon_PrivateKey
import typingsSlinky.nodeDashForge.Anon_PrivateKeyBinaryBuffer
import typingsSlinky.nodeDashForge.Anon_PublicKey
import typingsSlinky.nodeDashForge.Anon_Seed
import typingsSlinky.nodeDashForge.nodeDashForgeMod.util.ByteBuffer
import typingsSlinky.nodeDashForge.nodeDashForgeNumbers.`32`
import typingsSlinky.nodeDashForge.nodeDashForgeNumbers.`64`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "pki.ed25519")
@js.native
object ed25519 extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.nodeDashForge.Anon_Message
    - typings.nodeDashForge.Anon_Binary
  */
  trait ToNativeBufferParameters extends js.Object
  
  // generateKeyPair does not currently accept `util.ByteBuffer` as the seed.
  def generateKeyPair(): Anon_PrivateKey = js.native
  def generateKeyPair(options: Anon_Seed): Anon_PrivateKey = js.native
  def publicKeyFromPrivateKey(options: Anon_PrivateKeyBinaryBuffer): NativeBuffer = js.native
  def sign(options: ToNativeBufferParameters with Anon_PrivateKeyBinaryBuffer): NativeBuffer = js.native
  def verify(options: ToNativeBufferParameters with Anon_PublicKey): Boolean = js.native
  @js.native
  object constants extends js.Object {
    val HASH_BYTE_LENGTH: `64` = js.native
    val PRIVATE_KEY_BYTE_LENGTH: `64` = js.native
    val PUBLIC_KEY_BYTE_LENGTH: `32` = js.native
    val SEED_BYTE_LENGTH: `32` = js.native
    val SIGN_BYTE_LENGTH: `64` = js.native
  }
  
  // `string`s will be converted by toNativeBuffer with `encoding: 'binary'`
  type BinaryBuffer = NativeBuffer | ByteBuffer | String
  type Key = NativeBuffer
  type NativeBuffer = Buffer | scala.scalajs.js.typedarray.Uint8Array
}


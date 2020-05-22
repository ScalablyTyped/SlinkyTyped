package typingsSlinky.nodeForge.mod.pki

import typingsSlinky.node.Buffer
import typingsSlinky.nodeForge.anon.PrivateKeyBinaryBuffer
import typingsSlinky.nodeForge.anon.Seed
import typingsSlinky.nodeForge.mod.util.ByteBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "pki.ed25519")
@js.native
object ed25519 extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.nodeForge.anon.Message
    - typingsSlinky.nodeForge.anon.Encoding
  */
  trait ToNativeBufferParameters extends js.Object
  
  // generateKeyPair does not currently accept `util.ByteBuffer` as the seed.
  def generateKeyPair(): typingsSlinky.nodeForge.anon.PrivateKey = js.native
  def generateKeyPair(options: Seed): typingsSlinky.nodeForge.anon.PrivateKey = js.native
  def publicKeyFromPrivateKey(options: PrivateKeyBinaryBuffer): NativeBuffer = js.native
  def sign(options: ToNativeBufferParameters with PrivateKeyBinaryBuffer): NativeBuffer = js.native
  def verify(options: ToNativeBufferParameters with typingsSlinky.nodeForge.anon.PublicKey): Boolean = js.native
  @js.native
  object constants extends js.Object {
    val HASH_BYTE_LENGTH: /* 64 */ Double = js.native
    val PRIVATE_KEY_BYTE_LENGTH: /* 64 */ Double = js.native
    val PUBLIC_KEY_BYTE_LENGTH: /* 32 */ Double = js.native
    val SEED_BYTE_LENGTH: /* 32 */ Double = js.native
    val SIGN_BYTE_LENGTH: /* 64 */ Double = js.native
  }
  
  // `string`s will be converted by toNativeBuffer with `encoding: 'binary'`
  type BinaryBuffer = NativeBuffer | ByteBuffer | String
  type Key = NativeBuffer
  type NativeBuffer = Buffer | js.typedarray.Uint8Array
}


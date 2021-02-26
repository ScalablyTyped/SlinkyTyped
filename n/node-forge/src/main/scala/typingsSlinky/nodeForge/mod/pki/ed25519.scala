package typingsSlinky.nodeForge.mod.pki

import typingsSlinky.node.Buffer
import typingsSlinky.nodeForge.anon.PrivateKeyBinaryBuffer
import typingsSlinky.nodeForge.anon.Seed
import typingsSlinky.nodeForge.mod.util.ByteBuffer
import typingsSlinky.nodeForge.nodeForgeStrings.binary
import typingsSlinky.nodeForge.nodeForgeStrings.utf8
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ed25519 {
  
  object constants {
    
    @JSImport("node-forge", "pki.ed25519.constants.HASH_BYTE_LENGTH")
    @js.native
    val HASH_BYTE_LENGTH: /* 64 */ Double = js.native
    
    @JSImport("node-forge", "pki.ed25519.constants.PRIVATE_KEY_BYTE_LENGTH")
    @js.native
    val PRIVATE_KEY_BYTE_LENGTH: /* 64 */ Double = js.native
    
    @JSImport("node-forge", "pki.ed25519.constants.PUBLIC_KEY_BYTE_LENGTH")
    @js.native
    val PUBLIC_KEY_BYTE_LENGTH: /* 32 */ Double = js.native
    
    @JSImport("node-forge", "pki.ed25519.constants.SEED_BYTE_LENGTH")
    @js.native
    val SEED_BYTE_LENGTH: /* 32 */ Double = js.native
    
    @JSImport("node-forge", "pki.ed25519.constants.SIGN_BYTE_LENGTH")
    @js.native
    val SIGN_BYTE_LENGTH: /* 64 */ Double = js.native
  }
  
  // generateKeyPair does not currently accept `util.ByteBuffer` as the seed.
  @JSImport("node-forge", "pki.ed25519.generateKeyPair")
  @js.native
  def generateKeyPair(): typingsSlinky.nodeForge.anon.PrivateKey = js.native
  @JSImport("node-forge", "pki.ed25519.generateKeyPair")
  @js.native
  def generateKeyPair(options: Seed): typingsSlinky.nodeForge.anon.PrivateKey = js.native
  
  @JSImport("node-forge", "pki.ed25519.publicKeyFromPrivateKey")
  @js.native
  def publicKeyFromPrivateKey(options: PrivateKeyBinaryBuffer): NativeBuffer = js.native
  
  @JSImport("node-forge", "pki.ed25519.sign")
  @js.native
  def sign(options: ToNativeBufferParameters with PrivateKeyBinaryBuffer): NativeBuffer = js.native
  
  @JSImport("node-forge", "pki.ed25519.verify")
  @js.native
  def verify(options: ToNativeBufferParameters with typingsSlinky.nodeForge.anon.PublicKey): Boolean = js.native
  
  // `string`s will be converted by toNativeBuffer with `encoding: 'binary'`
  type BinaryBuffer = NativeBuffer | ByteBuffer | String
  
  type Key = NativeBuffer
  
  type NativeBuffer = Buffer | js.typedarray.Uint8Array
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.nodeForge.anon.Message
    - typingsSlinky.nodeForge.anon.Encoding
  */
  trait ToNativeBufferParameters extends StObject
  object ToNativeBufferParameters {
    
    @scala.inline
    def Encoding(encoding: binary | utf8, message: String): typingsSlinky.nodeForge.anon.Encoding = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.nodeForge.anon.Encoding]
    }
    
    @scala.inline
    def Message(message: NativeBuffer | ByteBuffer): typingsSlinky.nodeForge.anon.Message = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.nodeForge.anon.Message]
    }
  }
}

package typingsSlinky.asmcryptoJs

import typingsSlinky.asmcryptoJs.sha1Mod.Sha1
import typingsSlinky.asmcryptoJs.sha256Mod.Sha256
import typingsSlinky.asmcryptoJs.sha512Mod.Sha512
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pkcs1Mod {
  
  @JSImport("asmcrypto.js/dist_es8/rsa/pkcs1", "RSA_PKCS1_v1_5")
  @js.native
  class RSAPKCS1V15 protected () extends StObject {
    def this(key: js.Array[js.typedarray.Uint8Array], hash: Sha1) = this()
    def this(key: js.Array[js.typedarray.Uint8Array], hash: Sha256) = this()
    def this(key: js.Array[js.typedarray.Uint8Array], hash: Sha512) = this()
    
    val hash: js.Any = js.native
    
    val rsa: js.Any = js.native
    
    def sign(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    
    def verify(signature: js.typedarray.Uint8Array, data: js.typedarray.Uint8Array): Unit = js.native
  }
  
  @JSImport("asmcrypto.js/dist_es8/rsa/pkcs1", "RSA_OAEP")
  @js.native
  class RSA_OAEP protected () extends StObject {
    def this(key: js.Array[js.typedarray.Uint8Array], hash: Sha1) = this()
    def this(key: js.Array[js.typedarray.Uint8Array], hash: Sha256) = this()
    def this(key: js.Array[js.typedarray.Uint8Array], hash: Sha512) = this()
    def this(key: js.Array[js.typedarray.Uint8Array], hash: Sha1, label: js.typedarray.Uint8Array) = this()
    def this(key: js.Array[js.typedarray.Uint8Array], hash: Sha256, label: js.typedarray.Uint8Array) = this()
    def this(key: js.Array[js.typedarray.Uint8Array], hash: Sha512, label: js.typedarray.Uint8Array) = this()
    
    def RSA_MGF1_generate(seed: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    def RSA_MGF1_generate(seed: js.typedarray.Uint8Array, length: Double): js.typedarray.Uint8Array = js.native
    
    def decrypt(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    
    def encrypt(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    def encrypt(data: js.typedarray.Uint8Array, random: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    
    val hash: js.Any = js.native
    
    val label: js.Any = js.native
    
    val rsa: js.Any = js.native
  }
  
  @JSImport("asmcrypto.js/dist_es8/rsa/pkcs1", "RSA_PSS")
  @js.native
  class RSA_PSS protected () extends StObject {
    def this(key: js.Array[js.typedarray.Uint8Array], hash: Sha1) = this()
    def this(key: js.Array[js.typedarray.Uint8Array], hash: Sha256) = this()
    def this(key: js.Array[js.typedarray.Uint8Array], hash: Sha512) = this()
    def this(key: js.Array[js.typedarray.Uint8Array], hash: Sha1, saltLength: Double) = this()
    def this(key: js.Array[js.typedarray.Uint8Array], hash: Sha256, saltLength: Double) = this()
    def this(key: js.Array[js.typedarray.Uint8Array], hash: Sha512, saltLength: Double) = this()
    
    def RSA_MGF1_generate(seed: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    def RSA_MGF1_generate(seed: js.typedarray.Uint8Array, length: Double): js.typedarray.Uint8Array = js.native
    
    val hash: js.Any = js.native
    
    val rsa: js.Any = js.native
    
    val saltLength: js.Any = js.native
    
    def sign(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    def sign(data: js.typedarray.Uint8Array, random: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    
    def verify(signature: js.typedarray.Uint8Array, data: js.typedarray.Uint8Array): Unit = js.native
  }
}

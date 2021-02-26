package typingsSlinky.asmcryptoJs

import typingsSlinky.asmcryptoJs.anon.BitLength
import typingsSlinky.asmcryptoJs.anon.Gcd
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("asmcrypto.js", "AES_CBC")
  @js.native
  class AES_CBC protected ()
    extends typingsSlinky.asmcryptoJs.cbcMod.AES_CBC {
    def this(key: js.typedarray.Uint8Array) = this()
    def this(key: js.typedarray.Uint8Array, iv: js.typedarray.Uint8Array) = this()
    def this(key: js.typedarray.Uint8Array, iv: js.UndefOr[scala.Nothing], padding: Boolean) = this()
    def this(key: js.typedarray.Uint8Array, iv: js.typedarray.Uint8Array, padding: Boolean) = this()
  }
  /* static members */
  object AES_CBC {
    
    @JSImport("asmcrypto.js", "AES_CBC.decrypt")
    @js.native
    def decrypt(data: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    @JSImport("asmcrypto.js", "AES_CBC.decrypt")
    @js.native
    def decrypt(
      data: js.typedarray.Uint8Array,
      key: js.typedarray.Uint8Array,
      padding: js.UndefOr[scala.Nothing],
      iv: js.typedarray.Uint8Array
    ): js.typedarray.Uint8Array = js.native
    @JSImport("asmcrypto.js", "AES_CBC.decrypt")
    @js.native
    def decrypt(data: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, padding: Boolean): js.typedarray.Uint8Array = js.native
    @JSImport("asmcrypto.js", "AES_CBC.decrypt")
    @js.native
    def decrypt(
      data: js.typedarray.Uint8Array,
      key: js.typedarray.Uint8Array,
      padding: Boolean,
      iv: js.typedarray.Uint8Array
    ): js.typedarray.Uint8Array = js.native
    
    @JSImport("asmcrypto.js", "AES_CBC.encrypt")
    @js.native
    def encrypt(data: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    @JSImport("asmcrypto.js", "AES_CBC.encrypt")
    @js.native
    def encrypt(
      data: js.typedarray.Uint8Array,
      key: js.typedarray.Uint8Array,
      padding: js.UndefOr[scala.Nothing],
      iv: js.typedarray.Uint8Array
    ): js.typedarray.Uint8Array = js.native
    @JSImport("asmcrypto.js", "AES_CBC.encrypt")
    @js.native
    def encrypt(data: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, padding: Boolean): js.typedarray.Uint8Array = js.native
    @JSImport("asmcrypto.js", "AES_CBC.encrypt")
    @js.native
    def encrypt(
      data: js.typedarray.Uint8Array,
      key: js.typedarray.Uint8Array,
      padding: Boolean,
      iv: js.typedarray.Uint8Array
    ): js.typedarray.Uint8Array = js.native
  }
  
  @JSImport("asmcrypto.js", "AES_CCM")
  @js.native
  class AES_CCM protected ()
    extends typingsSlinky.asmcryptoJs.ccmMod.AES_CCM {
    def this(
      key: js.typedarray.Uint8Array,
      nonce: js.typedarray.Uint8Array,
      adata: js.UndefOr[scala.Nothing],
      tagSize: js.UndefOr[scala.Nothing],
      dataLength: Double
    ) = this()
    def this(
      key: js.typedarray.Uint8Array,
      nonce: js.typedarray.Uint8Array,
      adata: js.UndefOr[scala.Nothing],
      tagSize: Double,
      dataLength: Double
    ) = this()
    def this(
      key: js.typedarray.Uint8Array,
      nonce: js.typedarray.Uint8Array,
      adata: js.typedarray.Uint8Array,
      tagSize: js.UndefOr[scala.Nothing],
      dataLength: Double
    ) = this()
    def this(
      key: js.typedarray.Uint8Array,
      nonce: js.typedarray.Uint8Array,
      adata: js.typedarray.Uint8Array,
      tagSize: Double,
      dataLength: Double
    ) = this()
  }
  /* static members */
  object AES_CCM {
    
    @JSImport("asmcrypto.js", "AES_CCM.decrypt")
    @js.native
    def decrypt(cipher: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, nonce: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    @JSImport("asmcrypto.js", "AES_CCM.decrypt")
    @js.native
    def decrypt(
      cipher: js.typedarray.Uint8Array,
      key: js.typedarray.Uint8Array,
      nonce: js.typedarray.Uint8Array,
      adata: js.UndefOr[scala.Nothing],
      tagsize: Double
    ): js.typedarray.Uint8Array = js.native
    @JSImport("asmcrypto.js", "AES_CCM.decrypt")
    @js.native
    def decrypt(
      cipher: js.typedarray.Uint8Array,
      key: js.typedarray.Uint8Array,
      nonce: js.typedarray.Uint8Array,
      adata: js.typedarray.Uint8Array
    ): js.typedarray.Uint8Array = js.native
    @JSImport("asmcrypto.js", "AES_CCM.decrypt")
    @js.native
    def decrypt(
      cipher: js.typedarray.Uint8Array,
      key: js.typedarray.Uint8Array,
      nonce: js.typedarray.Uint8Array,
      adata: js.typedarray.Uint8Array,
      tagsize: Double
    ): js.typedarray.Uint8Array = js.native
    
    @JSImport("asmcrypto.js", "AES_CCM.encrypt")
    @js.native
    def encrypt(clear: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, nonce: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    @JSImport("asmcrypto.js", "AES_CCM.encrypt")
    @js.native
    def encrypt(
      clear: js.typedarray.Uint8Array,
      key: js.typedarray.Uint8Array,
      nonce: js.typedarray.Uint8Array,
      adata: js.UndefOr[scala.Nothing],
      tagsize: Double
    ): js.typedarray.Uint8Array = js.native
    @JSImport("asmcrypto.js", "AES_CCM.encrypt")
    @js.native
    def encrypt(
      clear: js.typedarray.Uint8Array,
      key: js.typedarray.Uint8Array,
      nonce: js.typedarray.Uint8Array,
      adata: js.typedarray.Uint8Array
    ): js.typedarray.Uint8Array = js.native
    @JSImport("asmcrypto.js", "AES_CCM.encrypt")
    @js.native
    def encrypt(
      clear: js.typedarray.Uint8Array,
      key: js.typedarray.Uint8Array,
      nonce: js.typedarray.Uint8Array,
      adata: js.typedarray.Uint8Array,
      tagsize: Double
    ): js.typedarray.Uint8Array = js.native
  }
  
  @JSImport("asmcrypto.js", "AES_CFB")
  @js.native
  class AES_CFB protected ()
    extends typingsSlinky.asmcryptoJs.cfbMod.AES_CFB {
    def this(key: js.typedarray.Uint8Array) = this()
    def this(key: js.typedarray.Uint8Array, iv: js.typedarray.Uint8Array) = this()
  }
  /* static members */
  object AES_CFB {
    
    @JSImport("asmcrypto.js", "AES_CFB.decrypt")
    @js.native
    def decrypt(data: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    @JSImport("asmcrypto.js", "AES_CFB.decrypt")
    @js.native
    def decrypt(data: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, iv: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    
    @JSImport("asmcrypto.js", "AES_CFB.encrypt")
    @js.native
    def encrypt(data: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    @JSImport("asmcrypto.js", "AES_CFB.encrypt")
    @js.native
    def encrypt(data: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, iv: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  }
  
  @JSImport("asmcrypto.js", "AES_CMAC")
  @js.native
  class AES_CMAC protected ()
    extends typingsSlinky.asmcryptoJs.cmacMod.AES_CMAC {
    def this(key: js.typedarray.Uint8Array) = this()
  }
  /* static members */
  object AES_CMAC {
    
    @JSImport("asmcrypto.js", "AES_CMAC.bytes")
    @js.native
    def bytes(data: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  }
  
  @JSImport("asmcrypto.js", "AES_CTR")
  @js.native
  class AES_CTR protected ()
    extends typingsSlinky.asmcryptoJs.ctrMod.AES_CTR {
    def this(key: js.typedarray.Uint8Array, nonce: js.typedarray.Uint8Array) = this()
  }
  /* static members */
  object AES_CTR {
    
    @JSImport("asmcrypto.js", "AES_CTR.decrypt")
    @js.native
    def decrypt(data: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, nonce: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    
    @JSImport("asmcrypto.js", "AES_CTR.encrypt")
    @js.native
    def encrypt(data: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, nonce: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  }
  
  @JSImport("asmcrypto.js", "AES_ECB")
  @js.native
  class AES_ECB protected ()
    extends typingsSlinky.asmcryptoJs.ecbMod.AES_ECB {
    def this(key: js.typedarray.Uint8Array) = this()
    def this(key: js.typedarray.Uint8Array, padding: Boolean) = this()
  }
  /* static members */
  object AES_ECB {
    
    @JSImport("asmcrypto.js", "AES_ECB.decrypt")
    @js.native
    def decrypt(data: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    @JSImport("asmcrypto.js", "AES_ECB.decrypt")
    @js.native
    def decrypt(data: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, padding: Boolean): js.typedarray.Uint8Array = js.native
    
    @JSImport("asmcrypto.js", "AES_ECB.encrypt")
    @js.native
    def encrypt(data: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    @JSImport("asmcrypto.js", "AES_ECB.encrypt")
    @js.native
    def encrypt(data: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, padding: Boolean): js.typedarray.Uint8Array = js.native
  }
  
  @JSImport("asmcrypto.js", "AES_GCM")
  @js.native
  class AES_GCM protected ()
    extends typingsSlinky.asmcryptoJs.gcmMod.AES_GCM {
    def this(key: js.typedarray.Uint8Array, nonce: js.typedarray.Uint8Array) = this()
    def this(key: js.typedarray.Uint8Array, nonce: js.typedarray.Uint8Array, adata: js.typedarray.Uint8Array) = this()
    def this(
      key: js.typedarray.Uint8Array,
      nonce: js.typedarray.Uint8Array,
      adata: js.UndefOr[scala.Nothing],
      tagSize: Double
    ) = this()
    def this(
      key: js.typedarray.Uint8Array,
      nonce: js.typedarray.Uint8Array,
      adata: js.typedarray.Uint8Array,
      tagSize: Double
    ) = this()
  }
  /* static members */
  object AES_GCM {
    
    @JSImport("asmcrypto.js", "AES_GCM.decrypt")
    @js.native
    def decrypt(
      ciphertext: js.typedarray.Uint8Array,
      key: js.typedarray.Uint8Array,
      nonce: js.typedarray.Uint8Array
    ): js.typedarray.Uint8Array = js.native
    @JSImport("asmcrypto.js", "AES_GCM.decrypt")
    @js.native
    def decrypt(
      ciphertext: js.typedarray.Uint8Array,
      key: js.typedarray.Uint8Array,
      nonce: js.typedarray.Uint8Array,
      adata: js.UndefOr[scala.Nothing],
      tagsize: Double
    ): js.typedarray.Uint8Array = js.native
    @JSImport("asmcrypto.js", "AES_GCM.decrypt")
    @js.native
    def decrypt(
      ciphertext: js.typedarray.Uint8Array,
      key: js.typedarray.Uint8Array,
      nonce: js.typedarray.Uint8Array,
      adata: js.typedarray.Uint8Array
    ): js.typedarray.Uint8Array = js.native
    @JSImport("asmcrypto.js", "AES_GCM.decrypt")
    @js.native
    def decrypt(
      ciphertext: js.typedarray.Uint8Array,
      key: js.typedarray.Uint8Array,
      nonce: js.typedarray.Uint8Array,
      adata: js.typedarray.Uint8Array,
      tagsize: Double
    ): js.typedarray.Uint8Array = js.native
    
    @JSImport("asmcrypto.js", "AES_GCM.encrypt")
    @js.native
    def encrypt(
      cleartext: js.typedarray.Uint8Array,
      key: js.typedarray.Uint8Array,
      nonce: js.typedarray.Uint8Array
    ): js.typedarray.Uint8Array = js.native
    @JSImport("asmcrypto.js", "AES_GCM.encrypt")
    @js.native
    def encrypt(
      cleartext: js.typedarray.Uint8Array,
      key: js.typedarray.Uint8Array,
      nonce: js.typedarray.Uint8Array,
      adata: js.UndefOr[scala.Nothing],
      tagsize: Double
    ): js.typedarray.Uint8Array = js.native
    @JSImport("asmcrypto.js", "AES_GCM.encrypt")
    @js.native
    def encrypt(
      cleartext: js.typedarray.Uint8Array,
      key: js.typedarray.Uint8Array,
      nonce: js.typedarray.Uint8Array,
      adata: js.typedarray.Uint8Array
    ): js.typedarray.Uint8Array = js.native
    @JSImport("asmcrypto.js", "AES_GCM.encrypt")
    @js.native
    def encrypt(
      cleartext: js.typedarray.Uint8Array,
      key: js.typedarray.Uint8Array,
      nonce: js.typedarray.Uint8Array,
      adata: js.typedarray.Uint8Array,
      tagsize: Double
    ): js.typedarray.Uint8Array = js.native
  }
  
  @JSImport("asmcrypto.js", "AES_OFB")
  @js.native
  class AES_OFB protected ()
    extends typingsSlinky.asmcryptoJs.ofbMod.AES_OFB {
    def this(key: js.typedarray.Uint8Array) = this()
    def this(key: js.typedarray.Uint8Array, iv: js.typedarray.Uint8Array) = this()
  }
  /* static members */
  object AES_OFB {
    
    @JSImport("asmcrypto.js", "AES_OFB.decrypt")
    @js.native
    def decrypt(data: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    @JSImport("asmcrypto.js", "AES_OFB.decrypt")
    @js.native
    def decrypt(data: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, iv: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    
    @JSImport("asmcrypto.js", "AES_OFB.encrypt")
    @js.native
    def encrypt(data: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    @JSImport("asmcrypto.js", "AES_OFB.encrypt")
    @js.native
    def encrypt(data: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, iv: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  }
  
  @JSImport("asmcrypto.js", "BigNumber")
  @js.native
  class BigNumber ()
    extends typingsSlinky.asmcryptoJs.bignumMod.BigNumber {
    def this(num: js.typedarray.Uint8Array) = this()
  }
  /* static members */
  object BigNumber {
    
    @JSImport("asmcrypto.js", "BigNumber")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("asmcrypto.js", "BigNumber.ONE")
    @js.native
    def ONE: typingsSlinky.asmcryptoJs.bignumMod.BigNumber = js.native
    @scala.inline
    def ONE_=(x: typingsSlinky.asmcryptoJs.bignumMod.BigNumber): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ONE")(x.asInstanceOf[js.Any])
    
    @JSImport("asmcrypto.js", "BigNumber.ZERO")
    @js.native
    def ZERO: typingsSlinky.asmcryptoJs.bignumMod.BigNumber = js.native
    @scala.inline
    def ZERO_=(x: typingsSlinky.asmcryptoJs.bignumMod.BigNumber): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZERO")(x.asInstanceOf[js.Any])
    
    @JSImport("asmcrypto.js", "BigNumber.extGCD")
    @js.native
    def extGCD: js.Function2[/* a */ this.type, /* b */ this.type, Gcd] = js.native
    @JSImport("asmcrypto.js", "BigNumber.extGCD")
    @js.native
    def extGCD(a: this.type, b: this.type): Gcd = js.native
    @scala.inline
    def extGCD_=(x: js.Function2[/* a */ this.type, /* b */ this.type, Gcd]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extGCD")(x.asInstanceOf[js.Any])
    
    @JSImport("asmcrypto.js", "BigNumber.fromArrayBuffer")
    @js.native
    def fromArrayBuffer(buffer: js.typedarray.ArrayBuffer): typingsSlinky.asmcryptoJs.bignumMod.BigNumber = js.native
    
    @JSImport("asmcrypto.js", "BigNumber.fromConfig")
    @js.native
    def fromConfig(obj: BitLength): typingsSlinky.asmcryptoJs.bignumMod.BigNumber = js.native
    
    @JSImport("asmcrypto.js", "BigNumber.fromNumber")
    @js.native
    def fromNumber(num: Double): typingsSlinky.asmcryptoJs.bignumMod.BigNumber = js.native
    
    @JSImport("asmcrypto.js", "BigNumber.fromString")
    @js.native
    def fromString(str: String): typingsSlinky.asmcryptoJs.bignumMod.BigNumber = js.native
  }
  
  @JSImport("asmcrypto.js", "HmacSha1")
  @js.native
  class HmacSha1 protected ()
    extends typingsSlinky.asmcryptoJs.hmacSha1Mod.HmacSha1 {
    def this(password: js.typedarray.Uint8Array) = this()
    def this(password: js.typedarray.Uint8Array, verify: js.typedarray.Uint8Array) = this()
  }
  
  @JSImport("asmcrypto.js", "HmacSha256")
  @js.native
  class HmacSha256 protected ()
    extends typingsSlinky.asmcryptoJs.hmacSha256Mod.HmacSha256 {
    def this(password: js.typedarray.Uint8Array) = this()
    def this(password: js.typedarray.Uint8Array, verify: js.typedarray.Uint8Array) = this()
  }
  
  @JSImport("asmcrypto.js", "HmacSha512")
  @js.native
  class HmacSha512 protected ()
    extends typingsSlinky.asmcryptoJs.hmacSha512Mod.HmacSha512 {
    def this(password: js.typedarray.Uint8Array) = this()
    def this(password: js.typedarray.Uint8Array, verify: js.typedarray.Uint8Array) = this()
  }
  
  @JSImport("asmcrypto.js", "IllegalArgumentError")
  @js.native
  class IllegalArgumentError protected ()
    extends typingsSlinky.asmcryptoJs.errorsMod.IllegalArgumentError {
    def this(args: js.Any*) = this()
  }
  
  @JSImport("asmcrypto.js", "IllegalStateError")
  @js.native
  class IllegalStateError protected ()
    extends typingsSlinky.asmcryptoJs.errorsMod.IllegalStateError {
    def this(args: js.Any*) = this()
  }
  
  @JSImport("asmcrypto.js", "Modulus")
  @js.native
  class Modulus protected ()
    extends typingsSlinky.asmcryptoJs.bignumMod.Modulus {
    def this(number: typingsSlinky.asmcryptoJs.bignumMod.BigNumber) = this()
  }
  /* static members */
  object Modulus {
    
    @JSImport("asmcrypto.js", "Modulus._Montgomery_reduce")
    @js.native
    def _Montgomery_reduce(a: typingsSlinky.asmcryptoJs.bignumMod.BigNumber, n: typingsSlinky.asmcryptoJs.bignumMod.Modulus): typingsSlinky.asmcryptoJs.bignumMod.BigNumber = js.native
  }
  
  @JSImport("asmcrypto.js", "Pbkdf2HmacSha1")
  @js.native
  def Pbkdf2HmacSha1(password: js.typedarray.Uint8Array, salt: js.typedarray.Uint8Array, count: Double, length: Double): js.typedarray.Uint8Array = js.native
  
  @JSImport("asmcrypto.js", "Pbkdf2HmacSha256")
  @js.native
  def Pbkdf2HmacSha256(password: js.typedarray.Uint8Array, salt: js.typedarray.Uint8Array, count: Double, length: Double): js.typedarray.Uint8Array = js.native
  
  @JSImport("asmcrypto.js", "Pbkdf2HmacSha512")
  @js.native
  def Pbkdf2HmacSha512(password: js.typedarray.Uint8Array, salt: js.typedarray.Uint8Array, count: Double, length: Double): js.typedarray.Uint8Array = js.native
  
  @JSImport("asmcrypto.js", "RSA")
  @js.native
  class RSA protected ()
    extends typingsSlinky.asmcryptoJs.rsaMod.RSA {
    def this(key: js.Array[js.typedarray.Uint8Array]) = this()
  }
  
  @JSImport("asmcrypto.js", "RSA_PKCS1_v1_5")
  @js.native
  class RSAPKCS1V15 protected ()
    extends typingsSlinky.asmcryptoJs.pkcs1Mod.RSAPKCS1V15 {
    def this(key: js.Array[js.typedarray.Uint8Array], hash: typingsSlinky.asmcryptoJs.sha1Mod.Sha1) = this()
    def this(key: js.Array[js.typedarray.Uint8Array], hash: typingsSlinky.asmcryptoJs.sha256Mod.Sha256) = this()
    def this(key: js.Array[js.typedarray.Uint8Array], hash: typingsSlinky.asmcryptoJs.sha512Mod.Sha512) = this()
  }
  
  @JSImport("asmcrypto.js", "RSA_OAEP")
  @js.native
  class RSA_OAEP protected ()
    extends typingsSlinky.asmcryptoJs.pkcs1Mod.RSA_OAEP {
    def this(key: js.Array[js.typedarray.Uint8Array], hash: typingsSlinky.asmcryptoJs.sha1Mod.Sha1) = this()
    def this(key: js.Array[js.typedarray.Uint8Array], hash: typingsSlinky.asmcryptoJs.sha256Mod.Sha256) = this()
    def this(key: js.Array[js.typedarray.Uint8Array], hash: typingsSlinky.asmcryptoJs.sha512Mod.Sha512) = this()
    def this(
      key: js.Array[js.typedarray.Uint8Array],
      hash: typingsSlinky.asmcryptoJs.sha1Mod.Sha1,
      label: js.typedarray.Uint8Array
    ) = this()
    def this(
      key: js.Array[js.typedarray.Uint8Array],
      hash: typingsSlinky.asmcryptoJs.sha256Mod.Sha256,
      label: js.typedarray.Uint8Array
    ) = this()
    def this(
      key: js.Array[js.typedarray.Uint8Array],
      hash: typingsSlinky.asmcryptoJs.sha512Mod.Sha512,
      label: js.typedarray.Uint8Array
    ) = this()
  }
  
  @JSImport("asmcrypto.js", "RSA_PSS")
  @js.native
  class RSA_PSS protected ()
    extends typingsSlinky.asmcryptoJs.pkcs1Mod.RSA_PSS {
    def this(key: js.Array[js.typedarray.Uint8Array], hash: typingsSlinky.asmcryptoJs.sha1Mod.Sha1) = this()
    def this(key: js.Array[js.typedarray.Uint8Array], hash: typingsSlinky.asmcryptoJs.sha256Mod.Sha256) = this()
    def this(key: js.Array[js.typedarray.Uint8Array], hash: typingsSlinky.asmcryptoJs.sha512Mod.Sha512) = this()
    def this(
      key: js.Array[js.typedarray.Uint8Array],
      hash: typingsSlinky.asmcryptoJs.sha1Mod.Sha1,
      saltLength: Double
    ) = this()
    def this(
      key: js.Array[js.typedarray.Uint8Array],
      hash: typingsSlinky.asmcryptoJs.sha256Mod.Sha256,
      saltLength: Double
    ) = this()
    def this(
      key: js.Array[js.typedarray.Uint8Array],
      hash: typingsSlinky.asmcryptoJs.sha512Mod.Sha512,
      saltLength: Double
    ) = this()
  }
  
  @JSImport("asmcrypto.js", "SecurityError")
  @js.native
  class SecurityError protected ()
    extends typingsSlinky.asmcryptoJs.errorsMod.SecurityError {
    def this(args: js.Any*) = this()
  }
  
  @JSImport("asmcrypto.js", "Sha1")
  @js.native
  class Sha1 ()
    extends typingsSlinky.asmcryptoJs.sha1Mod.Sha1
  /* static members */
  object Sha1 {
    
    @JSImport("asmcrypto.js", "Sha1")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("asmcrypto.js", "Sha1.NAME")
    @js.native
    def NAME: String = js.native
    @scala.inline
    def NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAME")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("asmcrypto.js", "Sha256")
  @js.native
  class Sha256 ()
    extends typingsSlinky.asmcryptoJs.sha256Mod.Sha256
  /* static members */
  object Sha256 {
    
    @JSImport("asmcrypto.js", "Sha256")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("asmcrypto.js", "Sha256.NAME")
    @js.native
    def NAME: String = js.native
    @scala.inline
    def NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAME")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("asmcrypto.js", "Sha512")
  @js.native
  class Sha512 ()
    extends typingsSlinky.asmcryptoJs.sha512Mod.Sha512
  /* static members */
  object Sha512 {
    
    @JSImport("asmcrypto.js", "Sha512")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("asmcrypto.js", "Sha512.NAME")
    @js.native
    def NAME: String = js.native
    @scala.inline
    def NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAME")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("asmcrypto.js", "base64_to_bytes")
  @js.native
  def base64ToBytes(str: String): js.typedarray.Uint8Array = js.native
  
  @JSImport("asmcrypto.js", "bytes_to_base64")
  @js.native
  def bytesToBase64(arr: js.typedarray.Uint8Array): String = js.native
  
  @JSImport("asmcrypto.js", "bytes_to_hex")
  @js.native
  def bytesToHex(arr: js.typedarray.Uint8Array): String = js.native
  
  @JSImport("asmcrypto.js", "bytes_to_string")
  @js.native
  def bytesToString(bytes: js.typedarray.Uint8Array): String = js.native
  @JSImport("asmcrypto.js", "bytes_to_string")
  @js.native
  def bytesToString(bytes: js.typedarray.Uint8Array, utf8: Boolean): String = js.native
  
  @JSImport("asmcrypto.js", "hex_to_bytes")
  @js.native
  def hexToBytes(str: String): js.typedarray.Uint8Array = js.native
  
  @JSImport("asmcrypto.js", "string_to_bytes")
  @js.native
  def stringToBytes(str: String): js.typedarray.Uint8Array = js.native
  @JSImport("asmcrypto.js", "string_to_bytes")
  @js.native
  def stringToBytes(str: String, utf8: Boolean): js.typedarray.Uint8Array = js.native
}

package typingsSlinky.nodeJose.mod

import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JWA {
  
  @JSImport("node-jose", "JWA.decrypt")
  @js.native
  def decrypt(alg: String, key: String, cdata: String): js.Promise[Buffer] = js.native
  @JSImport("node-jose", "JWA.decrypt")
  @js.native
  def decrypt(alg: String, key: String, cdata: String, props: DecryptEncryptOptions): js.Promise[Buffer] = js.native
  @JSImport("node-jose", "JWA.decrypt")
  @js.native
  def decrypt(alg: String, key: String, cdata: Buffer): js.Promise[Buffer] = js.native
  @JSImport("node-jose", "JWA.decrypt")
  @js.native
  def decrypt(alg: String, key: String, cdata: Buffer, props: DecryptEncryptOptions): js.Promise[Buffer] = js.native
  @JSImport("node-jose", "JWA.decrypt")
  @js.native
  def decrypt(alg: String, key: Buffer, cdata: String): js.Promise[Buffer] = js.native
  @JSImport("node-jose", "JWA.decrypt")
  @js.native
  def decrypt(alg: String, key: Buffer, cdata: String, props: DecryptEncryptOptions): js.Promise[Buffer] = js.native
  @JSImport("node-jose", "JWA.decrypt")
  @js.native
  def decrypt(alg: String, key: Buffer, cdata: Buffer): js.Promise[Buffer] = js.native
  @JSImport("node-jose", "JWA.decrypt")
  @js.native
  def decrypt(alg: String, key: Buffer, cdata: Buffer, props: DecryptEncryptOptions): js.Promise[Buffer] = js.native
  
  @JSImport("node-jose", "JWA.derive")
  @js.native
  def derive(alg: String, key: String): js.Promise[Buffer] = js.native
  @JSImport("node-jose", "JWA.derive")
  @js.native
  def derive(alg: String, key: String, props: DeriveOptions): js.Promise[Buffer] = js.native
  @JSImport("node-jose", "JWA.derive")
  @js.native
  def derive(alg: String, key: Buffer): js.Promise[Buffer] = js.native
  @JSImport("node-jose", "JWA.derive")
  @js.native
  def derive(alg: String, key: Buffer, props: DeriveOptions): js.Promise[Buffer] = js.native
  
  @JSImport("node-jose", "JWA.digest")
  @js.native
  def digest(alg: String, data: String): js.Promise[Buffer] = js.native
  @JSImport("node-jose", "JWA.digest")
  @js.native
  def digest(alg: String, data: String, props: js.Any): js.Promise[Buffer] = js.native
  @JSImport("node-jose", "JWA.digest")
  @js.native
  def digest(alg: String, data: Buffer): js.Promise[Buffer] = js.native
  @JSImport("node-jose", "JWA.digest")
  @js.native
  def digest(alg: String, data: Buffer, props: js.Any): js.Promise[Buffer] = js.native
  
  @JSImport("node-jose", "JWA.encrypt")
  @js.native
  def encrypt(alg: String, key: String, pdata: String): js.Promise[EncryptReturn] = js.native
  @JSImport("node-jose", "JWA.encrypt")
  @js.native
  def encrypt(alg: String, key: String, pdata: String, props: DecryptEncryptOptions): js.Promise[EncryptReturn] = js.native
  @JSImport("node-jose", "JWA.encrypt")
  @js.native
  def encrypt(alg: String, key: String, pdata: Buffer): js.Promise[EncryptReturn] = js.native
  @JSImport("node-jose", "JWA.encrypt")
  @js.native
  def encrypt(alg: String, key: String, pdata: Buffer, props: DecryptEncryptOptions): js.Promise[EncryptReturn] = js.native
  @JSImport("node-jose", "JWA.encrypt")
  @js.native
  def encrypt(alg: String, key: Buffer, pdata: String): js.Promise[EncryptReturn] = js.native
  @JSImport("node-jose", "JWA.encrypt")
  @js.native
  def encrypt(alg: String, key: Buffer, pdata: String, props: DecryptEncryptOptions): js.Promise[EncryptReturn] = js.native
  @JSImport("node-jose", "JWA.encrypt")
  @js.native
  def encrypt(alg: String, key: Buffer, pdata: Buffer): js.Promise[EncryptReturn] = js.native
  @JSImport("node-jose", "JWA.encrypt")
  @js.native
  def encrypt(alg: String, key: Buffer, pdata: Buffer, props: DecryptEncryptOptions): js.Promise[EncryptReturn] = js.native
  
  @JSImport("node-jose", "JWA.sign")
  @js.native
  def sign(alg: String, key: String, pdata: String, props: SignVerifyOptions): js.Promise[SignReturn] = js.native
  @JSImport("node-jose", "JWA.sign")
  @js.native
  def sign(alg: String, key: String, pdata: Buffer, props: SignVerifyOptions): js.Promise[SignReturn] = js.native
  @JSImport("node-jose", "JWA.sign")
  @js.native
  def sign(alg: String, key: Buffer, pdata: String, props: SignVerifyOptions): js.Promise[SignReturn] = js.native
  @JSImport("node-jose", "JWA.sign")
  @js.native
  def sign(alg: String, key: Buffer, pdata: Buffer, props: SignVerifyOptions): js.Promise[SignReturn] = js.native
  
  @JSImport("node-jose", "JWA.verify")
  @js.native
  def verify(alg: String, key: String, pdata: String, mac: String, props: SignVerifyOptions): js.Promise[VerifyReturn] = js.native
  @JSImport("node-jose", "JWA.verify")
  @js.native
  def verify(alg: String, key: String, pdata: String, mac: Buffer, props: SignVerifyOptions): js.Promise[VerifyReturn] = js.native
  @JSImport("node-jose", "JWA.verify")
  @js.native
  def verify(alg: String, key: String, pdata: Buffer, mac: String, props: SignVerifyOptions): js.Promise[VerifyReturn] = js.native
  @JSImport("node-jose", "JWA.verify")
  @js.native
  def verify(alg: String, key: String, pdata: Buffer, mac: Buffer, props: SignVerifyOptions): js.Promise[VerifyReturn] = js.native
  @JSImport("node-jose", "JWA.verify")
  @js.native
  def verify(alg: String, key: Buffer, pdata: String, mac: String, props: SignVerifyOptions): js.Promise[VerifyReturn] = js.native
  @JSImport("node-jose", "JWA.verify")
  @js.native
  def verify(alg: String, key: Buffer, pdata: String, mac: Buffer, props: SignVerifyOptions): js.Promise[VerifyReturn] = js.native
  @JSImport("node-jose", "JWA.verify")
  @js.native
  def verify(alg: String, key: Buffer, pdata: Buffer, mac: String, props: SignVerifyOptions): js.Promise[VerifyReturn] = js.native
  @JSImport("node-jose", "JWA.verify")
  @js.native
  def verify(alg: String, key: Buffer, pdata: Buffer, mac: Buffer, props: SignVerifyOptions): js.Promise[VerifyReturn] = js.native
  
  @js.native
  trait DecryptEncryptOptions extends StObject {
    
    var aad: js.UndefOr[Buffer] = js.native
    
    var adata: js.UndefOr[Buffer] = js.native
    
    // algorithm to use in ec
    var alg: js.UndefOr[String] = js.native
    
    // variation of enc, probably oversight in lib code
    var apu: js.UndefOr[Buffer] = js.native
    
    // agreement party info used in ec
    var apv: js.UndefOr[Buffer] = js.native
    
    // ephemeral pub key used in ec
    var enc: js.UndefOr[String] = js.native
    
    var epk: js.UndefOr[Buffer] = js.native
    
    // Not used in encrypt
    var epu: js.UndefOr[Buffer] = js.native
    
    // encryption party info
    var epv: js.UndefOr[Buffer] = js.native
    
    var iv: js.UndefOr[Buffer] = js.native
    
    // encryption party info
    var kdata: js.UndefOr[Buffer] = js.native
    
    // Not used in encrypt
    var mac: js.UndefOr[Buffer] = js.native
    
    // used in pbes
    var p2c: js.UndefOr[Double] = js.native
    
    // agreement party info used in ec
    var p2s: js.UndefOr[Buffer] = js.native
    
    var tag: js.UndefOr[Buffer] = js.native
  }
  object DecryptEncryptOptions {
    
    @scala.inline
    def apply(): DecryptEncryptOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DecryptEncryptOptions]
    }
    
    @scala.inline
    implicit class DecryptEncryptOptionsMutableBuilder[Self <: DecryptEncryptOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAad(value: Buffer): Self = StObject.set(x, "aad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAadUndefined: Self = StObject.set(x, "aad", js.undefined)
      
      @scala.inline
      def setAdata(value: Buffer): Self = StObject.set(x, "adata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdataUndefined: Self = StObject.set(x, "adata", js.undefined)
      
      @scala.inline
      def setAlg(value: String): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlgUndefined: Self = StObject.set(x, "alg", js.undefined)
      
      @scala.inline
      def setApu(value: Buffer): Self = StObject.set(x, "apu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApuUndefined: Self = StObject.set(x, "apu", js.undefined)
      
      @scala.inline
      def setApv(value: Buffer): Self = StObject.set(x, "apv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApvUndefined: Self = StObject.set(x, "apv", js.undefined)
      
      @scala.inline
      def setEnc(value: String): Self = StObject.set(x, "enc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncUndefined: Self = StObject.set(x, "enc", js.undefined)
      
      @scala.inline
      def setEpk(value: Buffer): Self = StObject.set(x, "epk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEpkUndefined: Self = StObject.set(x, "epk", js.undefined)
      
      @scala.inline
      def setEpu(value: Buffer): Self = StObject.set(x, "epu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEpuUndefined: Self = StObject.set(x, "epu", js.undefined)
      
      @scala.inline
      def setEpv(value: Buffer): Self = StObject.set(x, "epv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEpvUndefined: Self = StObject.set(x, "epv", js.undefined)
      
      @scala.inline
      def setIv(value: Buffer): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIvUndefined: Self = StObject.set(x, "iv", js.undefined)
      
      @scala.inline
      def setKdata(value: Buffer): Self = StObject.set(x, "kdata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKdataUndefined: Self = StObject.set(x, "kdata", js.undefined)
      
      @scala.inline
      def setMac(value: Buffer): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMacUndefined: Self = StObject.set(x, "mac", js.undefined)
      
      @scala.inline
      def setP2c(value: Double): Self = StObject.set(x, "p2c", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setP2cUndefined: Self = StObject.set(x, "p2c", js.undefined)
      
      @scala.inline
      def setP2s(value: Buffer): Self = StObject.set(x, "p2s", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setP2sUndefined: Self = StObject.set(x, "p2s", js.undefined)
      
      @scala.inline
      def setTag(value: Buffer): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
  
  @js.native
  trait DeriveOptions extends StObject {
    
    // public key used in ecdh
    var hash: js.UndefOr[Buffer] = js.native
    
    // salt value used in hkdf
    var info: js.UndefOr[Buffer] = js.native
    
    var length: js.UndefOr[Double] = js.native
    
    // key length
    var otherInfo: js.UndefOr[Buffer] = js.native
    
    // info used in concatkdf
    var public: js.UndefOr[Buffer] = js.native
    
    // hash used in ecdh
    var salt: js.UndefOr[Buffer] = js.native
  }
  object DeriveOptions {
    
    @scala.inline
    def apply(): DeriveOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeriveOptions]
    }
    
    @scala.inline
    implicit class DeriveOptionsMutableBuilder[Self <: DeriveOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHash(value: Buffer): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      @scala.inline
      def setInfo(value: Buffer): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      @scala.inline
      def setOtherInfo(value: Buffer): Self = StObject.set(x, "otherInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOtherInfoUndefined: Self = StObject.set(x, "otherInfo", js.undefined)
      
      @scala.inline
      def setPublic(value: Buffer): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
      
      @scala.inline
      def setSalt(value: Buffer): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaltUndefined: Self = StObject.set(x, "salt", js.undefined)
    }
  }
  
  @js.native
  trait EncryptReturn extends StObject {
    
    var data: Buffer = js.native
    
    // The cipher text
    var tag: js.UndefOr[Buffer] = js.native
  }
  object EncryptReturn {
    
    @scala.inline
    def apply(data: Buffer): EncryptReturn = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[EncryptReturn]
    }
    
    @scala.inline
    implicit class EncryptReturnMutableBuilder[Self <: EncryptReturn] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTag(value: Buffer): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
  
  @js.native
  trait SignReturn extends StObject {
    
    var data: Buffer = js.native
    
    // the data passed into the sign function
    var mac: Buffer = js.native
  }
  object SignReturn {
    
    @scala.inline
    def apply(data: Buffer, mac: Buffer): SignReturn = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignReturn]
    }
    
    @scala.inline
    implicit class SignReturnMutableBuilder[Self <: SignReturn] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMac(value: Buffer): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SignVerifyOptions extends StObject {
    
    var loose: js.UndefOr[Boolean] = js.native
  }
  object SignVerifyOptions {
    
    @scala.inline
    def apply(): SignVerifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SignVerifyOptions]
    }
    
    @scala.inline
    implicit class SignVerifyOptionsMutableBuilder[Self <: SignVerifyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLoose(value: Boolean): Self = StObject.set(x, "loose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLooseUndefined: Self = StObject.set(x, "loose", js.undefined)
    }
  }
  
  @js.native
  trait VerifyReturn extends StObject {
    
    var data: Buffer = js.native
    
    // the data passed into the verify function
    var mac: Buffer = js.native
    
    // the signature for `data`
    var valid: Boolean = js.native
  }
  object VerifyReturn {
    
    @scala.inline
    def apply(data: Buffer, mac: Buffer, valid: Boolean): VerifyReturn = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerifyReturn]
    }
    
    @scala.inline
    implicit class VerifyReturnMutableBuilder[Self <: VerifyReturn] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMac(value: Buffer): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    }
  }
}

package typingsSlinky.kmsJson

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("kms-json", JSImport.Namespace)
  @js.native
  class ^ protected () extends KmsJson {
    def this(options: KmsJsonOptions) = this()
  }
  
  @js.native
  trait KmsJson extends StObject {
    
    def decrypt(cipherText: String): js.Object = js.native
    
    def encrypt(inputJson: js.Object): String = js.native
  }
  object KmsJson {
    
    @scala.inline
    def apply(decrypt: String => js.Object, encrypt: js.Object => String): KmsJson = {
      val __obj = js.Dynamic.literal(decrypt = js.Any.fromFunction1(decrypt), encrypt = js.Any.fromFunction1(encrypt))
      __obj.asInstanceOf[KmsJson]
    }
    
    @scala.inline
    implicit class KmsJsonMutableBuilder[Self <: KmsJson] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecrypt(value: String => js.Object): Self = StObject.set(x, "decrypt", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEncrypt(value: js.Object => String): Self = StObject.set(x, "encrypt", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait KmsJsonOptions extends StObject {
    
    var awsKmsSettings: js.UndefOr[js.Object] = js.native
    
    var encoding: js.UndefOr[String] = js.native
    
    var keyId: String = js.native
  }
  object KmsJsonOptions {
    
    @scala.inline
    def apply(keyId: String): KmsJsonOptions = {
      val __obj = js.Dynamic.literal(keyId = keyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[KmsJsonOptions]
    }
    
    @scala.inline
    implicit class KmsJsonOptionsMutableBuilder[Self <: KmsJsonOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAwsKmsSettings(value: js.Object): Self = StObject.set(x, "awsKmsSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAwsKmsSettingsUndefined: Self = StObject.set(x, "awsKmsSettings", js.undefined)
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setKeyId(value: String): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
    }
  }
}

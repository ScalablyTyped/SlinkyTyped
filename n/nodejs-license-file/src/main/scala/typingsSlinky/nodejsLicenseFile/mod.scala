package typingsSlinky.nodejsLicenseFile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nodejs-license-file", "generate")
  @js.native
  def generate(options: GenerateOptions): String = js.native
  
  @JSImport("nodejs-license-file", "parse")
  @js.native
  def parse(options: ParseOptions): License = js.native
  
  @js.native
  trait GenerateOptions extends StObject {
    
    var data: js.Any = js.native
    
    var privateKey: js.UndefOr[String] = js.native
    
    var privateKeyPath: js.UndefOr[String] = js.native
    
    var template: String = js.native
  }
  object GenerateOptions {
    
    @scala.inline
    def apply(data: js.Any, template: String): GenerateOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenerateOptions]
    }
    
    @scala.inline
    implicit class GenerateOptionsMutableBuilder[Self <: GenerateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateKey(value: String): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateKeyPath(value: String): Self = StObject.set(x, "privateKeyPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateKeyPathUndefined: Self = StObject.set(x, "privateKeyPath", js.undefined)
      
      @scala.inline
      def setPrivateKeyUndefined: Self = StObject.set(x, "privateKey", js.undefined)
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait License extends StObject {
    
    var data: js.Any = js.native
    
    var serial: String = js.native
    
    var valid: Boolean = js.native
  }
  object License {
    
    @scala.inline
    def apply(data: js.Any, serial: String, valid: Boolean): License = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[License]
    }
    
    @scala.inline
    implicit class LicenseMutableBuilder[Self <: License] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerial(value: String): Self = StObject.set(x, "serial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ParseOptions extends StObject {
    
    var licenseFile: js.UndefOr[String] = js.native
    
    var licenseFilePath: js.UndefOr[String] = js.native
    
    var publicKey: js.UndefOr[String] = js.native
    
    var publicKeyPath: js.UndefOr[String] = js.native
    
    var template: String = js.native
  }
  object ParseOptions {
    
    @scala.inline
    def apply(template: String): ParseOptions = {
      val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseOptions]
    }
    
    @scala.inline
    implicit class ParseOptionsMutableBuilder[Self <: ParseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLicenseFile(value: String): Self = StObject.set(x, "licenseFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLicenseFilePath(value: String): Self = StObject.set(x, "licenseFilePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLicenseFilePathUndefined: Self = StObject.set(x, "licenseFilePath", js.undefined)
      
      @scala.inline
      def setLicenseFileUndefined: Self = StObject.set(x, "licenseFile", js.undefined)
      
      @scala.inline
      def setPublicKey(value: String): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicKeyPath(value: String): Self = StObject.set(x, "publicKeyPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicKeyPathUndefined: Self = StObject.set(x, "publicKeyPath", js.undefined)
      
      @scala.inline
      def setPublicKeyUndefined: Self = StObject.set(x, "publicKey", js.undefined)
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    }
  }
}

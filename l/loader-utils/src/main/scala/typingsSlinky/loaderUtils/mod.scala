package typingsSlinky.loaderUtils

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.loaderUtils.loaderUtilsBooleans.`false`
import typingsSlinky.loaderUtils.loaderUtilsBooleans.`true`
import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("loader-utils", "getCurrentRequest")
  @js.native
  def getCurrentRequest(
    loaderContext: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify loader.LoaderContext */ js.Any
  ): String = js.native
  
  @JSImport("loader-utils", "getHashDigest")
  @js.native
  def getHashDigest(buffer: Buffer, hashType: HashType, digestType: DigestType, maxLength: Double): String = js.native
  
  @JSImport("loader-utils", "getOptions")
  @js.native
  def getOptions(
    loaderContext: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify loader.LoaderContext */ js.Any
  ): js.Object = js.native
  
  @JSImport("loader-utils", "getRemainingRequest")
  @js.native
  def getRemainingRequest(
    loaderContext: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify loader.LoaderContext */ js.Any
  ): String = js.native
  
  @JSImport("loader-utils", "interpolateName")
  @js.native
  def interpolateName(
    loaderContext: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify loader.LoaderContext */ js.Any,
    name: String
  ): String = js.native
  @JSImport("loader-utils", "interpolateName")
  @js.native
  def interpolateName(
    loaderContext: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify loader.LoaderContext */ js.Any,
    name: String,
    options: js.Any
  ): String = js.native
  
  @JSImport("loader-utils", "isUrlRequest")
  @js.native
  def isUrlRequest(url: String): Boolean = js.native
  @JSImport("loader-utils", "isUrlRequest")
  @js.native
  def isUrlRequest(url: String, root: String): Boolean = js.native
  
  @JSImport("loader-utils", "parseQuery")
  @js.native
  def parseQuery(optionString: String): OptionObject = js.native
  
  @JSImport("loader-utils", "parseString")
  @js.native
  def parseString(str: String): String = js.native
  
  @JSImport("loader-utils", "stringifyRequest")
  @js.native
  def stringifyRequest(
    loaderContext: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify loader.LoaderContext */ js.Any,
    resource: String
  ): String = js.native
  
  @JSImport("loader-utils", "urlToRequest")
  @js.native
  def urlToRequest(url: String): String = js.native
  @JSImport("loader-utils", "urlToRequest")
  @js.native
  def urlToRequest(url: String, root: String): String = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.loaderUtils.loaderUtilsStrings.hex
    - typingsSlinky.loaderUtils.loaderUtilsStrings.base26
    - typingsSlinky.loaderUtils.loaderUtilsStrings.base32
    - typingsSlinky.loaderUtils.loaderUtilsStrings.base36
    - typingsSlinky.loaderUtils.loaderUtilsStrings.base49
    - typingsSlinky.loaderUtils.loaderUtilsStrings.base52
    - typingsSlinky.loaderUtils.loaderUtilsStrings.base58
    - typingsSlinky.loaderUtils.loaderUtilsStrings.base62
    - typingsSlinky.loaderUtils.loaderUtilsStrings.base64
  */
  trait DigestType extends StObject
  object DigestType {
    
    @scala.inline
    def base26: typingsSlinky.loaderUtils.loaderUtilsStrings.base26 = "base26".asInstanceOf[typingsSlinky.loaderUtils.loaderUtilsStrings.base26]
    
    @scala.inline
    def base32: typingsSlinky.loaderUtils.loaderUtilsStrings.base32 = "base32".asInstanceOf[typingsSlinky.loaderUtils.loaderUtilsStrings.base32]
    
    @scala.inline
    def base36: typingsSlinky.loaderUtils.loaderUtilsStrings.base36 = "base36".asInstanceOf[typingsSlinky.loaderUtils.loaderUtilsStrings.base36]
    
    @scala.inline
    def base49: typingsSlinky.loaderUtils.loaderUtilsStrings.base49 = "base49".asInstanceOf[typingsSlinky.loaderUtils.loaderUtilsStrings.base49]
    
    @scala.inline
    def base52: typingsSlinky.loaderUtils.loaderUtilsStrings.base52 = "base52".asInstanceOf[typingsSlinky.loaderUtils.loaderUtilsStrings.base52]
    
    @scala.inline
    def base58: typingsSlinky.loaderUtils.loaderUtilsStrings.base58 = "base58".asInstanceOf[typingsSlinky.loaderUtils.loaderUtilsStrings.base58]
    
    @scala.inline
    def base62: typingsSlinky.loaderUtils.loaderUtilsStrings.base62 = "base62".asInstanceOf[typingsSlinky.loaderUtils.loaderUtilsStrings.base62]
    
    @scala.inline
    def base64: typingsSlinky.loaderUtils.loaderUtilsStrings.base64 = "base64".asInstanceOf[typingsSlinky.loaderUtils.loaderUtilsStrings.base64]
    
    @scala.inline
    def hex: typingsSlinky.loaderUtils.loaderUtilsStrings.hex = "hex".asInstanceOf[typingsSlinky.loaderUtils.loaderUtilsStrings.hex]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.loaderUtils.loaderUtilsStrings.sha1
    - typingsSlinky.loaderUtils.loaderUtilsStrings.md4
    - typingsSlinky.loaderUtils.loaderUtilsStrings.md5
    - typingsSlinky.loaderUtils.loaderUtilsStrings.sha256
    - typingsSlinky.loaderUtils.loaderUtilsStrings.sha512
  */
  trait HashType extends StObject
  object HashType {
    
    @scala.inline
    def md4: typingsSlinky.loaderUtils.loaderUtilsStrings.md4 = "md4".asInstanceOf[typingsSlinky.loaderUtils.loaderUtilsStrings.md4]
    
    @scala.inline
    def md5: typingsSlinky.loaderUtils.loaderUtilsStrings.md5 = "md5".asInstanceOf[typingsSlinky.loaderUtils.loaderUtilsStrings.md5]
    
    @scala.inline
    def sha1: typingsSlinky.loaderUtils.loaderUtilsStrings.sha1 = "sha1".asInstanceOf[typingsSlinky.loaderUtils.loaderUtilsStrings.sha1]
    
    @scala.inline
    def sha256: typingsSlinky.loaderUtils.loaderUtilsStrings.sha256 = "sha256".asInstanceOf[typingsSlinky.loaderUtils.loaderUtilsStrings.sha256]
    
    @scala.inline
    def sha512: typingsSlinky.loaderUtils.loaderUtilsStrings.sha512 = "sha512".asInstanceOf[typingsSlinky.loaderUtils.loaderUtilsStrings.sha512]
  }
  
  @js.native
  trait InterpolateOption extends StObject {
    
    var content: js.UndefOr[String | Buffer] = js.native
    
    var context: js.UndefOr[String] = js.native
    
    var regExp: js.UndefOr[String | js.RegExp] = js.native
  }
  object InterpolateOption {
    
    @scala.inline
    def apply(): InterpolateOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InterpolateOption]
    }
    
    @scala.inline
    implicit class InterpolateOptionMutableBuilder[Self <: InterpolateOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String | Buffer): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setRegExp(value: String | js.RegExp): Self = StObject.set(x, "regExp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegExpRegExp(value: js.RegExp): Self = StObject.set(x, "regExp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegExpUndefined: Self = StObject.set(x, "regExp", js.undefined)
    }
  }
  
  type OptionObject = StringDictionary[Null | `false` | `true` | String]
  
  type Readonly[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ P in keyof T ]: T[P]}
    */ typingsSlinky.loaderUtils.loaderUtilsStrings.Readonly with TopLevel[T]
}

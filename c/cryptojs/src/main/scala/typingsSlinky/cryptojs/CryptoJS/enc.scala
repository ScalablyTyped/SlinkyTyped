package typingsSlinky.cryptojs.CryptoJS

import typingsSlinky.cryptojs.CryptoJS.lib.WordArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enc {
  
  @js.native
  trait EncStatic extends StObject {
    
    var Base64: ICoder = js.native
    
    var Hex: ICoder = js.native
    
    var Latin1: ICoder = js.native
    
    var Utf16: ICoder = js.native
    
    var Utf16BE: ICoder = js.native
    
    var Utf16LE: ICoder = js.native
    
    var Utf8: ICoder = js.native
  }
  object EncStatic {
    
    @scala.inline
    def apply(
      Base64: ICoder,
      Hex: ICoder,
      Latin1: ICoder,
      Utf16: ICoder,
      Utf16BE: ICoder,
      Utf16LE: ICoder,
      Utf8: ICoder
    ): EncStatic = {
      val __obj = js.Dynamic.literal(Base64 = Base64.asInstanceOf[js.Any], Hex = Hex.asInstanceOf[js.Any], Latin1 = Latin1.asInstanceOf[js.Any], Utf16 = Utf16.asInstanceOf[js.Any], Utf16BE = Utf16BE.asInstanceOf[js.Any], Utf16LE = Utf16LE.asInstanceOf[js.Any], Utf8 = Utf8.asInstanceOf[js.Any])
      __obj.asInstanceOf[EncStatic]
    }
    
    @scala.inline
    implicit class EncStaticMutableBuilder[Self <: EncStatic] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase64(value: ICoder): Self = StObject.set(x, "Base64", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHex(value: ICoder): Self = StObject.set(x, "Hex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatin1(value: ICoder): Self = StObject.set(x, "Latin1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUtf16(value: ICoder): Self = StObject.set(x, "Utf16", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUtf16BE(value: ICoder): Self = StObject.set(x, "Utf16BE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUtf16LE(value: ICoder): Self = StObject.set(x, "Utf16LE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUtf8(value: ICoder): Self = StObject.set(x, "Utf8", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ICoder
    extends IEncoder
       with IDecoder
  object ICoder {
    
    @scala.inline
    def apply(parse: String => WordArray, stringify: WordArray => String): ICoder = {
      val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), stringify = js.Any.fromFunction1(stringify))
      __obj.asInstanceOf[ICoder]
    }
  }
  
  @js.native
  trait IDecoder extends StObject {
    
    def parse(s: String): WordArray = js.native
  }
  object IDecoder {
    
    @scala.inline
    def apply(parse: String => WordArray): IDecoder = {
      val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse))
      __obj.asInstanceOf[IDecoder]
    }
    
    @scala.inline
    implicit class IDecoderMutableBuilder[Self <: IDecoder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParse(value: String => WordArray): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait IEncoder extends StObject {
    
    def stringify(wordArray: WordArray): String = js.native
  }
  object IEncoder {
    
    @scala.inline
    def apply(stringify: WordArray => String): IEncoder = {
      val __obj = js.Dynamic.literal(stringify = js.Any.fromFunction1(stringify))
      __obj.asInstanceOf[IEncoder]
    }
    
    @scala.inline
    implicit class IEncoderMutableBuilder[Self <: IEncoder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStringify(value: WordArray => String): Self = StObject.set(x, "stringify", js.Any.fromFunction1(value))
    }
  }
}

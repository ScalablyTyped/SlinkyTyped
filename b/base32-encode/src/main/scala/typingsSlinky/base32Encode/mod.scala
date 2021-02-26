package typingsSlinky.base32Encode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("base32-encode", JSImport.Namespace)
  @js.native
  def apply(buffer: js.typedarray.ArrayBuffer, variant: Variant): String = js.native
  @JSImport("base32-encode", JSImport.Namespace)
  @js.native
  def apply(buffer: js.typedarray.ArrayBuffer, variant: Variant, options: Options): String = js.native
  
  @js.native
  trait Options extends StObject {
    
    var padding: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPadding(value: Boolean): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.base32Encode.base32EncodeStrings.RFC3548
    - typingsSlinky.base32Encode.base32EncodeStrings.RFC4648
    - typingsSlinky.base32Encode.base32EncodeStrings.`RFC4648-HEX`
    - typingsSlinky.base32Encode.base32EncodeStrings.Crockford
  */
  trait Variant extends StObject
  object Variant {
    
    @scala.inline
    def Crockford: typingsSlinky.base32Encode.base32EncodeStrings.Crockford = "Crockford".asInstanceOf[typingsSlinky.base32Encode.base32EncodeStrings.Crockford]
    
    @scala.inline
    def RFC3548: typingsSlinky.base32Encode.base32EncodeStrings.RFC3548 = "RFC3548".asInstanceOf[typingsSlinky.base32Encode.base32EncodeStrings.RFC3548]
    
    @scala.inline
    def RFC4648: typingsSlinky.base32Encode.base32EncodeStrings.RFC4648 = "RFC4648".asInstanceOf[typingsSlinky.base32Encode.base32EncodeStrings.RFC4648]
    
    @scala.inline
    def `RFC4648-HEX`: typingsSlinky.base32Encode.base32EncodeStrings.`RFC4648-HEX` = "RFC4648-HEX".asInstanceOf[typingsSlinky.base32Encode.base32EncodeStrings.`RFC4648-HEX`]
  }
}

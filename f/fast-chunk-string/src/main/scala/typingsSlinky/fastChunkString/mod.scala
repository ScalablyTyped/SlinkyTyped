package typingsSlinky.fastChunkString

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fast-chunk-string", JSImport.Namespace)
  @js.native
  def apply(str: String, options: Options): js.Array[String] = js.native
  
  @js.native
  trait Options extends StObject {
    
    var size: Double = js.native
    
    var unicodeAware: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(size: Double): Options = {
      val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnicodeAware(value: Boolean): Self = StObject.set(x, "unicodeAware", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnicodeAwareUndefined: Self = StObject.set(x, "unicodeAware", js.undefined)
    }
  }
}

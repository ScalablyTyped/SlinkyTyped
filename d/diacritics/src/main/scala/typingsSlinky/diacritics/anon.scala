package typingsSlinky.diacritics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Base extends StObject {
    
    var base: String = js.native
    
    var chars: String = js.native
  }
  object Base {
    
    @scala.inline
    def apply(base: String, chars: String): Base = {
      val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], chars = chars.asInstanceOf[js.Any])
      __obj.asInstanceOf[Base]
    }
    
    @scala.inline
    implicit class BaseMutableBuilder[Self <: Base] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChars(value: String): Self = StObject.set(x, "chars", value.asInstanceOf[js.Any])
    }
  }
}

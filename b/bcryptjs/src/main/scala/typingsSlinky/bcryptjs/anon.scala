package typingsSlinky.bcryptjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Readonly<std.ArrayLike<number>> */
  @js.native
  trait ReadonlyArrayLikenumber extends StObject {
    
    val length: Double = js.native
  }
  object ReadonlyArrayLikenumber {
    
    @scala.inline
    def apply(length: Double): ReadonlyArrayLikenumber = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyArrayLikenumber]
    }
    
    @scala.inline
    implicit class ReadonlyArrayLikenumberMutableBuilder[Self <: ReadonlyArrayLikenumber] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
}

package typingsSlinky.pullStream

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Last extends StObject {
    
    var last: Boolean = js.native
  }
  object Last {
    
    @scala.inline
    def apply(last: Boolean): Last = {
      val __obj = js.Dynamic.literal(last = last.asInstanceOf[js.Any])
      __obj.asInstanceOf[Last]
    }
    
    @scala.inline
    implicit class LastMutableBuilder[Self <: Last] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLast(value: Boolean): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
    }
  }
}

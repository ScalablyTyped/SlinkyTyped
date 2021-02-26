package typingsSlinky.digibyte

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait PrevHash extends StObject {
    
    var prevHash: String = js.native
    
    var time: Double = js.native
  }
  object PrevHash {
    
    @scala.inline
    def apply(prevHash: String, time: Double): PrevHash = {
      val __obj = js.Dynamic.literal(prevHash = prevHash.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrevHash]
    }
    
    @scala.inline
    implicit class PrevHashMutableBuilder[Self <: PrevHash] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrevHash(value: String): Self = StObject.set(x, "prevHash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Reverse extends StObject {
    
    def reverse(a: js.Any): js.Any = js.native
  }
  object Reverse {
    
    @scala.inline
    def apply(reverse: js.Any => js.Any): Reverse = {
      val __obj = js.Dynamic.literal(reverse = js.Any.fromFunction1(reverse))
      __obj.asInstanceOf[Reverse]
    }
    
    @scala.inline
    implicit class ReverseMutableBuilder[Self <: Reverse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReverse(value: js.Any => js.Any): Self = StObject.set(x, "reverse", js.Any.fromFunction1(value))
    }
  }
}

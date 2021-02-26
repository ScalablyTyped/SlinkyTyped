package typingsSlinky.findInFiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Count extends StObject {
    
    var count: Double = js.native
    
    var line: String | Null = js.native
    
    var matches: js.Array[String] = js.native
  }
  object Count {
    
    @scala.inline
    def apply(count: Double, matches: js.Array[String]): Count = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any])
      __obj.asInstanceOf[Count]
    }
    
    @scala.inline
    implicit class CountMutableBuilder[Self <: Count] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: String): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineNull: Self = StObject.set(x, "line", null)
      
      @scala.inline
      def setMatches(value: js.Array[String]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchesVarargs(value: String*): Self = StObject.set(x, "matches", js.Array(value :_*))
    }
  }
}

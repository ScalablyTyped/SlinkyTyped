package typingsSlinky.jsonRulesEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Fact extends StObject {
    
    var fact: String = js.native
  }
  object Fact {
    
    @scala.inline
    def apply(fact: String): Fact = {
      val __obj = js.Dynamic.literal(fact = fact.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fact]
    }
    
    @scala.inline
    implicit class FactMutableBuilder[Self <: Fact] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFact(value: String): Self = StObject.set(x, "fact", value.asInstanceOf[js.Any])
    }
  }
}

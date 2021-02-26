package typingsSlinky.electronSpellchecker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Word extends StObject {
    
    var word: String = js.native
  }
  object Word {
    
    @scala.inline
    def apply(word: String): Word = {
      val __obj = js.Dynamic.literal(word = word.asInstanceOf[js.Any])
      __obj.asInstanceOf[Word]
    }
    
    @scala.inline
    implicit class WordMutableBuilder[Self <: Word] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWord(value: String): Self = StObject.set(x, "word", value.asInstanceOf[js.Any])
    }
  }
}

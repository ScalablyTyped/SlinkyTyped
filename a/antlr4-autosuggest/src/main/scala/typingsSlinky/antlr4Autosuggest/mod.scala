package typingsSlinky.antlr4Autosuggest

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.antlr4.mod.Lexer
import typingsSlinky.antlr4.mod.Parser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("antlr4-autosuggest", "autosuggester")
  @js.native
  def autosuggester(lexerCtr: Constructor[Lexer], parserCtr: Constructor[Parser]): AutoSuggester_ = js.native
  @JSImport("antlr4-autosuggest", "autosuggester")
  @js.native
  def autosuggester(lexerCtr: Constructor[Lexer], parserCtr: Constructor[Parser], casePref: CasePreference): AutoSuggester_ = js.native
  
  @js.native
  trait AutoSuggester_ extends StObject {
    
    def autosuggest(inputText: String): js.Array[String] = js.native
  }
  object AutoSuggester_ {
    
    @scala.inline
    def apply(autosuggest: String => js.Array[String]): AutoSuggester_ = {
      val __obj = js.Dynamic.literal(autosuggest = js.Any.fromFunction1(autosuggest))
      __obj.asInstanceOf[AutoSuggester_]
    }
    
    @scala.inline
    implicit class AutoSuggester_MutableBuilder[Self <: AutoSuggester_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutosuggest(value: String => js.Array[String]): Self = StObject.set(x, "autosuggest", js.Any.fromFunction1(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.antlr4Autosuggest.antlr4AutosuggestStrings.LOWER
    - typingsSlinky.antlr4Autosuggest.antlr4AutosuggestStrings.UPPER
    - typingsSlinky.antlr4Autosuggest.antlr4AutosuggestStrings.BOTH
  */
  trait CasePreference extends StObject
  object CasePreference {
    
    @scala.inline
    def BOTH: typingsSlinky.antlr4Autosuggest.antlr4AutosuggestStrings.BOTH = "BOTH".asInstanceOf[typingsSlinky.antlr4Autosuggest.antlr4AutosuggestStrings.BOTH]
    
    @scala.inline
    def LOWER: typingsSlinky.antlr4Autosuggest.antlr4AutosuggestStrings.LOWER = "LOWER".asInstanceOf[typingsSlinky.antlr4Autosuggest.antlr4AutosuggestStrings.LOWER]
    
    @scala.inline
    def UPPER: typingsSlinky.antlr4Autosuggest.antlr4AutosuggestStrings.UPPER = "UPPER".asInstanceOf[typingsSlinky.antlr4Autosuggest.antlr4AutosuggestStrings.UPPER]
  }
  
  @js.native
  trait Constructor[T]
    extends Instantiable1[/* args (repeated) */ js.Any, T]
}

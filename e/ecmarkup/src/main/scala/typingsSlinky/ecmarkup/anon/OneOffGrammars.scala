package typingsSlinky.ecmarkup.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OneOffGrammars extends StObject {
  
  var grammar: typingsSlinky.grammarkdown.mod.Grammar = js.native
  
  var oneOffGrammars: js.Array[GrammarEle] = js.native
}
object OneOffGrammars {
  
  @scala.inline
  def apply(grammar: typingsSlinky.grammarkdown.mod.Grammar, oneOffGrammars: js.Array[GrammarEle]): OneOffGrammars = {
    val __obj = js.Dynamic.literal(grammar = grammar.asInstanceOf[js.Any], oneOffGrammars = oneOffGrammars.asInstanceOf[js.Any])
    __obj.asInstanceOf[OneOffGrammars]
  }
  
  @scala.inline
  implicit class OneOffGrammarsMutableBuilder[Self <: OneOffGrammars] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGrammar(value: typingsSlinky.grammarkdown.mod.Grammar): Self = StObject.set(x, "grammar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOneOffGrammars(value: js.Array[GrammarEle]): Self = StObject.set(x, "oneOffGrammars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOneOffGrammarsVarargs(value: GrammarEle*): Self = StObject.set(x, "oneOffGrammars", js.Array(value :_*))
  }
}

package typingsSlinky.ecmarkup.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GrammarEle extends StObject {
  
  var grammar: typingsSlinky.grammarkdown.mod.Grammar = js.native
  
  var grammarEle: org.scalajs.dom.raw.Element = js.native
}
object GrammarEle {
  
  @scala.inline
  def apply(grammar: typingsSlinky.grammarkdown.mod.Grammar, grammarEle: org.scalajs.dom.raw.Element): GrammarEle = {
    val __obj = js.Dynamic.literal(grammar = grammar.asInstanceOf[js.Any], grammarEle = grammarEle.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrammarEle]
  }
  
  @scala.inline
  implicit class GrammarEleMutableBuilder[Self <: GrammarEle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGrammar(value: typingsSlinky.grammarkdown.mod.Grammar): Self = StObject.set(x, "grammar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrammarEle(value: org.scalajs.dom.raw.Element): Self = StObject.set(x, "grammarEle", value.asInstanceOf[js.Any])
  }
}

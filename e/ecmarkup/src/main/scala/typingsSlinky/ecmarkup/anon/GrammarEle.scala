package typingsSlinky.ecmarkup.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GrammarEle extends js.Object {
  
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
  implicit class GrammarEleOps[Self <: GrammarEle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGrammar(value: typingsSlinky.grammarkdown.mod.Grammar): Self = this.set("grammar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrammarEle(value: org.scalajs.dom.raw.Element): Self = this.set("grammarEle", value.asInstanceOf[js.Any])
  }
}

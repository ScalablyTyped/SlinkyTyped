package typingsSlinky.ecmarkup.anon

import org.scalajs.dom.raw.HTMLUListElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Grammar extends StObject {
  
  var grammar: org.scalajs.dom.raw.Element = js.native
  
  var lists: js.Array[HTMLUListElement] = js.native
}
object Grammar {
  
  @scala.inline
  def apply(grammar: org.scalajs.dom.raw.Element, lists: js.Array[HTMLUListElement]): Grammar = {
    val __obj = js.Dynamic.literal(grammar = grammar.asInstanceOf[js.Any], lists = lists.asInstanceOf[js.Any])
    __obj.asInstanceOf[Grammar]
  }
  
  @scala.inline
  implicit class GrammarMutableBuilder[Self <: Grammar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGrammar(value: org.scalajs.dom.raw.Element): Self = StObject.set(x, "grammar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLists(value: js.Array[HTMLUListElement]): Self = StObject.set(x, "lists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListsVarargs(value: HTMLUListElement*): Self = StObject.set(x, "lists", js.Array(value :_*))
  }
}

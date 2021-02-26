package typingsSlinky.regexpp.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CharacterClass
  extends BranchNode
     with NodeBase
     with QuantifiableElement {
  
  var elements: js.Array[CharacterClassElement] = js.native
  
  var negate: Boolean = js.native
  
  @JSName("parent")
  var parent_CharacterClass: Alternative | Quantifier = js.native
  
  @JSName("type")
  var type_CharacterClass: typingsSlinky.regexpp.regexppStrings.CharacterClass = js.native
}
object CharacterClass {
  
  @scala.inline
  def apply(
    elements: js.Array[CharacterClassElement],
    end: Double,
    negate: Boolean,
    parent: Alternative | Quantifier,
    raw: String,
    start: Double,
    `type`: typingsSlinky.regexpp.regexppStrings.CharacterClass
  ): CharacterClass = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], negate = negate.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CharacterClass]
  }
  
  @scala.inline
  implicit class CharacterClassMutableBuilder[Self <: CharacterClass] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElements(value: js.Array[CharacterClassElement]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementsVarargs(value: CharacterClassElement*): Self = StObject.set(x, "elements", js.Array(value :_*))
    
    @scala.inline
    def setNegate(value: Boolean): Self = StObject.set(x, "negate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: Alternative | Quantifier): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typingsSlinky.regexpp.regexppStrings.CharacterClass): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

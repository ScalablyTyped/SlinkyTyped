package typingsSlinky.regexpp.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Group
  extends BranchNode
     with NodeBase
     with QuantifiableElement {
  
  var alternatives: js.Array[Alternative] = js.native
  
  @JSName("parent")
  var parent_Group: Alternative | Quantifier = js.native
  
  @JSName("type")
  var type_Group: typingsSlinky.regexpp.regexppStrings.Group = js.native
}
object Group {
  
  @scala.inline
  def apply(
    alternatives: js.Array[Alternative],
    end: Double,
    parent: Alternative | Quantifier,
    raw: String,
    start: Double,
    `type`: typingsSlinky.regexpp.regexppStrings.Group
  ): Group = {
    val __obj = js.Dynamic.literal(alternatives = alternatives.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Group]
  }
  
  @scala.inline
  implicit class GroupMutableBuilder[Self <: Group] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlternatives(value: js.Array[Alternative]): Self = StObject.set(x, "alternatives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternativesVarargs(value: Alternative*): Self = StObject.set(x, "alternatives", js.Array(value :_*))
    
    @scala.inline
    def setParent(value: Alternative | Quantifier): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typingsSlinky.regexpp.regexppStrings.Group): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

package typingsSlinky.cssTree.mod

import typingsSlinky.cssTree.cssTreeStrings.Group
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DSNodeGroup
  extends DSNode
     with DSNodeMultiplied {
  
  var combinator: DSNodeCombinator = js.native
  
  var disallowEmpty: Boolean = js.native
  
  var explicit: Boolean = js.native
  
  var terms: js.Array[DSNode] = js.native
  
  var `type`: Group = js.native
}
object DSNodeGroup {
  
  @scala.inline
  def apply(
    combinator: DSNodeCombinator,
    disallowEmpty: Boolean,
    explicit: Boolean,
    terms: js.Array[DSNode],
    `type`: Group
  ): DSNodeGroup = {
    val __obj = js.Dynamic.literal(combinator = combinator.asInstanceOf[js.Any], disallowEmpty = disallowEmpty.asInstanceOf[js.Any], explicit = explicit.asInstanceOf[js.Any], terms = terms.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DSNodeGroup]
  }
  
  @scala.inline
  implicit class DSNodeGroupMutableBuilder[Self <: DSNodeGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCombinator(value: DSNodeCombinator): Self = StObject.set(x, "combinator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisallowEmpty(value: Boolean): Self = StObject.set(x, "disallowEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplicit(value: Boolean): Self = StObject.set(x, "explicit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerms(value: js.Array[DSNode]): Self = StObject.set(x, "terms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTermsVarargs(value: DSNode*): Self = StObject.set(x, "terms", js.Array(value :_*))
    
    @scala.inline
    def setType(value: Group): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

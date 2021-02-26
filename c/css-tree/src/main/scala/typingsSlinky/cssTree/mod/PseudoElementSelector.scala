package typingsSlinky.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PseudoElementSelector
  extends CssNodeCommon
     with CssNode {
  
  var children: List[CssNode] | Null = js.native
  
  var name: String = js.native
  
  @JSName("type")
  var type_PseudoElementSelector: typingsSlinky.cssTree.cssTreeStrings.PseudoElementSelector = js.native
}
object PseudoElementSelector {
  
  @scala.inline
  def apply(name: String, `type`: typingsSlinky.cssTree.cssTreeStrings.PseudoElementSelector): PseudoElementSelector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PseudoElementSelector]
  }
  
  @scala.inline
  implicit class PseudoElementSelectorMutableBuilder[Self <: PseudoElementSelector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: List[CssNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenNull: Self = StObject.set(x, "children", null)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typingsSlinky.cssTree.cssTreeStrings.PseudoElementSelector): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

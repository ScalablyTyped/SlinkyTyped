package typingsSlinky.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PseudoElementSelectorPlain
  extends CssNodeCommon
     with CssNodePlain {
  
  var children: js.Array[CssNodePlain] | Null = js.native
  
  var name: String = js.native
  
  @JSName("type")
  var type_PseudoElementSelectorPlain: typingsSlinky.cssTree.cssTreeStrings.PseudoElementSelector = js.native
}
object PseudoElementSelectorPlain {
  
  @scala.inline
  def apply(name: String, `type`: typingsSlinky.cssTree.cssTreeStrings.PseudoElementSelector): PseudoElementSelectorPlain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PseudoElementSelectorPlain]
  }
  
  @scala.inline
  implicit class PseudoElementSelectorPlainMutableBuilder[Self <: PseudoElementSelectorPlain] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[CssNodePlain]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenNull: Self = StObject.set(x, "children", null)
    
    @scala.inline
    def setChildrenVarargs(value: CssNodePlain*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typingsSlinky.cssTree.cssTreeStrings.PseudoElementSelector): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

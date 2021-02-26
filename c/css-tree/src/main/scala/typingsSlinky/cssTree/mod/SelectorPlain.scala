package typingsSlinky.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectorPlain
  extends CssNodeCommon
     with CssNodePlain {
  
  var children: js.Array[CssNodePlain] = js.native
  
  @JSName("type")
  var type_SelectorPlain: typingsSlinky.cssTree.cssTreeStrings.Selector = js.native
}
object SelectorPlain {
  
  @scala.inline
  def apply(children: js.Array[CssNodePlain], `type`: typingsSlinky.cssTree.cssTreeStrings.Selector): SelectorPlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectorPlain]
  }
  
  @scala.inline
  implicit class SelectorPlainMutableBuilder[Self <: SelectorPlain] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[CssNodePlain]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: CssNodePlain*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setType(value: typingsSlinky.cssTree.cssTreeStrings.Selector): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

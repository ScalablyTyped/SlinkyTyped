package typingsSlinky.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeclarationList
  extends CssNodeCommon
     with CssNode {
  
  var children: List[CssNode] = js.native
  
  @JSName("type")
  var type_DeclarationList: typingsSlinky.cssTree.cssTreeStrings.DeclarationList = js.native
}
object DeclarationList {
  
  @scala.inline
  def apply(children: List[CssNode], `type`: typingsSlinky.cssTree.cssTreeStrings.DeclarationList): DeclarationList = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclarationList]
  }
  
  @scala.inline
  implicit class DeclarationListMutableBuilder[Self <: DeclarationList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: List[CssNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typingsSlinky.cssTree.cssTreeStrings.DeclarationList): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

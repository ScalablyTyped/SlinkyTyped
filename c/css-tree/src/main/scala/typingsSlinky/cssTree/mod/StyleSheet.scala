package typingsSlinky.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StyleSheet
  extends CssNodeCommon
     with CssNode {
  
  var children: List[CssNode] = js.native
  
  @JSName("type")
  var type_StyleSheet: typingsSlinky.cssTree.cssTreeStrings.StyleSheet = js.native
}
object StyleSheet {
  
  @scala.inline
  def apply(children: List[CssNode], `type`: typingsSlinky.cssTree.cssTreeStrings.StyleSheet): StyleSheet = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleSheet]
  }
  
  @scala.inline
  implicit class StyleSheetMutableBuilder[Self <: StyleSheet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: List[CssNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typingsSlinky.cssTree.cssTreeStrings.StyleSheet): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

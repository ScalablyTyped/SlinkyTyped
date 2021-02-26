package typingsSlinky.estreeJsx.mod

import typingsSlinky.estree.mod.BaseNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSXFragment
  extends BaseNode
     with _Node {
  
  var children: js.Array[JSXText | JSXExpressionContainer | JSXSpreadChild | JSXElement | JSXFragment] = js.native
  
  var closingFragment: JSXClosingFragment = js.native
  
  var openingFragment: JSXOpeningFragment = js.native
  
  @JSName("type")
  var type_JSXFragment: typingsSlinky.estreeJsx.estreeJsxStrings.JSXFragment = js.native
}
object JSXFragment {
  
  @scala.inline
  def apply(
    children: js.Array[JSXText | JSXExpressionContainer | JSXSpreadChild | JSXElement | JSXFragment],
    closingFragment: JSXClosingFragment,
    openingFragment: JSXOpeningFragment,
    `type`: typingsSlinky.estreeJsx.estreeJsxStrings.JSXFragment
  ): JSXFragment = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], closingFragment = closingFragment.asInstanceOf[js.Any], openingFragment = openingFragment.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXFragment]
  }
  
  @scala.inline
  implicit class JSXFragmentMutableBuilder[Self <: JSXFragment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[JSXText | JSXExpressionContainer | JSXSpreadChild | JSXElement | JSXFragment]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: (JSXText | JSXExpressionContainer | JSXSpreadChild | JSXElement | JSXFragment)*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setClosingFragment(value: JSXClosingFragment): Self = StObject.set(x, "closingFragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpeningFragment(value: JSXOpeningFragment): Self = StObject.set(x, "openingFragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typingsSlinky.estreeJsx.estreeJsxStrings.JSXFragment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

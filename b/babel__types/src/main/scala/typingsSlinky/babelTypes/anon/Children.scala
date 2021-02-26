package typingsSlinky.babelTypes.anon

import typingsSlinky.babelTypes.indexTs37Mod.JSXElement_
import typingsSlinky.babelTypes.indexTs37Mod.JSXEmptyExpression_
import typingsSlinky.babelTypes.indexTs37Mod.JSXExpressionContainer_
import typingsSlinky.babelTypes.indexTs37Mod.JSXFragment_
import typingsSlinky.babelTypes.indexTs37Mod.JSXSpreadChild_
import typingsSlinky.babelTypes.indexTs37Mod.JSXText_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Children extends StObject {
  
  var children: js.Array[
    JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | JSXElement_ | JSXFragment_ | JSXEmptyExpression_
  ] = js.native
}
object Children {
  
  @scala.inline
  def apply(
    children: js.Array[
      JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | JSXElement_ | JSXFragment_ | JSXEmptyExpression_
    ]
  ): Children = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
  
  @scala.inline
  implicit class ChildrenMutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(
      value: js.Array[
          JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | JSXElement_ | JSXFragment_ | JSXEmptyExpression_
        ]
    ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(
      value: (JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | JSXElement_ | JSXFragment_ | JSXEmptyExpression_)*
    ): Self = StObject.set(x, "children", js.Array(value :_*))
  }
}

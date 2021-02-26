package typingsSlinky.reactNativeSvg.mod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XmlAST extends AST {
  
  @JSName("children")
  var children_XmlAST: js.Array[XmlAST | String] = js.native
  
  @JSName("parent")
  var parent_XmlAST: XmlAST | Null = js.native
}
object XmlAST {
  
  @scala.inline
  def apply(
    Tag: ReactComponentClass[js.Object],
    children: js.Array[XmlAST | String],
    props: StringDictionary[js.UndefOr[Styles | String]],
    tag: String
  ): XmlAST = {
    val __obj = js.Dynamic.literal(Tag = Tag.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[XmlAST]
  }
  
  @scala.inline
  implicit class XmlASTMutableBuilder[Self <: XmlAST] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[XmlAST | String]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: (XmlAST | String)*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setParent(value: XmlAST): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNull: Self = StObject.set(x, "parent", null)
  }
}

package typingsSlinky.reactNativeSvg.mod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AST extends StObject {
  
  var Tag: ReactComponentClass[js.Object] = js.native
  
  var children: js.Array[AST | ReactElement | String] = js.native
  
  var parent: AST | Null = js.native
  
  var priority: js.UndefOr[Map[String, js.UndefOr[Boolean]]] = js.native
  
  var props: StringDictionary[js.UndefOr[Styles | String]] = js.native
  
  var style: js.UndefOr[Styles] = js.native
  
  var styles: js.UndefOr[String] = js.native
  
  var tag: String = js.native
}
object AST {
  
  @scala.inline
  def apply(
    Tag: ReactComponentClass[js.Object],
    children: js.Array[AST | ReactElement | String],
    props: StringDictionary[js.UndefOr[Styles | String]],
    tag: String
  ): AST = {
    val __obj = js.Dynamic.literal(Tag = Tag.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[AST]
  }
  
  @scala.inline
  implicit class ASTMutableBuilder[Self <: AST] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[AST | ReactElement | String]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: (AST | ReactElement | String)*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setParent(value: AST): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNull: Self = StObject.set(x, "parent", null)
    
    @scala.inline
    def setPriority(value: Map[String, js.UndefOr[Boolean]]): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setProps(value: StringDictionary[js.UndefOr[Styles | String]]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: Styles): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setStyles(value: String): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    @scala.inline
    def setTag(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
  }
}

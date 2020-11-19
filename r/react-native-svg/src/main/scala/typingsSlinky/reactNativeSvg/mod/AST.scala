package typingsSlinky.reactNativeSvg.mod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AST extends js.Object {
  
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
  implicit class ASTOps[Self <: AST] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTag(value: ReactComponentClass[js.Object]): Self = this.set("Tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: (AST | ReactElement | String)*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[AST | ReactElement | String]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProps(value: StringDictionary[js.UndefOr[Styles | String]]): Self = this.set("props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: AST): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNull: Self = this.set("parent", null)
    
    @scala.inline
    def setPriority(value: Map[String, js.UndefOr[Boolean]]): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    
    @scala.inline
    def setStyle(value: Styles): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStyles(value: String): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
  }
}

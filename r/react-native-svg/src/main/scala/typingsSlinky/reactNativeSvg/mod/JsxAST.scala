package typingsSlinky.reactNativeSvg.mod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JsxAST extends AST {
  
  @JSName("children")
  var children_JsxAST: js.Array[ReactElement | String] = js.native
}
object JsxAST {
  
  @scala.inline
  def apply(
    Tag: ReactComponentClass[js.Object],
    children: js.Array[ReactElement | String],
    props: StringDictionary[js.UndefOr[Styles | String]],
    tag: String
  ): JsxAST = {
    val __obj = js.Dynamic.literal(Tag = Tag.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsxAST]
  }
  
  @scala.inline
  implicit class JsxASTOps[Self <: JsxAST] (val x: Self) extends AnyVal {
    
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
    def setChildrenVarargs(value: (ReactElement | String)*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[ReactElement | String]): Self = this.set("children", value.asInstanceOf[js.Any])
  }
}

package typingsSlinky.antd.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.commentMod.CommentProps
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Comment {
  
  @JSImport("antd", "Comment")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def actions(value: js.Array[ReactElement]): this.type = set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def actionsVarargs(value: ReactElement*): this.type = set("actions", js.Array(value :_*))
    
    @scala.inline
    def author(value: ReactElement): this.type = set("author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def authorReactElement(value: ReactElement): this.type = set("author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def avatar(value: ReactElement): this.type = set("avatar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def avatarReactElement(value: ReactElement): this.type = set("avatar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def content(value: ReactElement): this.type = set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def datetime(value: ReactElement): this.type = set("datetime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def datetimeReactElement(value: ReactElement): this.type = set("datetime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Comment.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CommentProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

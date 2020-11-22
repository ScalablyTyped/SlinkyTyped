package typingsSlinky.antd.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.antdStrings.bottom
import typingsSlinky.antd.antdStrings.circle
import typingsSlinky.antd.antdStrings.square
import typingsSlinky.antd.antdStrings.top
import typingsSlinky.antd.avatarAvatarMod.AvatarProps
import typingsSlinky.antd.groupMod.GroupProps
import typingsSlinky.antd.sizeContextMod.AvatarSize
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Avatar {
  
  @JSImport("antd", "Avatar")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, HTMLElement] {
    
    @scala.inline
    def alt(value: String): this.type = set("alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def draggable(value: Boolean): this.type = set("draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gap(value: Double): this.type = set("gap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconReactElement(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def icon(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onError(value: () => Boolean): this.type = set("onError", js.Any.fromFunction0(value))
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def shape(value: circle | square): this.type = set("shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: AvatarSize): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def srcReactElement(value: ReactElement): this.type = set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def src(value: ReactElement): this.type = set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def srcSet(value: String): this.type = set("srcSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AvatarProps with RefAttributes[HTMLElement]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Avatar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  object Group {
    
    @JSImport("antd", "Avatar.Group")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def maxCount(value: Double): this.type = set("maxCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def maxPopoverPlacement(value: top | bottom): this.type = set("maxPopoverPlacement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def maxStyle(value: CSSProperties): this.type = set("maxStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def size(value: AvatarSize): this.type = set("size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: GroupProps): typingsSlinky.antd.components.Avatar.Group.Builder = new typingsSlinky.antd.components.Avatar.Group.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: Group.type): typingsSlinky.antd.components.Avatar.Group.Builder = new typingsSlinky.antd.components.Avatar.Group.Builder(js.Array(this.component, js.Dictionary.empty))()
  }
}

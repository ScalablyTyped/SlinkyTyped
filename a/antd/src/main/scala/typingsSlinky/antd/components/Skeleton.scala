package typingsSlinky.antd.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.antdStrings.circle
import typingsSlinky.antd.antdStrings.default
import typingsSlinky.antd.antdStrings.large
import typingsSlinky.antd.antdStrings.round
import typingsSlinky.antd.antdStrings.small
import typingsSlinky.antd.antdStrings.square
import typingsSlinky.antd.paragraphMod.SkeletonParagraphProps
import typingsSlinky.antd.skeletonAvatarMod.AvatarProps
import typingsSlinky.antd.skeletonButtonMod.SkeletonButtonProps
import typingsSlinky.antd.skeletonImageMod.SkeletonImageProps
import typingsSlinky.antd.skeletonInputMod.SkeletonInputProps
import typingsSlinky.antd.skeletonSkeletonMod.SkeletonAvatarProps
import typingsSlinky.antd.skeletonSkeletonMod.SkeletonProps
import typingsSlinky.antd.titleMod.SkeletonTitleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Skeleton {
  
  object Avatar {
    
    @JSImport("antd", "Skeleton.Avatar")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      
      @scala.inline
      def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def shape(value: circle | square): this.type = set("shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def size(value: large | small | default | Double): this.type = set("size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: Avatar.type): typingsSlinky.antd.components.Skeleton.Avatar.Builder = new typingsSlinky.antd.components.Skeleton.Avatar.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: AvatarProps): typingsSlinky.antd.components.Skeleton.Avatar.Builder = new typingsSlinky.antd.components.Skeleton.Avatar.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Button {
    
    @JSImport("antd", "Skeleton.Button")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      
      @scala.inline
      def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def shape(value: circle | square | round): this.type = set("shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def size(value: large | small | default): this.type = set("size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: Button.type): typingsSlinky.antd.components.Skeleton.Button.Builder = new typingsSlinky.antd.components.Skeleton.Button.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: SkeletonButtonProps): typingsSlinky.antd.components.Skeleton.Button.Builder = new typingsSlinky.antd.components.Skeleton.Button.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Image {
    
    @JSImport("antd", "Skeleton.Image")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: Image.type): typingsSlinky.antd.components.Skeleton.Image.Builder = new typingsSlinky.antd.components.Skeleton.Image.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: SkeletonImageProps): typingsSlinky.antd.components.Skeleton.Image.Builder = new typingsSlinky.antd.components.Skeleton.Image.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Input {
    
    @JSImport("antd", "Skeleton.Input")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      
      @scala.inline
      def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def size(value: large | small | default): this.type = set("size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: Input.type): typingsSlinky.antd.components.Skeleton.Input.Builder = new typingsSlinky.antd.components.Skeleton.Input.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: SkeletonInputProps): typingsSlinky.antd.components.Skeleton.Input.Builder = new typingsSlinky.antd.components.Skeleton.Input.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("antd", "Skeleton")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def avatar(value: SkeletonAvatarProps | Boolean): this.type = set("avatar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paragraph(value: SkeletonParagraphProps | Boolean): this.type = set("paragraph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def round(value: Boolean): this.type = set("round", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: SkeletonTitleProps | Boolean): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Skeleton.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SkeletonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

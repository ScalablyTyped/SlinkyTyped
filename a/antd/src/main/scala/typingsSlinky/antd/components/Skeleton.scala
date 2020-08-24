package typingsSlinky.antd.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.antdStrings.circle
import typingsSlinky.antd.antdStrings.default
import typingsSlinky.antd.antdStrings.large
import typingsSlinky.antd.antdStrings.round
import typingsSlinky.antd.antdStrings.small
import typingsSlinky.antd.antdStrings.square
import typingsSlinky.antd.imageMod.SkeletonImageProps
import typingsSlinky.antd.paragraphMod.SkeletonParagraphProps
import typingsSlinky.antd.skeletonAvatarMod.AvatarProps
import typingsSlinky.antd.skeletonButtonMod.SkeletonButtonProps
import typingsSlinky.antd.skeletonInputMod.SkeletonInputProps
import typingsSlinky.antd.skeletonSkeletonMod.SkeletonAvatarProps
import typingsSlinky.antd.skeletonSkeletonMod.SkeletonProps
import typingsSlinky.antd.titleMod.SkeletonTitleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Skeleton {
  @JSImport("antd", "Skeleton")
  @js.native
  object component extends js.Object
  
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
  
  def withProps(p: SkeletonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Skeleton.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  object Input {
    @JSImport("antd", "Skeleton.Input")
    @js.native
    object component extends js.Object
    
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
    
    def withProps(p: SkeletonInputProps): typingsSlinky.antd.components.Skeleton.Input.Builder = new typingsSlinky.antd.components.Skeleton.Input.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: Input.type): typingsSlinky.antd.components.Skeleton.Input.Builder = new typingsSlinky.antd.components.Skeleton.Input.Builder(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Button {
    @JSImport("antd", "Skeleton.Button")
    @js.native
    object component extends js.Object
    
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
    
    def withProps(p: SkeletonButtonProps): typingsSlinky.antd.components.Skeleton.Button.Builder = new typingsSlinky.antd.components.Skeleton.Button.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: Button.type): typingsSlinky.antd.components.Skeleton.Button.Builder = new typingsSlinky.antd.components.Skeleton.Button.Builder(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Image {
    @JSImport("antd", "Skeleton.Image")
    @js.native
    object component extends js.Object
    
    def withProps(p: SkeletonImageProps): SharedBuilder_SkeletonImageProps696746036 = new SharedBuilder_SkeletonImageProps696746036(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: Image.type): SharedBuilder_SkeletonImageProps696746036 = new SharedBuilder_SkeletonImageProps696746036(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Avatar {
    @JSImport("antd", "Skeleton.Avatar")
    @js.native
    object component extends js.Object
    
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
    
    def withProps(p: AvatarProps): typingsSlinky.antd.components.Skeleton.Avatar.Builder = new typingsSlinky.antd.components.Skeleton.Avatar.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: Avatar.type): typingsSlinky.antd.components.Skeleton.Avatar.Builder = new typingsSlinky.antd.components.Skeleton.Avatar.Builder(js.Array(this.component, js.Dictionary.empty))()
  }
  
}


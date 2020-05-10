package typingsSlinky.antd.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.paragraphMod.SkeletonParagraphProps
import typingsSlinky.antd.skeletonMod.default
import typingsSlinky.antd.skeletonSkeletonMod.SkeletonAvatarProps
import typingsSlinky.antd.skeletonSkeletonMod.SkeletonProps
import typingsSlinky.antd.titleMod.SkeletonTitleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Skeleton {
  @JSImport("antd/lib/skeleton", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
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
    def title(value: SkeletonTitleProps | Boolean): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SkeletonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Skeleton.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}


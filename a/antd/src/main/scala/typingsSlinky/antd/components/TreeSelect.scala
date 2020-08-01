package typingsSlinky.antd.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.sizeContextMod.SizeType
import typingsSlinky.antd.treeSelectMod.TreeSelectProps
import typingsSlinky.antd.treeSelectMod.default
import typingsSlinky.rcTreeSelect.interfaceMod.Key
import typingsSlinky.rcTreeSelect.treeNodeMod.TreeNodeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TreeSelect {
  @JSImport("antd/lib/tree-select", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[T] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default[T]] {
    @scala.inline
    def bordered(value: Boolean): this.type = set("bordered", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: SizeType): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def suffixIconReactElement(value: ReactElement): this.type = set("suffixIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def suffixIcon(value: ReactElement): this.type = set("suffixIcon", value.asInstanceOf[js.Any])
  }
  
  def withProps[T](p: TreeSelectProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[T](): Builder[T] = {
    val __props = js.Dynamic.literal()
    new Builder[T](js.Array(this.component, __props.asInstanceOf[TreeSelectProps[T]]))
  }
  implicit def make[T](companion: TreeSelect.type): Builder[T] = new Builder[T](js.Array(this.component, js.Dictionary.empty))()
  object TreeNode {
    @JSImport("antd/lib/tree-select", "TreeNode")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      @scala.inline
      def checkable(value: Boolean): this.type = set("checkable", value.asInstanceOf[js.Any])
      @scala.inline
      def disableCheckbox(value: Boolean): this.type = set("disableCheckbox", value.asInstanceOf[js.Any])
      @scala.inline
      def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
      @scala.inline
      def labelReactElement(value: ReactElement): this.type = set("label", value.asInstanceOf[js.Any])
      @scala.inline
      def label(value: ReactElement): this.type = set("label", value.asInstanceOf[js.Any])
      @scala.inline
      def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
      @scala.inline
      def title(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: TreeNodeProps): typingsSlinky.antd.components.TreeSelect.TreeNode.Builder = new typingsSlinky.antd.components.TreeSelect.TreeNode.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    @scala.inline
    def apply(value: Key): typingsSlinky.antd.components.TreeSelect.TreeNode.Builder = {
        val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
        new typingsSlinky.antd.components.TreeSelect.TreeNode.Builder(js.Array(this.component, __props.asInstanceOf[TreeNodeProps]))
    }
  }
  
}


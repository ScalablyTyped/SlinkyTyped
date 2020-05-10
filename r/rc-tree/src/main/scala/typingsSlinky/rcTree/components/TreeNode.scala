package typingsSlinky.rcTree.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcTree.mod.InternalTreeNodeProps
import typingsSlinky.rcTree.mod.TreeNodeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TreeNode {
  @JSImport("rc-tree", "TreeNode")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.rcTree.mod.TreeNode] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def disableCheckbox(value: Boolean): this.type = set("disableCheckbox", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def iconReactElement(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def iconFunction1(value: /* props */ InternalTreeNodeProps => ReactElement): this.type = set("icon", js.Any.fromFunction1(value))
    @scala.inline
    def icon(value: ReactElement | (js.Function1[/* props */ InternalTreeNodeProps, ReactElement])): this.type = set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def isLeaf(value: Boolean): this.type = set("isLeaf", value.asInstanceOf[js.Any])
    @scala.inline
    def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def title(value: String | ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TreeNodeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: TreeNode.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}


package typingsSlinky.baseui.treeViewMod

import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeLabelProps extends js.Object {
  var hasChildren: Boolean = js.native
  var isExpanded: js.UndefOr[Boolean] = js.native
  var label: (js.Function1[/* node */ TreeNode, Node]) | String = js.native
  var node: TreeNode = js.native
  var overrides: js.UndefOr[TreeLabelOverrides] = js.native
}

object TreeLabelProps {
  @scala.inline
  def apply(hasChildren: Boolean, label: (js.Function1[/* node */ TreeNode, Node]) | String, node: TreeNode): TreeLabelProps = {
    val __obj = js.Dynamic.literal(hasChildren = hasChildren.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeLabelProps]
  }
  @scala.inline
  implicit class TreeLabelPropsOps[Self <: TreeLabelProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasChildren(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasChildren")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelFunction1(value: /* node */ TreeNode => Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLabel(value: (js.Function1[/* node */ TreeNode, Node]) | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode(value: TreeNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsExpanded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExpanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsExpanded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExpanded")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrides(value: TreeLabelOverrides): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(js.undefined)
        ret
    }
  }
  
}


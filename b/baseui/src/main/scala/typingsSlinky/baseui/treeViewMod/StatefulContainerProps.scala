package typingsSlinky.baseui.treeViewMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined baseui.baseui/tree-view.TreeViewProps & {children (props : baseui.baseui/tree-view.TreeViewProps): react.react.ReactNode} */
@js.native
trait StatefulContainerProps extends js.Object {
  var data: js.Array[TreeNode] = js.native
  var getId: js.UndefOr[js.Function1[/* node */ TreeNode, Double | String]] = js.native
  var indentGuides: js.UndefOr[Boolean] = js.native
  var onToggle: js.UndefOr[js.Function1[/* node */ TreeNode, Unit]] = js.native
  var overrides: js.UndefOr[TreeViewOverrides] = js.native
  var renderAll: js.UndefOr[Boolean] = js.native
  var singleExpanded: js.UndefOr[Boolean] = js.native
  def children(props: TreeViewProps): TagMod[Any] = js.native
}

object StatefulContainerProps {
  @scala.inline
  def apply(children: TreeViewProps => TagMod[Any], data: js.Array[TreeNode]): StatefulContainerProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatefulContainerProps]
  }
  @scala.inline
  implicit class StatefulContainerPropsOps[Self <: StatefulContainerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: TreeViewProps => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withData(value: js.Array[TreeNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetId(value: /* node */ TreeNode => Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getId")(js.undefined)
        ret
    }
    @scala.inline
    def withIndentGuides(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentGuides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndentGuides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentGuides")(js.undefined)
        ret
    }
    @scala.inline
    def withOnToggle(value: /* node */ TreeNode => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onToggle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnToggle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onToggle")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrides(value: TreeViewOverrides): Self = {
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
    @scala.inline
    def withRenderAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderAll")(js.undefined)
        ret
    }
    @scala.inline
    def withSingleExpanded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleExpanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleExpanded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleExpanded")(js.undefined)
        ret
    }
  }
  
}


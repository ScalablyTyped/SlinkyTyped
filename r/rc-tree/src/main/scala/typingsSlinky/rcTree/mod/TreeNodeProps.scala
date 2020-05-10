package typingsSlinky.rcTree.mod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeNodeProps extends js.Object {
  /**
    * additional css class for treeNode
    */
  var className: js.UndefOr[String] = js.native
  /**
    * whether treeNode's checkbox is disabled
    */
  var disableCheckbox: js.UndefOr[Boolean] = js.native
  /**
    * whether treeNode is disabled
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * customize icon. When you pass component, whose render will receive full TreeNode props as component props
    */
  var icon: js.UndefOr[ReactElement | (js.Function1[/* props */ InternalTreeNodeProps, ReactElement])] = js.native
  /**
    * whether it is a leaf node
    */
  var isLeaf: js.UndefOr[Boolean] = js.native
  /**
    * tree / subTree's title
    */
  var title: js.UndefOr[String | ReactElement] = js.native
}

object TreeNodeProps {
  @scala.inline
  def apply(): TreeNodeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeNodeProps]
  }
  @scala.inline
  implicit class TreeNodePropsOps[Self <: TreeNodeProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableCheckbox(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableCheckbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableCheckbox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableCheckbox")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIconReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIconFunction1(value: /* props */ InternalTreeNodeProps => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIcon(value: ReactElement | (js.Function1[/* props */ InternalTreeNodeProps, ReactElement])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withIsLeaf(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLeaf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsLeaf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLeaf")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String | ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}


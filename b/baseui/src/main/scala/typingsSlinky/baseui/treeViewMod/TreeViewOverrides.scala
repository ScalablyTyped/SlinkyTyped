package typingsSlinky.baseui.treeViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeViewOverrides extends TreeLabelOverrides {
  var Root: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any
  ] = js.native
  var TreeItem: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{  $isLeafNode ? :boolean}> */ js.Any
  ] = js.native
  var TreeItemList: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{  $isChildNode ? :boolean}> */ js.Any
  ] = js.native
  var TreeLabel: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<TreeLabelProps> */ js.Any
  ] = js.native
}

object TreeViewOverrides {
  @scala.inline
  def apply(): TreeViewOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeViewOverrides]
  }
  @scala.inline
  implicit class TreeViewOverridesOps[Self <: TreeViewOverrides] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRoot(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Root")(js.undefined)
        ret
    }
    @scala.inline
    def withTreeItem(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{  $isLeafNode ? :boolean}> */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TreeItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTreeItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TreeItem")(js.undefined)
        ret
    }
    @scala.inline
    def withTreeItemList(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{  $isChildNode ? :boolean}> */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TreeItemList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTreeItemList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TreeItemList")(js.undefined)
        ret
    }
    @scala.inline
    def withTreeLabel(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<TreeLabelProps> */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TreeLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTreeLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TreeLabel")(js.undefined)
        ret
    }
  }
  
}


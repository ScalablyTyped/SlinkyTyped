package typingsSlinky.reactSortableTree.mod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemeProps extends ThemeTreeProps {
  var treeNodeRenderer: js.UndefOr[TreeRenderer] = js.native
}

object ThemeProps {
  @scala.inline
  def apply(): ThemeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeProps]
  }
  @scala.inline
  implicit class ThemePropsOps[Self <: ThemeProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTreeNodeRendererFunctionComponent(value: ReactComponentClass[TreeRendererProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeNodeRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTreeNodeRendererComponentClass(value: ReactComponentClass[TreeRendererProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeNodeRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTreeNodeRenderer(value: TreeRenderer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeNodeRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTreeNodeRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeNodeRenderer")(js.undefined)
        ret
    }
  }
  
}


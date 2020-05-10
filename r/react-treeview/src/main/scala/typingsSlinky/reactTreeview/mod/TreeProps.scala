package typingsSlinky.reactTreeview.mod

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.TagMod
import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeProps extends HTMLAttributes[HTMLDivElement] {
  var childrenClassName: js.UndefOr[String] = js.native
  var collapsed: js.UndefOr[Boolean] = js.native
  var defaultCollapsed: js.UndefOr[Boolean] = js.native
  var itemClassName: js.UndefOr[String] = js.native
  var nodeLabel: TagMod[Any] = js.native
  var treeViewClassName: js.UndefOr[String] = js.native
}

object TreeProps {
  @scala.inline
  def apply(): TreeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeProps]
  }
  @scala.inline
  implicit class TreePropsOps[Self <: TreeProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildrenClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childrenClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildrenClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childrenClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapsed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultCollapsed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCollapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultCollapsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCollapsed")(js.undefined)
        ret
    }
    @scala.inline
    def withItemClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeLabel(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withTreeViewClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeViewClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTreeViewClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeViewClassName")(js.undefined)
        ret
    }
  }
  
}


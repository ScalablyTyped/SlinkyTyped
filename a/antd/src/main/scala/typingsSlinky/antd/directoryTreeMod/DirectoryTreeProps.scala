package typingsSlinky.antd.directoryTreeMod

import typingsSlinky.antd.treeTreeMod.TreeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryTreeProps extends TreeProps {
  var expandAction: js.UndefOr[ExpandAction] = js.native
}

object DirectoryTreeProps {
  @scala.inline
  def apply(): DirectoryTreeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectoryTreeProps]
  }
  @scala.inline
  implicit class DirectoryTreePropsOps[Self <: DirectoryTreeProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpandAction(value: ExpandAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandAction")(js.undefined)
        ret
    }
  }
  
}


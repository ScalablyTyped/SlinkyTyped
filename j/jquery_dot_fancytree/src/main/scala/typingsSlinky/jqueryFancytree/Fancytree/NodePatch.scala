package typingsSlinky.jqueryFancytree.Fancytree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Data object similar to NodeData, but with additional options.
  * May be passed to FancytreeNode#applyPatch (Every property that is omitted (or set to undefined) will be ignored)  */
@js.native
trait NodePatch extends js.Object {
  /** (not yet implemented) */
  var appendChildren: js.UndefOr[NodeData] = js.native
  /** (not yet implemented) */
  var insertChildren: js.UndefOr[NodeData] = js.native
  /** (not yet implemented) */
  var replaceChildren: js.UndefOr[NodeData] = js.native
}

object NodePatch {
  @scala.inline
  def apply(): NodePatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodePatch]
  }
  @scala.inline
  implicit class NodePatchOps[Self <: NodePatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppendChildren(value: NodeData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendChildren")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppendChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendChildren")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertChildren(value: NodeData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertChildren")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertChildren")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaceChildren(value: NodeData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceChildren")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplaceChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceChildren")(js.undefined)
        ret
    }
  }
  
}


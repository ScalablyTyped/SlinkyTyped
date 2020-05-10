package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeCollapsingEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the node object about to collapse.
  	 */
  var node: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets a reference to the tree.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
}

object NodeCollapsingEventUIParam {
  @scala.inline
  def apply(): NodeCollapsingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeCollapsingEventUIParam]
  }
  @scala.inline
  implicit class NodeCollapsingEventUIParamOps[Self <: NodeCollapsingEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNode(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(js.undefined)
        ret
    }
    @scala.inline
    def withOwner(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(js.undefined)
        ret
    }
  }
  
}


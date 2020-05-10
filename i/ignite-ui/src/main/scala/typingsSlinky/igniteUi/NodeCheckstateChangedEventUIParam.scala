package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeCheckstateChangedEventUIParam extends js.Object {
  /**
  	 * Gets the collection of all checked nodes.
  	 */
  var newCheckedNodes: js.UndefOr[js.Array[_]] = js.native
  /**
  	 * Gets the collection of all partially checked nodes.
  	 */
  var newPartiallyCheckedNodes: js.UndefOr[js.Array[_]] = js.native
  /**
  	 * Gets the new state that is already applied to the checkbox.
  	 */
  var newState: js.UndefOr[String] = js.native
  /**
  	 * Gets a reference to the node object the checkbox of which is being interacted with.
  	 */
  var node: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets a reference to the tree.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
}

object NodeCheckstateChangedEventUIParam {
  @scala.inline
  def apply(): NodeCheckstateChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeCheckstateChangedEventUIParam]
  }
  @scala.inline
  implicit class NodeCheckstateChangedEventUIParamOps[Self <: NodeCheckstateChangedEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewCheckedNodes(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCheckedNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewCheckedNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCheckedNodes")(js.undefined)
        ret
    }
    @scala.inline
    def withNewPartiallyCheckedNodes(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPartiallyCheckedNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewPartiallyCheckedNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPartiallyCheckedNodes")(js.undefined)
        ret
    }
    @scala.inline
    def withNewState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newState")(js.undefined)
        ret
    }
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


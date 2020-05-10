package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeCheckstateChangingEventUIParam extends js.Object {
  /**
  	 * Gets the collection of all checked nodes before the new state is applied.
  	 */
  var currentCheckedNodes: js.UndefOr[js.Array[_]] = js.native
  /**
  	 * Gets the current state of the checkbox.
  	 */
  var currentState: js.UndefOr[String] = js.native
  /**
  	 * Gets the new state that is going to be applied to the checkbox.
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

object NodeCheckstateChangingEventUIParam {
  @scala.inline
  def apply(): NodeCheckstateChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeCheckstateChangingEventUIParam]
  }
  @scala.inline
  implicit class NodeCheckstateChangingEventUIParamOps[Self <: NodeCheckstateChangingEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentCheckedNodes(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentCheckedNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentCheckedNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentCheckedNodes")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentState")(js.undefined)
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


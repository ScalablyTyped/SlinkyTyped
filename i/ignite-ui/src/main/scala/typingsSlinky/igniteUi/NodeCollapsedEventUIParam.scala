package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeCollapsedEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the collapsed node object.
  	 */
  var node: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets a reference to the tree.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
}

object NodeCollapsedEventUIParam {
  @scala.inline
  def apply(): NodeCollapsedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeCollapsedEventUIParam]
  }
  @scala.inline
  implicit class NodeCollapsedEventUIParamOps[Self <: NodeCollapsedEventUIParam] (val x: Self) extends AnyVal {
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


package typingsSlinky.oracleOraclejet

import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonInsertNewView extends js.Object {
  var isInitial: Boolean = js.native
  var newViewModel: js.Object = js.native
  var newViewParent: Node = js.native
  var node: Node = js.native
  var oldDomNodes: js.Array[_] = js.native
  var oldViewModel: js.Object = js.native
  var oldViewParent: Node = js.native
  def insertNewView(): js.UndefOr[scala.Nothing] = js.native
  def removeOldView(): js.UndefOr[scala.Nothing] = js.native
}

object AnonInsertNewView {
  @scala.inline
  def apply(
    insertNewView: () => js.UndefOr[scala.Nothing],
    isInitial: Boolean,
    newViewModel: js.Object,
    newViewParent: Node,
    node: Node,
    oldDomNodes: js.Array[_],
    oldViewModel: js.Object,
    oldViewParent: Node,
    removeOldView: () => js.UndefOr[scala.Nothing]
  ): AnonInsertNewView = {
    val __obj = js.Dynamic.literal(insertNewView = js.Any.fromFunction0(insertNewView), isInitial = isInitial.asInstanceOf[js.Any], newViewModel = newViewModel.asInstanceOf[js.Any], newViewParent = newViewParent.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], oldDomNodes = oldDomNodes.asInstanceOf[js.Any], oldViewModel = oldViewModel.asInstanceOf[js.Any], oldViewParent = oldViewParent.asInstanceOf[js.Any], removeOldView = js.Any.fromFunction0(removeOldView))
    __obj.asInstanceOf[AnonInsertNewView]
  }
  @scala.inline
  implicit class AnonInsertNewViewOps[Self <: AnonInsertNewView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInsertNewView(value: () => js.UndefOr[scala.Nothing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertNewView")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsInitial(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInitial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewViewModel(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newViewModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewViewParent(value: Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newViewParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode(value: Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldDomNodes(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldDomNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldViewModel(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldViewModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldViewParent(value: Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldViewParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveOldView(value: () => js.UndefOr[scala.Nothing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeOldView")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}


package typingsSlinky.jui.anon

import typingsSlinky.jui.mod.UITreeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragChild extends js.Object {
  /**
    * @cfg {Boolean} [drag=false]
    * It is possible to drag the movement of a node.
    */
  var drag: js.UndefOr[Boolean] = js.native
  /**
    * @cfg {Boolean} [dragChild=true]
    * It is possible to drag the node movement but the node is not changed to a child node of the target node.
    */
  var dragChild: js.UndefOr[Boolean] = js.native
  var event: js.UndefOr[js.Any] = js.native
  /**
    * @cfg {NodeObject} [root=null]
    * Adds a root node (required).
    */
  var root: js.UndefOr[UITreeNode] = js.native
  /**
    * @cfg {Boolean} [rootFold=false]
    * Folds up a root node.
    */
  var rootFold: js.UndefOr[Boolean] = js.native
  /**
    * @cfg {Boolean} [rootHide=false]
    * Hides a root node.
    */
  var rootHide: js.UndefOr[Boolean] = js.native
  var tpl: js.UndefOr[js.Any] = js.native
}

object DragChild {
  @scala.inline
  def apply(): DragChild = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragChild]
  }
  @scala.inline
  implicit class DragChildOps[Self <: DragChild] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDrag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drag")(js.undefined)
        ret
    }
    @scala.inline
    def withDragChild(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragChild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragChild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragChild")(js.undefined)
        ret
    }
    @scala.inline
    def withEvent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(js.undefined)
        ret
    }
    @scala.inline
    def withRoot(value: UITreeNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.undefined)
        ret
    }
    @scala.inline
    def withRootFold(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootFold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootFold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootFold")(js.undefined)
        ret
    }
    @scala.inline
    def withRootHide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootHide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootHide")(js.undefined)
        ret
    }
    @scala.inline
    def withTpl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tpl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTpl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tpl")(js.undefined)
        ret
    }
  }
  
}


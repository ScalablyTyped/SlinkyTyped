package typingsSlinky.activexLibreoffice.com_.sun.star.awt.tree

import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An event used by a {@link XTreeDataModel} to notify changes in the data model to the {@link XTreeControl} . You usually need to fill this event only
  * if you implement the {@link XTreeDataModel} yourself.
  * @see XTreeDataModel
  * @see XTreeControl
  * @see XTreeDataModelListener
  */
@js.native
trait TreeDataModelEvent extends EventObject {
  /**
    * contains the changed, added or removed nodes.
    *
    * All nodes must have {@link ParentNode} as parent.
    */
  var Nodes: SafeArray[XTreeNode] = js.native
  /**
    * holds the parent node for changed, added or removed nodes.
    *
    * If this is null, {@link Nodes} must contain only the root node
    */
  var ParentNode: XTreeNode = js.native
}

object TreeDataModelEvent {
  @scala.inline
  def apply(Nodes: SafeArray[XTreeNode], ParentNode: XTreeNode, Source: XInterface): TreeDataModelEvent = {
    val __obj = js.Dynamic.literal(Nodes = Nodes.asInstanceOf[js.Any], ParentNode = ParentNode.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeDataModelEvent]
  }
  @scala.inline
  implicit class TreeDataModelEventOps[Self <: TreeDataModelEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNodes(value: SafeArray[XTreeNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Nodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentNode(value: XTreeNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParentNode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.officeJsPreview.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides information about the replaced node that raised the nodeReplaced event.
  */
@js.native
trait NodeReplacedEventArgs extends js.Object {
  /**
    * Gets whether the replaced node was inserted as part of an undo or redo operation by the user.
    */
  var isUndoRedo: Boolean = js.native
  /**
    * Gets the node that was just added to the CustomXMLPart object.
    * 
    * Note that this node may have children, if a subtree was just added to the document.
    */
  var newNode: CustomXmlNode = js.native
  /**
    * Gets the node which was just deleted (replaced) from the CustomXmlPart object.
    * 
    * Note that this node may have children, if a subtree is being removed from the document. Also, this node will be a "disconnected" node in 
    * that you can query down from the node, but you cannot query up the tree - the node appears to exist alone.
    */
  var oldNode: CustomXmlNode = js.native
}

object NodeReplacedEventArgs {
  @scala.inline
  def apply(isUndoRedo: Boolean, newNode: CustomXmlNode, oldNode: CustomXmlNode): NodeReplacedEventArgs = {
    val __obj = js.Dynamic.literal(isUndoRedo = isUndoRedo.asInstanceOf[js.Any], newNode = newNode.asInstanceOf[js.Any], oldNode = oldNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeReplacedEventArgs]
  }
  @scala.inline
  implicit class NodeReplacedEventArgsOps[Self <: NodeReplacedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsUndoRedo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUndoRedo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewNode(value: CustomXmlNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldNode(value: CustomXmlNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldNode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


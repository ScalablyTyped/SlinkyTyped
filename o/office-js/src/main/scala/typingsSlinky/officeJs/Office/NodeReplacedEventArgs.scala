package typingsSlinky.officeJs.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about the replaced node that raised the nodeReplaced event.
  */
@js.native
trait NodeReplacedEventArgs extends StObject {
  
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
  implicit class NodeReplacedEventArgsMutableBuilder[Self <: NodeReplacedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsUndoRedo(value: Boolean): Self = StObject.set(x, "isUndoRedo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewNode(value: CustomXmlNode): Self = StObject.set(x, "newNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldNode(value: CustomXmlNode): Self = StObject.set(x, "oldNode", value.asInstanceOf[js.Any])
  }
}

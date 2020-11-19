package typingsSlinky.activexLibreoffice.com_.sun.star.awt.tree

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An instance of this interface is used by the {@link TreeControl} to get notifications about data model changes.
  *
  * Usually you must not implement this interface yourself as it is already handled by the {@link TreeControl} , but you must notify it correctly if you
  * implement the {@link XTreeDataModel} yourself
  *
  * .
  */
@js.native
trait XTreeDataModelListener extends XEventListener {
  
  /**
    * Invoked after a node (or a set of siblings) has changed in some way. The node(s) have not changed locations in the tree or altered their children
    * arrays, but other attributes have changed and may affect presentation.
    *
    * Example: the name of a file has changed, but it is in the same location in the file system.
    *
    * To indicate the root has changed, {@link TreeDataModelEvent.Nodes} will contain the root node and {@link TreeDataModelEvent.ParentNode} will be empty.
    */
  def treeNodesChanged(Event: TreeDataModelEvent): Unit = js.native
  
  /**
    * Invoked after nodes have been inserted into the tree.
    *
    * Use {@link TreeDataModelEvent.ParentNode} to get the parent of the new node(s). {@link TreeDataModelEvent.Nodes} contains the new node(s).
    */
  def treeNodesInserted(Event: TreeDataModelEvent): Unit = js.native
  
  /**
    * Invoked after nodes have been removed from the tree.
    *
    * Note that if a subtree is removed from the tree, this method may only be invoked once for the root of the removed subtree, not once for each
    * individual set of siblings removed.
    *
    * Use {@link TreeDataModelEvent.ParentNode} to get the former parent of the deleted node(s). {@link TreeDataModelEvent.Nodes} contains the removed
    * node(s).
    */
  def treeNodesRemoved(Event: TreeDataModelEvent): Unit = js.native
  
  /**
    * Invoked after the tree has drastically changed structure from a given node down.
    *
    * Use {@link TreeDataModelEvent.ParentNode} to get the node which structure has changed. {@link TreeDataModelEvent.Nodes} is empty.
    */
  def treeStructureChanged(Event: TreeDataModelEvent): Unit = js.native
}
object XTreeDataModelListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    treeNodesChanged: TreeDataModelEvent => Unit,
    treeNodesInserted: TreeDataModelEvent => Unit,
    treeNodesRemoved: TreeDataModelEvent => Unit,
    treeStructureChanged: TreeDataModelEvent => Unit
  ): XTreeDataModelListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), treeNodesChanged = js.Any.fromFunction1(treeNodesChanged), treeNodesInserted = js.Any.fromFunction1(treeNodesInserted), treeNodesRemoved = js.Any.fromFunction1(treeNodesRemoved), treeStructureChanged = js.Any.fromFunction1(treeStructureChanged))
    __obj.asInstanceOf[XTreeDataModelListener]
  }
  
  @scala.inline
  implicit class XTreeDataModelListenerOps[Self <: XTreeDataModelListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTreeNodesChanged(value: TreeDataModelEvent => Unit): Self = this.set("treeNodesChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTreeNodesInserted(value: TreeDataModelEvent => Unit): Self = this.set("treeNodesInserted", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTreeNodesRemoved(value: TreeDataModelEvent => Unit): Self = this.set("treeNodesRemoved", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTreeStructureChanged(value: TreeDataModelEvent => Unit): Self = this.set("treeStructureChanged", js.Any.fromFunction1(value))
  }
}

package typingsSlinky.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#collection/compound-nodes
  */
@js.native
trait NodeSingularCompound extends js.Object {
  
  /**
    * Get whether the node is a compound child (i.e. contained within a node)
    *  http://js.cytoscape.org/#node.isChild
    */
  def isChild(): Boolean = js.native
  
  /**
    * Get whether the node is childless (i.e. a node with no child nodes)
    * http://js.cytoscape.org/#node.isChildless
    */
  def isChildless(): Boolean = js.native
  
  /**
    * Get whether the node is an orphan (i.e. a node with no parent)
    * http://js.cytoscape.org/#node.isOrphan
    */
  def isOrphan(): Boolean = js.native
  
  /**
    * Get whether the node is a compound parent
    * (i.e. a node containing one or more child nodes)
    * http://js.cytoscape.org/#node.isParent
    */
  def isParent(): Boolean = js.native
}
object NodeSingularCompound {
  
  @scala.inline
  def apply(
    isChild: () => Boolean,
    isChildless: () => Boolean,
    isOrphan: () => Boolean,
    isParent: () => Boolean
  ): NodeSingularCompound = {
    val __obj = js.Dynamic.literal(isChild = js.Any.fromFunction0(isChild), isChildless = js.Any.fromFunction0(isChildless), isOrphan = js.Any.fromFunction0(isOrphan), isParent = js.Any.fromFunction0(isParent))
    __obj.asInstanceOf[NodeSingularCompound]
  }
  
  @scala.inline
  implicit class NodeSingularCompoundOps[Self <: NodeSingularCompound] (val x: Self) extends AnyVal {
    
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
    def setIsChild(value: () => Boolean): Self = this.set("isChild", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsChildless(value: () => Boolean): Self = this.set("isChildless", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsOrphan(value: () => Boolean): Self = this.set("isOrphan", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsParent(value: () => Boolean): Self = this.set("isParent", js.Any.fromFunction0(value))
  }
}

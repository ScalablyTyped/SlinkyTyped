package typingsSlinky.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#collection/compound-nodes
  */
@js.native
trait NodeCollectionCompound extends StObject {
  
  /**
    * Get all compound ancestor nodes
    * (i.e. parents, parents' parents, etc.) of each node in the collection.
    * @param selector A selector used to filter the resultant collection.
    * http://js.cytoscape.org/#nodes.ancestors
    */
  def ancestors(): NodeCollection = js.native
  def ancestors(selector: Selector): NodeCollection = js.native
  
  /**
    * Get all compound child (i.e. direct descendant) nodes of each node in the collection.
    * @param selector A selector used to filter the resultant collection.
    * http://js.cytoscape.org/#nodes.children
    */
  def children(): NodeCollection = js.native
  def children(selector: Selector): NodeCollection = js.native
  
  /**
    * Get all compound ancestors common to all the nodes in the collection,
    * starting with the closest and getting progressively farther.
    * @param selector A selector used to filter the resultant collection.
    * http://js.cytoscape.org/#nodes.commonAncestors
    */
  def commonAncestors(): NodeCollection = js.native
  def commonAncestors(selector: Selector): NodeCollection = js.native
  
  /**
    * Get all compound descendant (i.e. children, children's children, etc.)
    * nodes of each node in the collection.
    * @param selector A selector used to filter the resultant collection.
    * http://js.cytoscape.org/#nodes.descendants
    */
  def descendants(): NodeCollection = js.native
  def descendants(selector: Selector): NodeCollection = js.native
  
  /**
    * Get all nonorphan (i.e. has a compound parent) nodes in the calling collection.
    * @param selector A selector used to filter the resultant collection.
    * http://js.cytoscape.org/#nodes.nonorphans
    */
  def nonorphans(): NodeCollection = js.native
  def nonorphans(selector: Selector): NodeCollection = js.native
  
  /**
    * Get all orphan (i.e. has no compound parent) nodes in the calling collection.
    * @param selector A selector used to filter the resultant collection.
    * http://js.cytoscape.org/#nodes.orphans
    */
  def orphans(): NodeCollection = js.native
  def orphans(selector: Selector): NodeCollection = js.native
  
  /**
    * Get the compound parent node of each node in the collection.
    * @param selector A selector used to filter the resultant collection.
    * http://js.cytoscape.org/#nodes.parent
    */
  def parent(): NodeCollection = js.native
  def parent(selector: Selector): NodeCollection = js.native
  
  def parents(): NodeCollection = js.native
  def parents(selector: Selector): NodeCollection = js.native
  
  /**
    * Get all sibling (i.e. same compound parent)
    * nodes of each node in the collection.
    * @param selector A selector used to filter the resultant collection.
    * http://js.cytoscape.org/#nodes.siblings
    */
  def siblings(): NodeCollection = js.native
  def siblings(selector: Selector): NodeCollection = js.native
}

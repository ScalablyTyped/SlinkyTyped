package typingsSlinky.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Subset of API needed for appending elements and text nodes. */
@js.native
trait RNode extends js.Object {
  
  /**
    * Append a child node.
    *
    * Used exclusively for building up DOM which are static (ie not View roots)
    */
  def appendChild(newChild: RNode): RNode = js.native
  
  def insertBefore(newChild: RNode, refChild: Null, isViewRoot: Boolean): Unit = js.native
  /**
    * Insert a child node.
    *
    * Used exclusively for adding View root nodes into ViewAnchor location.
    */
  def insertBefore(newChild: RNode, refChild: RNode, isViewRoot: Boolean): Unit = js.native
  
  /**
    * Gets the Node immediately following this one in the parent's childNodes
    */
  var nextSibling: RNode | Null = js.native
  
  /**
    * Returns the parent Element if there is one
    */
  var parentElement: RElement | Null = js.native
  
  /**
    * Returns the parent Element, Document, or DocumentFragment
    */
  var parentNode: RNode | Null = js.native
  
  /**
    * Removes a child from the current node and returns the removed node
    * @param oldChild the child node to remove
    */
  def removeChild(oldChild: RNode): RNode = js.native
}

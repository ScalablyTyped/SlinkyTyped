package typingsSlinky.dom4

import org.scalajs.dom.raw.HTMLCollection
import org.scalajs.dom.raw.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParentNode extends StObject {
  
  /**
    * Inserts `nodes` after the last child of this node, while replacing strings with equivalent `Text` nodes.
    */
  def append(nodes: (Node | String)*): Unit = js.native
  
  /**
    * Returns the child elements.
    */
  val children: HTMLCollection = js.native
  
  /**
    * Inserts `nodes` before the first child of this node, while replacing strings with equivalent `Text` nodes.
    */
  def prepend(nodes: (Node | String)*): Unit = js.native
}
object ParentNode {
  
  @scala.inline
  def apply(
    append: /* repeated */ Node | String => Unit,
    children: HTMLCollection,
    prepend: /* repeated */ Node | String => Unit
  ): ParentNode = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction1(append), children = children.asInstanceOf[js.Any], prepend = js.Any.fromFunction1(prepend))
    __obj.asInstanceOf[ParentNode]
  }
  
  @scala.inline
  implicit class ParentNodeMutableBuilder[Self <: ParentNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppend(value: /* repeated */ Node | String => Unit): Self = StObject.set(x, "append", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildren(value: HTMLCollection): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrepend(value: /* repeated */ Node | String => Unit): Self = StObject.set(x, "prepend", js.Any.fromFunction1(value))
  }
}

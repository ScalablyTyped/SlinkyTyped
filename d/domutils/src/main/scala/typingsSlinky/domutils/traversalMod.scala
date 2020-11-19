package typingsSlinky.domutils

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("domutils/lib/traversal", JSImport.Namespace)
@js.native
object traversalMod extends js.Object {
  
  def getAttributeValue(elem: Element, name: String): String = js.native
  
  def getChildren(elem: Element): js.Array[Node] | Null = js.native
  def getChildren(elem: Node): js.Array[Node] | Null = js.native
  
  def getName(elem: Element): String = js.native
  
  def getParent(elem: Node): Node | Null = js.native
  
  def getSiblings(elem: Node): js.Array[Node] | Null = js.native
  
  def hasAttrib(elem: Element, name: String): Boolean = js.native
}

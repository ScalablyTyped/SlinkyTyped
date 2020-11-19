package typingsSlinky.domutils

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("domutils/lib/manipulation", JSImport.Namespace)
@js.native
object manipulationMod extends js.Object {
  
  def append(elem: Node, next: Node): Unit = js.native
  
  def appendChild(elem: Element, child: Node): Unit = js.native
  
  def prepend(elem: Node, prev: Node): Unit = js.native
  
  def removeElement(elem: Node): Unit = js.native
  
  def replaceElement(elem: Node, replacement: Node): Unit = js.native
}

package typingsSlinky.domutils

import org.scalajs.dom.raw.Node
import typingsSlinky.domSerializer.mod.DomSerializerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("domutils/lib/stringify", JSImport.Namespace)
@js.native
object stringifyMod extends js.Object {
  
  def getInnerHTML(node: Node): String = js.native
  def getInnerHTML(node: Node, options: DomSerializerOptions): String = js.native
  
  def getOuterHTML(node: js.Array[Node]): String = js.native
  def getOuterHTML(node: js.Array[Node], options: DomSerializerOptions): String = js.native
  def getOuterHTML(node: Node): String = js.native
  def getOuterHTML(node: Node, options: DomSerializerOptions): String = js.native
  
  def getText(node: js.Array[Node]): String = js.native
  def getText(node: Node): String = js.native
}

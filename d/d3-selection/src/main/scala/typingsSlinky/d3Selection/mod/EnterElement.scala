package typingsSlinky.d3Selection.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Node
import org.scalajs.dom.raw.NodeListOf
import typingsSlinky.std.Document_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnterElement extends js.Object {
  var namespaceURI: String
  var ownerDocument: Document_
  def appendChild(newChild: Node): Node
  def insertBefore(newChild: Node, refChild: Node): Node
  def querySelector(selectors: String): Element
  def querySelectorAll(selectors: String): NodeListOf[Element with Node]
}

object EnterElement {
  @scala.inline
  def apply(
    appendChild: Node => Node,
    insertBefore: (Node, Node) => Node,
    namespaceURI: String,
    ownerDocument: Document_,
    querySelector: String => Element,
    querySelectorAll: String => NodeListOf[Element with Node]
  ): EnterElement = {
    val __obj = js.Dynamic.literal(appendChild = js.Any.fromFunction1(appendChild), insertBefore = js.Any.fromFunction2(insertBefore), namespaceURI = namespaceURI.asInstanceOf[js.Any], ownerDocument = ownerDocument.asInstanceOf[js.Any], querySelector = js.Any.fromFunction1(querySelector), querySelectorAll = js.Any.fromFunction1(querySelectorAll))
  
    __obj.asInstanceOf[EnterElement]
  }
}


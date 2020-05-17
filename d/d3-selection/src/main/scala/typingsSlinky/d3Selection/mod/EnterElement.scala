package typingsSlinky.d3Selection.mod

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Node
import org.scalajs.dom.raw.NodeListOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnterElement extends BaseType {
  var namespaceURI: String = js.native
  var ownerDocument: Document = js.native
  def appendChild(newChild: Node): Node = js.native
  def insertBefore(newChild: Node, refChild: Node): Node = js.native
  def querySelector(selectors: String): Element = js.native
  def querySelectorAll(selectors: String): NodeListOf[Element with Node] = js.native
}

object EnterElement {
  @scala.inline
  def apply(
    appendChild: Node => Node,
    insertBefore: (Node, Node) => Node,
    namespaceURI: String,
    ownerDocument: Document,
    querySelector: String => Element,
    querySelectorAll: String => NodeListOf[Element with Node]
  ): EnterElement = {
    val __obj = js.Dynamic.literal(appendChild = js.Any.fromFunction1(appendChild), insertBefore = js.Any.fromFunction2(insertBefore), namespaceURI = namespaceURI.asInstanceOf[js.Any], ownerDocument = ownerDocument.asInstanceOf[js.Any], querySelector = js.Any.fromFunction1(querySelector), querySelectorAll = js.Any.fromFunction1(querySelectorAll))
    __obj.asInstanceOf[EnterElement]
  }
  @scala.inline
  implicit class EnterElementOps[Self <: EnterElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppendChild(value: Node => Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendChild")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsertBefore(value: (Node, Node) => Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertBefore")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withNamespaceURI(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaceURI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwnerDocument(value: Document): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerDocument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuerySelector(value: String => Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("querySelector")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withQuerySelectorAll(value: String => NodeListOf[Element with Node]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("querySelectorAll")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


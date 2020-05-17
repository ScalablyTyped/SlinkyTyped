package typingsSlinky.knockoutPaging

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Node
import typingsSlinky.knockoutPaging.anon.Dictindex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutVirtualElements extends js.Object {
  var allowedBindings: StringDictionary[Boolean] = js.native
  def childNodes(node: KnockoutVirtualElement): js.Array[Node] = js.native
  def emptyNode(node: KnockoutVirtualElement): Unit = js.native
  def firstChild(node: KnockoutVirtualElement): KnockoutVirtualElement = js.native
  def insertAfter(container: KnockoutVirtualElement, nodeToInsert: Node, insertAfter: Node): Unit = js.native
  def nextSibling(node: KnockoutVirtualElement): Node = js.native
  def prepend(node: KnockoutVirtualElement, toInsert: Node): Unit = js.native
  def setDomNodeChildren(node: KnockoutVirtualElement, newChildren: Dictindex): Unit = js.native
}

object KnockoutVirtualElements {
  @scala.inline
  def apply(
    allowedBindings: StringDictionary[Boolean],
    childNodes: KnockoutVirtualElement => js.Array[Node],
    emptyNode: KnockoutVirtualElement => Unit,
    firstChild: KnockoutVirtualElement => KnockoutVirtualElement,
    insertAfter: (KnockoutVirtualElement, Node, Node) => Unit,
    nextSibling: KnockoutVirtualElement => Node,
    prepend: (KnockoutVirtualElement, Node) => Unit,
    setDomNodeChildren: (KnockoutVirtualElement, Dictindex) => Unit
  ): KnockoutVirtualElements = {
    val __obj = js.Dynamic.literal(allowedBindings = allowedBindings.asInstanceOf[js.Any], childNodes = js.Any.fromFunction1(childNodes), emptyNode = js.Any.fromFunction1(emptyNode), firstChild = js.Any.fromFunction1(firstChild), insertAfter = js.Any.fromFunction3(insertAfter), nextSibling = js.Any.fromFunction1(nextSibling), prepend = js.Any.fromFunction2(prepend), setDomNodeChildren = js.Any.fromFunction2(setDomNodeChildren))
    __obj.asInstanceOf[KnockoutVirtualElements]
  }
  @scala.inline
  implicit class KnockoutVirtualElementsOps[Self <: KnockoutVirtualElements] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedBindings(value: StringDictionary[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedBindings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildNodes(value: KnockoutVirtualElement => js.Array[Node]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childNodes")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEmptyNode(value: KnockoutVirtualElement => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFirstChild(value: KnockoutVirtualElement => KnockoutVirtualElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstChild")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsertAfter(value: (KnockoutVirtualElement, Node, Node) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertAfter")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withNextSibling(value: KnockoutVirtualElement => Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextSibling")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPrepend(value: (KnockoutVirtualElement, Node) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepend")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetDomNodeChildren(value: (KnockoutVirtualElement, Dictindex) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDomNodeChildren")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}


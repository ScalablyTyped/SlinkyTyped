package typingsSlinky.parse5Htmlparser2TreeAdapter.mod

import typingsSlinky.parse5.mod.DocumentMode
import typingsSlinky.parse5Htmlparser2TreeAdapter.parse5Htmlparser2TreeAdapterStrings.root
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * htmlparser2 tree adapter Document interface.
  */
@js.native
trait Document extends ParentNode {
  /**
    * The name of the node.
    */
  var name: root = js.native
  /**
    * The type of the node.
    */
  @JSName("type")
  var type_Document: root = js.native
  /**
    * [Document mode](https://dom.spec.whatwg.org/#concept-document-limited-quirks).
    */
  var `x-mode`: DocumentMode = js.native
}

object Document {
  @scala.inline
  def apply(
    childNodes: js.Array[Node],
    children: js.Array[Node],
    firstChild: Node,
    lastChild: Node,
    name: root,
    next: Node,
    nextSibling: Node,
    nodeType: Double,
    parent: ParentNode,
    parentNode: ParentNode,
    prev: Node,
    previousSibling: Node,
    `type`: root,
    `x-mode`: DocumentMode
  ): Document = {
    val __obj = js.Dynamic.literal(childNodes = childNodes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], firstChild = firstChild.asInstanceOf[js.Any], lastChild = lastChild.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], nextSibling = nextSibling.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], previousSibling = previousSibling.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.updateDynamic("x-mode")(`x-mode`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document]
  }
  @scala.inline
  implicit class DocumentOps[Self <: Document] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: root): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: root): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withX-mode`(value: DocumentMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x-mode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


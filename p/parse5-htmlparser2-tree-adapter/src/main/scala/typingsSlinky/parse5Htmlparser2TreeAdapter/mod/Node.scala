package typingsSlinky.parse5Htmlparser2TreeAdapter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * htmlparser2 tree adapter Node interface.
  */
@js.native
trait Node extends js.Object {
  /**
    * Next sibling.
    */
  var next: Node = js.native
  /**
    * Same as {@link next}. [DOM spec](https://dom.spec.whatwg.org)-compatible alias.
    */
  var nextSibling: Node = js.native
  /**
    * [DOM spec](https://dom.spec.whatwg.org/#dom-node-nodetype)-compatible node {@link type}.
    */
  var nodeType: Double = js.native
  /**
    * Parent node.
    */
  var parent: ParentNode = js.native
  /**
    * Same as {@link parent}. [DOM spec](https://dom.spec.whatwg.org)-compatible alias.
    */
  var parentNode: ParentNode = js.native
  /**
    * Previous sibling.
    */
  var prev: Node = js.native
  /**
    * Same as {@link prev}. [DOM spec](https://dom.spec.whatwg.org)-compatible alias.
    */
  var previousSibling: Node = js.native
  /**
    * The type of the node. E.g. {@link Document} will have `type` equal to 'root'`.
    */
  var `type`: String = js.native
}

object Node {
  @scala.inline
  def apply(
    next: Node,
    nextSibling: Node,
    nodeType: Double,
    parent: ParentNode,
    parentNode: ParentNode,
    prev: Node,
    previousSibling: Node,
    `type`: String
  ): Node = {
    val __obj = js.Dynamic.literal(next = next.asInstanceOf[js.Any], nextSibling = nextSibling.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], previousSibling = previousSibling.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  implicit class NodeOps[Self <: Node] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNext(value: Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextSibling(value: Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextSibling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: ParentNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentNode(value: ParentNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrev(value: Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousSibling(value: Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousSibling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


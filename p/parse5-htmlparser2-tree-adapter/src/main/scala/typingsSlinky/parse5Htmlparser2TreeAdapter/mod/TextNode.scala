package typingsSlinky.parse5Htmlparser2TreeAdapter.mod

import typingsSlinky.parse5.mod.Location
import typingsSlinky.parse5Htmlparser2TreeAdapter.parse5Htmlparser2TreeAdapterStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * htmlparser2 tree adapter TextNode interface.
  */
@js.native
trait TextNode extends Node {
  /**
    * Text content.
    */
  var data: String = js.native
  /**
    * The name of the node.
    */
  var name: text = js.native
  /**
    * Same as {@link data}. [DOM spec](https://dom.spec.whatwg.org)-compatible alias.
    */
  var nodeValue: String = js.native
  /**
    * Comment source code location info. Available if location info is enabled via ParserOptions.
    */
  var sourceCodeLocation: js.UndefOr[Location] = js.native
}

object TextNode {
  @scala.inline
  def apply(
    data: String,
    name: text,
    next: Node,
    nextSibling: Node,
    nodeType: Double,
    nodeValue: String,
    parent: ParentNode,
    parentNode: ParentNode,
    prev: Node,
    previousSibling: Node,
    `type`: String
  ): TextNode = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], nextSibling = nextSibling.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], previousSibling = previousSibling.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextNode]
  }
  @scala.inline
  implicit class TextNodeOps[Self <: TextNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: text): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceCodeLocation(value: Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceCodeLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceCodeLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceCodeLocation")(js.undefined)
        ret
    }
  }
  
}


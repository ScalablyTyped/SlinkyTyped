package typingsSlinky.domParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Node extends DOMSearchable {
  var attributes: js.Array[String] = js.native
  var childNodes: js.Array[Node] = js.native
  var firstChild: Node | Null = js.native
  var innerHTML: String = js.native
  var lastChild: Node | Null = js.native
  var nodeName: String = js.native
  var nodeType: NodeType = js.native
  var outerHTML: String = js.native
  var parentNode: Node | Null = js.native
  var textContent: String = js.native
  def getAttribute(name: String): String | Null = js.native
}

object Node {
  @scala.inline
  def apply(
    attributes: js.Array[String],
    childNodes: js.Array[Node],
    getAttribute: String => String | Null,
    getElementById: String => Node | Null,
    getElementsByClassName: String => js.Array[Node] | Null,
    getElementsByName: String => js.Array[Node] | Null,
    getElementsByTagName: String => js.Array[Node] | Null,
    innerHTML: String,
    nodeName: String,
    nodeType: NodeType,
    outerHTML: String,
    textContent: String
  ): Node = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], getAttribute = js.Any.fromFunction1(getAttribute), getElementById = js.Any.fromFunction1(getElementById), getElementsByClassName = js.Any.fromFunction1(getElementsByClassName), getElementsByName = js.Any.fromFunction1(getElementsByName), getElementsByTagName = js.Any.fromFunction1(getElementsByTagName), innerHTML = innerHTML.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], outerHTML = outerHTML.asInstanceOf[js.Any], textContent = textContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  implicit class NodeOps[Self <: Node] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildNodes(value: js.Array[Node]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetAttribute(value: String => String | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttribute")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInnerHTML(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerHTML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeType(value: NodeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOuterHTML(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerHTML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstChild(value: Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstChild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstChildNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstChild")(null)
        ret
    }
    @scala.inline
    def withLastChild(value: Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastChild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastChildNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastChild")(null)
        ret
    }
    @scala.inline
    def withParentNode(value: Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentNodeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentNode")(null)
        ret
    }
  }
  
}


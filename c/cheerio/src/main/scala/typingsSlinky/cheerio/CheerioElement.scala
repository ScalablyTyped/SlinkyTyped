package typingsSlinky.cheerio

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheerioElement extends js.Object {
  var attribs: StringDictionary[String]
  var childNodes: js.Array[CheerioElement]
  var children: js.Array[CheerioElement]
  var data: js.UndefOr[String] = js.undefined
  var firstChild: CheerioElement
  var lastChild: CheerioElement
  var name: String
  var next: CheerioElement
  var nextSibling: CheerioElement
  var nodeValue: String
  var parent: CheerioElement
  var parentNode: CheerioElement
  var prev: CheerioElement
  var previousSibling: CheerioElement
  var startIndex: js.UndefOr[Double] = js.undefined
  // Document References
  // Node Console
  var tagName: String
  var `type`: String
}

object CheerioElement {
  @scala.inline
  def apply(
    attribs: StringDictionary[String],
    childNodes: js.Array[CheerioElement],
    children: js.Array[CheerioElement],
    firstChild: CheerioElement,
    lastChild: CheerioElement,
    name: String,
    next: CheerioElement,
    nextSibling: CheerioElement,
    nodeValue: String,
    parent: CheerioElement,
    parentNode: CheerioElement,
    prev: CheerioElement,
    previousSibling: CheerioElement,
    tagName: String,
    `type`: String
  ): CheerioElement = {
    val __obj = js.Dynamic.literal(attribs = attribs.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], firstChild = firstChild.asInstanceOf[js.Any], lastChild = lastChild.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], nextSibling = nextSibling.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], previousSibling = previousSibling.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheerioElement]
  }
  @scala.inline
  implicit class CheerioElementOps[Self <: CheerioElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAttribs(value: StringDictionary[String]): Self = this.set("attribs", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildNodesVarargs(value: CheerioElement*): Self = this.set("childNodes", js.Array(value :_*))
    @scala.inline
    def setChildNodes(value: js.Array[CheerioElement]): Self = this.set("childNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildrenVarargs(value: CheerioElement*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[CheerioElement]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirstChild(value: CheerioElement): Self = this.set("firstChild", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastChild(value: CheerioElement): Self = this.set("lastChild", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNext(value: CheerioElement): Self = this.set("next", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextSibling(value: CheerioElement): Self = this.set("nextSibling", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeValue(value: String): Self = this.set("nodeValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: CheerioElement): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentNode(value: CheerioElement): Self = this.set("parentNode", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrev(value: CheerioElement): Self = this.set("prev", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviousSibling(value: CheerioElement): Self = this.set("previousSibling", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagName(value: String): Self = this.set("tagName", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setStartIndex(value: Double): Self = this.set("startIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartIndex: Self = this.set("startIndex", js.undefined)
  }
  
}


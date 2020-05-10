package typingsSlinky.parse5Htmlparser2TreeAdapter.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.parse5.mod.ElementLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * htmlparser2 tree adapter Element interface.
  */
@js.native
trait Element extends ParentNode {
  /**
    * Element attributes.
    */
  var attribs: StringDictionary[String] = js.native
  /**
    * The name of the node. Equals to element {@link tagName}.
    */
  var name: String = js.native
  /**
    * Element namespace.
    */
  var namespace: String = js.native
  /**
    * Element source code location info. Available if location info is enabled via ParserOptions.
    */
  var sourceCodeLocation: js.UndefOr[ElementLocation] = js.native
  /**
    * Element tag name.
    */
  var tagName: String = js.native
  /**
    * Element attribute namespaces.
    */
  var `x-attribsNamespace`: StringDictionary[String] = js.native
  /**
    * Element attribute namespace-related prefixes.
    */
  var `x-attribsPrefix`: StringDictionary[String] = js.native
}

object Element {
  @scala.inline
  def apply(
    attribs: StringDictionary[String],
    childNodes: js.Array[Node],
    children: js.Array[Node],
    firstChild: Node,
    lastChild: Node,
    name: String,
    namespace: String,
    next: Node,
    nextSibling: Node,
    nodeType: Double,
    parent: ParentNode,
    parentNode: ParentNode,
    prev: Node,
    previousSibling: Node,
    tagName: String,
    `type`: String,
    `x-attribsNamespace`: StringDictionary[String],
    `x-attribsPrefix`: StringDictionary[String]
  ): Element = {
    val __obj = js.Dynamic.literal(attribs = attribs.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], firstChild = firstChild.asInstanceOf[js.Any], lastChild = lastChild.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], nextSibling = nextSibling.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], previousSibling = previousSibling.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.updateDynamic("x-attribsNamespace")(`x-attribsNamespace`.asInstanceOf[js.Any])
    __obj.updateDynamic("x-attribsPrefix")(`x-attribsPrefix`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
  @scala.inline
  implicit class ElementOps[Self <: Element] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttribs(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attribs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTagName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withX-attribsNamespace`(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x-attribsNamespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withX-attribsPrefix`(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x-attribsPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceCodeLocation(value: ElementLocation): Self = {
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


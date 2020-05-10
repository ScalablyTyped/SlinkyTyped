package typingsSlinky.parse5.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.parse5.mod.DefaultTreeNode because Already inherited
- typingsSlinky.parse5.mod.DefaultTreeParentNode because var conflicts: nodeName. Inlined childNodes */ @js.native
trait DefaultTreeElement extends DefaultTreeChildNode {
  /**
    * List of element attributes.
    */
  var attrs: js.Array[Attribute] = js.native
  /**
    * Child nodes.
    */
  var childNodes: js.Array[DefaultTreeNode] = js.native
  /**
    * Element namespace.
    */
  var namespaceURI: String = js.native
  /**
    * Element source code location info. Available if location info is enabled via {@link ParserOptions}.
    */
  var sourceCodeLocation: js.UndefOr[ElementLocation] = js.native
  /**
    * Element tag name.
    */
  var tagName: String = js.native
}

object DefaultTreeElement {
  @scala.inline
  def apply(
    attrs: js.Array[Attribute],
    childNodes: js.Array[DefaultTreeNode],
    namespaceURI: String,
    nodeName: String,
    parentNode: DefaultTreeParentNode,
    tagName: String
  ): DefaultTreeElement = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], namespaceURI = namespaceURI.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultTreeElement]
  }
  @scala.inline
  implicit class DefaultTreeElementOps[Self <: DefaultTreeElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttrs(value: js.Array[Attribute]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildNodes(value: js.Array[DefaultTreeNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamespaceURI(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaceURI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTagName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagName")(value.asInstanceOf[js.Any])
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


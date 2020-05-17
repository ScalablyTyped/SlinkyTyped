package typingsSlinky.parse5.mod

import typingsSlinky.parse5.parse5Strings.Numbersigndocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultTreeDocument
  extends DefaultTreeParentNode
     with Document {
  /**
    * [Document mode](https://dom.spec.whatwg.org/#concept-document-limited-quirks).
    */
  var mode: DocumentMode = js.native
  /**
    * The name of the node.
    */
  @JSName("nodeName")
  var nodeName_DefaultTreeDocument: Numbersigndocument = js.native
}

object DefaultTreeDocument {
  @scala.inline
  def apply(childNodes: js.Array[DefaultTreeNode], mode: DocumentMode, nodeName: Numbersigndocument): DefaultTreeDocument = {
    val __obj = js.Dynamic.literal(childNodes = childNodes.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultTreeDocument]
  }
  @scala.inline
  implicit class DefaultTreeDocumentOps[Self <: DefaultTreeDocument] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMode(value: DocumentMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeName(value: Numbersigndocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


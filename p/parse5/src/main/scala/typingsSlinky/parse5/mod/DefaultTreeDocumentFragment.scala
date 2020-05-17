package typingsSlinky.parse5.mod

import typingsSlinky.parse5.parse5Strings.`Numbersigndocument-fragment`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultTreeDocumentFragment
  extends DefaultTreeParentNode
     with DocumentFragment {
  /**
    * The name of the node.
    */
  @JSName("nodeName")
  var nodeName_DefaultTreeDocumentFragment: `Numbersigndocument-fragment` = js.native
}

object DefaultTreeDocumentFragment {
  @scala.inline
  def apply(childNodes: js.Array[DefaultTreeNode], nodeName: `Numbersigndocument-fragment`): DefaultTreeDocumentFragment = {
    val __obj = js.Dynamic.literal(childNodes = childNodes.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultTreeDocumentFragment]
  }
  @scala.inline
  implicit class DefaultTreeDocumentFragmentOps[Self <: DefaultTreeDocumentFragment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNodeName(value: `Numbersigndocument-fragment`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


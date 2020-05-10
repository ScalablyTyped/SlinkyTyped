package typingsSlinky.parse5.mod

import typingsSlinky.parse5.parse5Strings.Numbersigncomment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultTreeCommentNode extends DefaultTreeChildNode {
  /**
    * Comment text.
    */
  var data: String = js.native
  /**
    * The name of the node.
    */
  @JSName("nodeName")
  var nodeName_DefaultTreeCommentNode: Numbersigncomment = js.native
  /**
    * Comment source code location info. Available if location info is enabled via {@link ParserOptions}.
    */
  var sourceCodeLocation: js.UndefOr[Location] = js.native
}

object DefaultTreeCommentNode {
  @scala.inline
  def apply(data: String, nodeName: Numbersigncomment, parentNode: DefaultTreeParentNode): DefaultTreeCommentNode = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultTreeCommentNode]
  }
  @scala.inline
  implicit class DefaultTreeCommentNodeOps[Self <: DefaultTreeCommentNode] (val x: Self) extends AnyVal {
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
    def withNodeName(value: Numbersigncomment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeName")(value.asInstanceOf[js.Any])
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


package typingsSlinky.parse5.mod

import typingsSlinky.parse5.parse5Strings.Numbersigntext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultTreeTextNode
  extends DefaultTreeChildNode
     with TextNode {
  /**
    * The name of the node.
    */
  @JSName("nodeName")
  var nodeName_DefaultTreeTextNode: Numbersigntext = js.native
  /**
    * Text node source code location info. Available if location info is enabled via {@link ParserOptions}.
    */
  var sourceCodeLocation: js.UndefOr[Location] = js.native
  /**
    * Text content.
    */
  var value: String = js.native
}

object DefaultTreeTextNode {
  @scala.inline
  def apply(nodeName: Numbersigntext, parentNode: DefaultTreeParentNode, value: String): DefaultTreeTextNode = {
    val __obj = js.Dynamic.literal(nodeName = nodeName.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultTreeTextNode]
  }
  @scala.inline
  implicit class DefaultTreeTextNodeOps[Self <: DefaultTreeTextNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNodeName(value: Numbersigntext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
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


package typingsSlinky.reactSketchapp.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextNode extends js.Object {
  var content: String = js.native
  var textStyles: TextStyle = js.native
}

object TextNode {
  @scala.inline
  def apply(content: String, textStyles: TextStyle): TextNode = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], textStyles = textStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextNode]
  }
  @scala.inline
  implicit class TextNodeOps[Self <: TextNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextStyles(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyles")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.activexWord

import typingsSlinky.activexWord.Word.XMLNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonXMLNode extends js.Object {
  val XMLNode: typingsSlinky.activexWord.Word.XMLNode = js.native
}

object AnonXMLNode {
  @scala.inline
  def apply(XMLNode: XMLNode): AnonXMLNode = {
    val __obj = js.Dynamic.literal(XMLNode = XMLNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonXMLNode]
  }
  @scala.inline
  implicit class AnonXMLNodeOps[Self <: AnonXMLNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withXMLNode(value: XMLNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XMLNode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


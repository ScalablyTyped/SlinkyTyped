package typingsSlinky.activexWord.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XMLNode extends js.Object {
  val XMLNode: typingsSlinky.activexWord.Word.XMLNode = js.native
}

object XMLNode {
  @scala.inline
  def apply(XMLNode: typingsSlinky.activexWord.Word.XMLNode): XMLNode = {
    val __obj = js.Dynamic.literal(XMLNode = XMLNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[XMLNode]
  }
  @scala.inline
  implicit class XMLNodeOps[Self <: XMLNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withXMLNode(value: typingsSlinky.activexWord.Word.XMLNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XMLNode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


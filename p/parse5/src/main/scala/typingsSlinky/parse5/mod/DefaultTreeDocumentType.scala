package typingsSlinky.parse5.mod

import typingsSlinky.parse5.parse5Strings.NumbersigndocumentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultTreeDocumentType extends DefaultTreeNode {
  /**
    * Document type name.
    */
  var name: String = js.native
  /**
    * The name of the node.
    */
  @JSName("nodeName")
  var nodeName_DefaultTreeDocumentType: NumbersigndocumentType = js.native
  /**
    * Document type public identifier.
    */
  var publicId: String = js.native
  /**
    * Document type system identifier.
    */
  var systemId: String = js.native
}

object DefaultTreeDocumentType {
  @scala.inline
  def apply(name: String, nodeName: NumbersigndocumentType, publicId: String, systemId: String): DefaultTreeDocumentType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], publicId = publicId.asInstanceOf[js.Any], systemId = systemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultTreeDocumentType]
  }
  @scala.inline
  implicit class DefaultTreeDocumentTypeOps[Self <: DefaultTreeDocumentType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeName(value: NumbersigndocumentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublicId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSystemId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


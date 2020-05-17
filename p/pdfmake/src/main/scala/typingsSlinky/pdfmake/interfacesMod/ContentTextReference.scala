package typingsSlinky.pdfmake.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentTextReference
  extends ContentBase
     with Content {
  var textReference: String = js.native
}

object ContentTextReference {
  @scala.inline
  def apply(textReference: String): ContentTextReference = {
    val __obj = js.Dynamic.literal(textReference = textReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentTextReference]
  }
  @scala.inline
  implicit class ContentTextReferenceOps[Self <: ContentTextReference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTextReference(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textReference")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


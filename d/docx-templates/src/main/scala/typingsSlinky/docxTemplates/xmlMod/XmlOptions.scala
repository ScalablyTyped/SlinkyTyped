package typingsSlinky.docxTemplates.xmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XmlOptions extends js.Object {
  var literalXmlDelimiter: String = js.native
}

object XmlOptions {
  @scala.inline
  def apply(literalXmlDelimiter: String): XmlOptions = {
    val __obj = js.Dynamic.literal(literalXmlDelimiter = literalXmlDelimiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[XmlOptions]
  }
  @scala.inline
  implicit class XmlOptionsOps[Self <: XmlOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLiteralXmlDelimiter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("literalXmlDelimiter")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


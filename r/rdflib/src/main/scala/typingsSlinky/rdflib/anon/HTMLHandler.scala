package typingsSlinky.rdflib.anon

import typingsSlinky.rdflib.mod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLHandler extends js.Object {
  var HTMLHandler: Handler = js.native
  var N3Handler: Handler = js.native
  var RDFXMLHandler: Handler = js.native
  var TextHandler: Handler = js.native
  var XHTMLHandler: Handler = js.native
  var XMLHandler: Handler = js.native
}

object HTMLHandler {
  @scala.inline
  def apply(
    HTMLHandler: Handler,
    N3Handler: Handler,
    RDFXMLHandler: Handler,
    TextHandler: Handler,
    XHTMLHandler: Handler,
    XMLHandler: Handler
  ): HTMLHandler = {
    val __obj = js.Dynamic.literal(HTMLHandler = HTMLHandler.asInstanceOf[js.Any], N3Handler = N3Handler.asInstanceOf[js.Any], RDFXMLHandler = RDFXMLHandler.asInstanceOf[js.Any], TextHandler = TextHandler.asInstanceOf[js.Any], XHTMLHandler = XHTMLHandler.asInstanceOf[js.Any], XMLHandler = XMLHandler.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLHandler]
  }
  @scala.inline
  implicit class HTMLHandlerOps[Self <: HTMLHandler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHTMLHandler(value: Handler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTMLHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withN3Handler(value: Handler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("N3Handler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRDFXMLHandler(value: Handler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RDFXMLHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextHandler(value: Handler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXHTMLHandler(value: Handler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XHTMLHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXMLHandler(value: Handler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XMLHandler")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.jsonld.jsonldSpecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoteDocument extends js.Object {
  var contextUrl: js.UndefOr[Url] = js.native
  var document: JsonLd = js.native
  var documentUrl: Url = js.native
}

object RemoteDocument {
  @scala.inline
  def apply(document: JsonLd, documentUrl: Url): RemoteDocument = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], documentUrl = documentUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteDocument]
  }
  @scala.inline
  implicit class RemoteDocumentOps[Self <: RemoteDocument] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocument(value: JsonLd): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocumentUrl(value: Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContextUrl(value: Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextUrl")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.jsontoxml.mod

import typingsSlinky.jsontoxml.anon.Standalone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JsonToXmlOptions extends js.Object {
  var docType: js.UndefOr[String] = js.native
  var escape: js.UndefOr[Boolean] = js.native
  var html: js.UndefOr[Boolean] = js.native
  var indent: js.UndefOr[String] = js.native
  var prettyPrint: js.UndefOr[Boolean] = js.native
  var removeIllegalNameCharacters: js.UndefOr[Boolean] = js.native
  var xmlHeader: js.UndefOr[Boolean | Standalone] = js.native
}

object JsonToXmlOptions {
  @scala.inline
  def apply(): JsonToXmlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsonToXmlOptions]
  }
  @scala.inline
  implicit class JsonToXmlOptionsOps[Self <: JsonToXmlOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docType")(js.undefined)
        ret
    }
    @scala.inline
    def withEscape(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEscape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escape")(js.undefined)
        ret
    }
    @scala.inline
    def withHtml(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(js.undefined)
        ret
    }
    @scala.inline
    def withIndent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(js.undefined)
        ret
    }
    @scala.inline
    def withPrettyPrint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prettyPrint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrettyPrint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prettyPrint")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveIllegalNameCharacters(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeIllegalNameCharacters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveIllegalNameCharacters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeIllegalNameCharacters")(js.undefined)
        ret
    }
    @scala.inline
    def withXmlHeader(value: Boolean | Standalone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXmlHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlHeader")(js.undefined)
        ret
    }
  }
  
}


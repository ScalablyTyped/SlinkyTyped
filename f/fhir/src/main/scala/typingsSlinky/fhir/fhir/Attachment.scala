package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Content in a format defined elsewhere
  */
@js.native
trait Attachment extends Element {
  /**
    * Contains extended information for property 'contentType'.
    */
  var _contentType: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'creation'.
    */
  var _creation: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'data'.
    */
  var _data: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'hash'.
    */
  var _hash: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'language'.
    */
  var _language: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'size'.
    */
  var _size: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'title'.
    */
  var _title: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'url'.
    */
  var _url: js.UndefOr[Element] = js.native
  /**
    * Mime type of the content, with charset etc.
    */
  var contentType: js.UndefOr[code] = js.native
  /**
    * Date attachment was first created
    */
  var creation: js.UndefOr[dateTime] = js.native
  /**
    * Data inline, base64ed
    */
  var data: js.UndefOr[base64Binary] = js.native
  /**
    * Hash of the data (sha-1, base64ed)
    */
  var hash: js.UndefOr[base64Binary] = js.native
  /**
    * Human language of the content (BCP-47)
    */
  var language: js.UndefOr[code] = js.native
  /**
    * Number of bytes of content (if url provided)
    */
  var size: js.UndefOr[unsignedInt] = js.native
  /**
    * Label to display in place of the data
    */
  var title: js.UndefOr[String] = js.native
  /**
    * Uri where the data can be found
    */
  var url: js.UndefOr[uri] = js.native
}

object Attachment {
  @scala.inline
  def apply(): Attachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attachment]
  }
  @scala.inline
  implicit class AttachmentOps[Self <: Attachment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_contentType(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_contentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_contentType")(js.undefined)
        ret
    }
    @scala.inline
    def with_creation(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_creation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_creation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_creation")(js.undefined)
        ret
    }
    @scala.inline
    def with_data(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_data: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_data")(js.undefined)
        ret
    }
    @scala.inline
    def with_hash(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_hash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_hash")(js.undefined)
        ret
    }
    @scala.inline
    def with_language(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_language: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_language")(js.undefined)
        ret
    }
    @scala.inline
    def with_size(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_size: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_size")(js.undefined)
        ret
    }
    @scala.inline
    def with_title(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_title: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_title")(js.undefined)
        ret
    }
    @scala.inline
    def with_url(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_url")(js.undefined)
        ret
    }
    @scala.inline
    def withContentType(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(js.undefined)
        ret
    }
    @scala.inline
    def withCreation(value: dateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creation")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: base64Binary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withHash(value: base64Binary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: unsignedInt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}


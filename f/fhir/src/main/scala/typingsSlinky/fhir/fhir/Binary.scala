package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Pure binary content defined by a format other than FHIR
  */
@js.native
trait Binary
  extends ResourceBase
     with Resource {
  /**
    * Contains extended information for property 'content'.
    */
  var _content: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'contentType'.
    */
  var _contentType: js.UndefOr[Element] = js.native
  /**
    * The actual content
    */
  var content: base64Binary = js.native
  /**
    * MimeType of the binary content
    */
  var contentType: code = js.native
  /**
    * Access Control Management
    */
  var securityContext: js.UndefOr[Reference] = js.native
}

object Binary {
  @scala.inline
  def apply(content: base64Binary, contentType: code): Binary = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Binary]
  }
  @scala.inline
  implicit class BinaryOps[Self <: Binary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: base64Binary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentType(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_content(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_content: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_content")(js.undefined)
        ret
    }
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
    def withSecurityContext(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityContext")(js.undefined)
        ret
    }
  }
  
}


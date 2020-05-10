package typingsSlinky.harFormat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Content extends js.Object {
  /**  A comment provided by the user or the application */
  var comment: js.UndefOr[String] = js.native
  /**
    * Number of bytes saved. Leave out this field if the information is not
    * available.
    */
  var compression: js.UndefOr[Double] = js.native
  /**
    * Encoding used for response text field e.g `base64`.
    *
    * Leave out this field if the text field is HTTP decoded
    * (decompressed & unchunked), than trans-coded from its original character
    * set into UTF-8.
    */
  var encoding: js.UndefOr[String] = js.native
  /**
    * MIME type of the response text (value of the Content-Type response
    * header).
    *
    * The charset attribute of the MIME type is included (if available).
    */
  var mimeType: String = js.native
  /**
    * Length of the returned content in bytes.
    *
    * Should be equal to `response.bodySize` if there is no compression and
    * bigger when the content has been compressed.
    */
  var size: Double = js.native
  /**
    * Response body sent from the server or loaded from the browser cache.
    *
    * This field is populated with textual content only.
    *
    * The text field is either HTTP decoded text or a encoded (e.g. `base64`)
    * representation of the response body.
    *
    * Leave out this field if the information is not available.
    */
  var text: js.UndefOr[String] = js.native
}

object Content {
  @scala.inline
  def apply(mimeType: String, size: Double): Content = {
    val __obj = js.Dynamic.literal(mimeType = mimeType.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
  @scala.inline
  implicit class ContentOps[Self <: Content] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMimeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(js.undefined)
        ret
    }
    @scala.inline
    def withCompression(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compression")(js.undefined)
        ret
    }
    @scala.inline
    def withEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}


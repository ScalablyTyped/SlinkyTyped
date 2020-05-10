package typingsSlinky.meteor.emailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MailComposerOptions extends js.Object {
  var charset: String = js.native
  var encoding: String = js.native
  var escapeSMTP: Boolean = js.native
  var forceEmbeddedImages: Boolean = js.native
  var keepBcc: Boolean = js.native
}

object MailComposerOptions {
  @scala.inline
  def apply(
    charset: String,
    encoding: String,
    escapeSMTP: Boolean,
    forceEmbeddedImages: Boolean,
    keepBcc: Boolean
  ): MailComposerOptions = {
    val __obj = js.Dynamic.literal(charset = charset.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], escapeSMTP = escapeSMTP.asInstanceOf[js.Any], forceEmbeddedImages = forceEmbeddedImages.asInstanceOf[js.Any], keepBcc = keepBcc.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailComposerOptions]
  }
  @scala.inline
  implicit class MailComposerOptionsOps[Self <: MailComposerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCharset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEscapeSMTP(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeSMTP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForceEmbeddedImages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceEmbeddedImages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeepBcc(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepBcc")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


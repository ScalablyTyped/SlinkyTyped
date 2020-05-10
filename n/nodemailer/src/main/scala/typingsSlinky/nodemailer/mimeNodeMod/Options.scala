package typingsSlinky.nodemailer.mimeNodeMod

import typingsSlinky.nodemailer.nodemailerStrings.B
import typingsSlinky.nodemailer.nodemailerStrings.Q
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /** shared part of the unique multipart boundary */
  var baseBoundary: js.UndefOr[String] = js.native
  /** filename for an attachment node */
  var filename: js.UndefOr[String] = js.native
  /** If true, do not exclude Bcc from the generated headers */
  var keepBcc: js.UndefOr[Boolean] = js.native
  /** method to normalize header keys for custom caseing */
  var normalizeHeaderKey: js.UndefOr[js.Function1[/* key */ String, String]] = js.native
  /** immediate parent for this node */
  var parentNode: js.UndefOr[MimeNode] = js.native
  /** root node for this tree */
  var rootNode: js.UndefOr[MimeNode] = js.native
  /** either 'Q' (the default) or 'B' */
  var textEncoding: js.UndefOr[B | Q] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseBoundary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseBoundary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseBoundary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseBoundary")(js.undefined)
        ret
    }
    @scala.inline
    def withFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepBcc(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepBcc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepBcc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepBcc")(js.undefined)
        ret
    }
    @scala.inline
    def withNormalizeHeaderKey(value: /* key */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizeHeaderKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNormalizeHeaderKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizeHeaderKey")(js.undefined)
        ret
    }
    @scala.inline
    def withParentNode(value: MimeNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentNode")(js.undefined)
        ret
    }
    @scala.inline
    def withRootNode(value: MimeNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootNode")(js.undefined)
        ret
    }
    @scala.inline
    def withTextEncoding(value: B | Q): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textEncoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textEncoding")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.linkifyjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Record<linkifyjs.linkifyjs.LinkEntityType, string | (href : string): string>> */
@js.native
trait PartialRecordLinkEntityTy extends js.Object {
  var email: js.UndefOr[String | (js.Function1[/* href */ String, String])] = js.native
  var hashtag: js.UndefOr[String | (js.Function1[/* href */ String, String])] = js.native
  var mention: js.UndefOr[String | (js.Function1[/* href */ String, String])] = js.native
  var url: js.UndefOr[String | (js.Function1[/* href */ String, String])] = js.native
}

object PartialRecordLinkEntityTy {
  @scala.inline
  def apply(): PartialRecordLinkEntityTy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRecordLinkEntityTy]
  }
  @scala.inline
  implicit class PartialRecordLinkEntityTyOps[Self <: PartialRecordLinkEntityTy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmailFunction1(value: /* href */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEmail(value: String | (js.Function1[/* href */ String, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
        ret
    }
    @scala.inline
    def withHashtagFunction1(value: /* href */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashtag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHashtag(value: String | (js.Function1[/* href */ String, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashtag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHashtag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashtag")(js.undefined)
        ret
    }
    @scala.inline
    def withMentionFunction1(value: /* href */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mention")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMention(value: String | (js.Function1[/* href */ String, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mention")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMention: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mention")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlFunction1(value: /* href */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUrl(value: String | (js.Function1[/* href */ String, String])): Self = {
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

